package com.git.ex03.member;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;

@Data
public class MemberService {
    @Autowired MemberRepository memberRepository;

    public void regist(Member member) {
        memberRepository.insert(member);
    }

    public void list() {
        Collection<Member> collection = memberRepository.select();

        System.out.println("collection >>>> " + collection);

        // 콘솔 출력
        collection.stream().forEach(System.out::println);
    }
}
