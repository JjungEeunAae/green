package org.example.cart;

import org.example.Main;

import java.util.Scanner;

public class CartCLI {
    private Scanner sc = new Scanner(System.in);
    public int inputItem() {
        Main.id.select();   // ItemDB select method
        System.out.println("장바구니에 등록할 상품번호를 입력하세요.");
        int idx = sc.nextInt();

        return idx;
    }
}
