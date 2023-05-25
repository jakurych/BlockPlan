package com.jakurych.blockplan.blockplan.service;
import com.jakurych.blockplan.blockplan.model.domain.User;
import com.jakurych.blockplan.blockplan.model.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<User>findAll(){
        return userRepository.findAll();
    }
}
