package org.example;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("aaa", "bbb", "ccc", "Ddd");

        Instant before = Instant.now();
        System.out.println("before >> " + before);

        list.stream().forEach(System.out::print);
        System.out.println();

        Instant after = Instant.now();
        // System.out.println(after.getNano());

        // Duration : 시간의 차를 구함
        Duration between1 = Duration.between(before, after);
        System.out.println("List 시간차 " + between1);

        before = Instant.now(); // 초기화

        for(String s : list) {
            System.out.print(s);
        }
        System.out.println();

        after = Instant.now();  // 초기화

        Duration between2 = Duration.between(before, after);
        System.out.println("Array 시간차 " + between2);
    }
}
