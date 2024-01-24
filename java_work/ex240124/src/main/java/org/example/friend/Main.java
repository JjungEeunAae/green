package org.example.friend;

import org.example.friend.CompFriend;
import org.example.friend.Friend;
import org.example.friend.UniFriend;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        UniFriend[] uf = new UniFriend[5];
//        CompFriend[] cf = new CompFriend[5];
//
//        uf[0] = new UniFriend("김모씨","디자인","010-2345-2345");
//        uf[1] = new UniFriend("최모양","경영","010-4256-2523");
//
//        cf[0] = new CompFriend("이모씨","총무","010-2345-2345");
//        cf[1] = new CompFriend("정모양","개발","010-4256-2523");
//
//        System.out.println(uf[0]);
//        System.out.println(cf[0]);

        // 배열 방식
        Friend[] f = new Friend[5];

        f[0] = new UniFriend("김모씨","디자인","010-2345-2345");
        f[1] = new UniFriend("최모양","경영","010-4256-2523");
        f[2] = new CompFriend("이모씨","총무","010-2345-2345");
        f[3] = new CompFriend("정모양","개발","010-4256-2523");
        // f[4] : null
        System.out.println(Arrays.toString(f));

        System.out.println();

        // 리스트 방식
        List<Friend> f2 = new ArrayList<>();

        f2.add(new UniFriend("김모씨","디자인","010-2345-2345"));
        f2.add(new CompFriend("정모양","개발","010-4256-2523"));

        System.out.println(f2);
    }
}