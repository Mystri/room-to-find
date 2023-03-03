package com.room.backend.data.mapper;

import com.room.backend.data.entity.Permission;

import java.util.List;

public interface PermissionMapper {
    List<Permission> selectPermissionListByUserId(Integer userId);
}
