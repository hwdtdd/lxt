package com.lxt.ms.manage.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrganizationExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lxt_organization
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lxt_organization
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lxt_organization
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_organization
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    public OrganizationExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_organization
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_organization
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_organization
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_organization
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_organization
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_organization
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_organization
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_organization
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_organization
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_organization
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table lxt_organization
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andOrgIdIsNull() {
            addCriterion("ORG_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNotNull() {
            addCriterion("ORG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIdEqualTo(String value) {
            addCriterion("ORG_ID =", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotEqualTo(String value) {
            addCriterion("ORG_ID <>", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThan(String value) {
            addCriterion("ORG_ID >", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_ID >=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThan(String value) {
            addCriterion("ORG_ID <", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThanOrEqualTo(String value) {
            addCriterion("ORG_ID <=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLike(String value) {
            addCriterion("ORG_ID like", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotLike(String value) {
            addCriterion("ORG_ID not like", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIn(List<String> values) {
            addCriterion("ORG_ID in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotIn(List<String> values) {
            addCriterion("ORG_ID not in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdBetween(String value1, String value2) {
            addCriterion("ORG_ID between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotBetween(String value1, String value2) {
            addCriterion("ORG_ID not between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgNameIsNull() {
            addCriterion("ORG_NAME is null");
            return (Criteria) this;
        }

        public Criteria andOrgNameIsNotNull() {
            addCriterion("ORG_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andOrgNameEqualTo(String value) {
            addCriterion("ORG_NAME =", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotEqualTo(String value) {
            addCriterion("ORG_NAME <>", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThan(String value) {
            addCriterion("ORG_NAME >", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_NAME >=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThan(String value) {
            addCriterion("ORG_NAME <", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThanOrEqualTo(String value) {
            addCriterion("ORG_NAME <=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLike(String value) {
            addCriterion("ORG_NAME like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotLike(String value) {
            addCriterion("ORG_NAME not like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameIn(List<String> values) {
            addCriterion("ORG_NAME in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotIn(List<String> values) {
            addCriterion("ORG_NAME not in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameBetween(String value1, String value2) {
            addCriterion("ORG_NAME between", value1, value2, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotBetween(String value1, String value2) {
            addCriterion("ORG_NAME not between", value1, value2, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIsNull() {
            addCriterion("ORG_CODE is null");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIsNotNull() {
            addCriterion("ORG_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andOrgCodeEqualTo(String value) {
            addCriterion("ORG_CODE =", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotEqualTo(String value) {
            addCriterion("ORG_CODE <>", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeGreaterThan(String value) {
            addCriterion("ORG_CODE >", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_CODE >=", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLessThan(String value) {
            addCriterion("ORG_CODE <", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLessThanOrEqualTo(String value) {
            addCriterion("ORG_CODE <=", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLike(String value) {
            addCriterion("ORG_CODE like", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotLike(String value) {
            addCriterion("ORG_CODE not like", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIn(List<String> values) {
            addCriterion("ORG_CODE in", values, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotIn(List<String> values) {
            addCriterion("ORG_CODE not in", values, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeBetween(String value1, String value2) {
            addCriterion("ORG_CODE between", value1, value2, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotBetween(String value1, String value2) {
            addCriterion("ORG_CODE not between", value1, value2, "orgCode");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("PARENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("PARENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(String value) {
            addCriterion("PARENT_ID =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(String value) {
            addCriterion("PARENT_ID <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(String value) {
            addCriterion("PARENT_ID >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(String value) {
            addCriterion("PARENT_ID >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(String value) {
            addCriterion("PARENT_ID <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(String value) {
            addCriterion("PARENT_ID <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLike(String value) {
            addCriterion("PARENT_ID like", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotLike(String value) {
            addCriterion("PARENT_ID not like", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<String> values) {
            addCriterion("PARENT_ID in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<String> values) {
            addCriterion("PARENT_ID not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(String value1, String value2) {
            addCriterion("PARENT_ID between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(String value1, String value2) {
            addCriterion("PARENT_ID not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNull() {
            addCriterion("LAST_UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNotNull() {
            addCriterion("LAST_UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeEqualTo(Date value) {
            addCriterion("LAST_UPDATE_TIME =", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotEqualTo(Date value) {
            addCriterion("LAST_UPDATE_TIME <>", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThan(Date value) {
            addCriterion("LAST_UPDATE_TIME >", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATE_TIME >=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThan(Date value) {
            addCriterion("LAST_UPDATE_TIME <", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATE_TIME <=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIn(List<Date> values) {
            addCriterion("LAST_UPDATE_TIME in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotIn(List<Date> values) {
            addCriterion("LAST_UPDATE_TIME not in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("LAST_UPDATE_TIME between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("LAST_UPDATE_TIME not between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserIsNull() {
            addCriterion("LAST_UPDATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserIsNotNull() {
            addCriterion("LAST_UPDATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserEqualTo(String value) {
            addCriterion("LAST_UPDATE_USER =", value, "lastUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserNotEqualTo(String value) {
            addCriterion("LAST_UPDATE_USER <>", value, "lastUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserGreaterThan(String value) {
            addCriterion("LAST_UPDATE_USER >", value, "lastUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_UPDATE_USER >=", value, "lastUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserLessThan(String value) {
            addCriterion("LAST_UPDATE_USER <", value, "lastUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("LAST_UPDATE_USER <=", value, "lastUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserLike(String value) {
            addCriterion("LAST_UPDATE_USER like", value, "lastUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserNotLike(String value) {
            addCriterion("LAST_UPDATE_USER not like", value, "lastUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserIn(List<String> values) {
            addCriterion("LAST_UPDATE_USER in", values, "lastUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserNotIn(List<String> values) {
            addCriterion("LAST_UPDATE_USER not in", values, "lastUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserBetween(String value1, String value2) {
            addCriterion("LAST_UPDATE_USER between", value1, value2, "lastUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserNotBetween(String value1, String value2) {
            addCriterion("LAST_UPDATE_USER not between", value1, value2, "lastUpdateUser");
            return (Criteria) this;
        }

        public Criteria andOrgManagerIsNull() {
            addCriterion("ORG_MANAGER is null");
            return (Criteria) this;
        }

        public Criteria andOrgManagerIsNotNull() {
            addCriterion("ORG_MANAGER is not null");
            return (Criteria) this;
        }

        public Criteria andOrgManagerEqualTo(String value) {
            addCriterion("ORG_MANAGER =", value, "orgManager");
            return (Criteria) this;
        }

        public Criteria andOrgManagerNotEqualTo(String value) {
            addCriterion("ORG_MANAGER <>", value, "orgManager");
            return (Criteria) this;
        }

        public Criteria andOrgManagerGreaterThan(String value) {
            addCriterion("ORG_MANAGER >", value, "orgManager");
            return (Criteria) this;
        }

        public Criteria andOrgManagerGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_MANAGER >=", value, "orgManager");
            return (Criteria) this;
        }

        public Criteria andOrgManagerLessThan(String value) {
            addCriterion("ORG_MANAGER <", value, "orgManager");
            return (Criteria) this;
        }

        public Criteria andOrgManagerLessThanOrEqualTo(String value) {
            addCriterion("ORG_MANAGER <=", value, "orgManager");
            return (Criteria) this;
        }

        public Criteria andOrgManagerLike(String value) {
            addCriterion("ORG_MANAGER like", value, "orgManager");
            return (Criteria) this;
        }

        public Criteria andOrgManagerNotLike(String value) {
            addCriterion("ORG_MANAGER not like", value, "orgManager");
            return (Criteria) this;
        }

        public Criteria andOrgManagerIn(List<String> values) {
            addCriterion("ORG_MANAGER in", values, "orgManager");
            return (Criteria) this;
        }

        public Criteria andOrgManagerNotIn(List<String> values) {
            addCriterion("ORG_MANAGER not in", values, "orgManager");
            return (Criteria) this;
        }

        public Criteria andOrgManagerBetween(String value1, String value2) {
            addCriterion("ORG_MANAGER between", value1, value2, "orgManager");
            return (Criteria) this;
        }

        public Criteria andOrgManagerNotBetween(String value1, String value2) {
            addCriterion("ORG_MANAGER not between", value1, value2, "orgManager");
            return (Criteria) this;
        }

        public Criteria andOrgOrderIsNull() {
            addCriterion("ORG_ORDER is null");
            return (Criteria) this;
        }

        public Criteria andOrgOrderIsNotNull() {
            addCriterion("ORG_ORDER is not null");
            return (Criteria) this;
        }

        public Criteria andOrgOrderEqualTo(Integer value) {
            addCriterion("ORG_ORDER =", value, "orgOrder");
            return (Criteria) this;
        }

        public Criteria andOrgOrderNotEqualTo(Integer value) {
            addCriterion("ORG_ORDER <>", value, "orgOrder");
            return (Criteria) this;
        }

        public Criteria andOrgOrderGreaterThan(Integer value) {
            addCriterion("ORG_ORDER >", value, "orgOrder");
            return (Criteria) this;
        }

        public Criteria andOrgOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORG_ORDER >=", value, "orgOrder");
            return (Criteria) this;
        }

        public Criteria andOrgOrderLessThan(Integer value) {
            addCriterion("ORG_ORDER <", value, "orgOrder");
            return (Criteria) this;
        }

        public Criteria andOrgOrderLessThanOrEqualTo(Integer value) {
            addCriterion("ORG_ORDER <=", value, "orgOrder");
            return (Criteria) this;
        }

        public Criteria andOrgOrderIn(List<Integer> values) {
            addCriterion("ORG_ORDER in", values, "orgOrder");
            return (Criteria) this;
        }

        public Criteria andOrgOrderNotIn(List<Integer> values) {
            addCriterion("ORG_ORDER not in", values, "orgOrder");
            return (Criteria) this;
        }

        public Criteria andOrgOrderBetween(Integer value1, Integer value2) {
            addCriterion("ORG_ORDER between", value1, value2, "orgOrder");
            return (Criteria) this;
        }

        public Criteria andOrgOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("ORG_ORDER not between", value1, value2, "orgOrder");
            return (Criteria) this;
        }

        public Criteria andOrgLevelIsNull() {
            addCriterion("ORG_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andOrgLevelIsNotNull() {
            addCriterion("ORG_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andOrgLevelEqualTo(Integer value) {
            addCriterion("ORG_LEVEL =", value, "orgLevel");
            return (Criteria) this;
        }

        public Criteria andOrgLevelNotEqualTo(Integer value) {
            addCriterion("ORG_LEVEL <>", value, "orgLevel");
            return (Criteria) this;
        }

        public Criteria andOrgLevelGreaterThan(Integer value) {
            addCriterion("ORG_LEVEL >", value, "orgLevel");
            return (Criteria) this;
        }

        public Criteria andOrgLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORG_LEVEL >=", value, "orgLevel");
            return (Criteria) this;
        }

        public Criteria andOrgLevelLessThan(Integer value) {
            addCriterion("ORG_LEVEL <", value, "orgLevel");
            return (Criteria) this;
        }

        public Criteria andOrgLevelLessThanOrEqualTo(Integer value) {
            addCriterion("ORG_LEVEL <=", value, "orgLevel");
            return (Criteria) this;
        }

        public Criteria andOrgLevelIn(List<Integer> values) {
            addCriterion("ORG_LEVEL in", values, "orgLevel");
            return (Criteria) this;
        }

        public Criteria andOrgLevelNotIn(List<Integer> values) {
            addCriterion("ORG_LEVEL not in", values, "orgLevel");
            return (Criteria) this;
        }

        public Criteria andOrgLevelBetween(Integer value1, Integer value2) {
            addCriterion("ORG_LEVEL between", value1, value2, "orgLevel");
            return (Criteria) this;
        }

        public Criteria andOrgLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("ORG_LEVEL not between", value1, value2, "orgLevel");
            return (Criteria) this;
        }

        public Criteria andOrgPathIsNull() {
            addCriterion("ORG_PATH is null");
            return (Criteria) this;
        }

        public Criteria andOrgPathIsNotNull() {
            addCriterion("ORG_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andOrgPathEqualTo(String value) {
            addCriterion("ORG_PATH =", value, "orgPath");
            return (Criteria) this;
        }

        public Criteria andOrgPathNotEqualTo(String value) {
            addCriterion("ORG_PATH <>", value, "orgPath");
            return (Criteria) this;
        }

        public Criteria andOrgPathGreaterThan(String value) {
            addCriterion("ORG_PATH >", value, "orgPath");
            return (Criteria) this;
        }

        public Criteria andOrgPathGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_PATH >=", value, "orgPath");
            return (Criteria) this;
        }

        public Criteria andOrgPathLessThan(String value) {
            addCriterion("ORG_PATH <", value, "orgPath");
            return (Criteria) this;
        }

        public Criteria andOrgPathLessThanOrEqualTo(String value) {
            addCriterion("ORG_PATH <=", value, "orgPath");
            return (Criteria) this;
        }

        public Criteria andOrgPathLike(String value) {
            addCriterion("ORG_PATH like", value, "orgPath");
            return (Criteria) this;
        }

        public Criteria andOrgPathNotLike(String value) {
            addCriterion("ORG_PATH not like", value, "orgPath");
            return (Criteria) this;
        }

        public Criteria andOrgPathIn(List<String> values) {
            addCriterion("ORG_PATH in", values, "orgPath");
            return (Criteria) this;
        }

        public Criteria andOrgPathNotIn(List<String> values) {
            addCriterion("ORG_PATH not in", values, "orgPath");
            return (Criteria) this;
        }

        public Criteria andOrgPathBetween(String value1, String value2) {
            addCriterion("ORG_PATH between", value1, value2, "orgPath");
            return (Criteria) this;
        }

        public Criteria andOrgPathNotBetween(String value1, String value2) {
            addCriterion("ORG_PATH not between", value1, value2, "orgPath");
            return (Criteria) this;
        }

        public Criteria andOrgMemoIsNull() {
            addCriterion("ORG_MEMO is null");
            return (Criteria) this;
        }

        public Criteria andOrgMemoIsNotNull() {
            addCriterion("ORG_MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andOrgMemoEqualTo(String value) {
            addCriterion("ORG_MEMO =", value, "orgMemo");
            return (Criteria) this;
        }

        public Criteria andOrgMemoNotEqualTo(String value) {
            addCriterion("ORG_MEMO <>", value, "orgMemo");
            return (Criteria) this;
        }

        public Criteria andOrgMemoGreaterThan(String value) {
            addCriterion("ORG_MEMO >", value, "orgMemo");
            return (Criteria) this;
        }

        public Criteria andOrgMemoGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_MEMO >=", value, "orgMemo");
            return (Criteria) this;
        }

        public Criteria andOrgMemoLessThan(String value) {
            addCriterion("ORG_MEMO <", value, "orgMemo");
            return (Criteria) this;
        }

        public Criteria andOrgMemoLessThanOrEqualTo(String value) {
            addCriterion("ORG_MEMO <=", value, "orgMemo");
            return (Criteria) this;
        }

        public Criteria andOrgMemoLike(String value) {
            addCriterion("ORG_MEMO like", value, "orgMemo");
            return (Criteria) this;
        }

        public Criteria andOrgMemoNotLike(String value) {
            addCriterion("ORG_MEMO not like", value, "orgMemo");
            return (Criteria) this;
        }

        public Criteria andOrgMemoIn(List<String> values) {
            addCriterion("ORG_MEMO in", values, "orgMemo");
            return (Criteria) this;
        }

        public Criteria andOrgMemoNotIn(List<String> values) {
            addCriterion("ORG_MEMO not in", values, "orgMemo");
            return (Criteria) this;
        }

        public Criteria andOrgMemoBetween(String value1, String value2) {
            addCriterion("ORG_MEMO between", value1, value2, "orgMemo");
            return (Criteria) this;
        }

        public Criteria andOrgMemoNotBetween(String value1, String value2) {
            addCriterion("ORG_MEMO not between", value1, value2, "orgMemo");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table lxt_organization
     *
     * @mbggenerated do_not_delete_during_merge Wed May 22 10:56:10 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table lxt_organization
     *
     * @mbggenerated Wed May 22 10:56:10 CST 2019
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}