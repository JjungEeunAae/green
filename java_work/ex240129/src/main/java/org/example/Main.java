package org.example;

// 다형성으로 모든 객체는 부모 객체에 담을 수 있다.
class Apple {
    private String name;

    public Apple(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Orange {
    private String name;

    public Orange(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Orange{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Box<T> {     // 과일을 담을 수 있는 Box class 생성

    private T obj; // 모든 객체의 최상위라 어떠한 객체든 담을 수 있음.

    public Box() {};

    public Box(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "Box{" +
                "obj=" + obj +
                '}';
    }
}


public class Main {
    public static void main(String[] args) {
        Box<Apple> box_apple = new Box();
        box_apple.setObj(new Apple("사과"));

        Box<Orange> box_orange = new Box();
        box_orange.setObj(new Orange("오렌지"));

        Apple ap = box_apple.getObj();
        Orange or = box_orange.getObj();

//        Orange or2 = (Orange) box_apple.getObj();   // 오류
//        Apple ap2 = (Apple) box_orange.getObj();    // 오류
    }
}