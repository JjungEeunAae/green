package org.example;

import org.example.util.Login;
import org.example.util.MyCLI;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MemberDB mem = new MemberDB();

        while (true) {
            int select = 0;

            if(Login.member != null && Login.getRole().equalsIgnoreCase("admin")) {
                select = printMenuAdmin();
            } else {
                select = printMenu();
            }

            if(select == 1) {
                mem.insert();
            } else if(select == 2) {
                if(!Login.login) {
                    Member loginResult = mem.login();
                    if(loginResult != null) {
                        Login.login = true;
                        Login.member = loginResult;
                    }
                } else {
                    System.out.println("이미 로그인이 되어있습니다.");
                }
            } else if(select == 6) {
                System.out.println("시스템을 종료합니다.");
                System.exit(0);
            }
        }
    }

    // user로 로그인하면 상품관리 불가
    // admin으로 로그인하면 상품 및 회원관리 가능

    public static int printMenu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("1.회원가입 |  2.로그인 | 3.물품보기");
        System.out.println("4.장바구니 | 5.주문목록 | 6.섭스종료");
        System.out.println("0.로그아웃");
        int menu = sc.nextInt();
        return menu;
    }

    public static int printMenuAdmin() {
        Scanner sc = new Scanner(System.in);

        System.out.println("1.회원가입 |  2.로그인 | 3.물품보기");
        System.out.println("4.장바구니 | 5.주문목록 | 6.섭스종료");
        System.out.println("7.상품등록 | 8.회원목록 | 0.로그아웃");
        int menu = sc.nextInt();
        return menu;
    }
}