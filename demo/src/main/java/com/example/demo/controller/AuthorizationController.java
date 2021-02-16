package com.example.demo.controller;

import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AuthorizationController {
    private UserService userService;
    @Autowired
    public AuthorizationController(UserService userService){
        this.userService = userService;
    }
    
}
