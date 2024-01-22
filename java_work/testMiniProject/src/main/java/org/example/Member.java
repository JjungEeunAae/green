package org.example;

import lombok.*;

@Getter             // setter method
@Setter             // getter method
@AllArgsConstructor // 생성자
public class Member {
    private String email;
    private String name;
    private String addr;
    private String password;
}
