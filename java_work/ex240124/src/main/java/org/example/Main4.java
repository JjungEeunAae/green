package org.example;

import org.example.print.Printable;

import java.util.ArrayList;
import java.util.List;

public class Main4 {
    public static void doA(Printable prn) {
        prn.print();
    }
    public static void main(String[] args) {
        // doA 메서드는 매개변수로 인터페이스를 받는다.
        doA(()-> {
            System.out.println("함수");
        });

        /* List<String> list = new ArrayList<>();
           list.add("aa");
           list.add("bb");
           list.add("cc");
         */

        // 위의 방법을 코드 한줄로 줄여버림.
        // List.of() : 리스트를 한번에 만드는 것과 같음
        List<String> list = List.of("aa","bb","cc","aac","aab");

        // stream() : 컬렉션에 저장되어 있는 엘리트먼트들을 하나씩 순회하면서 처리하는 코드패턴
        list.forEach((item)->{
            System.out.println(item);
        });

        System.out.println();
        // filter() : 새로운 List 생성(가상)
        // contains() : 괄호 안에 넣은 String을 stream을 통해 각각 순회하면서 찾아낸다.
        // forEach() : 찾아낸 String을 반복하면서 출력한다.
        list.stream().filter(item -> item.contains("aa"))
                     .forEach(System.out::print);
    }
}
