package com.ujs.spmsys.entity;

import java.util.Date;

public class Account {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.id
     *
     * @mbg.generated Sun Apr 15 09:52:52 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.accountname
     *
     * @mbg.generated Sun Apr 15 09:52:52 CST 2018
     */
    private String accountname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.passwd
     *
     * @mbg.generated Sun Apr 15 09:52:52 CST 2018
     */
    private String passwd;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.regtime
     *
     * @mbg.generated Sun Apr 15 09:52:52 CST 2018
     */
    private Date regtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.status
     *
     * @mbg.generated Sun Apr 15 09:52:52 CST 2018
     */
    private Integer status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.id
     *
     * @return the value of account.id
     *
     * @mbg.generated Sun Apr 15 09:52:52 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.id
     *
     * @param id the value for account.id
     *
     * @mbg.generated Sun Apr 15 09:52:52 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.accountname
     *
     * @return the value of account.accountname
     *
     * @mbg.generated Sun Apr 15 09:52:52 CST 2018
     */
    public String getAccountname() {
        return accountname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.accountname
     *
     * @param accountname the value for account.accountname
     *
     * @mbg.generated Sun Apr 15 09:52:52 CST 2018
     */
    public void setAccountname(String accountname) {
        this.accountname = accountname == null ? null : accountname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.passwd
     *
     * @return the value of account.passwd
     *
     * @mbg.generated Sun Apr 15 09:52:52 CST 2018
     */
    public String getPasswd() {
        return passwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.passwd
     *
     * @param passwd the value for account.passwd
     *
     * @mbg.generated Sun Apr 15 09:52:52 CST 2018
     */
    public void setPasswd(String passwd) {
        this.passwd = passwd == null ? null : passwd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.regtime
     *
     * @return the value of account.regtime
     *
     * @mbg.generated Sun Apr 15 09:52:52 CST 2018
     */
    public Date getRegtime() {
        return regtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.regtime
     *
     * @param regtime the value for account.regtime
     *
     * @mbg.generated Sun Apr 15 09:52:52 CST 2018
     */
    public void setRegtime(Date regtime) {
        this.regtime = regtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.status
     *
     * @return the value of account.status
     *
     * @mbg.generated Sun Apr 15 09:52:52 CST 2018
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.status
     *
     * @param status the value for account.status
     *
     * @mbg.generated Sun Apr 15 09:52:52 CST 2018
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}