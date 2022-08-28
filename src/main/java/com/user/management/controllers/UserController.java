package com.user.management.controllers;

import com.user.management.dao.UserDao;
import com.user.management.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserDao userDao;

    @RequestMapping(value="api/create", method = RequestMethod.POST)
    public User create(@RequestBody User user){

        this.userDao.create(user);
        return user;
    }
}
