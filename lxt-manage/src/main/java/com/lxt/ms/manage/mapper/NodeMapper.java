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
     * @mbggenerated Tue Aug 07 15:10:59 CST 2018
     */
    int countByExample(NodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_node
     *
     * @mbggenerated Tue Aug 07 15:10:59 CST 2018
     */
    int deleteByExample(NodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_node
     *
     * @mbggenerated Tue Aug 07 15:10:59 CST 2018
     */
    int deleteByPrimaryKey(String nodeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_node
     *
     * @mbggenerated Tue Aug 07 15:10:59 CST 2018
     */
    int insert(Node record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_node
     *
     * @mbggenerated Tue Aug 07 15:10:59 CST 2018
     */
    int insertSelective(Node record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_node
     *
     * @mbggenerated Tue Aug 07 15:10:59 CST 2018
     */
    List<Node> selectByExampleWithBLOBs(NodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_node
     *
     * @mbggenerated Tue Aug 07 15:10:59 CST 2018
     */
    List<Node> selectByExample(NodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_node
     *
     * @mbggenerated Tue Aug 07 15:10:59 CST 2018
     */
    Node selectByPrimaryKey(String nodeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_node
     *
     * @mbggenerated Tue Aug 07 15:10:59 CST 2018
     */
    int updateByExampleSelective(@Param("record") Node record, @Param("example") NodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_node
     *
     * @mbggenerated Tue Aug 07 15:10:59 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") Node record, @Param("example") NodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_node
     *
     * @mbggenerated Tue Aug 07 15:10:59 CST 2018
     */
    int updateByExample(@Param("record") Node record, @Param("example") NodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_node
     *
     * @mbggenerated Tue Aug 07 15:10:59 CST 2018
     */
    int updateByPrimaryKeySelective(Node record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_node
     *
     * @mbggenerated Tue Aug 07 15:10:59 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(Node record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_node
     *
     * @mbggenerated Tue Aug 07 15:10:59 CST 2018
     */
    int updateByPrimaryKey(Node record);
}