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
@RequestMapping(value = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    public ResponseEntity<User> create(User user) {
        return ResponseEntity.ok().build(); //TODO: one/two line(s)
    }

    public ResponseEntity<User> delete(int id) {
        return ResponseEntity.ok(userService.delete(id)); //TODO: one/two line(s)
    }

    public ResponseEntity<User> find(int id){
        return ResponseEntity.ok(userService.findById(id));
    }

    public ResponseEntity<User> find(String username){
        return ResponseEntity.ok(userService.findByUsername(username));
    }

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        return ResponseEntity.ok(userService.findAll());
    }
}
