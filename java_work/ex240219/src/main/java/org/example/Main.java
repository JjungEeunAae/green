package org.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public Main() {
        fileWrite();
        fileRead();
    }

    private void fileRead() {
        FileInputStream fis = null; // 초기화
        try {
            fis = new FileInputStream("data.dat");
            int dat = fis.read();
            System.out.println("dat >>> " + dat);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


//        while (true) {
//            try {
//                Thread.sleep(1000);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
    }

    private void fileWrite() {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("data.dat");
            fos.write(7); // byte
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}