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

    public List<User>findAll(){
        return userRepository.findAll();
    }

    //C R U D
/*
    public User getUser(int id){
        User user = new User();
        user = userRepository.findById(id);

        return user;

    }
    public User deleteUser(){

    }
    public User putUser(){

    }
    public User postCreate(){

    }*/
}
