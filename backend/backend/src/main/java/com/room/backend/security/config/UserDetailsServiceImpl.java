package com.room.backend.security.config;

import com.room.backend.data.entity.Permission;
import com.room.backend.data.entity.UsersInfo;
import com.room.backend.data.entity.UsersInfoExample;
import com.room.backend.data.entity.UsersLogin;
import com.room.backend.data.mapper.PermissionMapper;
import com.room.backend.data.mapper.UsersInfoMapper;
import com.room.backend.data.mapper.UsersLoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    UsersInfoMapper usersInfoMapper;

    @Autowired
    PermissionMapper permissionMapper;

    @Autowired
    UsersLoginMapper usersLoginMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UsersInfoExample usersInfoExample = new UsersInfoExample();
        usersInfoExample.createCriteria().andNameEqualTo(username);

        UsersInfo usersInfo = usersInfoMapper.selectByExample(usersInfoExample).get(0);
        if (usersInfo == null) {
            throw new UsernameNotFoundException("username not found");
        }

        Integer loginId = usersInfo.getLogin_id();
        UsersLogin usersLogin = usersLoginMapper.selectByPrimaryKey(loginId);

        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        List<Permission> userPermissions = permissionMapper.selectPermissionListByUserId(loginId);

        userPermissions.forEach(permission -> {
            GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(permission.getName());
            grantedAuthorities.add(grantedAuthority);
        });

        return new User(username, usersLogin.getPassword_encoded(), grantedAuthorities);
    }
}
