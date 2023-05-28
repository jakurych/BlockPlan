package com.jakurych.blockplan.blockplan.controller;
import com.jakurych.blockplan.blockplan.service.UserService;
import com.jakurych.blockplan.blockplan.model.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/user",produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    public void createUser(int id, String name, String surname, String email, String username){
        //TODO: User newUser= new User(id,name, surname, email,username);
    }
    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        return ResponseEntity.ok(userService.findAll());
    }

}
