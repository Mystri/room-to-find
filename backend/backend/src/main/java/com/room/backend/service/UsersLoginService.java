package com.room.backend.service;

import com.room.backend.data.entity.UsersLogin;

public interface UsersLoginService {
    UsersLogin getLoginInfoByUserId(Integer loginId);

    UsersLogin createNewUser(String password, Integer role) throws Exception;

    UsersLogin getLoginInfoByUsername(String userName);

    void removeUser(Integer loginId);
}
