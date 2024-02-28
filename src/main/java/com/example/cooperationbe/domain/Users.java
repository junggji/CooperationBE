package com.example.cooperationbe.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Users {

    @Id
    private Long user_id;
    private String username;
    private String email;
}
