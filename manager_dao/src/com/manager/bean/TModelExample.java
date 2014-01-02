package com.manager.bean;

import java.util.ArrayList;
import java.util.List;

public class TModelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TModelExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andModelIdIsNull() {
            addCriterion("Model.model_id is null");
            return (Criteria) this;
        }

        public Criteria andModelIdIsNotNull() {
            addCriterion("Model.model_id is not null");
            return (Criteria) this;
        }

        public Criteria andModelIdEqualTo(String value) {
            addCriterion("Model.model_id =", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotEqualTo(String value) {
            addCriterion("Model.model_id <>", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdGreaterThan(String value) {
            addCriterion("Model.model_id >", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdGreaterThanOrEqualTo(String value) {
            addCriterion("Model.model_id >=", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLessThan(String value) {
            addCriterion("Model.model_id <", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLessThanOrEqualTo(String value) {
            addCriterion("Model.model_id <=", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLike(String value) {
            addCriterion("Model.model_id like", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotLike(String value) {
            addCriterion("Model.model_id not like", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdIn(List<String> values) {
            addCriterion("Model.model_id in", values, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotIn(List<String> values) {
            addCriterion("Model.model_id not in", values, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdBetween(String value1, String value2) {
            addCriterion("Model.model_id between", value1, value2, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotBetween(String value1, String value2) {
            addCriterion("Model.model_id not between", value1, value2, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelNameIsNull() {
            addCriterion("Model.model_name is null");
            return (Criteria) this;
        }

        public Criteria andModelNameIsNotNull() {
            addCriterion("Model.model_name is not null");
            return (Criteria) this;
        }

        public Criteria andModelNameEqualTo(String value) {
            addCriterion("Model.model_name =", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameNotEqualTo(String value) {
            addCriterion("Model.model_name <>", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameGreaterThan(String value) {
            addCriterion("Model.model_name >", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameGreaterThanOrEqualTo(String value) {
            addCriterion("Model.model_name >=", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameLessThan(String value) {
            addCriterion("Model.model_name <", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameLessThanOrEqualTo(String value) {
            addCriterion("Model.model_name <=", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameLike(String value) {
            addCriterion("Model.model_name like", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameNotLike(String value) {
            addCriterion("Model.model_name not like", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameIn(List<String> values) {
            addCriterion("Model.model_name in", values, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameNotIn(List<String> values) {
            addCriterion("Model.model_name not in", values, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameBetween(String value1, String value2) {
            addCriterion("Model.model_name between", value1, value2, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameNotBetween(String value1, String value2) {
            addCriterion("Model.model_name not between", value1, value2, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelIdentIsNull() {
            addCriterion("Model.model_ident is null");
            return (Criteria) this;
        }

        public Criteria andModelIdentIsNotNull() {
            addCriterion("Model.model_ident is not null");
            return (Criteria) this;
        }

        public Criteria andModelIdentEqualTo(String value) {
            addCriterion("Model.model_ident =", value, "modelIdent");
            return (Criteria) this;
        }

        public Criteria andModelIdentNotEqualTo(String value) {
            addCriterion("Model.model_ident <>", value, "modelIdent");
            return (Criteria) this;
        }

        public Criteria andModelIdentGreaterThan(String value) {
            addCriterion("Model.model_ident >", value, "modelIdent");
            return (Criteria) this;
        }

        public Criteria andModelIdentGreaterThanOrEqualTo(String value) {
            addCriterion("Model.model_ident >=", value, "modelIdent");
            return (Criteria) this;
        }

        public Criteria andModelIdentLessThan(String value) {
            addCriterion("Model.model_ident <", value, "modelIdent");
            return (Criteria) this;
        }

        public Criteria andModelIdentLessThanOrEqualTo(String value) {
            addCriterion("Model.model_ident <=", value, "modelIdent");
            return (Criteria) this;
        }

        public Criteria andModelIdentLike(String value) {
            addCriterion("Model.model_ident like", value, "modelIdent");
            return (Criteria) this;
        }

        public Criteria andModelIdentNotLike(String value) {
            addCriterion("Model.model_ident not like", value, "modelIdent");
            return (Criteria) this;
        }

        public Criteria andModelIdentIn(List<String> values) {
            addCriterion("Model.model_ident in", values, "modelIdent");
            return (Criteria) this;
        }

        public Criteria andModelIdentNotIn(List<String> values) {
            addCriterion("Model.model_ident not in", values, "modelIdent");
            return (Criteria) this;
        }

        public Criteria andModelIdentBetween(String value1, String value2) {
            addCriterion("Model.model_ident between", value1, value2, "modelIdent");
            return (Criteria) this;
        }

        public Criteria andModelIdentNotBetween(String value1, String value2) {
            addCriterion("Model.model_ident not between", value1, value2, "modelIdent");
            return (Criteria) this;
        }

        public Criteria andModelStatusIsNull() {
            addCriterion("Model.model_status is null");
            return (Criteria) this;
        }

        public Criteria andModelStatusIsNotNull() {
            addCriterion("Model.model_status is not null");
            return (Criteria) this;
        }

        public Criteria andModelStatusEqualTo(Integer value) {
            addCriterion("Model.model_status =", value, "modelStatus");
            return (Criteria) this;
        }

        public Criteria andModelStatusNotEqualTo(Integer value) {
            addCriterion("Model.model_status <>", value, "modelStatus");
            return (Criteria) this;
        }

        public Criteria andModelStatusGreaterThan(Integer value) {
            addCriterion("Model.model_status >", value, "modelStatus");
            return (Criteria) this;
        }

        public Criteria andModelStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("Model.model_status >=", value, "modelStatus");
            return (Criteria) this;
        }

        public Criteria andModelStatusLessThan(Integer value) {
            addCriterion("Model.model_status <", value, "modelStatus");
            return (Criteria) this;
        }

        public Criteria andModelStatusLessThanOrEqualTo(Integer value) {
            addCriterion("Model.model_status <=", value, "modelStatus");
            return (Criteria) this;
        }

        public Criteria andModelStatusIn(List<Integer> values) {
            addCriterion("Model.model_status in", values, "modelStatus");
            return (Criteria) this;
        }

        public Criteria andModelStatusNotIn(List<Integer> values) {
            addCriterion("Model.model_status not in", values, "modelStatus");
            return (Criteria) this;
        }

        public Criteria andModelStatusBetween(Integer value1, Integer value2) {
            addCriterion("Model.model_status between", value1, value2, "modelStatus");
            return (Criteria) this;
        }

        public Criteria andModelStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("Model.model_status not between", value1, value2, "modelStatus");
            return (Criteria) this;
        }

        public Criteria andManagerIdIsNull() {
            addCriterion("Model.manager_id is null");
            return (Criteria) this;
        }

        public Criteria andManagerIdIsNotNull() {
            addCriterion("Model.manager_id is not null");
            return (Criteria) this;
        }

        public Criteria andManagerIdEqualTo(String value) {
            addCriterion("Model.manager_id =", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotEqualTo(String value) {
            addCriterion("Model.manager_id <>", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdGreaterThan(String value) {
            addCriterion("Model.manager_id >", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdGreaterThanOrEqualTo(String value) {
            addCriterion("Model.manager_id >=", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdLessThan(String value) {
            addCriterion("Model.manager_id <", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdLessThanOrEqualTo(String value) {
            addCriterion("Model.manager_id <=", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdLike(String value) {
            addCriterion("Model.manager_id like", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotLike(String value) {
            addCriterion("Model.manager_id not like", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdIn(List<String> values) {
            addCriterion("Model.manager_id in", values, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotIn(List<String> values) {
            addCriterion("Model.manager_id not in", values, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdBetween(String value1, String value2) {
            addCriterion("Model.manager_id between", value1, value2, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotBetween(String value1, String value2) {
            addCriterion("Model.manager_id not between", value1, value2, "managerId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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