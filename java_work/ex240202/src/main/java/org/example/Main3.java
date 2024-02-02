package org.example;

import java.util.TreeSet;

public class Main3 {
    public static void main(String[] args) {
        // Integer
        TreeSet<Integer> t = new TreeSet<>();
        t.add(10);
        t.add(20);
        t.add(30);
        t.add(40);
        t.add(5);
        System.out.println(t + "\n");

        // String
        TreeSet<String> t2 = new TreeSet<>();
        t2.add("aa");
        t2.add("bb");
        t2.add("zz");
        t2.add("cc");
        System.out.println(t2);
    }
}
