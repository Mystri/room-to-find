package com.room.backend.controller;

import com.room.backend.data.entity.UsersInfo;
import com.room.backend.data.entity.UsersLogin;
import com.room.backend.data.mapper.UsersInfoMapper;
import com.room.backend.service.UserLookupService;
import com.room.backend.service.UserRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.*;

import java.util.Date;


@RestController
public class MainController {

    @PostMapping("/users/login")
    void login() {

    }

    @Autowired
    UserRegistrationService userRegistrationService;

    @Autowired
    UserLookupService userLookupService;

    @GetMapping("/users/{id}")
    UsersInfo getUserById(@PathVariable Integer id) {
        UsersInfoMapper usersInfoMapper;
        UsersInfo usersInfo = userLookupService.findUserById(id);
        return usersInfo;
    }



    @PostMapping("/users/register")
    UsersInfo registerUser(String userName,
                           String email,
                           Integer mobilePhone,
                           Date birthday,
                           String gender,
                           String password) {

        UsersInfo usersInfo = null;
        try {
            usersInfo = userRegistrationService.registerMember(userName, email, mobilePhone, birthday, gender, password);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return usersInfo;
    }

    @GetMapping("/query-user")
    String queryUser() {
        return "query user successful!";
    }

}
