package org.example.member;

import lombok.*;

@Getter             // setter method
@Setter             // getter method
@AllArgsConstructor // 생성자
@ToString
@Builder            // 객체생성
public class Member {
    private String email;
    private String name;
    private String address;
    private String password;
    private String role;
}
