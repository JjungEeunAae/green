package com.example.restapi02.member;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MemberController {
    //@Autowired
    private final MemberRepository memberRepository;

    @GetMapping("member")
    public List<Member> allMember(){
        // SELECT
        return memberRepository.findAll();
    }

    @PostMapping("member")
    public Member memberSave(String username, String email) {
        Member mem = Member.builder()
                            .username(username)
                            .email(email)
                            .build();
        Member request = memberRepository.save(mem);
        return request;
    }

    @PutMapping("member")
    public Member update(Long id, String username, String email) {
        Member mem = Member.builder()
                            .id(id)
                            .username(username)
                            .email(email)
                            .build();
        Member request = memberRepository.save(mem);
        return request;
    }

    @DeleteMapping("member")
    public String delete(Long id) {
        memberRepository.deleteById(id);
        return "DELETE SUCCESS = " + id;
    }
}
