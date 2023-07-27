package com.jakurych.blockplan.blockplan.service;

import com.jakurych.blockplan.blockplan.model.domain.User;
import com.jakurych.blockplan.blockplan.model.repository.UserRepository;
import lombok.Builder; // Import the @Builder annotation
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
@Builder
public class UserService {
    private final UserRepository userRepository;

    public User createOrUpdate(User user) {
        return userRepository.save(user);
    }

    public User delete(Integer id) {
        User user = findById(id);
        if (user != null) {
            userRepository.delete(user);
        }
        return user;
    }

    public User findById(int id) {
        return userRepository.findById(id).orElse(null);
    }

    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public List<User> findByRegistrationDateBetween(LocalDateTime startDateTime, LocalDateTime endDateTime) {
        return userRepository.findByRegistrationDateBetween(startDateTime, endDateTime);
    }
}
