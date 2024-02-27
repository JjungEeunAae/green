package org.example.member;

import org.example.component.AABBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class MemberService {
    @Autowired
    @Qualifier("AABBService")
    AABBService aammcc;

    @Autowired MemberDAO memberDAO;

    public void Regist(Member member) {
        // member map 등록
        memberDAO.insert(member);
    }

    public void list() {
        // 내용출력
        Collection<Member> collection = memberDAO.select();
        collection.forEach(System.out::println);
    }
}
