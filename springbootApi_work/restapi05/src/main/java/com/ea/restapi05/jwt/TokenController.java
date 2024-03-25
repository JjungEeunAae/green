package com.ea.restapi05.jwt;

import com.ea.restapi05.member.Member;
import com.ea.restapi05.member.MemberRepository;
import com.ea.restapi05.member.Role;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class TokenController {
    private final TokenManager tokenManager;
    private final MemberRepository memberRepository;

    @PostMapping("token")
    public String token(@RequestBody TokenDTO tokenDTO) {
        Member dbMember
                = memberRepository.findByEmailAndPassword(tokenDTO.getEmail(), tokenDTO.getPassword());

        if(dbMember == null) {
            throw new RuntimeException("회원가입이 되지 않은 아이디입니다.");
        }
        return tokenManager.generateToken(dbMember);
    }

    @GetMapping("auth")
    public String loginTest(Authentication authentication) {
        System.out.println(authentication);
        System.out.println(authentication.isAuthenticated());
        System.out.println(authentication.getPrincipal());
        return "loginTest";
    }

    @GetMapping("valid")
    public String valid(HttpServletRequest request) {
        String auth = request.getHeader("Authorization");
        System.out.println(auth);

        // 유효성 검사
        //tokenManager.validateToken("eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlYVRva2VuIiwiaWQiOjEsInVzZXJuYW1lIjoidXNlciIsInJvbGUiOiJVU0VSIiwiZW1haWwiOiJhYUBhYS5jb20iLCJleHAiOjE3MTA5ODUyNDl9.PdAL6XJbt2c5lvuFASLlyMLDHkb-APHsgJJ6clXkpeQ");
        return "valid";
    }
}
