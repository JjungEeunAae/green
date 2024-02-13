package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(11,22,44,55,66);
        list = new ArrayList<>(list);

        List<String> list2 = Arrays.asList("aa","ac","ab","ad","ae");
        list2 = new ArrayList<>(list2);

        //removeIf : boolean 값이 들어와야 함
        Predicate<Integer> predicate = (item) -> { return item < 33; };
        list.removeIf(predicate);

        list.removeIf(integer -> integer<33);

        System.out.println(list);

        list2.removeIf(s -> s.equals("aa"));
        System.out.println(list2);
    }
}
