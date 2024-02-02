package org.example.listTest;

import org.example.listTest.Item;
import org.example.listTest.ItemDB;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ItemDB id = new ItemDB();
        List<Item> list = id.findAll();

        Collections.sort(list);

        for(int i = 0 ; i < list.size() ; i++) {
            Item tmp = list.get(i);
            System.out.println(tmp);
        }
    }
}