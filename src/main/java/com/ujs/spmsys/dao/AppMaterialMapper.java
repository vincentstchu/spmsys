package com.ujs.spmsys.dao;

import com.ujs.spmsys.entity.AppMaterial;

public interface AppMaterialMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_material
     *
     * @mbg.generated Sun Apr 15 09:52:52 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_material
     *
     * @mbg.generated Sun Apr 15 09:52:52 CST 2018
     */
    int insert(AppMaterial record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_material
     *
     * @mbg.generated Sun Apr 15 09:52:52 CST 2018
     */
    int insertSelective(AppMaterial record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_material
     *
     * @mbg.generated Sun Apr 15 09:52:52 CST 2018
     */
    AppMaterial selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_material
     *
     * @mbg.generated Sun Apr 15 09:52:52 CST 2018
     */
    int updateByPrimaryKeySelective(AppMaterial record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_material
     *
     * @mbg.generated Sun Apr 15 09:52:52 CST 2018
     */
    int updateByPrimaryKey(AppMaterial record);
}