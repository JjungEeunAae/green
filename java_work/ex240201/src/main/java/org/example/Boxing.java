package org.example;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Boxing {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();

        // 박싱
        list.add(10);
        list.add(20);
        list.add(30);

        int n;

        // 반복문 : for문
        for(Iterator<Integer> itr = list.iterator() ; itr.hasNext() ; ){
            // 언박싱
            n = itr.next();
            System.out.println(n);
        }

        System.out.println();

        // 반복문 : while
        Iterator<Integer> itr = list.iterator();    //
        while (itr.hasNext()) {
            // 언박싱
            n = itr.next();
            System.out.println(n);
        }
    }
}
