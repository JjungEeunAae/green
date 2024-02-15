package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // stream

        // 배열
        int[] ar = {1,2,3,4,5};
        IntStream is_arr = Arrays.stream(ar);       // stream은 파이프라고도 말한다.(통과한다)
        is_arr.forEach(System.out::println);        // 메소드 참조 형식
        // is_arr.forEach(s -> System.out.println(s)); // 람다식

        // 위의 코드를 아래의 코드처럼 간결하게 만들 수 있다.
        Arrays.stream(ar).forEach(value -> System.out.println(value));

        System.out.println();

        // List 컬렉션
        List<Integer> list = Arrays.asList(11,22,33,44,55);
        Stream<Integer> is_list = list.stream();
        is_list.forEach(System.out::println);

        // 위의 코드를 아래의 코드처럼 간결하게 만들 수 있다.
        list.stream().forEach(System.out::println);
    }
}