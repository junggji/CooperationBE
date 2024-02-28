package com.example.cooperationbe.service;

import com.example.cooperationbe.repository.JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sample.Controller.entity.User;

@Service
@RequiredArgsConstructor
public class testService {

    private final JpaRepository jpaRepository;

    public Iterable<User> getAllUsers(){
        return jpaRepository.findAll();
    }

}
