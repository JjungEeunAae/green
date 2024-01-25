package org.example;

public class Main6 {
    public static void main(String[] args) {
        System.out.println("시작");
        try {
            // 강제로 예외 발생 시킴
            throw new MyException2("새로운 예외");
        } catch (MyException2 e) {
            e.printStackTrace();
        }
        System.out.println("끝");

        System.out.println();

        System.out.println("시작");
        try {
            // 강제로 예외 발생 시킴
            throw new MyException();
        } catch (MyException e) {
            e.printStackTrace();
        }
        System.out.println("끝");
    }
}
