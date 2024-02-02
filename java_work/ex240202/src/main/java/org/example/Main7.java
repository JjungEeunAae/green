package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main7 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "홍");
        map.put(2, "김");
        map.put(3, "최");

        Set<Integer> s = map.keySet();
        System.out.println(s);  // [1, 2, 3]
        for(int tmp : s) {
            System.out.println(map.get(tmp));
        }

        System.out.println();

        Map<String, String> smap = new HashMap<>();
        smap.put("a", "홍");
        smap.put("b", "김");
        smap.put("c", "최");

        Set<String> s2 = smap.keySet(); // [a, b, c]
        System.out.println(s2);
        for(String tmp : s2) {
            System.out.println(smap.get(tmp));
        }
    }
}
