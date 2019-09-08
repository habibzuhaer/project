package com.web_app.springbootapp.repository;

import com.web_app.springbootapp.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {

    long countByUsername(String username);
}

