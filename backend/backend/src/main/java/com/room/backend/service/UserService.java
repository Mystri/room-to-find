package com.room.backend.service;

import com.room.backend.data.entity.UsersInfo;

import java.util.Date;

public interface UserService {

    int registerMember(String userName,
                     String email,
                     Integer mobilePhone,
                     Date birthday,
                     String gender,
                     String password) throws Exception;

    int registerAdmin(String userName,
                      String password) throws Exception;


    void removeUser(Integer userId);
}
