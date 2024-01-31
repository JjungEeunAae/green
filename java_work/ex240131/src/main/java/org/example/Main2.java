package org.example;

public class Main2 {
    public static void main(String[] args) {
        double a = 0.999999;
        double b = 0.000001;

        System.out.println(a+b);
        double c = 0.001;

        for(int i = 0 ; i < 1000 ; i++) {
            c += c; // 1.0715086071862673E298 -> 오차의 실수범위
            // 이유는 2진수이기 때문이다.
        }

        System.out.println(c);

    }
}
