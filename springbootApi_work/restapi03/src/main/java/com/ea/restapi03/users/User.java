package com.ea.restapi03.users;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@ToString
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users") // DB 테이블명을 정의해주는 어노테이션
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment로 설정
    private Long id;

    @Column(length = 50)
    private String username;

    // unique = true : 중복허용하지않겠다
    @Column(length = 50, unique = true)
    private String email;

    private String password;

    // Enum에 들어가있는 값은 male과 female이다.
    // EnumType.ORDINAL : int로 들어간다 (0, 1)
    // EnumType.STRING : 문자열로 들어가라 (male, female)
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss")
    private LocalDateTime wdate;
}
