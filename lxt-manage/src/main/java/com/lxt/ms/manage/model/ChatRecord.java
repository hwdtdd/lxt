package com.lxt.ms.manage.model;

import java.util.Date;

public class ChatRecord {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_chat_record.RECORD_ID
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    private String recordId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_chat_record.SEND_ID
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    private String sendId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_chat_record.RECEIVE_ID
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    private String receiveId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_chat_record.MSG_TYPE
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    private Integer msgType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_chat_record.CONTENT
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_chat_record.INSERT_TIME
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    private Date insertTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_chat_record.RECORD_ID
     *
     * @return the value of lxt_chat_record.RECORD_ID
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public String getRecordId() {
        return recordId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_chat_record.RECORD_ID
     *
     * @param recordId the value for lxt_chat_record.RECORD_ID
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public void setRecordId(String recordId) {
        this.recordId = recordId == null ? null : recordId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_chat_record.SEND_ID
     *
     * @return the value of lxt_chat_record.SEND_ID
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public String getSendId() {
        return sendId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_chat_record.SEND_ID
     *
     * @param sendId the value for lxt_chat_record.SEND_ID
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public void setSendId(String sendId) {
        this.sendId = sendId == null ? null : sendId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_chat_record.RECEIVE_ID
     *
     * @return the value of lxt_chat_record.RECEIVE_ID
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public String getReceiveId() {
        return receiveId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_chat_record.RECEIVE_ID
     *
     * @param receiveId the value for lxt_chat_record.RECEIVE_ID
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public void setReceiveId(String receiveId) {
        this.receiveId = receiveId == null ? null : receiveId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_chat_record.MSG_TYPE
     *
     * @return the value of lxt_chat_record.MSG_TYPE
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public Integer getMsgType() {
        return msgType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_chat_record.MSG_TYPE
     *
     * @param msgType the value for lxt_chat_record.MSG_TYPE
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public void setMsgType(Integer msgType) {
        this.msgType = msgType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_chat_record.CONTENT
     *
     * @return the value of lxt_chat_record.CONTENT
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_chat_record.CONTENT
     *
     * @param content the value for lxt_chat_record.CONTENT
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_chat_record.INSERT_TIME
     *
     * @return the value of lxt_chat_record.INSERT_TIME
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public Date getInsertTime() {
        return insertTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_chat_record.INSERT_TIME
     *
     * @param insertTime the value for lxt_chat_record.INSERT_TIME
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
}