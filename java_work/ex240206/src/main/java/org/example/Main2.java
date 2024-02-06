package org.example;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        ENUM_STUDY_DB db = new ENUM_STUDY_DB();
        db.insert();
        db.select();
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.println("수정하고 싶은 ID?");
        int tmp = sc.nextInt();

        db.update(tmp);
        db.select();
        System.out.println();

        System.out.println("삭제하고 싶은 ID?");
        tmp = sc.nextInt();
        db.delete(tmp);
        db.select();
    }
}
