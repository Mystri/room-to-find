package com.room.backend.service;

import com.room.backend.data._generated.entity.UsersInfo;

import java.util.Date;

/**
 * Register users. Should be the first layer
 */
public interface UserRegistrationService {

    UsersInfo registerMember(String userName,
                             String email,
                             Integer mobilePhone,
                             Date birthday,
                             String gender,
                             String password) throws Exception;

    UsersInfo registerAdmin(String userName,
                      String password) throws Exception;


    void removeUser(Integer userId);
}
