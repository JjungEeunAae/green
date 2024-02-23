package org.example.conf;

import org.example.member.MemberDAO;
import org.example.member.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Myconf {

    @Bean
    public MemberDAO memberDAO() {
        MemberDAO md = new MemberDAO();
        return md;
    }

    @Bean
    public MemberService memberService() {
        MemberService service = new MemberService(memberDAO());
        return service;
    }
}
