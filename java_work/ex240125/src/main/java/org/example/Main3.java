package org.example;

interface Upper {
    default public String doUpper(String con) { return con.toUpperCase(); }
}

interface Lower {
    default public String doLower(String con) { return con.toLowerCase(); }
}

interface Printa {
    void doA(String con);
}

class MyPrinter implements Printa, Upper {

    @Override
    public void doA(String con) {
        System.out.println(doUpper(con));
    }
}

public class Main3 {
    public static void main(String[] args) {
        MyPrinter mp = new MyPrinter();
        mp.doA("hihihihihi");

        // 다형성의 특징
        // 자식객체를 부모 객체에 담을 수 있다.
        // 부모객체는 자식 객체를 참조할 수 있다.
        if(mp instanceof Upper) {
            Upper up = mp;
        }

        try {
            Lower lower = (Lower) mp;
            System.out.println("정상작동");
        } catch (ClassCastException cce) {
//            cce.printStackTrace();
            System.err.println("형변환 예외 발생");
        }

        System.out.println(mp instanceof Lower);
    }
}
