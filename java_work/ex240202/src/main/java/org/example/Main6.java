package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main6 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "홍");
        map.put(2, "김");
        map.put(3, "최");

        System.out.println(map.get(1));
        System.out.println(map.get(3));
        System.out.println(map.get(2));

        Map<String, String> smap = new HashMap<>();

        smap.put("a", "홍");
        smap.put("b", "김");
        smap.put("c", "최");

        System.out.println(smap.get("a"));
        System.out.println(smap.get("b"));
        System.out.println(smap.get("c"));
    }
}
