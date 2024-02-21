package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main2 {
    public static void main(String[] args) {
//        Path p = Paths.get("C:\\javastudy\\AA.java");
//        Path dp = Paths.get("C:\\javastudy\\EMPTY");
//        Path aaa = Paths.get("C:\\aa\\bb\\cc");
//
//        try {
//            if(!Files.exists(p)) {
//                Files.createFile(p);
//            }
//            if(!Files.exists(dp)) {
//                Files.createDirectories(dp);
//            }
//
//            if(!Files.exists(aaa)) {
//                Files.createDirectories(aaa);
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        //                                           상대경로
        try(FileWriter fw = new FileWriter("aaa.txt")) {
            fw.write("새로운 문자열");
            fw.write("\n");
            fw.write("테스트으으으으으으으으으으으으으으으으으으");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
