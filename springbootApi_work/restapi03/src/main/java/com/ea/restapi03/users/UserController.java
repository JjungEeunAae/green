package com.ea.restapi03.users;

import com.ea.restapi03.exception.ErrorCode;
import com.ea.restapi03.exception.UserException;
import jakarta.validation.Valid;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService service;

    @GetMapping("users")
    public ResponseEntity<List<User>> getAllUsers() {

        List<User> list = service.getAllUsers();

        if(list.size() == 0) {
            throw new UserException(ErrorCode.NOTFOUND);
        }

        // 다른 리턴 방식 ( 현재 리턴 방식과 동일하다 )
        // return ResponseEntity.status(HttpStatus.OK).body(list);
        return ResponseEntity.ok(list);
    }

    @GetMapping("users/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        System.out.println("id >>>> " + id);
        User user = service.getUserById(id);
        return ResponseEntity.status(HttpStatus.OK).body(user);
    }

    @PostMapping("users")
    public ResponseEntity<User> addUser(@RequestBody @Valid UserDTO userDTO) {
        // 수정된 네번째 방식 ( 코드가 더욱 간결해짐 )
        userDTO.setWdate(LocalDateTime.now());

        ModelMapper mapper = new ModelMapper();

        User user = mapper.map(userDTO, User.class);
        User dbUser = service.regist(user);

        return ResponseEntity.status(HttpStatus.CREATED).body(dbUser);
    }

    @PutMapping("users")
    public ResponseEntity<User> modifyUser(@RequestBody @Valid UserDTO userDTO) {
        ModelMapper mapper = new ModelMapper();

        User user = mapper.map(userDTO, User.class);
        user.setWdate(LocalDateTime.now());

        User dbUser = service.modifyUser(user);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(dbUser);
    }
}
