package com.example.cooperationbe.service;

import com.example.cooperationbe.domain.Users;
import com.example.cooperationbe.mapper.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class testService {

    private final TestRepository testRepository;

    @Autowired
    public testService(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    public List<Users> getAllUsers(){
        return testRepository.findAll();
    }

}
