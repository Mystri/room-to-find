package com.room.backend.service;

import com.room.backend.data.entity.UsersInfo;
import com.room.backend.data.entity.UsersLogin;

public interface UserLookupService {
    public UsersInfo findUserByName(String userName);
    public UsersInfo findUserById(Integer id);

    public UsersLogin findById(Integer id);

}
