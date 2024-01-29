package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {
        List<Apple> apple = new ArrayList<>();

        apple.add(new Apple("사과"));
        apple.add(new Apple("사과2"));
        apple.add(new Apple("사과3"));

        System.out.println(apple);
    }
}
