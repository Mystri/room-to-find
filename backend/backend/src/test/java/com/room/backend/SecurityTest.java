package com.room.backend;

import com.room.backend.data._generated.mapper.UsersLoginMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.web.servlet.MockMvc;

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
    public void testApiProtection() {
        try {
            mockMvc.perform(get("/api/ping")).andExpect(status().isUnauthorized());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    @Test
    public void testLoginOnly() throws Exception {
        mockMvc.perform(post("/login")
                .param("username", "asd")
                .param("password", "asdf")).
                andDo(print()).
        andExpect(status().isOk());
    }

}
