package org.example;

// 해당 클래스는 객체 담는 통이라고 생각하면 된다.
// IOC 컨테이너 = (스프링 객체 공장(팩토리))

import org.example.conponent.AA;
import org.example.conponent.BB;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppContext {
    // 객체를 넣겠다라는 어노테이션
    @Bean
    public AA aa() {
        return new AA();
    }

    @Bean
    public BB bb() {
        BB bb = new BB();
        bb.setHi(String.format("%s", "안녕하세요"));
        bb.getHi();
        return bb;
    }
}
