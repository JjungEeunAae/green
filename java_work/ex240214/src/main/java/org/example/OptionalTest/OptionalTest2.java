package org.example.OptionalTest;

import java.util.Optional;

public class OptionalTest2 {

    public static void main(String[] args) {

        Optional<String> os1 = Optional.of("TOY");
        Optional<String> os2 = Optional.ofNullable("ROBOT");
        Optional<String> os3 = Optional.empty();

//        os1.ifPresent(s -> System.out.println(s));
//        os2.ifPresent(System.out::println);
//        os3.ifPresent(s -> System.out.println(s));

        if(os1.isPresent()) {
            System.out.println(os1.get());
        }

        if(os2.isPresent()) {
            System.out.println(os2.get());
        }

        if(os3.isPresent()) {
            System.out.println(os3.get());
        }
    }
}
