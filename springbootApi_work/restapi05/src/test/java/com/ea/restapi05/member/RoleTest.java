package com.ea.restapi05.member;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class RoleTest {
    @Test
    public void test() {
        for(Role role : Role.values()) {
            System.out.println(role);
        }
    }
}