package com.ea.fileEx.file;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
@RequestMapping("api/file")
public class FileController {
    private final Path imagePath;

    // 이미지를 넣을 수 있는 파일을 해당 경로에 생성
    public FileController() {
        imagePath = Paths.get("src/main/resources/static/images/upload/").toAbsolutePath().normalize();

        try {
            Files.createDirectories(this.imagePath);
        } catch (Exception e) {
            e.printStackTrace();;
        }
    }

    // 외부에서 이미지 저장을 요청하면 이미지를 저장하는 경로 및 파일에 저장하기
    @PostMapping("/upload")
    public EntityModel<FileDTO> uploadFile(@RequestParam("file") MultipartFile file) {
        try {
            System.out.println(file.getOriginalFilename());
            System.out.println(imagePath + "/" + file.getOriginalFilename());

            // 저장시키기
            File dest = new File(imagePath + "/" + file.getOriginalFilename());
            file.transferTo(dest);

            EntityModel<FileDTO> entityModel = EntityModel.of(new FileDTO(file.getOriginalFilename()));
            entityModel.add(
                    WebMvcLinkBuilder
                            .linkTo(
                                    WebMvcLinkBuilder
                                            .methodOn(FileController.class)
                                            .getDownloadImage(file.getOriginalFilename())
                            )
                            .withRel("download"));
            return entityModel;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 다운로드 된 이미지 파일 확인하기
    @GetMapping("download/{fileName}")
    public ResponseEntity<Resource> getDownloadImage(@PathVariable String fileName) {
        System.out.println(fileName);
        // 파일명이 해당되는 이미지를 웹으로 바로 출력
        Path filePath = this.imagePath.resolve(fileName).normalize();
        Resource resource = null;
        try {
            resource = new UrlResource(filePath.toUri());
        } catch (Exception e) {
            e.printStackTrace();
            // 파일이 존재하지 않을 때 파일 없는 상태 값 보내기
            return ResponseEntity.notFound().build();
        }
        // 파일이 존재할 경우 파일 리소스 보내주기
        return ResponseEntity.ok().body(resource);
    }
}
