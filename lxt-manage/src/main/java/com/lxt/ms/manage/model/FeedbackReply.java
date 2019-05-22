package com.lxt.ms.manage.model;

import java.util.Date;

public class FeedbackReply {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_feedback_reply.ID
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_feedback_reply.FEEDBACK_ID
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    private String feedbackId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_feedback_reply.CONTENT
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_feedback_reply.INSERT_TIME
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    private Date insertTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_feedback_reply.USER_ID
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_feedback_reply.STATUS
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    private String status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_feedback_reply.ID
     *
     * @return the value of lxt_feedback_reply.ID
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_feedback_reply.ID
     *
     * @param id the value for lxt_feedback_reply.ID
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_feedback_reply.FEEDBACK_ID
     *
     * @return the value of lxt_feedback_reply.FEEDBACK_ID
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    public String getFeedbackId() {
        return feedbackId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_feedback_reply.FEEDBACK_ID
     *
     * @param feedbackId the value for lxt_feedback_reply.FEEDBACK_ID
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    public void setFeedbackId(String feedbackId) {
        this.feedbackId = feedbackId == null ? null : feedbackId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_feedback_reply.CONTENT
     *
     * @return the value of lxt_feedback_reply.CONTENT
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_feedback_reply.CONTENT
     *
     * @param content the value for lxt_feedback_reply.CONTENT
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_feedback_reply.INSERT_TIME
     *
     * @return the value of lxt_feedback_reply.INSERT_TIME
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    public Date getInsertTime() {
        return insertTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_feedback_reply.INSERT_TIME
     *
     * @param insertTime the value for lxt_feedback_reply.INSERT_TIME
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_feedback_reply.USER_ID
     *
     * @return the value of lxt_feedback_reply.USER_ID
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_feedback_reply.USER_ID
     *
     * @param userId the value for lxt_feedback_reply.USER_ID
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_feedback_reply.STATUS
     *
     * @return the value of lxt_feedback_reply.STATUS
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_feedback_reply.STATUS
     *
     * @param status the value for lxt_feedback_reply.STATUS
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}