package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("BOX","TOY","ROBOT","SAMPLE");
        list = new ArrayList<>();


        List<String> list_2 = new ArrayList<>();

        List<String> clist = Arrays.asList("BOX","TOY","ROBOT","SAMPLE");
        list.addAll(clist);
        System.out.println(list);

//        for(String s : list) {
//            if(s.length() > 3) {
//                list_2.add(s);
//            }
//        }
//        System.out.println(list_2);

//        List streamList = list.stream()
//                                .filter(s -> s.length() > 3)
//                                .collect(
//                                            () -> new ArrayList<>(),            // 어떻게 만들어주길 원하냐(저장소 생성)
//                                            (object,item) -> object.add(item), // 리스트 객체 안에 아이템을 어떻게 담을거냐
//                                            (list1, list2) -> list1.addAll(list2)// 병렬 스트림이면 인자를 추가해야 함 (순차 스트림에선 의미없음)
//                                        );
//
//        System.out.println(streamList);
//
//        List streamList2 = list.stream()
//                .filter(s -> s.length() > 3)
//                .collect(
//                            Collectors.toList()
//                        );
//        System.out.println(streamList2);


        // 병렬
    }
}
