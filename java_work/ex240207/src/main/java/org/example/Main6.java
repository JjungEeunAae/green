package org.example;

class BB{
    public String a() {
        return "BB Test";
    }
};

//람다표현식을 위한 인터페이스 생성
interface In {
    public void interFnt();
}

public class Main6 {
    // non-static 영역
    public Main6() {
        // 생성자를 통해 메소드를 호출할 수 있다.
        doA(100, new BB(), () -> {
            System.out.println("어쩔티비");
        });
    }

    // non-static 영역
    public void doA(int a, BB b, In inter) {
        System.out.println("test");
        System.out.print(a + ", " + b.a() + ", ");
        inter.interFnt();
    }

    public static void main(String[] args) {
        /*Main6 m = new Main6();
          m.doA();*/

        // 생성자로 메소드를 호출한 방법
        new Main6();
    }
}
