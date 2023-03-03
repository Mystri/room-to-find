package com.room.backend;

import com.room.backend.data.entity.UsersInfo;
import com.room.backend.data.entity.UsersInfoExample;
import com.room.backend.data.entity.UsersLoginExample;
import com.room.backend.data.mapper.UsersInfoMapper;
import com.room.backend.data.mapper.UsersLoginMapper;
import com.room.backend.service.UserService;
import com.room.backend.service.UsersLoginService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.Date;
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
    UsersLoginService usersLoginService;

    @Autowired
    UsersLoginMapper usersLoginMapper;


    @Autowired
    UserService userService;

    @Test
    @Rollback
    void testRegisterAndDeleteExampleUser() throws Exception {

//        Integer id = userService.registerMember("asdf", "a@a.a", 123, new Date(System.currentTimeMillis()), "m", "asdf");
//
//        System.out.println("Start test");
//        System.out.println(usersLoginMapper.selectByExample(new UsersLoginExample()));
//        System.out.println(usersInfoMapper.selectByExample(new UsersInfoExample()));
//
//        userService.removeUser(id);
//
//        System.out.println(usersLoginMapper.selectByExample(new UsersLoginExample()));
//        System.out.println(usersInfoMapper.selectByExample(new UsersInfoExample()));

    }

//    @Test
//    void addUser() throws Exception {
//        int id = userService.registerMember("asdf", "a@a.a", 123, new Date(System.currentTimeMillis()), "m", "asdf");
//        System.out.println(usersInfoMapper.selectByPrimaryKey(id));
//        System.out.println("success");
//    }

}
