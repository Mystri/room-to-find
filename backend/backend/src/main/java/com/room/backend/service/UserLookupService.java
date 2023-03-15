package com.room.backend.service;

import com.room.backend.data.entity.Permission;
import com.room.backend.data.entity.UsersInfo;
import com.room.backend.data.entity.UsersLogin;

import java.util.List;

public interface UserLookupService {
    UsersInfo findUserByName(String username);
    UsersInfo findUserById(Integer id);
    UsersLogin findLoginById(Integer id);

    UsersLogin findLoginByUsername(String username);


    List<Permission> findPermissionsByUsername(String username);

    List<Permission> findPermissionsByLoginId(Integer id);

}
