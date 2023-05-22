package com.jakurych.blockplan.blockplan.controller;
import com.jakurych.blockplan.blockplan.service.UserService;
import com.jakurych.blockplan.blockplan.model.domain.User;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private UserService userService;

    public void createUser(String name, String surname, String email, String username,int id){
        User newUser= new User(name, surname, email,username,id);
    }
}
