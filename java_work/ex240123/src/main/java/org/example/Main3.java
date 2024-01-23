package org.example;

public class Main3 {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone("010-2412-4152","1.0");
        sp.playApp();   // 스마트폰 클래스 (자식클래스)
        sp.answer();    // 모바일폰 클래스 (부모클래스)

        // 부모객체             자식객체
        // 자식객체는 부모에게 담을 수 있다.      --
        //                                     | 다형성의 특징
        // 부모객체는 자식객체를 참조할 수 있다.   --
        MobilePhone mp = new SmartPhone("010-3534-2623","2.3");
        mp.answer();
        // 모바일에는 palyApp 메서드가 없기 때문에 playApp 메서드 사용이 불가하다.
    }
}
