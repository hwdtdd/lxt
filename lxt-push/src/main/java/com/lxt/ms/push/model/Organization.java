package com.lxt.ms.push.model;

import java.util.Date;

public class Organization {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_organization.ORG_ID
     *
     * @mbggenerated Thu Apr 04 15:26:54 CST 2019
     */
    private String orgId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_organization.ORG_NAME
     *
     * @mbggenerated Thu Apr 04 15:26:54 CST 2019
     */
    private String orgName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_organization.ORG_CODE
     *
     * @mbggenerated Thu Apr 04 15:26:54 CST 2019
     */
    private String orgCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_organization.PARENT_ID
     *
     * @mbggenerated Thu Apr 04 15:26:54 CST 2019
     */
    private String parentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_organization.LAST_UPDATE_TIME
     *
     * @mbggenerated Thu Apr 04 15:26:54 CST 2019
     */
    private Date lastUpdateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_organization.LAST_UPDATE_USER
     *
     * @mbggenerated Thu Apr 04 15:26:54 CST 2019
     */
    private String lastUpdateUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_organization.ORG_MANAGER
     *
     * @mbggenerated Thu Apr 04 15:26:54 CST 2019
     */
    private String orgManager;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_organization.ORG_ORDER
     *
     * @mbggenerated Thu Apr 04 15:26:54 CST 2019
     */
    private Integer orgOrder;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_organization.ORG_LEVEL
     *
     * @mbggenerated Thu Apr 04 15:26:54 CST 2019
     */
    private Integer orgLevel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_organization.ORG_PATH
     *
     * @mbggenerated Thu Apr 04 15:26:54 CST 2019
     */
    private String orgPath;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_organization.ORG_MEMO
     *
     * @mbggenerated Thu Apr 04 15:26:54 CST 2019
     */
    private String orgMemo;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_organization.ORG_ID
     *
     * @return the value of lxt_organization.ORG_ID
     *
     * @mbggenerated Thu Apr 04 15:26:54 CST 2019
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_organization.ORG_ID
     *
     * @param orgId the value for lxt_organization.ORG_ID
     *
     * @mbggenerated Thu Apr 04 15:26:54 CST 2019
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_organization.ORG_NAME
     *
     * @return the value of lxt_organization.ORG_NAME
     *
     * @mbggenerated Thu Apr 04 15:26:54 CST 2019
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_organization.ORG_NAME
     *
     * @param orgName the value for lxt_organization.ORG_NAME
     *
     * @mbggenerated Thu Apr 04 15:26:54 CST 2019
     */
    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_organization.ORG_CODE
     *
     * @return the value of lxt_organization.ORG_CODE
     *
     * @mbggenerated Thu Apr 04 15:26:54 CST 2019
     */
    public String getOrgCode() {
        return orgCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_organization.ORG_CODE
     *
     * @param orgCode the value for lxt_organization.ORG_CODE
     *
     * @mbggenerated Thu Apr 04 15:26:54 CST 2019
     */
    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode == null ? null : orgCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_organization.PARENT_ID
     *
     * @return the value of lxt_organization.PARENT_ID
     *
     * @mbggenerated Thu Apr 04 15:26:54 CST 2019
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_organization.PARENT_ID
     *
     * @param parentId the value for lxt_organization.PARENT_ID
     *
     * @mbggenerated Thu Apr 04 15:26:54 CST 2019
     */
    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_organization.LAST_UPDATE_TIME
     *
     * @return the value of lxt_organization.LAST_UPDATE_TIME
     *
     * @mbggenerated Thu Apr 04 15:26:54 CST 2019
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_organization.LAST_UPDATE_TIME
     *
     * @param lastUpdateTime the value for lxt_organization.LAST_UPDATE_TIME
     *
     * @mbggenerated Thu Apr 04 15:26:54 CST 2019
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_organization.LAST_UPDATE_USER
     *
     * @return the value of lxt_organization.LAST_UPDATE_USER
     *
     * @mbggenerated Thu Apr 04 15:26:54 CST 2019
     */
    public String getLastUpdateUser() {
        return lastUpdateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_organization.LAST_UPDATE_USER
     *
     * @param lastUpdateUser the value for lxt_organization.LAST_UPDATE_USER
     *
     * @mbggenerated Thu Apr 04 15:26:54 CST 2019
     */
    public void setLastUpdateUser(String lastUpdateUser) {
        this.lastUpdateUser = lastUpdateUser == null ? null : lastUpdateUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_organization.ORG_MANAGER
     *
     * @return the value of lxt_organization.ORG_MANAGER
     *
     * @mbggenerated Thu Apr 04 15:26:54 CST 2019
     */
    public String getOrgManager() {
        return orgManager;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_organization.ORG_MANAGER
     *
     * @param orgManager the value for lxt_organization.ORG_MANAGER
     *
     * @mbggenerated Thu Apr 04 15:26:54 CST 2019
     */
    public void setOrgManager(String orgManager) {
        this.orgManager = orgManager == null ? null : orgManager.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_organization.ORG_ORDER
     *
     * @return the value of lxt_organization.ORG_ORDER
     *
     * @mbggenerated Thu Apr 04 15:26:54 CST 2019
     */
    public Integer getOrgOrder() {
        return orgOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_organization.ORG_ORDER
     *
     * @param orgOrder the value for lxt_organization.ORG_ORDER
     *
     * @mbggenerated Thu Apr 04 15:26:54 CST 2019
     */
    public void setOrgOrder(Integer orgOrder) {
        this.orgOrder = orgOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_organization.ORG_LEVEL
     *
     * @return the value of lxt_organization.ORG_LEVEL
     *
     * @mbggenerated Thu Apr 04 15:26:54 CST 2019
     */
    public Integer getOrgLevel() {
        return orgLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_organization.ORG_LEVEL
     *
     * @param orgLevel the value for lxt_organization.ORG_LEVEL
     *
     * @mbggenerated Thu Apr 04 15:26:54 CST 2019
     */
    public void setOrgLevel(Integer orgLevel) {
        this.orgLevel = orgLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_organization.ORG_PATH
     *
     * @return the value of lxt_organization.ORG_PATH
     *
     * @mbggenerated Thu Apr 04 15:26:54 CST 2019
     */
    public String getOrgPath() {
        return orgPath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_organization.ORG_PATH
     *
     * @param orgPath the value for lxt_organization.ORG_PATH
     *
     * @mbggenerated Thu Apr 04 15:26:54 CST 2019
     */
    public void setOrgPath(String orgPath) {
        this.orgPath = orgPath == null ? null : orgPath.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_organization.ORG_MEMO
     *
     * @return the value of lxt_organization.ORG_MEMO
     *
     * @mbggenerated Thu Apr 04 15:26:54 CST 2019
     */
    public String getOrgMemo() {
        return orgMemo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_organization.ORG_MEMO
     *
     * @param orgMemo the value for lxt_organization.ORG_MEMO
     *
     * @mbggenerated Thu Apr 04 15:26:54 CST 2019
     */
    public void setOrgMemo(String orgMemo) {
        this.orgMemo = orgMemo == null ? null : orgMemo.trim();
    }
}