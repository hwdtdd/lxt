package com.lxt.ms.manage.model;

import java.util.Date;

public class Role {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_role.ROLE_ID
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    private String roleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_role.NAME
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_role.STATUS
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_role.USER_ID
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_role.INSERT_TIME
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    private Date insertTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_role.UPDATE_TIME
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_role.ROLE_ID
     *
     * @return the value of lxt_role.ROLE_ID
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_role.ROLE_ID
     *
     * @param roleId the value for lxt_role.ROLE_ID
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_role.NAME
     *
     * @return the value of lxt_role.NAME
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_role.NAME
     *
     * @param name the value for lxt_role.NAME
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_role.STATUS
     *
     * @return the value of lxt_role.STATUS
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_role.STATUS
     *
     * @param status the value for lxt_role.STATUS
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_role.USER_ID
     *
     * @return the value of lxt_role.USER_ID
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_role.USER_ID
     *
     * @param userId the value for lxt_role.USER_ID
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_role.INSERT_TIME
     *
     * @return the value of lxt_role.INSERT_TIME
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    public Date getInsertTime() {
        return insertTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_role.INSERT_TIME
     *
     * @param insertTime the value for lxt_role.INSERT_TIME
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_role.UPDATE_TIME
     *
     * @return the value of lxt_role.UPDATE_TIME
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_role.UPDATE_TIME
     *
     * @param updateTime the value for lxt_role.UPDATE_TIME
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}