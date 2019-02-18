package com.lxt.ms.workflow.model;

import java.util.ArrayList;
import java.util.List;

public class NodeExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lxt_node
     *
     * @mbggenerated Thu Feb 14 11:30:52 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lxt_node
     *
     * @mbggenerated Thu Feb 14 11:30:52 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lxt_node
     *
     * @mbggenerated Thu Feb 14 11:30:52 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_node
     *
     * @mbggenerated Thu Feb 14 11:30:52 CST 2019
     */
    public NodeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_node
     *
     * @mbggenerated Thu Feb 14 11:30:52 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_node
     *
     * @mbggenerated Thu Feb 14 11:30:52 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_node
     *
     * @mbggenerated Thu Feb 14 11:30:52 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_node
     *
     * @mbggenerated Thu Feb 14 11:30:52 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_node
     *
     * @mbggenerated Thu Feb 14 11:30:52 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_node
     *
     * @mbggenerated Thu Feb 14 11:30:52 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_node
     *
     * @mbggenerated Thu Feb 14 11:30:52 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_node
     *
     * @mbggenerated Thu Feb 14 11:30:52 CST 2019
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
     * This method corresponds to the database table lxt_node
     *
     * @mbggenerated Thu Feb 14 11:30:52 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_node
     *
     * @mbggenerated Thu Feb 14 11:30:52 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table lxt_node
     *
     * @mbggenerated Thu Feb 14 11:30:52 CST 2019
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

        public Criteria andNodeIdIsNull() {
            addCriterion("NODE_ID is null");
            return (Criteria) this;
        }

        public Criteria andNodeIdIsNotNull() {
            addCriterion("NODE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNodeIdEqualTo(String value) {
            addCriterion("NODE_ID =", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdNotEqualTo(String value) {
            addCriterion("NODE_ID <>", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdGreaterThan(String value) {
            addCriterion("NODE_ID >", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdGreaterThanOrEqualTo(String value) {
            addCriterion("NODE_ID >=", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdLessThan(String value) {
            addCriterion("NODE_ID <", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdLessThanOrEqualTo(String value) {
            addCriterion("NODE_ID <=", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdLike(String value) {
            addCriterion("NODE_ID like", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdNotLike(String value) {
            addCriterion("NODE_ID not like", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdIn(List<String> values) {
            addCriterion("NODE_ID in", values, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdNotIn(List<String> values) {
            addCriterion("NODE_ID not in", values, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdBetween(String value1, String value2) {
            addCriterion("NODE_ID between", value1, value2, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdNotBetween(String value1, String value2) {
            addCriterion("NODE_ID not between", value1, value2, "nodeId");
            return (Criteria) this;
        }

        public Criteria andCellIdIsNull() {
            addCriterion("CELL_ID is null");
            return (Criteria) this;
        }

        public Criteria andCellIdIsNotNull() {
            addCriterion("CELL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCellIdEqualTo(String value) {
            addCriterion("CELL_ID =", value, "cellId");
            return (Criteria) this;
        }

        public Criteria andCellIdNotEqualTo(String value) {
            addCriterion("CELL_ID <>", value, "cellId");
            return (Criteria) this;
        }

        public Criteria andCellIdGreaterThan(String value) {
            addCriterion("CELL_ID >", value, "cellId");
            return (Criteria) this;
        }

        public Criteria andCellIdGreaterThanOrEqualTo(String value) {
            addCriterion("CELL_ID >=", value, "cellId");
            return (Criteria) this;
        }

        public Criteria andCellIdLessThan(String value) {
            addCriterion("CELL_ID <", value, "cellId");
            return (Criteria) this;
        }

        public Criteria andCellIdLessThanOrEqualTo(String value) {
            addCriterion("CELL_ID <=", value, "cellId");
            return (Criteria) this;
        }

        public Criteria andCellIdLike(String value) {
            addCriterion("CELL_ID like", value, "cellId");
            return (Criteria) this;
        }

        public Criteria andCellIdNotLike(String value) {
            addCriterion("CELL_ID not like", value, "cellId");
            return (Criteria) this;
        }

        public Criteria andCellIdIn(List<String> values) {
            addCriterion("CELL_ID in", values, "cellId");
            return (Criteria) this;
        }

        public Criteria andCellIdNotIn(List<String> values) {
            addCriterion("CELL_ID not in", values, "cellId");
            return (Criteria) this;
        }

        public Criteria andCellIdBetween(String value1, String value2) {
            addCriterion("CELL_ID between", value1, value2, "cellId");
            return (Criteria) this;
        }

        public Criteria andCellIdNotBetween(String value1, String value2) {
            addCriterion("CELL_ID not between", value1, value2, "cellId");
            return (Criteria) this;
        }

        public Criteria andProcessIdIsNull() {
            addCriterion("PROCESS_ID is null");
            return (Criteria) this;
        }

        public Criteria andProcessIdIsNotNull() {
            addCriterion("PROCESS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProcessIdEqualTo(String value) {
            addCriterion("PROCESS_ID =", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdNotEqualTo(String value) {
            addCriterion("PROCESS_ID <>", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdGreaterThan(String value) {
            addCriterion("PROCESS_ID >", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdGreaterThanOrEqualTo(String value) {
            addCriterion("PROCESS_ID >=", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdLessThan(String value) {
            addCriterion("PROCESS_ID <", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdLessThanOrEqualTo(String value) {
            addCriterion("PROCESS_ID <=", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdLike(String value) {
            addCriterion("PROCESS_ID like", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdNotLike(String value) {
            addCriterion("PROCESS_ID not like", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdIn(List<String> values) {
            addCriterion("PROCESS_ID in", values, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdNotIn(List<String> values) {
            addCriterion("PROCESS_ID not in", values, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdBetween(String value1, String value2) {
            addCriterion("PROCESS_ID between", value1, value2, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdNotBetween(String value1, String value2) {
            addCriterion("PROCESS_ID not between", value1, value2, "processId");
            return (Criteria) this;
        }

        public Criteria andLabelIsNull() {
            addCriterion("LABEL is null");
            return (Criteria) this;
        }

        public Criteria andLabelIsNotNull() {
            addCriterion("LABEL is not null");
            return (Criteria) this;
        }

        public Criteria andLabelEqualTo(String value) {
            addCriterion("LABEL =", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotEqualTo(String value) {
            addCriterion("LABEL <>", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelGreaterThan(String value) {
            addCriterion("LABEL >", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelGreaterThanOrEqualTo(String value) {
            addCriterion("LABEL >=", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelLessThan(String value) {
            addCriterion("LABEL <", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelLessThanOrEqualTo(String value) {
            addCriterion("LABEL <=", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelLike(String value) {
            addCriterion("LABEL like", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotLike(String value) {
            addCriterion("LABEL not like", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelIn(List<String> values) {
            addCriterion("LABEL in", values, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotIn(List<String> values) {
            addCriterion("LABEL not in", values, "label");
            return (Criteria) this;
        }

        public Criteria andLabelBetween(String value1, String value2) {
            addCriterion("LABEL between", value1, value2, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotBetween(String value1, String value2) {
            addCriterion("LABEL not between", value1, value2, "label");
            return (Criteria) this;
        }

        public Criteria andFormIsNull() {
            addCriterion("FORM is null");
            return (Criteria) this;
        }

        public Criteria andFormIsNotNull() {
            addCriterion("FORM is not null");
            return (Criteria) this;
        }

        public Criteria andFormEqualTo(String value) {
            addCriterion("FORM =", value, "form");
            return (Criteria) this;
        }

        public Criteria andFormNotEqualTo(String value) {
            addCriterion("FORM <>", value, "form");
            return (Criteria) this;
        }

        public Criteria andFormGreaterThan(String value) {
            addCriterion("FORM >", value, "form");
            return (Criteria) this;
        }

        public Criteria andFormGreaterThanOrEqualTo(String value) {
            addCriterion("FORM >=", value, "form");
            return (Criteria) this;
        }

        public Criteria andFormLessThan(String value) {
            addCriterion("FORM <", value, "form");
            return (Criteria) this;
        }

        public Criteria andFormLessThanOrEqualTo(String value) {
            addCriterion("FORM <=", value, "form");
            return (Criteria) this;
        }

        public Criteria andFormLike(String value) {
            addCriterion("FORM like", value, "form");
            return (Criteria) this;
        }

        public Criteria andFormNotLike(String value) {
            addCriterion("FORM not like", value, "form");
            return (Criteria) this;
        }

        public Criteria andFormIn(List<String> values) {
            addCriterion("FORM in", values, "form");
            return (Criteria) this;
        }

        public Criteria andFormNotIn(List<String> values) {
            addCriterion("FORM not in", values, "form");
            return (Criteria) this;
        }

        public Criteria andFormBetween(String value1, String value2) {
            addCriterion("FORM between", value1, value2, "form");
            return (Criteria) this;
        }

        public Criteria andFormNotBetween(String value1, String value2) {
            addCriterion("FORM not between", value1, value2, "form");
            return (Criteria) this;
        }

        public Criteria andAssignerTypeIsNull() {
            addCriterion("ASSIGNER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andAssignerTypeIsNotNull() {
            addCriterion("ASSIGNER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAssignerTypeEqualTo(Integer value) {
            addCriterion("ASSIGNER_TYPE =", value, "assignerType");
            return (Criteria) this;
        }

        public Criteria andAssignerTypeNotEqualTo(Integer value) {
            addCriterion("ASSIGNER_TYPE <>", value, "assignerType");
            return (Criteria) this;
        }

        public Criteria andAssignerTypeGreaterThan(Integer value) {
            addCriterion("ASSIGNER_TYPE >", value, "assignerType");
            return (Criteria) this;
        }

        public Criteria andAssignerTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ASSIGNER_TYPE >=", value, "assignerType");
            return (Criteria) this;
        }

        public Criteria andAssignerTypeLessThan(Integer value) {
            addCriterion("ASSIGNER_TYPE <", value, "assignerType");
            return (Criteria) this;
        }

        public Criteria andAssignerTypeLessThanOrEqualTo(Integer value) {
            addCriterion("ASSIGNER_TYPE <=", value, "assignerType");
            return (Criteria) this;
        }

        public Criteria andAssignerTypeIn(List<Integer> values) {
            addCriterion("ASSIGNER_TYPE in", values, "assignerType");
            return (Criteria) this;
        }

        public Criteria andAssignerTypeNotIn(List<Integer> values) {
            addCriterion("ASSIGNER_TYPE not in", values, "assignerType");
            return (Criteria) this;
        }

        public Criteria andAssignerTypeBetween(Integer value1, Integer value2) {
            addCriterion("ASSIGNER_TYPE between", value1, value2, "assignerType");
            return (Criteria) this;
        }

        public Criteria andAssignerTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("ASSIGNER_TYPE not between", value1, value2, "assignerType");
            return (Criteria) this;
        }

        public Criteria andAssignerValueIsNull() {
            addCriterion("ASSIGNER_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andAssignerValueIsNotNull() {
            addCriterion("ASSIGNER_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andAssignerValueEqualTo(String value) {
            addCriterion("ASSIGNER_VALUE =", value, "assignerValue");
            return (Criteria) this;
        }

        public Criteria andAssignerValueNotEqualTo(String value) {
            addCriterion("ASSIGNER_VALUE <>", value, "assignerValue");
            return (Criteria) this;
        }

        public Criteria andAssignerValueGreaterThan(String value) {
            addCriterion("ASSIGNER_VALUE >", value, "assignerValue");
            return (Criteria) this;
        }

        public Criteria andAssignerValueGreaterThanOrEqualTo(String value) {
            addCriterion("ASSIGNER_VALUE >=", value, "assignerValue");
            return (Criteria) this;
        }

        public Criteria andAssignerValueLessThan(String value) {
            addCriterion("ASSIGNER_VALUE <", value, "assignerValue");
            return (Criteria) this;
        }

        public Criteria andAssignerValueLessThanOrEqualTo(String value) {
            addCriterion("ASSIGNER_VALUE <=", value, "assignerValue");
            return (Criteria) this;
        }

        public Criteria andAssignerValueLike(String value) {
            addCriterion("ASSIGNER_VALUE like", value, "assignerValue");
            return (Criteria) this;
        }

        public Criteria andAssignerValueNotLike(String value) {
            addCriterion("ASSIGNER_VALUE not like", value, "assignerValue");
            return (Criteria) this;
        }

        public Criteria andAssignerValueIn(List<String> values) {
            addCriterion("ASSIGNER_VALUE in", values, "assignerValue");
            return (Criteria) this;
        }

        public Criteria andAssignerValueNotIn(List<String> values) {
            addCriterion("ASSIGNER_VALUE not in", values, "assignerValue");
            return (Criteria) this;
        }

        public Criteria andAssignerValueBetween(String value1, String value2) {
            addCriterion("ASSIGNER_VALUE between", value1, value2, "assignerValue");
            return (Criteria) this;
        }

        public Criteria andAssignerValueNotBetween(String value1, String value2) {
            addCriterion("ASSIGNER_VALUE not between", value1, value2, "assignerValue");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("MEMO is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("MEMO =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("MEMO <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("MEMO >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("MEMO >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("MEMO <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("MEMO <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("MEMO like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("MEMO not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("MEMO in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("MEMO not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("MEMO between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("MEMO not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andNodeTypeIsNull() {
            addCriterion("NODE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andNodeTypeIsNotNull() {
            addCriterion("NODE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andNodeTypeEqualTo(String value) {
            addCriterion("NODE_TYPE =", value, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeTypeNotEqualTo(String value) {
            addCriterion("NODE_TYPE <>", value, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeTypeGreaterThan(String value) {
            addCriterion("NODE_TYPE >", value, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("NODE_TYPE >=", value, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeTypeLessThan(String value) {
            addCriterion("NODE_TYPE <", value, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeTypeLessThanOrEqualTo(String value) {
            addCriterion("NODE_TYPE <=", value, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeTypeLike(String value) {
            addCriterion("NODE_TYPE like", value, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeTypeNotLike(String value) {
            addCriterion("NODE_TYPE not like", value, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeTypeIn(List<String> values) {
            addCriterion("NODE_TYPE in", values, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeTypeNotIn(List<String> values) {
            addCriterion("NODE_TYPE not in", values, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeTypeBetween(String value1, String value2) {
            addCriterion("NODE_TYPE between", value1, value2, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeTypeNotBetween(String value1, String value2) {
            addCriterion("NODE_TYPE not between", value1, value2, "nodeType");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table lxt_node
     *
     * @mbggenerated do_not_delete_during_merge Thu Feb 14 11:30:52 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table lxt_node
     *
     * @mbggenerated Thu Feb 14 11:30:52 CST 2019
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