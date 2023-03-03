package com.room.backend.service.impl;

import com.room.backend.data.entity.UsersInfo;
import com.room.backend.data.entity.UsersLogin;
import com.room.backend.service.UserService;
import com.room.backend.service.UsersInfoService;
import com.room.backend.service.UsersLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service("UserService")
public class UserServiceImpl implements UserService {

    @Autowired
    UsersInfoService usersInfoService;

    @Autowired
    UsersLoginService usersLoginService;

    @Override
    public int registerMember(String userName,
                              String email,
                              Integer mobilePhone,
                              Date birthday,
                              String gender,
                              String password) throws Exception {

        UsersLogin usersLogin = usersLoginService.createNewUser(password, 1);
        UsersInfo usersInfo = usersInfoService.createNewUser(
                userName,
                email,
                mobilePhone,
                birthday,
                gender,
                usersLogin.getId());

        return usersInfo.getId();

    }

    @Override
    public int registerAdmin(String userName, String password) throws Exception {
        UsersLogin usersLogin = usersLoginService.createNewUser(password, 2);
        UsersInfo usersInfo = usersInfoService.createNewUser(
                userName,
                null,
                null,
                null,
                null,
                usersLogin.getId());

        return usersInfo.getId();
    }

    @Override
    public void removeUser(Integer userId) {
        Integer loginId = usersInfoService.getUsersInfoById(userId).getLogin_id();
        usersInfoService.removeUser(userId);
        usersLoginService.removeUser(loginId);
    }


}
