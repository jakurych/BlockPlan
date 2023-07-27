package com.jakurych.blockplan.blockplan.controller;

import com.jakurych.blockplan.blockplan.model.domain.User;
import com.jakurych.blockplan.blockplan.service.UserService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping(value = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<User> create(@RequestBody User user) {
        return ResponseEntity.ok(userService.createOrUpdate(user));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<User> delete(@PathVariable Integer id) {
        User deletedUser = userService.delete(id);
        if (deletedUser != null) {
            return ResponseEntity.ok(deletedUser);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> find(@PathVariable int id) {
        User user = userService.findById(id);
        if (user != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        List<User> users = userService.findAll();
        return ResponseEntity.ok(users);
    }

    @GetMapping("/username/{username}")
    public ResponseEntity<User> findByUsername(@PathVariable String username) {
        User user = userService.findByUsername(username);
        if (user != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/email/{email}")
    public ResponseEntity<User> findByEmail(@PathVariable String email) {
        User user = userService.findByEmail(email);
        if (user != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/registrationDateBetween")
    public ResponseEntity<List<User>> findByRegistrationDateBetween(
            @RequestParam(name = "startDateTime") LocalDateTime startDateTime,
            @RequestParam(name = "endDateTime") LocalDateTime endDateTime
    ) {
        List<User> users = userService.findByRegistrationDateBetween(startDateTime, endDateTime);
        return ResponseEntity.ok(users);
    }
}
