package org.example;

import java.io.IOException;
import java.nio.file.*;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class Main4 {
    public static void main(String[] args) throws IOException {
        Path org = Paths.get("nio.txt");
        if(!Files.exists(org)) { // 존재하지 않으면
            Files.createFile(org);
        }

        Path dst = Paths.get("noicopy.txt");

        // 파일 복사해라. 옵션으로는 존재하면 대체
        Files.copy(org, dst, REPLACE_EXISTING);

        // aaa가 삭제되고 bbb가 만들어짐
        Files.move(Paths.get("aaa.txt"), Paths.get("bbb.txt"), REPLACE_EXISTING);
    }
}
