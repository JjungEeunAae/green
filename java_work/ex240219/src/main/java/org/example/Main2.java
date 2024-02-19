package org.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main2 {
    public static void main(String[] args) {
        try(
            FileInputStream fis = new FileInputStream("Java30.pptx");
            FileOutputStream fos = new FileOutputStream("Java30_copy_copy.pptx");
        ) {
            byte[] buf = new byte[1024];
            int len;
            while (true) {
               len = fis.read(buf);
               if(len == -1) {
                   break;
               }
               fos.write(buf, 0, len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
