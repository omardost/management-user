package com.user.management.controllers;

import com.user.management.dao.UserDao;
import com.user.management.models.Message;
import com.user.management.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    String messageError = "EMAIL NULLS FIRST";
    String emailError = "javax.validation.constraints.Email.message";

    @Autowired
    UserDao userDao;

    @RequestMapping(value="api/create", method = RequestMethod.POST)
    public ResponseEntity<Object> create(@RequestBody User user){

        try{
            User userSave = this.userDao.create(user);
            return new ResponseEntity<>(userSave, HttpStatus.OK);
        }catch (Exception e){
            Message message = new Message();
            if (e.getMessage().contains(messageError)){
                message.setMessage("El correo ya registrado");
            }else if(e.getMessage().contains(emailError)){
                message.setMessage("El correo es incorrecto");
            }else {
                message.setMessage(e.getMessage());
            }
            return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
        }
    }
}
