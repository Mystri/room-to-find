package com.room.backend.data.mapper;

import com.room.backend.data.entity.UserFavApartment;
import com.room.backend.data.entity.UserFavApartmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserFavApartmentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_fav_apartment
     *
     * @mbg.generated Tue Aug 30 00:49:17 CDT 2022
     */
    long countByExample(UserFavApartmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_fav_apartment
     *
     * @mbg.generated Tue Aug 30 00:49:17 CDT 2022
     */
    int deleteByExample(UserFavApartmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_fav_apartment
     *
     * @mbg.generated Tue Aug 30 00:49:17 CDT 2022
     */
    int insert(UserFavApartment row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_fav_apartment
     *
     * @mbg.generated Tue Aug 30 00:49:17 CDT 2022
     */
    int insertSelective(UserFavApartment row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_fav_apartment
     *
     * @mbg.generated Tue Aug 30 00:49:17 CDT 2022
     */
    List<UserFavApartment> selectByExample(UserFavApartmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_fav_apartment
     *
     * @mbg.generated Tue Aug 30 00:49:17 CDT 2022
     */
    int updateByExampleSelective(@Param("row") UserFavApartment row, @Param("example") UserFavApartmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_fav_apartment
     *
     * @mbg.generated Tue Aug 30 00:49:17 CDT 2022
     */
    int updateByExample(@Param("row") UserFavApartment row, @Param("example") UserFavApartmentExample example);
}