package org.example.member;

import java.time.LocalDate;
import java.util.Collection;

public class MemberService {
    private MemberDAO memberDAO;

    public MemberService(MemberDAO dao) {
        this.memberDAO = dao;
    }

    public void regist(MemberDTO md) {
        Member member = new Member(0
                                    ,md.getEmail()
                                    , md.getName()
                                    , md.getPassword()
                                    , md.getConfirmpPssword()
                                    , LocalDate.now());
        memberDAO.insert(member);
    }

    public void list() {
        Collection<Member> collection = memberDAO.select();
        collection.stream().forEach(System.out::println);
    }
}
