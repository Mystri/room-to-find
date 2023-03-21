package com.room.backend.data.mapper;

import com.room.backend.data.entity.UsersPref;
import com.room.backend.data.entity.UsersPrefExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsersPrefMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_pref
     *
     * @mbg.generated Tue Aug 30 00:49:17 CDT 2022
     */
    long countByExample(UsersPrefExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_pref
     *
     * @mbg.generated Tue Aug 30 00:49:17 CDT 2022
     */
    int deleteByExample(UsersPrefExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_pref
     *
     * @mbg.generated Tue Aug 30 00:49:17 CDT 2022
     */
    int insert(UsersPref row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_pref
     *
     * @mbg.generated Tue Aug 30 00:49:17 CDT 2022
     */
    int insertSelective(UsersPref row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_pref
     *
     * @mbg.generated Tue Aug 30 00:49:17 CDT 2022
     */
    List<UsersPref> selectByExample(UsersPrefExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_pref
     *
     * @mbg.generated Tue Aug 30 00:49:17 CDT 2022
     */
    int updateByExampleSelective(@Param("row") UsersPref row, @Param("example") UsersPrefExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_pref
     *
     * @mbg.generated Tue Aug 30 00:49:17 CDT 2022
     */
    int updateByExample(@Param("row") UsersPref row, @Param("example") UsersPrefExample example);
}