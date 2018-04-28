package com.ujs.spmsys.dao;

import com.ujs.spmsys.entity.File;
import org.springframework.stereotype.Repository;

@Repository
public interface FileMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file
     *
     * @mbg.generated Wed Apr 25 15:19:19 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file
     *
     * @mbg.generated Wed Apr 25 15:19:19 CST 2018
     */
    int insert(File record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file
     *
     * @mbg.generated Wed Apr 25 15:19:19 CST 2018
     */
    int insertSelective(File record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file
     *
     * @mbg.generated Wed Apr 25 15:19:19 CST 2018
     */
    File selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file
     *
     * @mbg.generated Wed Apr 25 15:19:19 CST 2018
     */
    int updateByPrimaryKeySelective(File record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file
     *
     * @mbg.generated Wed Apr 25 15:19:19 CST 2018
     */
    int updateByPrimaryKey(File record);
}