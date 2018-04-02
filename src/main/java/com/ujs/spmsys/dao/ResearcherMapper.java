package com.ujs.spmsys.dao;

import com.ujs.spmsys.entity.Researcher;
import org.springframework.stereotype.Repository;

@Repository
public interface ResearcherMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table researcher
     *
     * @mbg.generated Mon Apr 02 10:35:35 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table researcher
     *
     * @mbg.generated Mon Apr 02 10:35:35 CST 2018
     */
    int insert(Researcher record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table researcher
     *
     * @mbg.generated Mon Apr 02 10:35:35 CST 2018
     */
    int insertSelective(Researcher record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table researcher
     *
     * @mbg.generated Mon Apr 02 10:35:35 CST 2018
     */
    Researcher selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table researcher
     *
     * @mbg.generated Mon Apr 02 10:35:35 CST 2018
     */
    int updateByPrimaryKeySelective(Researcher record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table researcher
     *
     * @mbg.generated Mon Apr 02 10:35:35 CST 2018
     */
    int updateByPrimaryKey(Researcher record);

    Researcher selectByName(String name);
}