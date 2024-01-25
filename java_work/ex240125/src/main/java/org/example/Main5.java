package org.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main5 {
    public static void doA() {
        Path file = Paths.get("a.txt");
        BufferedWriter fw = null;

        try {
            fw = Files.newBufferedWriter(file);     // IOException 발생 가능
            fw.write("A");                      // IOException 발생 가능
            fw.write("Z");                      // IOException 발생 가능
        } catch (IOException e) {
            e.printStackTrace();
        } finally {                     // 무조건 실행
            if(fw != null) {
                try {
                    fw.close();         // IOException 발생 가능
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static void main(String[] args) {
        doA();
    }
}
