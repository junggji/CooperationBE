package com.example.cooperationbe.repository;

import sample.Controller.entity.User;
import org.springframework.data.repository.CrudRepository;

//CrudRepository는 JPA가 제공하는 기능으로 간단한 save, findby등 기능 제공
public interface JpaRepository extends CrudRepository<User, Long> {
}
