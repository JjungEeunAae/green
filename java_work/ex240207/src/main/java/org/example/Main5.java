package org.example;

interface AA {
    public void aa(String a);

    default void bb() {
        System.out.println("뭄체가 있는 인터페이스 디폴트 메소드");
    }

    static void cc() {
        System.out.println("몸체가 있는 인터페이스 스태틱 메소드");
    }
}

//class newAA implements AA {
//    @Override
//    public void aa() {
//        System.out.println("고전방식");
//    }
//}

public class Main5 {
    public static void main(String[] args) {
        // 람다식
        AA be_laa = (String s) -> {
            System.out.println(s);
        };

        // 람다식 : 타입 생략이 가능하다. 컴파일러가 알아서 타입을 매칭한다.
        AA af_laa = (s) -> {
            System.out.println(s);
        };

        be_laa.aa("매개변수에 String(타입)이 같이 있음");
        af_laa.aa("매개변수에 String(타입)을 생략하였음");
    }
}
