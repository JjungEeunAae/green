package org.example;

class A1 {
    private String name;
    public A1() {};
    public A1(String name) {
        this.name = name;
    }
    //setter 생성
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "A1{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class Main2 {
    public static void main(String[] args) {
        // 생성자로 클래스변수 private 값을 바꿀 수 있다.
        A1 a = new A1("A1");
        System.out.println(a);

        // 클래스변수 private setter 값을 바꿀 수 있다.
        A1 a2 = new A1();
        a2.setName("A1 SETTER");
        System.out.println(a2);
    }
}
