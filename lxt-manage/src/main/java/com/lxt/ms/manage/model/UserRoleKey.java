package com.lxt.ms.manage.model;

public class UserRoleKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_user_role.USER_ID
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_user_role.ROLE_ID
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    private String roleId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_user_role.USER_ID
     *
     * @return the value of lxt_user_role.USER_ID
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_user_role.USER_ID
     *
     * @param userId the value for lxt_user_role.USER_ID
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_user_role.ROLE_ID
     *
     * @return the value of lxt_user_role.ROLE_ID
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_user_role.ROLE_ID
     *
     * @param roleId the value for lxt_user_role.ROLE_ID
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }
}