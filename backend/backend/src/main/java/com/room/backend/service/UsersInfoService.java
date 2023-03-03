package com.room.backend.service;

import com.room.backend.data.entity.UsersInfo;

import java.util.Date;

public interface UsersInfoService {

    UsersInfo getUsersInfoById(Integer userId);
    UsersInfo createNewUser(String userName,
                            String email,
                            Integer mobilePhone,
                            Date birthday,
                            String gender,
                            Integer loginId);

    UsersInfo getUsersInfoByName(String username);

    int removeUser(Integer userId);
}
