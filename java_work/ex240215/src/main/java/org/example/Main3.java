package org.example;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main3 {
    public static void main(String[] args) {
        String[] str_arr = {"홍","김","박"};

        // for문 활용
        for(String s : str_arr) {
            System.out.println(s);
        }

        System.out.println();

        // Stream 인터페이스 활용
        Stream<String> stream = Arrays.stream(str_arr);
        stream.forEach(s-> System.out.println(s));

        System.out.println();

        // 코드를 더욱 간결하게!
        Arrays.stream(str_arr).forEach(s -> System.out.println(s));
        //Arrays.stream(str_arr).forEach(System.out::println); // 메소드 참조 형식
    }
}
