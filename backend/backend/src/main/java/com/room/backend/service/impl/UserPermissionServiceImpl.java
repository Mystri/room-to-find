package com.room.backend.service.impl;

import com.room.backend.data.entity.Permission;
import com.room.backend.data.mapper.PermissionMapper;
import com.room.backend.service.UserPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("UserPermissionService")
public class UserPermissionServiceImpl implements UserPermissionService {
    @Autowired
    private PermissionMapper permissionMapper;

    @Override
    public List<Permission> getPermissionsByUserId(Integer userId) {
        return permissionMapper.selectPermissionListByUserId(userId);
    }
}
