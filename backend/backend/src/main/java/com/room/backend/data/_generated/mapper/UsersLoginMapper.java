package com.room.backend.data._generated.mapper;

import com.room.backend.data._generated.entity.UsersLogin;
import com.room.backend.data._generated.entity.UsersLoginExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsersLoginMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_login
     *
     * @mbg.generated Tue Mar 21 06:11:41 CDT 2023
     */
    long countByExample(UsersLoginExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_login
     *
     * @mbg.generated Tue Mar 21 06:11:41 CDT 2023
     */
    int deleteByExample(UsersLoginExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_login
     *
     * @mbg.generated Tue Mar 21 06:11:41 CDT 2023
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_login
     *
     * @mbg.generated Tue Mar 21 06:11:41 CDT 2023
     */
    int insert(UsersLogin row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_login
     *
     * @mbg.generated Tue Mar 21 06:11:41 CDT 2023
     */
    int insertSelective(UsersLogin row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_login
     *
     * @mbg.generated Tue Mar 21 06:11:41 CDT 2023
     */
    List<UsersLogin> selectByExample(UsersLoginExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_login
     *
     * @mbg.generated Tue Mar 21 06:11:41 CDT 2023
     */
    UsersLogin selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_login
     *
     * @mbg.generated Tue Mar 21 06:11:41 CDT 2023
     */
    int updateByExampleSelective(@Param("row") UsersLogin row, @Param("example") UsersLoginExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_login
     *
     * @mbg.generated Tue Mar 21 06:11:41 CDT 2023
     */
    int updateByExample(@Param("row") UsersLogin row, @Param("example") UsersLoginExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_login
     *
     * @mbg.generated Tue Mar 21 06:11:41 CDT 2023
     */
    int updateByPrimaryKeySelective(UsersLogin row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_login
     *
     * @mbg.generated Tue Mar 21 06:11:41 CDT 2023
     */
    int updateByPrimaryKey(UsersLogin row);
}