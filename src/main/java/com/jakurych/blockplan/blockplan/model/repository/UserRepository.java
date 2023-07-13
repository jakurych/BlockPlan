package com.jakurych.blockplan.blockplan.model.repository;

import com.jakurych.blockplan.blockplan.model.domain.User;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);

}
