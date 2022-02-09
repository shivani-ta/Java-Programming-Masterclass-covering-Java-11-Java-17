package com.example.demo.repository;


import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

@EnableJpaRepositories
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByLastname(String lastname);

    User findByEmail(String email);

    User findByNumber(Long number);

}
