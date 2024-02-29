package com.example.chap06.conf;

import com.example.chap06.filter.MyFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class MyFilterConfig {

    @Bean
    public FilterRegistrationBean<MyFilter> myFilterFilterRegistrationBean() {
        FilterRegistrationBean<MyFilter> myFilterFilterRegistrationBean
                = new FilterRegistrationBean<>();

        // 어떤 필터를 쓸 것인지?
        myFilterFilterRegistrationBean.setFilter(new MyFilter());
        // 어떤 URL에 사용할 것인지?
        myFilterFilterRegistrationBean.setUrlPatterns(Arrays.asList("/member/list"));
        return myFilterFilterRegistrationBean;
    }
}
