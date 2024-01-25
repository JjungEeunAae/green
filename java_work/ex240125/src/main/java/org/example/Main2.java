package org.example;

interface A {
    public void doA();
    default public void doB() {
        System.out.println("A default method");
    }

    static public void doC() {
        System.out.println("A static method");
    }
}

public class Main2 {
    public static void main(String[] args) {
        A a = new A() {
            @Override       // doA() 재정의
            public void doA() {
                System.out.println("A doA()");
            }
        };

        a.doA();
        a.doB();

        System.out.println();
        // 오버라이드할 메서드가 2개 이상이면 람다식을 사용할 수 없다.
//        A a2 = () -> {
//            System.out.println("람다");
//        };
//
//        a2.doA();
//        a2.doB();
    }
}
