package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,5,7,9);
        list = new ArrayList<>(list);

        Collections.reverse(list);  // 순서 뒤집기
        System.out.println(list);

        // 람다식
        Consumer<List<Integer>> consumer = lst -> Collections.reverse(lst);
        consumer.accept(list);      // 순서 뒤집기
        System.out.println(list);

        // static 메소드 참조형식(람다식을 더욱 짧게 할 수 있는 방법)
        Consumer<List<Integer>> consumer1 = Collections::reverse;
        consumer1.accept(list);
        System.out.println(list);
    }
}