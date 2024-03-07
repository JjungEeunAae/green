package com.ea.restapi03.users;

import com.ea.restapi03.exception.ErrorCode;
import com.ea.restapi03.exception.LogExcetion;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User regist(User user) {
        User emailCheck = userRepository.findByEmail(user.getEmail());

        // 중복 이메일이 있을 경우 오류 메세지를 띄운다.
        if(emailCheck != null) {
            //System.err.println(user.getEmail() + " 중복 이메일이 있습니다.");
            throw new LogExcetion(ErrorCode.DUPLICATE);
        }

        User dbUser = userRepository.save(user);
        return dbUser;
    }

    public List<User> getAllUsers() {
        List<User> list = userRepository.findAll();
        return list;
    }
}
