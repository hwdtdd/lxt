package com.lxt.ms.manage.model;

import java.util.Date;

public class Department {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_department.DEPT_ID
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    private String deptId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_department.DEPT_NAME
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    private String deptName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_department.DEPT_CODE
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    private String deptCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_department.PARENT_ID
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    private String parentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_department.LAST_UPDATE_TIME
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    private Date lastUpdateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_department.LAST_UPDATE_USER
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    private String lastUpdateUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_department.DEPT_MANAGER
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    private String deptManager;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_department.DEPT_ORDER
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    private Integer deptOrder;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_department.ORG_ID
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    private String orgId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_department.PHONE
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_department.MOBILE
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    private String mobile;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_department.FAX
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    private String fax;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_department.QQ
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    private String qq;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_department.EMAIL
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_department.DEPT_MEMO
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    private String deptMemo;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_department.DEPT_ID
     *
     * @return the value of lxt_department.DEPT_ID
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public String getDeptId() {
        return deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_department.DEPT_ID
     *
     * @param deptId the value for lxt_department.DEPT_ID
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public void setDeptId(String deptId) {
        this.deptId = deptId == null ? null : deptId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_department.DEPT_NAME
     *
     * @return the value of lxt_department.DEPT_NAME
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_department.DEPT_NAME
     *
     * @param deptName the value for lxt_department.DEPT_NAME
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_department.DEPT_CODE
     *
     * @return the value of lxt_department.DEPT_CODE
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_department.DEPT_CODE
     *
     * @param deptCode the value for lxt_department.DEPT_CODE
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode == null ? null : deptCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_department.PARENT_ID
     *
     * @return the value of lxt_department.PARENT_ID
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_department.PARENT_ID
     *
     * @param parentId the value for lxt_department.PARENT_ID
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_department.LAST_UPDATE_TIME
     *
     * @return the value of lxt_department.LAST_UPDATE_TIME
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_department.LAST_UPDATE_TIME
     *
     * @param lastUpdateTime the value for lxt_department.LAST_UPDATE_TIME
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_department.LAST_UPDATE_USER
     *
     * @return the value of lxt_department.LAST_UPDATE_USER
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public String getLastUpdateUser() {
        return lastUpdateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_department.LAST_UPDATE_USER
     *
     * @param lastUpdateUser the value for lxt_department.LAST_UPDATE_USER
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public void setLastUpdateUser(String lastUpdateUser) {
        this.lastUpdateUser = lastUpdateUser == null ? null : lastUpdateUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_department.DEPT_MANAGER
     *
     * @return the value of lxt_department.DEPT_MANAGER
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public String getDeptManager() {
        return deptManager;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_department.DEPT_MANAGER
     *
     * @param deptManager the value for lxt_department.DEPT_MANAGER
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public void setDeptManager(String deptManager) {
        this.deptManager = deptManager == null ? null : deptManager.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_department.DEPT_ORDER
     *
     * @return the value of lxt_department.DEPT_ORDER
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public Integer getDeptOrder() {
        return deptOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_department.DEPT_ORDER
     *
     * @param deptOrder the value for lxt_department.DEPT_ORDER
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public void setDeptOrder(Integer deptOrder) {
        this.deptOrder = deptOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_department.ORG_ID
     *
     * @return the value of lxt_department.ORG_ID
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_department.ORG_ID
     *
     * @param orgId the value for lxt_department.ORG_ID
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_department.PHONE
     *
     * @return the value of lxt_department.PHONE
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_department.PHONE
     *
     * @param phone the value for lxt_department.PHONE
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_department.MOBILE
     *
     * @return the value of lxt_department.MOBILE
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_department.MOBILE
     *
     * @param mobile the value for lxt_department.MOBILE
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_department.FAX
     *
     * @return the value of lxt_department.FAX
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public String getFax() {
        return fax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_department.FAX
     *
     * @param fax the value for lxt_department.FAX
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_department.QQ
     *
     * @return the value of lxt_department.QQ
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public String getQq() {
        return qq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_department.QQ
     *
     * @param qq the value for lxt_department.QQ
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_department.EMAIL
     *
     * @return the value of lxt_department.EMAIL
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_department.EMAIL
     *
     * @param email the value for lxt_department.EMAIL
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_department.DEPT_MEMO
     *
     * @return the value of lxt_department.DEPT_MEMO
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public String getDeptMemo() {
        return deptMemo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_department.DEPT_MEMO
     *
     * @param deptMemo the value for lxt_department.DEPT_MEMO
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public void setDeptMemo(String deptMemo) {
        this.deptMemo = deptMemo == null ? null : deptMemo.trim();
    }
}