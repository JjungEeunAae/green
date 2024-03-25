package com.ea.restapi05.config;

import com.ea.restapi05.jwt.TokenManager;
import com.ea.restapi05.member.Member;
import com.ea.restapi05.member.Role;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jws;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import java.util.List;
import java.util.stream.Stream;

@Component
@RequiredArgsConstructor
public class JWTInterceptor implements HandlerInterceptor {
    private final TokenManager tokenManager;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("일로오나");

        // header를 통해 token 값을 가져온다.
        String token = request.getHeader("Authorization");

        // member나 mypage를 호출한다는 가정하에
        // jwt 토큰이 없거나 유효성이 실패했을 때 예외를 발생시킨다.
        if(token == null || token.startsWith("Baerer ")) {
            System.err.println("토큰이 없습니다.");
            throw  new RuntimeException("JWT 토큰 발행 후 실행해주세요.");
        }

        // 유효성 검사를 진행한다.
        try {
            Jws<Claims> jws = tokenManager.validateToken(token.substring("Bearer ".length()));
            // 로그인 했는데 작성자를 자동으로 적고싶다?
            List<SimpleGrantedAuthority> roles =
                    Stream.of(jws.getBody().get("role").toString())
                            .map(SimpleGrantedAuthority::new)
                            .toList();

            // 로그인한 사람 정보를 Authorization에 저장해라.
            Authentication authentication = UsernamePasswordAuthenticationToken.authenticated(
                    Member.builder()
                            .email(jws.getPayload().get("email").toString())
                            .username(jws.getPayload().get("username").toString())
                            .id(jws.getPayload().get("id", Long.class))
                            .role(
                                    Role.valueOf(jws.getPayload().get("role").toString())
                            )
                            .build(),
                    null,
                    roles
            );

            // 로그인한 사람 정보를 저장해라.
            SecurityContextHolder.getContext().setAuthentication(authentication);
        } catch (ExpiredJwtException e) {
            System.err.println("토큰 만료");
            throw new RuntimeException("JWT 토큰 만료");
        } catch (Exception e) {
            System.err.println("토큰 검증 실패");
            throw  new RuntimeException("JWT 토큰 검증 실패");
        }

        //하고 싶은거 하러가라
        return true;
    }
}
