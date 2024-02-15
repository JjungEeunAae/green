package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main5 {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("BOX","ROBOT", "SIMPLE");

        // stream에서는 String이였던 값들이 map을 만나고 int로 변환
//        Stream<Integer> is = list1.stream().map(s -> s.length());
//        is.forEach(System.out::println);

        // map을 통해 새롭게 값을 형성한다로 이해하는게 맞을 듯
//        list1.stream().map(s -> s.substring(0,1)).forEach(System.out::println);
//        list1.stream().map(s -> s + "입니다.").forEach(System.out::println);


        Person p = new Person("홍", 20);
        Person p2 = new Person("이", 20);
        Person p3 = new Person("최", 30);
        Person p4 = new Person("박", 34);

        List<Person> list = Arrays.asList(p, p2, p3, p4);

//        list.stream()
//                .map(pe -> pe.getName())
//                .forEach(System.out::println);
//
//        // for문 활용
//        for(Person pe : list) {
//            System.out.println(pe.getName() + "씨 입니다.");
//        }

        int sum = list.stream()
                        .map(pe -> pe.getAge())
                        .filter(integer -> integer >= 25)
                        .reduce(0, (integer, integer2) -> integer += integer2);
        System.out.println(sum);

        sum = 0;

        sum = list.stream()
                .mapToInt(pe -> pe.getAge())
                .filter(integer -> integer >= 25)
                .sum();

        System.out.println(sum);


//        for(Person pe : list) {
//            if(pe.getAge() >= 25) {
//                sum += pe.getAge();
//            }
//        }
//        System.out.println(sum);
    }
}
