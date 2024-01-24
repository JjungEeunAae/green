package org.example.print;

public class Main3 {
    public static void main(String[] args) {
        Print p = new Print();
        p.print();

        // 이렇게도 재정의가 가능하다.
        Printable printable = new Printable() {
            @Override
            public void print() {
                System.out.println("프린트 됩니다.");
            }
        };
        printable.print();


        // 람다식
        Printable lamda = () -> {
            System.out.println("람다");
        };
        lamda.print();
    }
}
