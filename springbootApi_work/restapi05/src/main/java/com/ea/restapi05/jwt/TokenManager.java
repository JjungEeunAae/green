package com.ea.restapi05.jwt;

import com.ea.restapi05.member.Member;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;

import static io.jsonwebtoken.security.Keys.hmacShaKeyFor;

@Component
public class TokenManager {
    @Value("${spring.jwt.secret}")
    private String myKey;

    // 토큰 만들어주는 함수
    public String generateToken(Member member) {
        return Jwts.builder()
                .subject("eaToken")
                .claim("id", member.getId())
                .claim("username", member.getUsername())
                .claim("role", member.getRole())
                .claim("email", member.getEmail())
                // 유효시간은 1000 * 60 * 60 * 10 10시간
//                .expiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 10))
                // 유효시간은 1000 * 60 * 15 15분
//                .expiration(new Date(System.currentTimeMillis() + 1000 * 60 * 15))
                // 유효시간 60초..
                .expiration(new Date(System.currentTimeMillis() + 1000 * 60))
                .signWith(hmacShaKeyFor(myKey.getBytes()))
                .compact();
    }

    // 토큰 검증해주는 함수
    public Jws<Claims> validateToken(String token) {
        // 사인을 푸는 방법
        Jws<Claims> jws = Jwts.parser() // 번영해라
                                .setSigningKey(hmacShaKeyFor(myKey.getBytes())) // 비밀번호로
                                .build()    // 객체를 생성하고
                                .parseClaimsJws(token); // claim들을 번역해서 컬렉션타입으로 만들어줘

        System.err.println(jws);

        return jws;
    }
}
