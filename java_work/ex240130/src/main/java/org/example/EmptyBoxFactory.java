package org.example;

public class EmptyBoxFactory {
    public static <T> Box<T> makeBox() {
        Box<T> box = new Box<T>();
        return box;
    }

    public static void outBox(Box <? extends Toy> box,Toy n) {
//        box.setObj(new Toy());
        Toy toy = box.getObj();
        System.out.println(box);
    }

    public static void inBox(Box <? super Toy> box,Toy n) {
        box.setObj(new Toy());
//        Toy toy = box.getObj();
        System.out.println(box);
    }

    public static <T> void peekBox(Box<T> box) {
        System.out.println(box);
    }

    // 오버로딩이 되지 않음(똑같은 메서드로 봄)
    public static void peekBox(Box<?> box, String a) {
        System.out.println(box + ", " + a);
    }
}
