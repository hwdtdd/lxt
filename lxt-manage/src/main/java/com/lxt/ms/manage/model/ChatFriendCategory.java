package com.lxt.ms.manage.model;

import java.util.Date;

public class ChatFriendCategory {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_chat_friend_category.FRIEND_CATEGORY_ID
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    private String friendCategoryId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_chat_friend_category.USER_ID
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_chat_friend_category.NAME
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_chat_friend_category.SORT_SEQ
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    private Integer sortSeq;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_chat_friend_category.INSERT_TIME
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    private Date insertTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_chat_friend_category.UPDATE_TIME
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_chat_friend_category.FRIEND_CATEGORY_ID
     *
     * @return the value of lxt_chat_friend_category.FRIEND_CATEGORY_ID
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public String getFriendCategoryId() {
        return friendCategoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_chat_friend_category.FRIEND_CATEGORY_ID
     *
     * @param friendCategoryId the value for lxt_chat_friend_category.FRIEND_CATEGORY_ID
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public void setFriendCategoryId(String friendCategoryId) {
        this.friendCategoryId = friendCategoryId == null ? null : friendCategoryId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_chat_friend_category.USER_ID
     *
     * @return the value of lxt_chat_friend_category.USER_ID
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_chat_friend_category.USER_ID
     *
     * @param userId the value for lxt_chat_friend_category.USER_ID
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_chat_friend_category.NAME
     *
     * @return the value of lxt_chat_friend_category.NAME
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_chat_friend_category.NAME
     *
     * @param name the value for lxt_chat_friend_category.NAME
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_chat_friend_category.SORT_SEQ
     *
     * @return the value of lxt_chat_friend_category.SORT_SEQ
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public Integer getSortSeq() {
        return sortSeq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_chat_friend_category.SORT_SEQ
     *
     * @param sortSeq the value for lxt_chat_friend_category.SORT_SEQ
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public void setSortSeq(Integer sortSeq) {
        this.sortSeq = sortSeq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_chat_friend_category.INSERT_TIME
     *
     * @return the value of lxt_chat_friend_category.INSERT_TIME
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public Date getInsertTime() {
        return insertTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_chat_friend_category.INSERT_TIME
     *
     * @param insertTime the value for lxt_chat_friend_category.INSERT_TIME
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_chat_friend_category.UPDATE_TIME
     *
     * @return the value of lxt_chat_friend_category.UPDATE_TIME
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_chat_friend_category.UPDATE_TIME
     *
     * @param updateTime the value for lxt_chat_friend_category.UPDATE_TIME
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}