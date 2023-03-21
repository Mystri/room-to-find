package com.room.backend.security.config;

import com.room.backend.data.entity.Permission;
import com.room.backend.data._generated.entity.UsersLogin;
import com.room.backend.data.mapper.PermissionMapper;
import com.room.backend.data._generated.mapper.UsersInfoMapper;
import com.room.backend.service.UserLookupService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    UsersInfoMapper usersInfoMapper;

    @Autowired
    PermissionMapper permissionMapper;

    @Autowired
    UserLookupService userLookupService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        log.info("Loading username " + username);

        UsersLogin usersLogin = userLookupService.findLoginByUsername(username);
        if (usersLogin == null) {
            throw new UsernameNotFoundException("Cannot find user named " + username);
        }
        List<Permission> userPermissions = null;
        userPermissions = userLookupService.findPermissionsByLoginId(usersLogin.getId());

        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        userPermissions.forEach(permission -> {
            GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(permission.getName());
            grantedAuthorities.add(grantedAuthority);
        });

        return new User(username, usersLogin.getPassword_encoded(), grantedAuthorities);
    }
}
