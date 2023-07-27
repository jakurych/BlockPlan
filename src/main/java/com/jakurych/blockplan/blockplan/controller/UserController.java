package com.jakurych.blockplan.blockplan.controller;

import com.jakurych.blockplan.blockplan.dto.UserDto;
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
    public ResponseEntity<UserDto> create(@RequestBody UserDto user) {
        return ResponseEntity.ok(userService.createOrUpdate(user));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<UserDto> delete(@PathVariable Integer id) {
        UserDto deletedUser = userService.delete(id);
        if (deletedUser != null) {
            return ResponseEntity.ok(deletedUser);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> find(@PathVariable int id) {
        UserDto user = userService.findById(id);
        if (user != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<UserDto>> findAll() {
        List<UserDto> users = userService.findAll();
        return ResponseEntity.ok(users);
    }

    @GetMapping("/username/{username}")
    public ResponseEntity<UserDto> findByUsername(@PathVariable String username) {
        User userDto = userService.findByUsername(username);
        if (user != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/email/{email}")
    public ResponseEntity<UserDto> findByEmail(@PathVariable String email) {
        UserDto user = userService.findByEmail(email);
        if (user != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/registrationDateBetween")
    public ResponseEntity<List<UserDto>> findByRegistrationDateBetween(
            @RequestParam(name = "startDateTime") LocalDateTime startDateTime,
            @RequestParam(name = "endDateTime") LocalDateTime endDateTime
    ) {
        List<UserDto> users = userService.findByRegistrationDateBetween(startDateTime, endDateTime);
        return ResponseEntity.ok(users);
    }
}
