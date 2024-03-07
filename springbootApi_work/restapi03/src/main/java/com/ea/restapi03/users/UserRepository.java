package com.ea.restapi03.users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    // findAll(), save(), findById() 객체 오버라이딩

    // 자동으로 만들어짐
    // 쿼리문 : select * from user where email = ?
    public User findByEmail(String email);
}
