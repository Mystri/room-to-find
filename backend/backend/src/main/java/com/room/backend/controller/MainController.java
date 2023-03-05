package com.room.backend.controller;

import com.room.backend.data.entity.UsersInfo;
import com.room.backend.data.entity.UsersLogin;
import com.room.backend.data.mapper.UsersInfoMapper;
import com.room.backend.service.UsersInfoService;
import com.room.backend.service.UsersLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;


@RestController
public class MainController {

    @PostMapping("/users/login")
    void login() {

    }

    @Autowired
    UsersInfoService usersInfoService;

    @Autowired
    UsersLoginService usersLoginService;

    @GetMapping("/users/{id}")
    UsersInfo getUserById(@PathVariable Integer id) {
        UsersInfoMapper usersInfoMapper;
        UsersInfo usersInfo = usersInfoService.getUsersInfoById(id);
        return usersInfo;
    }



    @PostMapping("/users/register")
    UsersInfo registerUser(String userName,
                           String email,
                           Integer mobilePhone,
                           Date birthday,
                           String gender,
                           String password) {
        UsersLogin usersLogin = null;
        try {
            usersLogin = usersLoginService.createNewUser(password, 1, );
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        UsersInfo usersInfo = usersInfoService.createNewUser(
                userName,
                email,
                mobilePhone,
                birthday,
                gender,
                usersLogin.getId());

        return usersInfo;
    }

    @GetMapping("/query-user")
    String queryUser() {
        return "query user successful!";
    }

}
