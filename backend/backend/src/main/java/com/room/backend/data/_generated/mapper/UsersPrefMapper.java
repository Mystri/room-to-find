package com.room.backend.data._generated.mapper;

import com.room.backend.data._generated.entity.UsersPref;
import com.room.backend.data._generated.entity.UsersPrefExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsersPrefMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_pref
     *
     * @mbg.generated Tue Mar 21 06:11:41 CDT 2023
     */
    long countByExample(UsersPrefExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_pref
     *
     * @mbg.generated Tue Mar 21 06:11:41 CDT 2023
     */
    int deleteByExample(UsersPrefExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_pref
     *
     * @mbg.generated Tue Mar 21 06:11:41 CDT 2023
     */
    int insert(UsersPref row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_pref
     *
     * @mbg.generated Tue Mar 21 06:11:41 CDT 2023
     */
    int insertSelective(UsersPref row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_pref
     *
     * @mbg.generated Tue Mar 21 06:11:41 CDT 2023
     */
    List<UsersPref> selectByExample(UsersPrefExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_pref
     *
     * @mbg.generated Tue Mar 21 06:11:41 CDT 2023
     */
    int updateByExampleSelective(@Param("row") UsersPref row, @Param("example") UsersPrefExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_pref
     *
     * @mbg.generated Tue Mar 21 06:11:41 CDT 2023
     */
    int updateByExample(@Param("row") UsersPref row, @Param("example") UsersPrefExample example);
}