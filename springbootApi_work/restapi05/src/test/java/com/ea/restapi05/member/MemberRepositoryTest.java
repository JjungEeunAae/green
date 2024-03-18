package com.ea.restapi05.member;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest // Bean 객체를 @Autowired를 통해 가져올 수 있도록 해주는 어노테이션
class MemberRepositoryTest {
    @Autowired private MemberRepository memberRepository;

    @BeforeEach
    public void init() {
        // DB에 있는 내용 전체 삭제하기
        System.out.println("DELETE ALL");
        memberRepository.deleteAll();
    }

    @Test
    public void saveTest() {
        Member member = Member.builder()
                                .username("user")
                                .password("1234")
                                .email("aa@aa.com")
                                .build();
        Member dbMember = memberRepository.save(member);

        // 두 개의 문자열이 일치한지 확인하는 방법
        assertEquals("dddd", dbMember.getUsername());
        assertEquals("aa@aa.com", dbMember.getEmail());
        assertEquals("1234", dbMember.getPassword());
    }

    @Test
    public void selectTest() {
        List<Member> list = memberRepository.findAll();
        for(Member member : list) {
            System.out.println(member);
        }
    }
}