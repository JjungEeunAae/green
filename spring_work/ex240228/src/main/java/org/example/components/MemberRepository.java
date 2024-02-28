package org.example.components;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository // IOC 컨테이너에 등록
public class MemberRepository {
    @Autowired SqlSession session;
    
    public void insert() {
        // member.xml에 있는 insert와 연결
        session.insert("member.insert");
    }
}
