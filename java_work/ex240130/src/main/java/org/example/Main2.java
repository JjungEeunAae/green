package org.example;

public class Main2 {
    public static void main(String[] args) {
        Box<String> box1 = new SteelBox<String>();
//        Box<String> box2 = new SteelBox<Integer>();

        Box<Integer> box2 = EmptyBoxFactory.<Integer>makeBox();
        box2.setObj(10);
        Box<String> box3 = EmptyBoxFactory.makeBox();
        box3.setObj("넣었다");

//        Box<Integer> box4 = EmptyBoxFactory.peekBox(box2);
        EmptyBoxFactory.peekBox(box2);
        EmptyBoxFactory.peekBox(box3, "문자열");
    }
}
