package org.example.OptionalTest;

import java.util.Optional;

public class Main9 {
    public static void main(String[] args) {
        Optional<ContInfo> ci = Optional.of(new ContInfo(null, "Republic of Korea"));

        String phone = ci.map(c -> c.getPhone()).orElse("폰번호 없음");
        String addr = ci.map(c -> c.getAddr()).orElse("주소 없음");

        System.out.println(phone + ", " + addr);
    }
}
