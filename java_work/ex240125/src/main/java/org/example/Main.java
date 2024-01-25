package org.example;

interface Printable {
    public void print(String str);

    default public void doA() {
        System.out.println("Printable의 doA 메서드입니다.");
    }
}

interface CMTKPrintable extends Printable {
    public void printCMYK(String str);
}

class SPrint implements Printable {
    @Override
    public void print(String str) {
        System.out.println("삼성 프린트 출력합니다.");
        System.out.println(str);
    }
}

class LPrint implements Printable {
    @Override
    public void print(String str) {
        System.out.println("엘지 프린트 출력합니다.");
        System.out.println(str);
    }
}

class PRN909 implements CMTKPrintable {
    @Override
    public void print(String str) {
        System.out.println("흑백출력");
        System.out.println(str);
    }

    @Override
    public void printCMYK(String str) {
        System.out.println("컬러출력");
        System.out.println(str);
    }
}

public class Main {
    public static void main(String[] args) {
        String doc = "REPORT";

        SPrint sp = new SPrint();
        sp.print(doc);

        LPrint lp = new LPrint();
        lp.print(doc);

        // 람다식
        // 클래스가 아닌 인터페이스로 선언하여 재정의 해주어야 한다.
//        Printable pRamda = (str) -> {
//            System.out.println("람다식으로 프린트 출력합니다.");
//        };
//        pRamda.print(doc);

        PRN909 prn909 = new PRN909();
        prn909.print("흑백을 출력합니다.");
        prn909.printCMYK("컬러를 출력합니다.");
    }
}