package com.lxt.ms.manage.mapper;

import com.lxt.ms.manage.model.Node;
import com.lxt.ms.manage.model.NodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NodeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_node
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    int countByExample(NodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_node
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    int deleteByExample(NodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_node
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    int deleteByPrimaryKey(String nodeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_node
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    int insert(Node record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_node
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    int insertSelective(Node record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_node
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    List<Node> selectByExampleWithBLOBs(NodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_node
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    List<Node> selectByExample(NodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_node
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    Node selectByPrimaryKey(String nodeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_node
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    int updateByExampleSelective(@Param("record") Node record, @Param("example") NodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_node
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") Node record, @Param("example") NodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_node
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    int updateByExample(@Param("record") Node record, @Param("example") NodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_node
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    int updateByPrimaryKeySelective(Node record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_node
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    int updateByPrimaryKeyWithBLOBs(Node record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_node
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    int updateByPrimaryKey(Node record);
}