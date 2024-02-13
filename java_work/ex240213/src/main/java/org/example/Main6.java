package org.example;

import java.util.function.Consumer;

public class Main6 {
    public static void main(String[] args) {
        Consumer<String> con = s -> {
            String temp = s + " " + s;
            System.out.println(temp);
        };

        con.accept("나는");
        con.accept("우주의");
        con.accept("먼지다.");
    }
}
