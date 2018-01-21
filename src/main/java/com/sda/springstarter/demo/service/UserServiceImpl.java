package com.sda.springstarter.demo.service;

import com.sda.springstarter.demo.interfaces.UserService;
import com.sda.springstarter.demo.model.Roles;
import com.sda.springstarter.demo.model.User;
import com.sda.springstarter.demo.repository.RoleRepository;
import com.sda.springstarter.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashSet;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public User findByEmail(String email) {
        return null;
    }

    @Override
    public void saveUser(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(
                user.getPassword()
        ));
        user.setActive(1);
        Roles userRoles = roleRepository.findByRole("ADMIN");
        user.setRelesSet(new HashSet<>(Arrays.asList(userRoles)));
    }
}
