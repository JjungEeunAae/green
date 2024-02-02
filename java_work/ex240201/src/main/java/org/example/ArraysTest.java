package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArraysTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("aaa","bbb","cccc");
        System.out.println(list);

        // 불변객체이기 때문에 값을 추가할 수 없음
//        list.add("eee");

        // 새로운 객체를 생성하여 값을 넣어주어야 한다.
        List<String> list2 = new ArrayList<>(list);

        // 하나의 값만 넣어주기
        list2.add("eee");
        System.out.println(list2);

        // 한방에 여러 값 넣어주기
        list2.addAll(Arrays.asList("fff","ggg","hhh"));
        System.out.println(list2);

        List<String> list3 = new LinkedList<>(list);
    }
}
