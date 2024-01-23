package com.mh.mybatistest.member;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {
    @Autowired MemberRepository member;

    @GetMapping("/test")
    public ResponseEntity<String> doA() {
        member.insert();
        return ResponseEntity.ok("SUCCESS");
    }
}
