package com.room.backend.security.config;

import com.room.backend.data.entity.Permission;
import com.room.backend.data.entity.UsersInfo;
import com.room.backend.data.entity.UsersLogin;
import com.room.backend.service.UserPermissionService;
import com.room.backend.service.UsersInfoService;
import com.room.backend.service.UsersLoginService;
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
    public UsersInfoService usersInfoService;

    @Autowired
    public UserPermissionService userPermissionService;

    @Autowired
    public UsersLoginService usersLoginService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UsersInfo usersInfo = usersInfoService.getUsersInfoByName(username);
        if (usersInfo == null) {
            throw new UsernameNotFoundException("username not found");
        }

        Integer loginId = usersInfo.getLogin_id();

        UsersLogin usersLogin = usersLoginService.getLoginInfoByUserId(loginId);

        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        List<Permission> userPermissions = userPermissionService.getPermissionsByUserId(loginId);

        userPermissions.forEach(permission -> {
            GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(permission.getName());
            grantedAuthorities.add(grantedAuthority);
        });

        return new User(username, usersLogin.getPassword_encoded(), grantedAuthorities);
    }
}
