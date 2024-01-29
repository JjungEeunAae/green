package org.example.util;

import org.example.member.Member;

public class Login {
    // DBmember를 담는 것
    public static Member member;
    // 로그인 여부를 저장
    public static boolean login = false;

    public static String getRole() {
        return member.getRole();
    }

}
