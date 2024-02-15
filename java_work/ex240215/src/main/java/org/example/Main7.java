package org.example;

import java.util.Arrays;
import java.util.List;

public class Main7 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("BOX","ROBOT","COMPLEX","SIMPLE");

//        String result = list.stream()
//                            .reduce("AAAAAAAA", (s, s2) -> {
//                                if(s.length() > s2.length()) {
//                                    return s;
//                                } else {
//                                    return s2;
//                                }
//                            });

        //데이터가 클 때 속도개선을 할 수 있다.
        String result = list.parallelStream()
                .reduce("", (s, s2) -> {
                    if(s.length() > s2.length()) {
                        return s;
                    } else {
                        return s2;
                    }
                });

        System.out.println(result);
    }
}
