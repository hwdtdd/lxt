package com.lxt.ms.manage.mapper;

import com.lxt.ms.manage.model.Process;
import com.lxt.ms.manage.model.ProcessExample;
import com.lxt.ms.manage.model.ProcessWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProcessMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_process
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    int countByExample(ProcessExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_process
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    int deleteByExample(ProcessExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_process
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    int deleteByPrimaryKey(String processId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_process
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    int insert(ProcessWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_process
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    int insertSelective(ProcessWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_process
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    List<ProcessWithBLOBs> selectByExampleWithBLOBs(ProcessExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_process
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    List<Process> selectByExample(ProcessExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_process
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    ProcessWithBLOBs selectByPrimaryKey(String processId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_process
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    int updateByExampleSelective(@Param("record") ProcessWithBLOBs record, @Param("example") ProcessExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_process
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") ProcessWithBLOBs record, @Param("example") ProcessExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_process
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    int updateByExample(@Param("record") Process record, @Param("example") ProcessExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_process
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    int updateByPrimaryKeySelective(ProcessWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_process
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    int updateByPrimaryKeyWithBLOBs(ProcessWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_process
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    int updateByPrimaryKey(Process record);
}