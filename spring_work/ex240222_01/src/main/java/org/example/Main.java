package org.example;

import org.example.conponent.AA;
import org.example.conponent.BB;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                // 괄호 안에 객체담는 통이라는걸 만들어 줘야 함
                new AnnotationConfigApplicationContext(AppContext.class);

        BB bb = context.getBean(BB.class);
        System.out.println(bb.getHi());

        /*AA a1 = context.getBean(AA.class);
        //System.out.println(a1);

        AA a2 = context.getBean(AA.class);
        //System.out.println(a2);

        a1.setName("감사합니다 땡큐");

        System.out.println(a1.getName());
        System.out.println(a2.getName());
        System.out.println(a1 == a2);*/

        context.close();    // 종료를 함으로써 자원을 없앤다.
    }
}