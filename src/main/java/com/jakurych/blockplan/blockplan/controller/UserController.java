package com.jakurych.blockplan.blockplan.controller;
import com.jakurych.blockplan.blockplan.service.UserService;
import com.jakurych.blockplan.blockplan.model.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    private UserService userService;

    public void createUser(int id, String name, String surname, String email, String username){
        User newUser= new User(id,name, surname, email,username);
    }
    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        return ResponseEntity.ok(userService.findAll());
    }

}
