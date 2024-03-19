package com.ea.restapi05.test;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {
    private final PasswordEncoder passwordEncoder;

    @GetMapping("test")
    public String test() {
        String pw = passwordEncoder.encode("1234");
        return pw;
    }
}
