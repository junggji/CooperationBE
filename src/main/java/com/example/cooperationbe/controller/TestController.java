package com.example.cooperationbe.controller;

import com.example.cooperationbe.domain.Users;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.example.cooperationbe.service.testService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/lalala")
public class TestController {

    private final testService service;

    @PostMapping
    public List<Users> memberList() {
        System.out.println("hi");
        return service.getAllUsers();
    }

}
