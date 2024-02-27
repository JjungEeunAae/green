package com.git.ex03.conf;

import com.git.ex03.member.MemberRepository;
import com.git.ex03.member.MemberService;
import com.git.ex03.myanno.ManualBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(value = "aa.bb.cc"
            // ManualBean이라고 되어있는건 등록하지 말라는 뜻
            , excludeFilters = {
                @ComponentScan.Filter(type= FilterType.ANNOTATION, classes = ManualBean.class)
            })
public class MyConf {
    @Bean
    public MemberService memberService() {
        return new MemberService();
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemberRepository();
    }
}
