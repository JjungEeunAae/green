package com.ea.restapi05.member;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
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
        Member member2 = new Member();
        BeanUtils.copyProperties(memberDTO, member2);

//        ModelMapper mapper = new ModelMapper();
//        Member member = mapper.map(memberDTO, Member.class);
//        service.save(member);

        service.save(member2);
        return "member";
    }

}
