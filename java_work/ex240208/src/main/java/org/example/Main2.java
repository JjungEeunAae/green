package org.example;

interface Calu {
    void cal(int a, int b);
}

public class Main2 {
    public static void doA(int a, int b, Calu cc) {
        cc.cal(a, b);
    }
    public static void doA(Calu cc, int ...a) {
        cc.cal(a[0], a[1]);
    }

    interface RetCalcu {
        int cal(int a, int b);
    }

    public static void main(String[] args) {
        // 1
//        Calu cc = (a,b) -> System.out.println(a + b);
//        cc.cal(10, 20);
//
//        Calu cc1 = (a,b) -> System.out.println(a - b);
//        cc1.cal(10,20);

        // 2
//        Main2.doA(10, 20, (a, b) -> System.out.println(a+b));
//        Main2.doA(10, 20, (a, b) -> System.out.println(a-b));
//        Main2.doA(10, 20, (a, b) -> System.out.println((double) a/b));
//        Main2.doA(10, 20, (a, b) -> System.out.println(a*b));
//        Main2.doA(10, 20, (a, b) -> System.out.println(a%b));

        // 3
//        Main2.doA((a,b) ->System.out.println(a%b), 10,20,30);

        // 4
        // return 구문은 생략이 가능하다.
        RetCalcu rcc = (a, b) -> {return a + b;};
        int result = rcc.cal(10,4);
        System.out.println(result);
    }
}