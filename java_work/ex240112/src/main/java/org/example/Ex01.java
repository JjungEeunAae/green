package org.example;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer = "";
        System.out.println("문자열 입력");
        String str = sc.next();

        System.out.println("숫자 입력");
        int n = sc.nextInt();

        System.out.println(str + ", " + n);

        for(int i = 0 ; i < 5 ; i++) {
            answer += str;
        }
        System.out.println(answer);
    }
}
