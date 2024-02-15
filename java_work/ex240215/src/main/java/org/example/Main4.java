package org.example;

import java.util.Arrays;
import java.util.List;

public class Main4 {

    public static void main(String[] args) {
        Person p = new Person("홍", 20);
        Person p2 = new Person("이", 20);
        Person p3 = new Person("최", 30);
        Person p4 = new Person("박", 34);

        List<Person> list = Arrays.asList(p, p2, p3, p4);

        // for문 활용
        for(Person pe : list) {
            if(pe.getAge() == 20) {
                System.out.println(pe);
            }
        }

        // stream 활용
        list.stream().filter(person -> person.getAge() == 20)
                     .forEach(System.out::println);


    }
}
