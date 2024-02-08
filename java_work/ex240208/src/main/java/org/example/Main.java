package org.example;

import java.util.*;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("robot","apple","banana","box","temp");
        list = new ArrayList<>(list);

        // 배열정렬은 Arrays.sort로 진행하면 된다.

        // 익명클래스
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        }); // List<E> 정렬

        // 익명클래스를 람다식으로 표현
        Collections.sort(list, (o1, o2) -> o1.length() - o2.length());

        // Comparator 인터페이스에 정렬할 수 있는 값을 보낸다.
        Comparator<String> comp = (o1, o2) -> o1.length() - o2.length();
        Collections.sort(list, comp);

        // list 값 출력
        list.stream().forEach( s -> System.out.print(s + "\t"));

        // 정의되어 있는 함수형 인터페이스를 사용하여 출력
        Consumer<String> con = (s) -> {
            System.out.print(s + " ");
            System.out.println(s.length());
        };
        list.stream().forEach(con);

    }
}