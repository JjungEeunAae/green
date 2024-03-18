package com.ea.restapi05.member;

import jakarta.persistence.*;
import lombok.*;
import net.sf.jsqlparser.expression.DateTimeLiteralExpression;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Member {
    // PK 설계
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 문자열길이 50이하, null 비허용
    @Column(length = 50, nullable = false)
    private String username;

    private String password;

    // 문자길이 50 이하, null 비허용, 고유한 값
    @Column(length = 50, nullable = false, unique = true)
    private String email;

    // USER, ADMIN
    @Enumerated(EnumType.STRING)
    private Role role;

    @CreatedDate
    private LocalDateTime writeDate;

    @LastModifiedDate
    private LocalDateTime modifyDate;
}
