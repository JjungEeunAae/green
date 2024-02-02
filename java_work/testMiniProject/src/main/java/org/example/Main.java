package org.example;

import org.example.cart.CartDB;
import org.example.item.ItemDB;
import org.example.member.Member;
import org.example.member.MemberDB;
import org.example.orders.OrderDB;
import org.example.util.Login;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MemberDB mem = new MemberDB();
        ItemDB    id = new ItemDB();
        CartDB    cd = new CartDB();
        OrderDB   od = new OrderDB();

        while (true) {
            int select = 0;

            if(Login.member != null && Login.getRole().equalsIgnoreCase("admin")) {
                select = printMenuAdmin();
            } else {
                select = printMenuUser();
            }

            if(select == 1) {
                mem.insert();
            } else if(select == 2) {
                if(!Login.login) {
                    Member loginResult = mem.login();
                    System.out.println(loginResult);
                    if(loginResult != null) {
                        Login.login = true;
                        Login.member = loginResult;
                    }
                } else {
                    System.out.println("이미 로그인이 되어있습니다.");
                }
            } else if(select == 3) {
                if(Login.login) {
                    System.err.println("로그인 하셔야 로그아웃 할 수 있습니다.");
                } else {
                    Login.login = false;
                    Login.member = null;
                    System.out.println("로그아웃 되었습니다.");
                }
            } else if(select == 4) {
              id.select();
            } else if(select == 5) {
                if(Login.login) {
                    while (true) {
                        int cartSelect = printMenuCart();
                        if(cartSelect == 1) {
                            // 등록
                        } else if(cartSelect == 5) {
                            // 종료
                            break;
                        }
                    }
                } else {
                    System.err.println("로그인이 필요합니다.");
                }
            } else if(select == 7) {
                System.out.println("시스템을 종료합니다.");
                System.exit(0);
            } else if(select == 8 && Login.member != null
                    && Login.getRole().equalsIgnoreCase("admin")) {
                try {
                    id.insert();
                    System.out.println("상품등록 완료");
                } catch (SQLException e) {
                    //e.printStackTrace();
                    System.err.println("상품등록 실패" + e.getMessage());
                }
            }
        }
    }

    // 로그인이 되었을 때 보여주는
    public static int printMenuCart() {
        Scanner sc = new Scanner(System.in);

        System.out.println("1.등록 | 2.수정   | 3.삭제");
        System.out.println("4.목록 | 5.뒤로");
        int menu = sc.nextInt();
        return menu;
    }

    // user로 로그인하면 상품관리 불가
    // admin으로 로그인하면 상품 및 회원관리 가능
    public static int printMenuUser() {
        Scanner sc = new Scanner(System.in);

        System.out.println("1.회원가입 | 2.로그인   | 3.로그아웃");
        System.out.println("4.물품보기 | 5.장바구니 | 6.주문목록");
        System.out.println("7.섭스종료");
        int menu = sc.nextInt();
        return menu;
    }

    public static int printMenuAdmin() {
        Scanner sc = new Scanner(System.in);

        System.out.println("1.회원가입 | 2.로그인   | 3.로그아웃");
        System.out.println("4.물품보기 | 5.장바구니 | 6.주문목록");
        System.out.println("7.섭스종료 | 8.상품등록 | 9.회원목록");
        int menu = sc.nextInt();
        return menu;
    }
}