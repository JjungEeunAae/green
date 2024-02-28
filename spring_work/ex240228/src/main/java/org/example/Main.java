package org.example;

import org.example.components.MemberService;
import org.example.conf.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        MemberService service = context.getBean(MemberService.class);
        service.regist();


        /*String[] arr = context.getBeanDefinitionNames();
        Arrays.stream(arr).forEach(System.out::println);*/

        context.close();
    }
}