package org.example;

import org.example.util.MyCLI;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MemberDB mem = new MemberDB();

        while (true) {
            int select = printMenu();

            if(select == 1) {
                mem.insert();
            } else if(select == 2) {
                boolean loginResult = mem.login();
                if(!loginResult) {
                    System.err.println("로그인에 실패하였습니다.");
                }

            } else if(select == 6) {
                System.out.println("시스템을 종료합니다.");
                System.exit(0);
            }
        }
    }

    public static int printMenu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("1.회원가입 |  2.로그인 | 3.물품보기");
        System.out.println("4.장바구니 | 5.주문목록 | 6.섭스종료");
        int menu = sc.nextInt();
        return menu;
    }
}