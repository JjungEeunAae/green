package org.example;

import java.util.function.Consumer;

interface AA {
    public void doA();
}

public class Main {
    public static void aa(AA aa, String str) {
        aa.doA();
    }

    public static void aa1(Consumer<String> con, String str) {
        con.accept(str);    // accept 함수를 재정의
    }

    public static void main(String[] args) {
        AA a = () -> {
            System.out.println("hello!");
        };
        a.doA();

        aa(() -> {
            System.out.println("함수 매개변수 보내기");
        }, "문자열");

        aa1(s -> {
            System.out.println(s);
        },"consumer로 만들어졌다.");

    }
}