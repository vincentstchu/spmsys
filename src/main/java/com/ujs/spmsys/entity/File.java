package com.ujs.spmsys.entity;

import java.util.Date;

public class File {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column file.id
     *
     * @mbg.generated Mon Apr 02 10:35:35 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column file.name
     *
     * @mbg.generated Mon Apr 02 10:35:35 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column file.type
     *
     * @mbg.generated Mon Apr 02 10:35:35 CST 2018
     */
    private Integer type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column file.route
     *
     * @mbg.generated Mon Apr 02 10:35:35 CST 2018
     */
    private String route;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column file.uploadtime
     *
     * @mbg.generated Mon Apr 02 10:35:35 CST 2018
     */
    private Date uploadtime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column file.id
     *
     * @return the value of file.id
     *
     * @mbg.generated Mon Apr 02 10:35:35 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column file.id
     *
     * @param id the value for file.id
     *
     * @mbg.generated Mon Apr 02 10:35:35 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column file.name
     *
     * @return the value of file.name
     *
     * @mbg.generated Mon Apr 02 10:35:35 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column file.name
     *
     * @param name the value for file.name
     *
     * @mbg.generated Mon Apr 02 10:35:35 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column file.type
     *
     * @return the value of file.type
     *
     * @mbg.generated Mon Apr 02 10:35:35 CST 2018
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column file.type
     *
     * @param type the value for file.type
     *
     * @mbg.generated Mon Apr 02 10:35:35 CST 2018
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column file.route
     *
     * @return the value of file.route
     *
     * @mbg.generated Mon Apr 02 10:35:35 CST 2018
     */
    public String getRoute() {
        return route;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column file.route
     *
     * @param route the value for file.route
     *
     * @mbg.generated Mon Apr 02 10:35:35 CST 2018
     */
    public void setRoute(String route) {
        this.route = route == null ? null : route.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column file.uploadtime
     *
     * @return the value of file.uploadtime
     *
     * @mbg.generated Mon Apr 02 10:35:35 CST 2018
     */
    public Date getUploadtime() {
        return uploadtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column file.uploadtime
     *
     * @param uploadtime the value for file.uploadtime
     *
     * @mbg.generated Mon Apr 02 10:35:35 CST 2018
     */
    public void setUploadtime(Date uploadtime) {
        this.uploadtime = uploadtime;
    }
}