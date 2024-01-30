package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Box<String>> boxList = new ArrayList<>();
        for(int i = 0 ; i < 10 ; i++) {
            Box<String> sBox = new Box<>();
            sBox.setObj("문자열" + i);
            boxList.add(sBox);
        }
        boxList.get(0).setObj("0번째만 바꿈");
        System.out.println(boxList);
    }
}