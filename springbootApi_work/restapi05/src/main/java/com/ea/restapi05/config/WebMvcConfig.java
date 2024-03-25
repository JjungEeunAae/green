package com.ea.restapi05.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class WebMvcConfig {
    // 패스워드 암호화 클래스
    @Bean
    public PasswordEncoder passwordEnconder() {
        return new BCryptPasswordEncoder();
    }

    // 스프링 부터 3 버전은 람다문법을 써야지만 에러가 발생하지 않는다.
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http.csrf().disable();    // 스프링부트 2버전 방식
        //        http.csrf(c -> c.disable());  // 스프링부트 3버전 방식 1

        // 스프링부트 3버전 방식 2
        // post, put, delete 사용할 때 csrf 토근을 사용하지 않고 허용해주겠다.
        http.csrf(httpSecurityCsrfConfigurer -> httpSecurityCsrfConfigurer.disable());
        http
                .authorizeRequests(authorizeRequests ->
                        authorizeRequests
                                .requestMatchers("/**").permitAll()  // 해당 페이지는 접근을 허용한다.
                                .anyRequest().authenticated()             // 그 외 페이지는 허용이 필요하다.
                );

        return http.build();
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
