package com.room.backend;

import com.room.backend.data._generated.entity.ApartmentsInfo;
import com.room.backend.data._generated.entity.UsersInfo;
import com.room.backend.data._generated.entity.UsersInfoExample;
import com.room.backend.data._generated.mapper.UsersInfoMapper;
import com.room.backend.data.mapper.CustomUserMapper;
import com.room.backend.service.ApartmentService;
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
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

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


    @Test
    @Rollback
    void testGet() {
        UsersInfo usersInfo = usersInfoMapper.selectByPrimaryKey(1);
        System.out.println(usersInfo);
    }

    @Autowired
    UserRegistrationService userRegistrationService;

    @Autowired
    UserLookupService userLookupService;

    @Test
    void createUser() {
        try {
            UsersInfo usersInfo = userRegistrationService.registerMember("asd", "a@a.a", 123, new Date(System.currentTimeMillis()),"m", "asdf");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    @Rollback
    void testCreateUser() throws Exception {

        System.out.println("Start test");
        UsersInfo usersInfo = userRegistrationService.registerMember("asdfdf", "a@a.a", 123, new Date(System.currentTimeMillis()),"m", "asdf");

        if (usersInfo != null) {
            System.out.println(userLookupService.findUserById(usersInfo.getId()));
            System.out.println(usersInfo);

            System.out.println("Deleting user");
            userRegistrationService.removeUser(usersInfo.getId());
            System.out.println(userLookupService.findUserByName("asdfdf"));
        }


    }

    @Test
    void testAccessUser() {
        UsersInfoExample usersInfoExample = new UsersInfoExample();
        usersInfoExample.createCriteria().andNameEqualTo("asdf");

        List<UsersInfo> usersInfoList = usersInfoMapper.selectByExample(usersInfoExample);

        System.out.println(usersInfoList);

    }



    @Autowired
    CustomUserMapper customUserMapper;

    @Test
    void testSelectAptFromId() {
        List<ApartmentsInfo> apartmentsInfoList = customUserMapper.getApartmentsInfoByUserId(1);
        System.out.println(apartmentsInfoList);

    }


}
