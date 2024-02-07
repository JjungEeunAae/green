package org.example;

class Outer2 {
    private int num = 0;
    public class Member {
        void add(int n) {
            num += n;
        }
        int get() { return num; }
    }
}

public class Main2 {
    public static void main(String[] args) {
        Outer2 o1 = new Outer2();       // 클래스를 사용하기 위해 인스턴스화를 진행
        Outer2.Member o1m = o1.new Member();
        o1m.add(100);
        System.out.println(o1m.get());

        Outer2 o2 = new Outer2();       // 클래스를 사용하기 위해 인스턴스화를 진행
        Outer2.Member o2m = o2.new Member();
        o2m.add(40);
        System.out.println(o2m.get());
    }
}
