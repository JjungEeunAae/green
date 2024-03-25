//package com.ea.restapi05.config;
//
//import com.ea.restapi05.jwt.TokenManager;
//import com.ea.restapi05.member.Member;
//import com.ea.restapi05.member.MemberRepository;
//import com.ea.restapi05.member.Role;
//import io.jsonwebtoken.Claims;
//import io.jsonwebtoken.ExpiredJwtException;
//import io.jsonwebtoken.Jws;
//import jakarta.servlet.FilterChain;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import lombok.RequiredArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.stereotype.Component;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//import java.io.IOException;
//import java.util.List;
//import java.util.Optional;
//import java.util.stream.Stream;
//
//@Component
//@RequiredArgsConstructor
//public class WebFilter extends OncePerRequestFilter {
//
//    private final TokenManager tokenManager;
//
//    @Override
//    protected void doFilterInternal(HttpServletRequest request
//                                    , HttpServletResponse response
//                                    , FilterChain filterChain)
//                                            throws ServletException, IOException {
//        // header를 통해 token 값을 가져온다.
//        String token = request.getHeader("Authorization");
//        // 실행시킨 url 값을 가져온다.
//        String reqUrl = request.getRequestURI();
//
//        // 해당 페이지는 토큰 검사를 진행하지 않는다.
//        if(reqUrl.contains("login") || reqUrl.contains("join") || reqUrl.contains("token")) {
//            filterChain.doFilter(request, response);
//            return;
//        }
//
//        // member나 mypage를 호출한다는 가정하에
//        // jwt 토큰이 없거나 유효성이 실패했을 때 예외를 발생시킨다.
//        if(token == null || token.startsWith("Baerer ")) {
//            System.err.println("토큰이 없습니다.");
//            throw  new RuntimeException("JWT 토큰 발행 후 실행해주세요.");
//        }
//
//        // 유효성 검사를 진행한다.
//        try {
//            Jws<Claims> jws = tokenManager.validateToken(token.substring("Bearer ".length()));
//            // 로그인 했는데 작성자를 자동으로 적고싶다?
//            List<SimpleGrantedAuthority> roles =
//                                Stream.of(jws.getBody().get("role").toString())
//                                        .map(SimpleGrantedAuthority::new)
//                                        .toList();
//
//            // 로그인한 사람 정보를 Authorization에 저장해라.
//            Authentication authentication = UsernamePasswordAuthenticationToken.authenticated(
//                    Member.builder()
//                            .email(jws.getPayload().get("email").toString())
//                            .username(jws.getPayload().get("username").toString())
//                            .id(jws.getPayload().get("id", Long.class))
//                            .role(
//                                    Role.valueOf(jws.getPayload().get("role").toString())
//                            )
//                            .build(),
//            null,
//                      roles
//            );
//
//            // 로그인한 사람 정보를 저장해라.
//            SecurityContextHolder.getContext().setAuthentication(authentication);
//
//            // 그 다음으로 이동해서 진행해라.(정상적으로 실행해라?)
//            filterChain.doFilter(request, response);
//        } catch (ExpiredJwtException e) {
//            System.err.println("토큰 만료");
//            throw new RuntimeException("JWT 토큰 만료");
//        } catch (Exception e) {
//            System.err.println("토큰 검증 실패");
//            throw  new RuntimeException("JWT 토큰 검증 실패");
//        }
//    }
//}
