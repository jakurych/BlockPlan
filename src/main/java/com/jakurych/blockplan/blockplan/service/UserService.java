package com.jakurych.blockplan.blockplan.service;
import com.jakurych.blockplan.blockplan.controller.UserController;
import com.jakurych.blockplan.blockplan.model.domain.User;
import com.jakurych.blockplan.blockplan.model.repository.UserRepository;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Builder
public class UserService {
    private final UserRepository userRepository;

    public User createOrUpdate(User user) {
        userRepository.save(user);
        return null; //TODO: one/two line(s)
    }

    public User delete(Integer id) {
        User user = findById(id);
        userRepository.delete(user);
        return user; //TODO: one/two line(s)
    }

    public User findById(int id) {

        return userRepository.findById(id).orElse(null);
    }
    public User findByUsername(String username){
        return userRepository.findByUsername(username);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }
}
