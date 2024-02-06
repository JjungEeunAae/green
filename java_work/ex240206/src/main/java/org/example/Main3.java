package org.example;

public class Main3 {

    public static void showAllAfter(String... aa) {
        for(String s : aa) {
            System.out.println(s);
        }
    }

    public static void showAllBefore(String[] aa) {
        for(String s : aa) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        // 컴파일러가 다음과 같이 배열 기반 코드로 수정한다.
        showAllBefore(new String[]{"box"});
        System.out.println();
        showAllBefore(new String[]{"box","show"});
        System.out.println();
        showAllBefore(new String[]{"box","show","all"});

        System.out.println("----------------------------");

        showAllAfter("box");
        System.out.println();
        showAllAfter("box","show");
        System.out.println();
        showAllAfter("box","show","all");
    }
}
