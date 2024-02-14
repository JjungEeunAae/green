package org.example.OptionalTest;

import java.util.Optional;

public class Main10 {
    public static void main(String[] args) {
        Friend f = new Friend("홍길동", new Company("회사명", null));

        Optional<Friend> optionalFriend = Optional.of(f);

        // 람다식
        String addr = optionalFriend.map(friend -> friend.getCon())
                .map(company -> company.getContInfo())
                .map(contInfo -> contInfo.getAddr())
                .orElse("주소 없음");

        // 메소드 참조 방식
        String addr2 = optionalFriend.map(Friend::getCon)
                .map(Company::getContInfo)
                .map(ContInfo::getAddr)
                .orElse("주소 없음");

        System.out.println(addr);
        System.out.println(addr2);
    }
}
