package org.example.OptionalTest;

import java.util.Optional;

public class Main7 {

    public static void main(String[] args) {
        Optional<String> os1 = Optional.of("Optional String");
        Optional<String> os2 = os1.map(s -> s.toLowerCase());

        System.out.println(os1);
        System.out.println(os1.get());

        System.out.println(".......................");

        System.out.println(os2);
        System.out.println(os2.get());

        System.out.println(".......................");

        Optional<String> os3 = os1.map(s -> s.replace(" ", "_"))
                                  .map(s -> s.toLowerCase());
        System.out.println(os3);
    }
}
