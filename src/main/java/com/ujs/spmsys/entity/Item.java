package com.ujs.spmsys.entity;

public class Item {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item.id
     *
     * @mbg.generated Fri May 04 10:00:35 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item.type
     *
     * @mbg.generated Fri May 04 10:00:35 CST 2018
     */
    private Integer type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item.name
     *
     * @mbg.generated Fri May 04 10:00:35 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item.filepath
     *
     * @mbg.generated Fri May 04 10:00:35 CST 2018
     */
    private String filepath;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item.accountid
     *
     * @mbg.generated Fri May 04 10:00:35 CST 2018
     */
    private Integer accountid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item.projectid
     *
     * @mbg.generated Fri May 04 10:00:35 CST 2018
     */
    private Integer projectid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item.projectname
     *
     * @mbg.generated Fri May 04 10:00:35 CST 2018
     */
    private String projectname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item.accountname
     *
     * @mbg.generated Fri May 04 10:00:35 CST 2018
     */
    private String accountname;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item.id
     *
     * @return the value of item.id
     *
     * @mbg.generated Fri May 04 10:00:35 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item.id
     *
     * @param id the value for item.id
     *
     * @mbg.generated Fri May 04 10:00:35 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item.type
     *
     * @return the value of item.type
     *
     * @mbg.generated Fri May 04 10:00:35 CST 2018
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item.type
     *
     * @param type the value for item.type
     *
     * @mbg.generated Fri May 04 10:00:35 CST 2018
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item.name
     *
     * @return the value of item.name
     *
     * @mbg.generated Fri May 04 10:00:35 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item.name
     *
     * @param name the value for item.name
     *
     * @mbg.generated Fri May 04 10:00:35 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item.filepath
     *
     * @return the value of item.filepath
     *
     * @mbg.generated Fri May 04 10:00:35 CST 2018
     */
    public String getFilepath() {
        return filepath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item.filepath
     *
     * @param filepath the value for item.filepath
     *
     * @mbg.generated Fri May 04 10:00:35 CST 2018
     */
    public void setFilepath(String filepath) {
        this.filepath = filepath == null ? null : filepath.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item.accountid
     *
     * @return the value of item.accountid
     *
     * @mbg.generated Fri May 04 10:00:35 CST 2018
     */
    public Integer getAccountid() {
        return accountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item.accountid
     *
     * @param accountid the value for item.accountid
     *
     * @mbg.generated Fri May 04 10:00:35 CST 2018
     */
    public void setAccountid(Integer accountid) {
        this.accountid = accountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item.projectid
     *
     * @return the value of item.projectid
     *
     * @mbg.generated Fri May 04 10:00:35 CST 2018
     */
    public Integer getProjectid() {
        return projectid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item.projectid
     *
     * @param projectid the value for item.projectid
     *
     * @mbg.generated Fri May 04 10:00:35 CST 2018
     */
    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item.projectname
     *
     * @return the value of item.projectname
     *
     * @mbg.generated Fri May 04 10:00:35 CST 2018
     */
    public String getProjectname() {
        return projectname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item.projectname
     *
     * @param projectname the value for item.projectname
     *
     * @mbg.generated Fri May 04 10:00:35 CST 2018
     */
    public void setProjectname(String projectname) {
        this.projectname = projectname == null ? null : projectname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item.accountname
     *
     * @return the value of item.accountname
     *
     * @mbg.generated Fri May 04 10:00:35 CST 2018
     */
    public String getAccountname() {
        return accountname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item.accountname
     *
     * @param accountname the value for item.accountname
     *
     * @mbg.generated Fri May 04 10:00:35 CST 2018
     */
    public void setAccountname(String accountname) {
        this.accountname = accountname == null ? null : accountname.trim();
    }
}