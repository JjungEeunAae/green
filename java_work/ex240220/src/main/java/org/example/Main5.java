package org.example;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main5 {
    // io + nio = nio2
    public static void main(String[] args) {
        Path p = Paths.get("nio2.dat");

        // -->io 방식
        // try(DataOutputStream dos = new DataOutputStream(new FilesInputStream(p))) {

        try(DataOutputStream dos = new DataOutputStream(Files.newOutputStream(p))) {
            dos.writeInt(10);
            dos.writeDouble(20.2);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try(DataInputStream dis = new DataInputStream(Files.newInputStream(p))) {
            int tmp = dis.readInt();
            double tmp1 = dis.readDouble();
            System.out.println("int > " + tmp + ", double > " + tmp1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
