package com.doerit.dao;

import com.doerit.model.ActionTemplateValue;
import com.doerit.model.ActionTemplateValueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActionTemplateValueMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_action_template_value
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    int countByExample(ActionTemplateValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_action_template_value
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    int deleteByExample(ActionTemplateValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_action_template_value
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_action_template_value
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    int insert(ActionTemplateValue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_action_template_value
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    int insertSelective(ActionTemplateValue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_action_template_value
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    List<ActionTemplateValue> selectByExample(ActionTemplateValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_action_template_value
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    ActionTemplateValue selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_action_template_value
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    int updateByExampleSelective(@Param("record") ActionTemplateValue record, @Param("example") ActionTemplateValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_action_template_value
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    int updateByExample(@Param("record") ActionTemplateValue record, @Param("example") ActionTemplateValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_action_template_value
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    int updateByPrimaryKeySelective(ActionTemplateValue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_action_template_value
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    int updateByPrimaryKey(ActionTemplateValue record);
}