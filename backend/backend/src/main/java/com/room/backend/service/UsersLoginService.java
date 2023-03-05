package com.room.backend.service;

import com.room.backend.data.entity.UsersLogin;

import java.sql.Date;

public interface UsersLoginService {
    UsersLogin getLoginInfoByUserId(Integer loginId);

    UsersLogin createNewUser(String password, Integer role, Date currentTime) throws Exception;

    UsersLogin getLoginInfoByUsername(String userName);

    void removeUser(Integer loginId);
}
