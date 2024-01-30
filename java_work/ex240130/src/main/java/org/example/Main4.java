package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main4 {
    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(10,30,50);
        List<Integer> list = List.of(10,30,50);
        System.out.println(list);

        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()) {
            int tmp = itr.next();
            System.out.println(tmp);
        }

        // 불변인지 아는지 확인한다.
//        list.add(50);
//        list.remove(1);

        System.out.println(list);

        List<Integer> list2 = new ArrayList<>(list);
        System.out.println(list2);

        list2.add(60);
        System.out.println(list2);
    }
}
