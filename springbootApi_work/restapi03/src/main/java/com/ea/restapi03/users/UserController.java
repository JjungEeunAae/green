package com.ea.restapi03.users;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService service;

    @PostMapping("users")
    public User addUser(@RequestBody User reqUser) {
        User user = User.builder()
                            .email(reqUser.getEmail())
                            .password(reqUser.getPassword())
                            .username(reqUser.getUsername())
                            .gender(reqUser.getGender())
                            .wdate(LocalDateTime.now())
                            .build();
        User dbUser = service.regist(user);
        return dbUser;
    }
}
