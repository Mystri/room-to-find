package com.room.backend;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import com.room.backend.data.entity.UsersLogin;
import com.room.backend.data.mapper.UsersLoginMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultHandler;
import org.springframework.web.client.RestTemplate;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class SecurityTest {

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private UsersLoginMapper usersLoginMapper;

    @Autowired
    private MockMvc mockMvc;


    @Test
    public void testLoginOnly() throws Exception {
        mockMvc.perform(post("/login")
                .param("username", "asdf")
                .param("password", "asdf")).
                andDo(print()).
        andExpect(status().isOk());
    }

}
