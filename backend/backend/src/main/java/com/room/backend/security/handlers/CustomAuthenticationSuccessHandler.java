package com.room.backend.security.handlers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.room.backend.data.entity.UsersInfo;
import com.room.backend.data.entity.UsersLogin;
import com.room.backend.service.UserLookupService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
@Component
@Slf4j
public class CustomAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

    @Autowired
    UserLookupService userLookupService;


    @Autowired
    ObjectMapper objectMapper;


    /**
     * @param request
     * @param response
     * @param authentication
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        User userDetails = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        UsersLogin usersLogin = userLookupService.findLoginByUsername(userDetails.getUsername());

        usersLogin.setLast_modify(new Date(System.currentTimeMillis()));

        String jsonString = objectMapper.writeValueAsString(userLookupService.findUserByName(userDetails.getUsername()));
        response.getWriter().write(jsonString);
    }
}
