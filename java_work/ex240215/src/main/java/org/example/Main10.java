package org.example;

import java.util.stream.IntStream;

public class Main10 {
    public static void main(String[] args) {
        System.out.println(IntStream.of(1,3,5,7,9).sum());

        System.out.println(IntStream.of(1,3,5,7,9).count());

        // ifPresent() : 값이 없으면 예외처리, 있으면 결과값 출력
        IntStream.of(1,3,5,7,9).average().ifPresent(System.out::println);

        IntStream.of(1,3,5,7,9).max().ifPresent(System.out::println);

        IntStream.of(1,3,5,7,9).min().ifPresent(System.out::println);

        double avg = IntStream.of(1,3,5,7,9).average().orElse(0);
        System.out.println(avg);
    }
}
