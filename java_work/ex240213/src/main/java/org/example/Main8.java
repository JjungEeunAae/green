package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntFunction;

public class Main8 {
    public static void main(String[] args) {
//        Function<String, Integer> fn = s -> s.length();
//        System.out.println(fn.apply("robot"));
//        System.out.println(fn.apply("System"));

        List<String> list = Arrays.asList("robot","system","test");
        for(int i = 0 ; i < list.size() ; i++) {
            System.out.println(list.get(i).length());
        }

        // JAVA 8 버전 이상
        list.stream()
                .map(s -> s.length())
                .forEach(integer -> System.out.println(integer));


        int num = 10;
        System.out.println(((Integer) num).getClass().getSimpleName());

        IntFunction<String> stringIntFnt = value -> value + "";
        String result = stringIntFnt.apply(num);
        System.out.println(result.getClass().getName());
    }
}
