package com.ea.restapi05.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class WebMvcConfig {
    // 패스워드 암호화 클래스
    @Bean
    public PasswordEncoder passwordEnconder() {
        return new BCryptPasswordEncoder();
    }

//    @Bean
//    public UserDetailsService userDetailsService() {
//        // 유저 관리하는 매너저 클래스
//        InMemoryUserDetailsManager userDetailsManager
//                        = new InMemoryUserDetailsManager();
//
//        UserDetails userDetails =  User.withUsername("user")
//                                        .password(passwordEnconder().encode("1234"))
//                                        .roles("USER")
//                                        .build();
//
//        // 유저 관리하는 매니저 클래스에 유저를 등록
//        userDetailsManager.createUser(userDetails);
//
//        // 유저 관리하는 매니저를 IOC 컨테이너에 등록 -> 스프링 시큐리티에서 사용 가능함
//        return userDetailsManager;
//    }
}
