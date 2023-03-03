package com.room.backend.service.impl;

import com.room.backend.data.entity.UsersInfo;
import com.room.backend.data.entity.UsersInfoExample;
import com.room.backend.data.entity.UsersLogin;
import com.room.backend.data.entity.UsersLoginExample;
import com.room.backend.data.mapper.UsersLoginMapper;
import com.room.backend.service.UsersInfoService;
import com.room.backend.service.UsersLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service("UsersLoginService")
public class UsersLoginServiceImpl implements UsersLoginService {
    @Autowired
    private UsersLoginMapper usersLoginMapper;

    @Autowired
    private UsersInfoService usersInfoService;

    @Override
    public UsersLogin getLoginInfoByUserId(Integer loginId) {
        return usersLoginMapper.selectByPrimaryKey(loginId);
    }

    @Override
    public UsersLogin createNewUser(String password, Integer role) throws Exception {

        if (role != 1 && role != 2) {
            throw new Exception("invalid role");
        }

        UsersLogin usersLogin = new UsersLogin();
        usersLogin.setRole_id(role);
        usersLogin.setPassword_encoded(new BCryptPasswordEncoder().encode(password));

        usersLoginMapper.insert(usersLogin);

        return usersLogin;
    }

    /**
     * @param userName
     * @return
     */
    @Override
    public UsersLogin getLoginInfoByUsername(String userName) {
        UsersInfo usersInfo = usersInfoService.getUsersInfoByName(userName);
        return usersLoginMapper.selectByPrimaryKey(usersInfo.getLogin_id());
    }


    @Override
    public void removeUser(Integer loginId) {
        usersLoginMapper.deleteByPrimaryKey(loginId);
    }


}
