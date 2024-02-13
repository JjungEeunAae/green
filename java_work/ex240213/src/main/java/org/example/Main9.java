package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main9 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("aaa","bbb","ccc");
        list = new ArrayList<>(list);

        list.removeIf(s -> s.equals("aaa"));
        System.out.println(list);
    }
}
