package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex01 {
    // 문자열을 정렬할 수 있는 list를 만들어보자
    public static void main(String[] args) {
        List<String> list = Arrays.asList("weapon", "box", "toy", "robot");
        list = new ArrayList<>(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
