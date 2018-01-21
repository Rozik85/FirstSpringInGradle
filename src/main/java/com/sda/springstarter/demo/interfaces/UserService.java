package com.sda.springstarter.demo.interfaces;

import com.sda.springstarter.demo.model.User;

public interface UserService {

    public User findByEmail(String email);
    public void saveUser(User user);
}
