package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("이메일 입력");
        String email = sc.nextLine();
        System.out.println("주소 입력");
        String addr = sc.nextLine();
        System.out.println("이름 입력");
        String name = sc.nextLine();
        System.out.println("비번 입력");
        String pw = sc.nextLine();

        MemberDB mem = new MemberDB();
        Member me = new Member(addr, email, name, pw);
        mem.insert(me);
    }
}