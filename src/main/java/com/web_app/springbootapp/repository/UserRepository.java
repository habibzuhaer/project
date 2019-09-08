package com.web_app.springbootapp.repository;

import com.web_app.springbootapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    long countByUsername(String username);
}

