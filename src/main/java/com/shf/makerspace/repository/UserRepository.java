package com.shf.makerspace.repository;

import com.shf.makerspace.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findUserById(Long id);

    User findUserByEmail(String email);

    User findUserByUserName(String username);
}
