package com.lxt.ms.manage.model;

import java.util.Date;

public class Menu {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_menu.MENU_ID
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    private String menuId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_menu.NAME
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_menu.STATUS
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_menu.USER_ID
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_menu.INSERT_TIME
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    private Date insertTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_menu.UPDATE_TIME
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_menu.URL
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    private String url;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_menu.MENU_ID
     *
     * @return the value of lxt_menu.MENU_ID
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    public String getMenuId() {
        return menuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_menu.MENU_ID
     *
     * @param menuId the value for lxt_menu.MENU_ID
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    public void setMenuId(String menuId) {
        this.menuId = menuId == null ? null : menuId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_menu.NAME
     *
     * @return the value of lxt_menu.NAME
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_menu.NAME
     *
     * @param name the value for lxt_menu.NAME
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_menu.STATUS
     *
     * @return the value of lxt_menu.STATUS
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_menu.STATUS
     *
     * @param status the value for lxt_menu.STATUS
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_menu.USER_ID
     *
     * @return the value of lxt_menu.USER_ID
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_menu.USER_ID
     *
     * @param userId the value for lxt_menu.USER_ID
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_menu.INSERT_TIME
     *
     * @return the value of lxt_menu.INSERT_TIME
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    public Date getInsertTime() {
        return insertTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_menu.INSERT_TIME
     *
     * @param insertTime the value for lxt_menu.INSERT_TIME
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_menu.UPDATE_TIME
     *
     * @return the value of lxt_menu.UPDATE_TIME
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_menu.UPDATE_TIME
     *
     * @param updateTime the value for lxt_menu.UPDATE_TIME
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_menu.URL
     *
     * @return the value of lxt_menu.URL
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_menu.URL
     *
     * @param url the value for lxt_menu.URL
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }
}