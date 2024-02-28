package com.example.cooperationbe.mapper;

import com.example.cooperationbe.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<Users, Long> {

}
