package com.room.backend.controller;

import com.room.backend.data.entity.UsersInfo;
import com.room.backend.data.mapper.UsersInfoMapper;
import org.springframework.web.bind.annotation.*;


@RestController
public class MainController {

    @PostMapping("/users/login")
    void login() {

    }

    @GetMapping("/users/{id}")
    UsersInfo getUserById(@PathVariable Integer id) {
        UsersInfoMapper usersInfo;
        System.out.println();
        return null;
    }

    @PostMapping("/users/register")
    UsersInfo registerUser() {
        return null;
    }

    @GetMapping("/query-user")
    String queryUser() {
        return "query user successful!";
    }

}
