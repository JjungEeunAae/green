package org.example;

import org.example.conf.Myconf;
import org.example.member.MemberDTO;
import org.example.member.MemberService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static AnnotationConfigApplicationContext acac;

    public static void main(String[] args) {
        acac = new AnnotationConfigApplicationContext(Myconf.class);
        processNewCommand();    // 함수호출
        processListCommand();
    }

    // list User 조회
    private static void processListCommand() {
        MemberService ms = acac.getBean(MemberService.class);
        ms.list();
    }

    // insert User 등록
    private static void processNewCommand() {
        MemberService ms = acac.getBean(MemberService.class);

        MemberDTO md = MemberDTO.builder()
                                .email("aaa@aaa.com")
                                .name("hong")
                                .password("1234")
                                .confirmpPssword("1234")
                                .build();
        // 두 개의 패스워드가 같지않으면
        if(!md.isEqualPassword()) {
            System.out.println("정신차리고 비밀번호 다시 쳐라");
            return;
        }
        ms.regist(md);
    }
}