package com.ea.restapi05.member;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("member")
public class MemberController {
    private final MemberService service;

    @GetMapping()
    public String member(){
        return "member";
    }

    @PostMapping()
    public String member(@Valid @RequestBody MemberDTO memberDTO) {
        System.out.println(memberDTO.toString());
        return "member";
    }

}
