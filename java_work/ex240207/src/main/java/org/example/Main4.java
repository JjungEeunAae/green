package org.example;

import java.util.*;

class StrComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}

public class Main4 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("aa","b","ccc","ddd","");
        list = new ArrayList<>(list); // asList를 쓰면 불변 객체가 되기 때문에 재정의 해주어야 한다.

        /*Collections.sort(list, new StrComp());
        System.out.println(list);*/

        Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };
        Collections.sort(list, comp);
        System.out.println(list);

        // return이 없으면 {} 생략 가능
        Collections.sort(list, (o1, o2) -> o1.length() - o2.length());
        System.out.println(list);
    }
}
