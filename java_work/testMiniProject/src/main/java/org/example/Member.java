package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter             // setter method
@Setter             // getter method
@AllArgsConstructor // 생성자
public class Member {
    private String email;
    private String name;
    private String address;
    private String password;
}
