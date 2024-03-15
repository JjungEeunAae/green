package com.mh.restapi03.users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    // findAll(), save(), findById()

    // SELECT * FROM user WHERE email = ?;
    public User findByEmail(String email);

    public User findByEmailAndPassword(String email, String password);

    // SELECT ... WHERE username LIKE %:username%
    public List<User> findByUsernameContainingOrEmailContaining(String username,String email);

    @Query(value = "select m from User m where m.email = :email")
    public User findMyCustom(String email);

}
