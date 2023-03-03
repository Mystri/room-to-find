package com.room.backend.service.impl;

import com.room.backend.data.entity.UsersInfo;
import com.room.backend.data.entity.UsersInfoExample;
import com.room.backend.data.mapper.UsersInfoMapper;
import com.room.backend.service.UsersInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service("UsersInfoService")
public class UsersInfoServiceImpl implements UsersInfoService {

    @Autowired
    UsersInfoMapper usersInfoMapper;


    @Override
    public UsersInfo getUsersInfoById(Integer userId) {
        return usersInfoMapper.selectByPrimaryKey(userId);
    }

    @Override
    public UsersInfo createNewUser(String userName, String email, Integer mobilePhone, Date birthday, String gender, Integer loginId) {
        UsersInfo row = new UsersInfo();

        row.setName(userName);
        row.setEmail(email);
        row.setCreate_time(new Date(System.currentTimeMillis()));
        row.setLast_modify(new Date(System.currentTimeMillis()));
        row.setBirthday(birthday);
        row.setGender(gender);
        row.setMobile_phone(mobilePhone);
        row.setLogin_id(loginId);

        usersInfoMapper.insert(row);

        return row;

    }


    @Override
    public UsersInfo getUsersInfoByName(String username) {

        UsersInfoExample usersInfoExample = new UsersInfoExample();
        usersInfoExample.createCriteria().andNameEqualTo(username);

        List<UsersInfo> queryResultList = usersInfoMapper.selectByExample(usersInfoExample);
        if (queryResultList == null || queryResultList.isEmpty())
            return null;

        return queryResultList.get(0);


    }

    @Override
    public int removeUser(Integer userId) {
        return usersInfoMapper.deleteByPrimaryKey(userId);
    }
}
