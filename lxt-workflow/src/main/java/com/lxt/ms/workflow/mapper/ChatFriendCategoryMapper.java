package com.lxt.ms.workflow.mapper;

import com.lxt.ms.workflow.model.ChatFriendCategory;
import com.lxt.ms.workflow.model.ChatFriendCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChatFriendCategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_chat_friend_category
     *
     * @mbggenerated Wed Mar 20 17:24:04 CST 2019
     */
    int countByExample(ChatFriendCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_chat_friend_category
     *
     * @mbggenerated Wed Mar 20 17:24:04 CST 2019
     */
    int deleteByExample(ChatFriendCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_chat_friend_category
     *
     * @mbggenerated Wed Mar 20 17:24:04 CST 2019
     */
    int deleteByPrimaryKey(String friendCategoryId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_chat_friend_category
     *
     * @mbggenerated Wed Mar 20 17:24:04 CST 2019
     */
    int insert(ChatFriendCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_chat_friend_category
     *
     * @mbggenerated Wed Mar 20 17:24:04 CST 2019
     */
    int insertSelective(ChatFriendCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_chat_friend_category
     *
     * @mbggenerated Wed Mar 20 17:24:04 CST 2019
     */
    List<ChatFriendCategory> selectByExample(ChatFriendCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_chat_friend_category
     *
     * @mbggenerated Wed Mar 20 17:24:04 CST 2019
     */
    ChatFriendCategory selectByPrimaryKey(String friendCategoryId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_chat_friend_category
     *
     * @mbggenerated Wed Mar 20 17:24:04 CST 2019
     */
    int updateByExampleSelective(@Param("record") ChatFriendCategory record, @Param("example") ChatFriendCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_chat_friend_category
     *
     * @mbggenerated Wed Mar 20 17:24:04 CST 2019
     */
    int updateByExample(@Param("record") ChatFriendCategory record, @Param("example") ChatFriendCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_chat_friend_category
     *
     * @mbggenerated Wed Mar 20 17:24:04 CST 2019
     */
    int updateByPrimaryKeySelective(ChatFriendCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_chat_friend_category
     *
     * @mbggenerated Wed Mar 20 17:24:04 CST 2019
     */
    int updateByPrimaryKey(ChatFriendCategory record);
}