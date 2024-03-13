package com.ea.restapi03.users;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@ToString
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users") // DB 테이블명을 정의해주는 어노테이션
@Schema(description = "User Table에 대한 내용입니다.")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment로 설정
    @Schema(title = "사용자 ID", description = "table에서 자동으로 1씩 증가하는 컬럼입니다.")
    private Long id;

    @Column(length = 50)
    @Schema(title = "사용자 이름", description = "문자열 길이 50이하로 입력해주어야 하며, 사용자 이름을 정의하는 컬럼입니다.")
    private String username;

    // unique = true : 중복허용하지않겠다
    @Column(length = 50, unique = true)
    @Schema(title = "사용자 이메일", description = "문자열 길이 50이하로 입력해주어야 하며, NOT NULL 제약조건입니다.")
    private String email;

    @JsonIgnore
    private String password;

    // Enum에 들어가있는 값은 male과 female이다.
    // EnumType.ORDINAL : int로 들어간다 (0, 1)
    // EnumType.STRING : 문자열로 들어가라 (male, female)
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss")
    private LocalDateTime wdate;
}
