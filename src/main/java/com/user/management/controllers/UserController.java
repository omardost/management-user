package com.user.management.controllers;

import com.user.management.models.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping(value="create")
    public User create(){
        User user = new User();
        user.setName("OMAR");

        return user;
    }
}
