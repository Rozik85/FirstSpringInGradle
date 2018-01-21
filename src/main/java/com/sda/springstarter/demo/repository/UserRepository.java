package com.sda.springstarter.demo.repository;

import com.sda.springstarter.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long>{
    User findByName(String name);
    User findByLastName(String lastName);
    User findById(int id);
    User findByEmail(String email);
}
