package com.lxt.ms.manage.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ChatFriendCategoryExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lxt_chat_friend_category
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lxt_chat_friend_category
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lxt_chat_friend_category
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_chat_friend_category
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public ChatFriendCategoryExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_chat_friend_category
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_chat_friend_category
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_chat_friend_category
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_chat_friend_category
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_chat_friend_category
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_chat_friend_category
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_chat_friend_category
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_chat_friend_category
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
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
     * This method corresponds to the database table lxt_chat_friend_category
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_chat_friend_category
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table lxt_chat_friend_category
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
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

        public Criteria andFriendCategoryIdIsNull() {
            addCriterion("FRIEND_CATEGORY_ID is null");
            return (Criteria) this;
        }

        public Criteria andFriendCategoryIdIsNotNull() {
            addCriterion("FRIEND_CATEGORY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFriendCategoryIdEqualTo(String value) {
            addCriterion("FRIEND_CATEGORY_ID =", value, "friendCategoryId");
            return (Criteria) this;
        }

        public Criteria andFriendCategoryIdNotEqualTo(String value) {
            addCriterion("FRIEND_CATEGORY_ID <>", value, "friendCategoryId");
            return (Criteria) this;
        }

        public Criteria andFriendCategoryIdGreaterThan(String value) {
            addCriterion("FRIEND_CATEGORY_ID >", value, "friendCategoryId");
            return (Criteria) this;
        }

        public Criteria andFriendCategoryIdGreaterThanOrEqualTo(String value) {
            addCriterion("FRIEND_CATEGORY_ID >=", value, "friendCategoryId");
            return (Criteria) this;
        }

        public Criteria andFriendCategoryIdLessThan(String value) {
            addCriterion("FRIEND_CATEGORY_ID <", value, "friendCategoryId");
            return (Criteria) this;
        }

        public Criteria andFriendCategoryIdLessThanOrEqualTo(String value) {
            addCriterion("FRIEND_CATEGORY_ID <=", value, "friendCategoryId");
            return (Criteria) this;
        }

        public Criteria andFriendCategoryIdLike(String value) {
            addCriterion("FRIEND_CATEGORY_ID like", value, "friendCategoryId");
            return (Criteria) this;
        }

        public Criteria andFriendCategoryIdNotLike(String value) {
            addCriterion("FRIEND_CATEGORY_ID not like", value, "friendCategoryId");
            return (Criteria) this;
        }

        public Criteria andFriendCategoryIdIn(List<String> values) {
            addCriterion("FRIEND_CATEGORY_ID in", values, "friendCategoryId");
            return (Criteria) this;
        }

        public Criteria andFriendCategoryIdNotIn(List<String> values) {
            addCriterion("FRIEND_CATEGORY_ID not in", values, "friendCategoryId");
            return (Criteria) this;
        }

        public Criteria andFriendCategoryIdBetween(String value1, String value2) {
            addCriterion("FRIEND_CATEGORY_ID between", value1, value2, "friendCategoryId");
            return (Criteria) this;
        }

        public Criteria andFriendCategoryIdNotBetween(String value1, String value2) {
            addCriterion("FRIEND_CATEGORY_ID not between", value1, value2, "friendCategoryId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("USER_ID like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("USER_ID not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andSortSeqIsNull() {
            addCriterion("SORT_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andSortSeqIsNotNull() {
            addCriterion("SORT_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andSortSeqEqualTo(Integer value) {
            addCriterion("SORT_SEQ =", value, "sortSeq");
            return (Criteria) this;
        }

        public Criteria andSortSeqNotEqualTo(Integer value) {
            addCriterion("SORT_SEQ <>", value, "sortSeq");
            return (Criteria) this;
        }

        public Criteria andSortSeqGreaterThan(Integer value) {
            addCriterion("SORT_SEQ >", value, "sortSeq");
            return (Criteria) this;
        }

        public Criteria andSortSeqGreaterThanOrEqualTo(Integer value) {
            addCriterion("SORT_SEQ >=", value, "sortSeq");
            return (Criteria) this;
        }

        public Criteria andSortSeqLessThan(Integer value) {
            addCriterion("SORT_SEQ <", value, "sortSeq");
            return (Criteria) this;
        }

        public Criteria andSortSeqLessThanOrEqualTo(Integer value) {
            addCriterion("SORT_SEQ <=", value, "sortSeq");
            return (Criteria) this;
        }

        public Criteria andSortSeqIn(List<Integer> values) {
            addCriterion("SORT_SEQ in", values, "sortSeq");
            return (Criteria) this;
        }

        public Criteria andSortSeqNotIn(List<Integer> values) {
            addCriterion("SORT_SEQ not in", values, "sortSeq");
            return (Criteria) this;
        }

        public Criteria andSortSeqBetween(Integer value1, Integer value2) {
            addCriterion("SORT_SEQ between", value1, value2, "sortSeq");
            return (Criteria) this;
        }

        public Criteria andSortSeqNotBetween(Integer value1, Integer value2) {
            addCriterion("SORT_SEQ not between", value1, value2, "sortSeq");
            return (Criteria) this;
        }

        public Criteria andInsertTimeIsNull() {
            addCriterion("INSERT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andInsertTimeIsNotNull() {
            addCriterion("INSERT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andInsertTimeEqualTo(Date value) {
            addCriterion("INSERT_TIME =", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotEqualTo(Date value) {
            addCriterion("INSERT_TIME <>", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeGreaterThan(Date value) {
            addCriterion("INSERT_TIME >", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("INSERT_TIME >=", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeLessThan(Date value) {
            addCriterion("INSERT_TIME <", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeLessThanOrEqualTo(Date value) {
            addCriterion("INSERT_TIME <=", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeIn(List<Date> values) {
            addCriterion("INSERT_TIME in", values, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotIn(List<Date> values) {
            addCriterion("INSERT_TIME not in", values, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeBetween(Date value1, Date value2) {
            addCriterion("INSERT_TIME between", value1, value2, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotBetween(Date value1, Date value2) {
            addCriterion("INSERT_TIME not between", value1, value2, "insertTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table lxt_chat_friend_category
     *
     * @mbggenerated do_not_delete_during_merge Wed May 22 11:23:04 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table lxt_chat_friend_category
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
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