package org.example.member;

import java.util.Scanner;

public class MemberCLI {
    Scanner sc = new Scanner(System.in);

    public Member inputMember() {
        System.out.println("이메일 입력");
        String email = sc.nextLine();
        System.out.println("주소 입력");
        String addr = sc.nextLine();
        System.out.println("이름 입력");
        String name = sc.nextLine();
        System.out.println("비번 입력");
        String pw = sc.nextLine();

        return Member.builder()
                .email(email)
                .address(addr)
                .name(name)
                .password(pw)
                .build();
    }

    public Member loginMember() {
        System.out.println("이메일 입력");
        String email = sc.nextLine();
        System.out.println("비번 입력");
        String pw = sc.nextLine();

        return Member.builder()
                .email(email)
                .password(pw)
                .build();
    }
}
