package com.room.backend.controller;

import com.room.backend.data._generated.entity.ApartmentsInfo;
import com.room.backend.data._generated.entity.UsersInfo;
import com.room.backend.data._generated.mapper.UsersInfoMapper;
import com.room.backend.service.ApartmentService;
import com.room.backend.service.UserLookupService;
import com.room.backend.service.UserRegistrationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@Slf4j
public class MainController {

    @Autowired
    UserRegistrationService userRegistrationService;

    @Autowired
    UserLookupService userLookupService;

    @Autowired
    ApartmentService apartmentService;

    @GetMapping("/api/favapt/{userId}")
    List<ApartmentsInfo> getApartment(@PathVariable Integer userId) {
        return apartmentService.findUserFavoriteApartment(userId);
    }

    @GetMapping("/api/ping")
    void ping() {
        log.info("pinged");
    }

    @GetMapping("/api/users/{id}")
    UsersInfo getUserById(@PathVariable Integer id) {
        UsersInfoMapper usersInfoMapper;
        UsersInfo usersInfo = userLookupService.findUserById(id);
        return usersInfo;
    }
    @PostMapping("/api/users/register")
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

    @GetMapping("/api/query-user")
    String queryUser() {
        return "query user successful!";
    }

}
