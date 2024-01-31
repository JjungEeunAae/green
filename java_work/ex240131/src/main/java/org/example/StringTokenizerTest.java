package org.example;

import java.util.StringTokenizer;

public class StringTokenizerTest {

    public static void main(String[] args) {
        String a = "오후:08:22";

        // StringTokenizer 클래스 활용
        StringTokenizer st = new StringTokenizer(a, ":");
        while (st.hasMoreTokens()) {
            String tmp = st.nextToken();
            System.out.println(tmp);
        }

        System.out.println();

        // String 클래스의 split 메서드 활용
        String[] arr = a.split(":");
        for(String i : arr) {
            System.out.println(i);
        }
    }
}
