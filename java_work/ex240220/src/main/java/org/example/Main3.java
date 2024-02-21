package org.example;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Main3 {
    public static void main(String[] args) throws IOException {
        Path p = Paths.get("nid.txt"); // -> 현재 디렉토리/nid.xtx

        if(!Files.exists(p)) {
            Files.createFile(p);
        }

        // 파일에 데이터 쓰기
        Files.write(p, "문자열 적는다1111".getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);
        Files.write(p, "문자열 적는다2222".getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);
        Files.write(p, "문자열 적는다3333".getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);

        // 파일로부터 데이터 읽기
        List<String> list = Files.readAllLines(p);
        System.out.println(list);
    }
}
