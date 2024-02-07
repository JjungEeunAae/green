package org.example;

class Outer {
    private static int num = 0;
    public static class Nested1 {
        public void add (int n) { num+=n; }
    }
    public static class Nested2 {
        public int get() {
            int a = 10;
            return num + a;
        }

        public void doPrint() {
            System.out.println(num);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Outer.Nested1 on1 = new Outer.Nested1();
        Outer.Nested2 on2 = new Outer.Nested2();

        on1.add(100);
        System.out.println(on2.get());
        on2.doPrint();
    }
}