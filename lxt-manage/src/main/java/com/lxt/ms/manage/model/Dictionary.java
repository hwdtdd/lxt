package com.lxt.ms.manage.model;

public class Dictionary {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_dictionary.ID
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_dictionary.VALUE
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    private Integer value;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_dictionary.TEXT
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    private String text;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_dictionary.TYPE
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    private String type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_dictionary.CODE
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    private String code;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_dictionary.ID
     *
     * @return the value of lxt_dictionary.ID
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_dictionary.ID
     *
     * @param id the value for lxt_dictionary.ID
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_dictionary.VALUE
     *
     * @return the value of lxt_dictionary.VALUE
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public Integer getValue() {
        return value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_dictionary.VALUE
     *
     * @param value the value for lxt_dictionary.VALUE
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public void setValue(Integer value) {
        this.value = value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_dictionary.TEXT
     *
     * @return the value of lxt_dictionary.TEXT
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public String getText() {
        return text;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_dictionary.TEXT
     *
     * @param text the value for lxt_dictionary.TEXT
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_dictionary.TYPE
     *
     * @return the value of lxt_dictionary.TYPE
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_dictionary.TYPE
     *
     * @param type the value for lxt_dictionary.TYPE
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_dictionary.CODE
     *
     * @return the value of lxt_dictionary.CODE
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_dictionary.CODE
     *
     * @param code the value for lxt_dictionary.CODE
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }
}