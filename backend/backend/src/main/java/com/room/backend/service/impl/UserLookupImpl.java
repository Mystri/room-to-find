package com.room.backend.service.impl;

import com.room.backend.data.entity.Permission;
import com.room.backend.data._generated.entity.UsersInfo;
import com.room.backend.data._generated.entity.UsersInfoExample;
import com.room.backend.data._generated.entity.UsersLogin;
import com.room.backend.data.mapper.PermissionMapper;
import com.room.backend.data._generated.mapper.UsersInfoMapper;
import com.room.backend.data._generated.mapper.UsersLoginMapper;
import com.room.backend.service.UserLookupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("UserLookupService")
public class UserLookupImpl implements UserLookupService {
    @Autowired
    UsersInfoMapper usersInfoMapper;

    @Autowired
    UsersLoginMapper usersLoginMapper;

    @Autowired
    PermissionMapper permissionMapper;

    @Override
    public UsersInfo findUserByName(String username) {
        UsersInfoExample usersInfoExample = new UsersInfoExample();
        usersInfoExample.createCriteria().andNameEqualTo(username);
        List<UsersInfo> usersInfoList = usersInfoMapper.selectByExample(usersInfoExample);
        return usersInfoList.size() > 0 ? usersInfoList.get(0) : null;
    }

    @Override
    public UsersInfo findUserById(Integer id) {
        return usersInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public UsersLogin findLoginById(Integer id) {
        return usersLoginMapper.selectByPrimaryKey(id);
    }

    @Override
    public UsersLogin findLoginByUsername(String username) {
        UsersInfoExample usersInfoExample = new UsersInfoExample();
        usersInfoExample.createCriteria().andNameEqualTo(username);
        List<UsersInfo> usersInfoList = usersInfoMapper.selectByExample(usersInfoExample);
        if (usersInfoList.size() == 0) {
            return null;
        }
        UsersInfo usersInfo = usersInfoList.get(0);
        UsersLogin usersLogin = usersLoginMapper.selectByPrimaryKey(usersInfo.getLogin_id());
        return usersLogin;
    }

    @Override
    public List<Permission> findPermissionsByUsername(String username) throws NullPointerException {
        UsersLogin usersLogin = findLoginByUsername(username);
        if (username == null) {
            throw new NullPointerException("Cannot find the login data for this username.");
        }
        List<Permission> userPermissions = permissionMapper.selectPermissionListByUserId(usersLogin.getId());
        return userPermissions;
    }

    @Override
    public List<Permission> findPermissionsByLoginId(Integer id) {
        return permissionMapper.selectPermissionListByUserId(id);
    }
}
