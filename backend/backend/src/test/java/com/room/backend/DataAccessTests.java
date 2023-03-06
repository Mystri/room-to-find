package com.room.backend;

import com.room.backend.controller.MainController;
import com.room.backend.data.entity.UsersInfo;
import com.room.backend.data.entity.UsersLogin;
import com.room.backend.data.mapper.UsersInfoMapper;
import com.room.backend.service.UserLookupService;
import com.room.backend.service.UserRegistrationService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.Date;
import java.sql.SQLException;

@SpringBootTest
public class DataAccessTests {
    @Autowired
    DataSource datasource;
    @Test
    void connectionLoads() throws SQLException {
        System.out.println(datasource.getClass());
        Connection connection = datasource.getConnection();
        System.out.println(connection);
        connection.close();
    }


    @Autowired
    UsersInfoMapper usersInfoMapper;
//    @Test
//    @Rollback
//    void testGet() {
//        UsersInfo usersInfo = usersInfoMapper.selectByPrimaryKey(1);
//        System.out.println(usersInfo.toString());
//    }

    @Autowired
    UserRegistrationService userRegistrationService;

    @Autowired
    UserLookupService userLookupService;

    @Test
    @Rollback
    void testCreateUser() throws Exception {

        System.out.println("Start test");
        UsersInfo usersInfo = userRegistrationService.registerMember("asdf", "a@a.a", 123, new Date(System.currentTimeMillis()),"m", "asdf");

        System.out.println(userLookupService.findUserById(usersInfo.getId()));
        System.out.println(usersInfo);

        System.out.println("Deleting user");
//        userRegistrationService.removeUser(usersInfo.getId());


    }


}
