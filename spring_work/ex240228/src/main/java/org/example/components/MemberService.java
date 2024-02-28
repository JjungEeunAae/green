package org.example.components;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // IOC 컨테이너에 등록
public class MemberService implements InitializingBean, DisposableBean {
    // IOC 컨테이너에 있는 객체를 활용
    @Autowired MemberRepository memberRepository;

    private String str;

    @Override
    public void afterPropertiesSet() throws Exception {
        str = "jdbc:mysql://192.168.0.";
        System.out.println("IOC 컨테이너 들어갈 때!");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("IOC 컨테이너 없어질 때!");
    }

    public void regist() {
        memberRepository.insert();
    }
}
