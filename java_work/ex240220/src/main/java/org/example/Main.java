package org.example;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Path p = Paths.get("C:\\javastudy\\PathDemo.java");

        System.out.println(p.getRoot());
        System.out.println(p.getParent());
        System.out.println(p.getFileName());

        // 현재 디렉토리 정보 ' 상대경로' 형태로 담긴 인스턴스 생성
        Path curpath = Paths.get("");
        // isAbsolute() : 해당 파일의 경로명이 절대 경로인지 검사
        if(curpath.isAbsolute()) {
            System.out.println(curpath);
        } else {
            String temp = curpath.toAbsolutePath().toString();
            System.out.println(temp);
        }

        try(FileOutputStream fos = new FileOutputStream("aa.dat")) {
            fos.write(10);
            fos.write(20);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}