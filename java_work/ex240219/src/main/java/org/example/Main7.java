package org.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Main7 {
    public static void main(String[] args) {
        try(BufferedWriter bfw = new BufferedWriter(new FileWriter("ccc.txt"))) {
            bfw.write("나는 글이다");
            bfw.write("나는 우주의 먼지다");
            bfw.newLine();
            bfw.write("나는 능이 못하는 버섯이다!!");
        } catch (Exception e) {
            e.printStackTrace();
        }

        try(BufferedReader bfr = new BufferedReader(new FileReader("ccc.txt"))) {
            while(true) {
                String txt =  bfr.readLine();
                if(txt == null) {
                    break;
                }
                System.out.println(txt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
