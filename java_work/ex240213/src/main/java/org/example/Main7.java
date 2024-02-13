package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Main7 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(11,22,33,44,55);
        list.forEach(integer -> System.out.print(integer + " "));
        System.out.println();

        Consumer<String> con = s -> System.out.println(s.length());
        con.accept("abdfe");
        con.accept("15123515");

        BiConsumer<String, String> biConsumer = (s, s2) -> System.out.println(s + " " + s2);
        biConsumer.accept("나는" , "우주의 먼지다!");

        //익명 인터페이스
        Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };
        consumer.accept(564);

        Consumer<Integer> con2 = (i -> System.out.println(i));
        con2.accept(15);
        System.out.println(con2);
    }
}
