package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Toy");
        list.add("Robot");
        list.add("Car");

        System.out.println(list);

        for(int i = 0 ; i < list.size() ; i++) {
            System.out.print(list.get(i) + " ");
        }

        // list 첫번째 칸에 있는 문자열 삭제
        list.remove(0);
        System.out.println();

        for(String i : list) {
            System.out.println(i);
        }

        // 람다식
        Stream.of(list).forEach(item -> System.out.println(item));
        Stream.of(list).forEach(System.out::println);
    }
}
