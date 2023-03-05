package com.room.backend.service;

import java.util.Date;

/**
 * Register users. Should be the first layer
 */
public interface UserRegistrationAPIService {

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
