package com.room.backend.service;


import com.room.backend.data.entity.Permission;

import java.util.List;

public interface UserPermissionService {
    List<Permission> getPermissionsByUserId(Integer userId);
}
