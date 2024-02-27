package org.example;

import org.example.comf.MyConf;
import org.example.member.Member;
import org.example.member.MemberService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConf.class);

        String[] str = context.getBeanDefinitionNames();
        Arrays.stream(str).forEach(System.out::println);

        /*LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        System.out.println(formatter.format(now));*/

        Member member1 = Member.builder().email("aa@aaa.com").name("jung").password("1234").wdate(LocalDateTime.now()).build();
        Member member2 = Member.builder().email("bb@bbb.com").name("choi").password("5678").wdate(LocalDateTime.now()).build();

        /*Member member1 = new Member("aa@aaa.com","jung","1234",LocalDateTime.now());
        Member member2 = new Member("bb@bbb.com","choi","5678",LocalDateTime.now());*/

        MemberService service = context.getBean(MemberService.class);
        /*service.Regist(member1);
        service.Regist(member2);

        service.list();*/

        //MemberService services = context.getBean(AABBService.class);

        context.close();
    }
}