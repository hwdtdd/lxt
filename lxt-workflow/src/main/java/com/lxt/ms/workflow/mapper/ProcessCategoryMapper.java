package com.lxt.ms.workflow.mapper;

import com.lxt.ms.workflow.model.ProcessCategory;
import com.lxt.ms.workflow.model.ProcessCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProcessCategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_process_category
     *
     * @mbggenerated Thu Feb 14 11:30:52 CST 2019
     */
    int countByExample(ProcessCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_process_category
     *
     * @mbggenerated Thu Feb 14 11:30:52 CST 2019
     */
    int deleteByExample(ProcessCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_process_category
     *
     * @mbggenerated Thu Feb 14 11:30:52 CST 2019
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_process_category
     *
     * @mbggenerated Thu Feb 14 11:30:52 CST 2019
     */
    int insert(ProcessCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_process_category
     *
     * @mbggenerated Thu Feb 14 11:30:52 CST 2019
     */
    int insertSelective(ProcessCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_process_category
     *
     * @mbggenerated Thu Feb 14 11:30:52 CST 2019
     */
    List<ProcessCategory> selectByExample(ProcessCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_process_category
     *
     * @mbggenerated Thu Feb 14 11:30:52 CST 2019
     */
    ProcessCategory selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_process_category
     *
     * @mbggenerated Thu Feb 14 11:30:52 CST 2019
     */
    int updateByExampleSelective(@Param("record") ProcessCategory record, @Param("example") ProcessCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_process_category
     *
     * @mbggenerated Thu Feb 14 11:30:52 CST 2019
     */
    int updateByExample(@Param("record") ProcessCategory record, @Param("example") ProcessCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_process_category
     *
     * @mbggenerated Thu Feb 14 11:30:52 CST 2019
     */
    int updateByPrimaryKeySelective(ProcessCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_process_category
     *
     * @mbggenerated Thu Feb 14 11:30:52 CST 2019
     */
    int updateByPrimaryKey(ProcessCategory record);
}