package org.example.conf;

import org.example.aspect.TimeAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy // AOP 기능 활성화하겠다는 어느테이션을 정의
@ComponentScan({"org.example.aspect","org.example.components"})
public class AppCtx {
    @Bean
    public TimeAspect timeAspect() {
        return new TimeAspect();
    }
}
