package com.lxt.ms.workflow.mapper;

import com.lxt.ms.workflow.model.ChatGroup;
import com.lxt.ms.workflow.model.ChatGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChatGroupMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_chat_group
     *
     * @mbggenerated Wed Mar 20 17:24:04 CST 2019
     */
    int countByExample(ChatGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_chat_group
     *
     * @mbggenerated Wed Mar 20 17:24:04 CST 2019
     */
    int deleteByExample(ChatGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_chat_group
     *
     * @mbggenerated Wed Mar 20 17:24:04 CST 2019
     */
    int deleteByPrimaryKey(String groupId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_chat_group
     *
     * @mbggenerated Wed Mar 20 17:24:04 CST 2019
     */
    int insert(ChatGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_chat_group
     *
     * @mbggenerated Wed Mar 20 17:24:04 CST 2019
     */
    int insertSelective(ChatGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_chat_group
     *
     * @mbggenerated Wed Mar 20 17:24:04 CST 2019
     */
    List<ChatGroup> selectByExample(ChatGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_chat_group
     *
     * @mbggenerated Wed Mar 20 17:24:04 CST 2019
     */
    ChatGroup selectByPrimaryKey(String groupId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_chat_group
     *
     * @mbggenerated Wed Mar 20 17:24:04 CST 2019
     */
    int updateByExampleSelective(@Param("record") ChatGroup record, @Param("example") ChatGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_chat_group
     *
     * @mbggenerated Wed Mar 20 17:24:04 CST 2019
     */
    int updateByExample(@Param("record") ChatGroup record, @Param("example") ChatGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_chat_group
     *
     * @mbggenerated Wed Mar 20 17:24:04 CST 2019
     */
    int updateByPrimaryKeySelective(ChatGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_chat_group
     *
     * @mbggenerated Wed Mar 20 17:24:04 CST 2019
     */
    int updateByPrimaryKey(ChatGroup record);
}