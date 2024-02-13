package org.example;

import java.util.function.Predicate;

public class Main3 {
    public static void doPredicate(Predicate<Integer> p, int i) {
        boolean result = p.test(i);
        System.out.println(result);
    }
    public static void main(String[] args) {
        doPredicate(integer -> integer == 100 , 100);
    }
}
