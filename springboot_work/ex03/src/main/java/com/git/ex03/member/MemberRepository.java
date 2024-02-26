package com.git.ex03.member;

import java.util.*;

public class MemberRepository {
    // <email, email에 대한 Member 필드값>
    Map<String, Member> map = new HashMap<>();

    public void insert(Member member) {
        map.put(member.getEmail(), member);
    }

    public Collection<Member> select() {
        // map의 Key값을 가지고 오는 방법
        //Set<String>  keys = map.keySet();

        // map의 value를 가져옴
        return map.values();
    }
}
