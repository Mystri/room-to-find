package com.room.backend.data._generated.mapper;

import com.room.backend.data._generated.entity.Hobby;
import com.room.backend.data._generated.entity.HobbyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HobbyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hobby
     *
     * @mbg.generated Tue Mar 21 06:11:41 CDT 2023
     */
    long countByExample(HobbyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hobby
     *
     * @mbg.generated Tue Mar 21 06:11:41 CDT 2023
     */
    int deleteByExample(HobbyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hobby
     *
     * @mbg.generated Tue Mar 21 06:11:41 CDT 2023
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hobby
     *
     * @mbg.generated Tue Mar 21 06:11:41 CDT 2023
     */
    int insert(Hobby row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hobby
     *
     * @mbg.generated Tue Mar 21 06:11:41 CDT 2023
     */
    int insertSelective(Hobby row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hobby
     *
     * @mbg.generated Tue Mar 21 06:11:41 CDT 2023
     */
    List<Hobby> selectByExample(HobbyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hobby
     *
     * @mbg.generated Tue Mar 21 06:11:41 CDT 2023
     */
    Hobby selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hobby
     *
     * @mbg.generated Tue Mar 21 06:11:41 CDT 2023
     */
    int updateByExampleSelective(@Param("row") Hobby row, @Param("example") HobbyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hobby
     *
     * @mbg.generated Tue Mar 21 06:11:41 CDT 2023
     */
    int updateByExample(@Param("row") Hobby row, @Param("example") HobbyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hobby
     *
     * @mbg.generated Tue Mar 21 06:11:41 CDT 2023
     */
    int updateByPrimaryKeySelective(Hobby row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hobby
     *
     * @mbg.generated Tue Mar 21 06:11:41 CDT 2023
     */
    int updateByPrimaryKey(Hobby row);
}