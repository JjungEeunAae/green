package com.ea.restapi05.member;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MemberServiceTest {
    @Autowired private MemberService service;
    @Autowired private MemberRepository memberRepository;

    @BeforeEach
    void setUp() {
        Member member = Member.builder()
                                .username("user1")
                                .password("1234")
                                .email("aa@aa.com")
                                .build();
        service.save(member);
    }

    @Test
    void save() {
        Member member = Member.builder()
                .username("user1")
                .password("1234")
                .email("aa@aa.com")
                .build();

        service.save(member);
    }
}