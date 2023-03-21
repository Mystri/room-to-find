package com.room.backend.service.impl;


import com.room.backend.data._generated.entity.UsersInfo;
import com.room.backend.data._generated.entity.UsersLogin;
import com.room.backend.data._generated.mapper.UsersInfoMapper;
import com.room.backend.data._generated.mapper.UsersLoginMapper;
import com.room.backend.service.UserRegistrationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;

@Slf4j
@Service("UserRegistrationService")
public class UserRegistrationImpl implements UserRegistrationService {

    @Autowired
    UsersInfoMapper usersInfoMapper;

    @Autowired
    UsersLoginMapper usersLoginMapper;



    @Override
    public UsersInfo registerMember(String userName, String email, Integer mobilePhone, Date birthday, String gender, String password) throws Exception {
        UsersLogin usersLogin = createNewUserLogin(password, 1);
        UsersInfo usersInfo = null;
        try {
            usersInfo = createNewUserInfo(userName, email, mobilePhone, birthday, gender, usersLogin.getId());
        } catch (DuplicateKeyException e) {
            log.warn("Duplicate key " + userName);
        }
        return usersInfo;
    }

    @Override
    public UsersInfo registerAdmin(String userName, String password) throws Exception {
        UsersLogin usersLogin = createNewUserLogin(password, 2);
        return createNewUserInfo(userName, "", 0, new Date(), "", usersLogin.getId());
    }

    @Override
    public void removeUser(Integer userId) {
        UsersInfo usersInfo = usersInfoMapper.selectByPrimaryKey(userId);
        usersLoginMapper.deleteByPrimaryKey(usersInfo.getLogin_id());
        usersInfoMapper.deleteByPrimaryKey(userId);
    }


    private UsersInfo createNewUserInfo(String userName, String email, Integer mobilePhone, Date birthday, String gender, Integer loginId) throws DuplicateKeyException {
        UsersInfo usersInfo = new UsersInfo();

        usersInfo.setName(userName);
        usersInfo.setEmail(email);
        usersInfo.setCreate_time(new Date(System.currentTimeMillis()));
        usersInfo.setLast_modify(new Date(System.currentTimeMillis()));
        usersInfo.setBirthday(birthday);
        usersInfo.setGender(gender);
        usersInfo.setMobile_phone(mobilePhone);
        usersInfo.setLogin_id(loginId);

        usersInfoMapper.insert(usersInfo);

        return usersInfo;

    }

    private UsersLogin createNewUserLogin(String password, Integer role) throws Exception {

        if (role != 1 && role != 2) {
            throw new Exception("invalid role");
        }

        String encodedPassword = new BCryptPasswordEncoder().encode(password);

        UsersLogin usersLogin = new UsersLogin();
        usersLogin.setRole_id(role);
        usersLogin.setPassword_encoded(encodedPassword);
        usersLogin.setCreate_time(new Date(System.currentTimeMillis()));
        usersLogin.setLast_modify(new Date(System.currentTimeMillis()));

        int id = usersLoginMapper.insert(usersLogin);
        usersLogin.setId(id);
        return usersLogin;

    }
}
