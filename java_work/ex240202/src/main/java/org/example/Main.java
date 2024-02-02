package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("BOX");
        set.add("ROBOT");
        set.add("BOX");
        set.add("TOY");
        set.add(new String("BOX"));
        System.out.println(set);

        // 반복문을 통한 배열 값 추출
        for(String i : set) {
            System.out.print(i + "\t");
        }
        System.out.println();
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            String tmp = itr.next();
            System.out.print(tmp + "\t");
        }

        // hashCode() : 인스턴스가 중복인지 아닌지를 구별한다.
        System.out.println(new String("BOX").hashCode());
        System.out.println(new String("BOX").hashCode());
    }
}