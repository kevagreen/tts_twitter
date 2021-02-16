package com.example.demo.service;

import com.example.demo.model.User;

import java.util.List;

public interface UserService {

    User findByUserName(String userName);
    List<User> findAll();
    void save(User user);
    User saveNewUser(User user);
    User getLoggedInUser();
}
