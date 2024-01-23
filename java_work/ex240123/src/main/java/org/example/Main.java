package org.example;

import org.example.myclass.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 배열로 선언하면 크기를 미리 설정해줘야해서 메모리 공간 차지가 심각하다.
        // Member[] mem_arr = new Member[100];

        // 컬렉션 사용
        List<Member> list = new ArrayList<>();


        Member mem = new Member("홍길동", 20);
        System.out.println(mem);

        Member mem2 = new Member("짱구",5);
        System.out.println(mem2);

        list.add(mem);
        list.add(mem2);
        System.out.println(list);

        Member mem3 = list.get(0);
        System.out.println(mem3);
    }
}