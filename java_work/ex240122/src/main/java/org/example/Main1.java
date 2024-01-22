package org.example;

class Man {
    private String name;
    Man() { System.out.println("Man 부모 생성자"); }
    Man(String name){ this.name = name; }
    public void yourName() { System.out.println("name = " + name); }
}

class BusinessMan extends Man { // Man 클래스 안에 있는 필드명과 메서드를 사용할 수 있다.
    private String company;
    private String position;

    BusinessMan() {
        // 슈퍼 : 부모클래스를 가르킨다(생략가능)
        // 부모클래스 필드명이 private으로 되어있지 않으면 super(name)으로 가르키면 됨
//        super();
        System.out.println("기본생성자");
    }; //기본생성자
    BusinessMan(String company, String position, String name) { // 기본생성자
        // this(); : 기본생성자를 가르킨다.
//        this();
        super(name);
        System.out.println("다른생성자");
        this.company = company;
        this.position = position;
    }

    public void yourInfo() {
        System.out.println("company: " + company);
        System.out.println("position: " + position);
        yourName();
    };
}

public class Main1 {
    public static void main(String[] args) {
        BusinessMan bm = new BusinessMan("그린","학생","짱구");
        bm.yourInfo();
    }
}
