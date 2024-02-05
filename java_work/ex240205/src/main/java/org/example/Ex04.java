package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex04 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("box", "robot", "apple");
        list = new ArrayList<>(list);

        List<String> copyList = Arrays.asList(new String[list.size()]);
        Collections.copy(copyList, list);
        System.out.println(copyList);

        List<String> newList = list.stream().toList();
        System.out.println(newList);

//        copyList.set(0, "aa");
        System.out.println(list);

//        int idx = Collections.binarySearch(list, "robot");
//        System.out.println(idx);
//
//        System.out.println(list.get(idx));

//        int num = 0;
//        for(String i : list) {
//            num++;
//            if(i.equals("robot")) {
//                System.out.println(i + " " + (num-1));
//            }
//        }
    }
}
