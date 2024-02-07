package org.example;

interface Printable {
    public void print();
}

class Paper {
    private String con;

    public Paper(String con) {
        this.con = con;
    }

    // 로컬
    public Printable getPrinter() {
        class Printer implements Printable {
            @Override
            public void print() {
                System.out.println(con);
            }
        }
        return new Printer();
    }

    // 익명
    public Printable getPrinter1() {
        return new Printable() {
            @Override
            public void print() {
                System.out.println(con);
            }
        };
    }

    // 람다
    public Printable getPrinter2() {
        return () -> {
            System.out.println(con);
        };
    }
}
public class Main3 {
    public static void main(String[] args) {
        Paper p = new Paper("내용");
        Printable printable = p.getPrinter();
        printable.print();
    }
}
