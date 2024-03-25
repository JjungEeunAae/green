package com.ea.restapi05.member;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("member")
public class MemberController {
    private final MemberService service;

    @GetMapping()
    public String member(Authentication authentication){
        Member member = (Member) authentication.getPrincipal();
        return "getMember {email = " + member.getEmail() +
                            ", username = " + member.getUsername() +
                            ", role = " + member.getRole() + "}";
    }

    @PostMapping("join")
    public ResponseEntity<String> member(@Valid @RequestBody MemberDTO memberDTO) {
        System.out.println(memberDTO);
        Member member2 = new Member();
        BeanUtils.copyProperties(memberDTO, member2);

//        ModelMapper mapper = new ModelMapper();
//        Member member = mapper.map(memberDTO, Member.class);
//        service.save(member);

        service.save(member2);
        return ResponseEntity.status(HttpStatus.OK).body("회원가입 성공");
    }

    @GetMapping("list")
    public ResponseEntity<List<Member>> allList() {
        List<Member> list = service.getAllMembers();
        return ResponseEntity.status(HttpStatus.OK).body(list);
    }

}
