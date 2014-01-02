package com.manager.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TOrgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TOrgExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andOrgIdIsNull() {
            addCriterion("Org.org_id is null");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNotNull() {
            addCriterion("Org.org_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIdEqualTo(String value) {
            addCriterion("Org.org_id =", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotEqualTo(String value) {
            addCriterion("Org.org_id <>", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThan(String value) {
            addCriterion("Org.org_id >", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThanOrEqualTo(String value) {
            addCriterion("Org.org_id >=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThan(String value) {
            addCriterion("Org.org_id <", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThanOrEqualTo(String value) {
            addCriterion("Org.org_id <=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLike(String value) {
            addCriterion("Org.org_id like", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotLike(String value) {
            addCriterion("Org.org_id not like", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIn(List<String> values) {
            addCriterion("Org.org_id in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotIn(List<String> values) {
            addCriterion("Org.org_id not in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdBetween(String value1, String value2) {
            addCriterion("Org.org_id between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotBetween(String value1, String value2) {
            addCriterion("Org.org_id not between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andManagerIdIsNull() {
            addCriterion("Org.manager_id is null");
            return (Criteria) this;
        }

        public Criteria andManagerIdIsNotNull() {
            addCriterion("Org.manager_id is not null");
            return (Criteria) this;
        }

        public Criteria andManagerIdEqualTo(String value) {
            addCriterion("Org.manager_id =", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotEqualTo(String value) {
            addCriterion("Org.manager_id <>", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdGreaterThan(String value) {
            addCriterion("Org.manager_id >", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdGreaterThanOrEqualTo(String value) {
            addCriterion("Org.manager_id >=", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdLessThan(String value) {
            addCriterion("Org.manager_id <", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdLessThanOrEqualTo(String value) {
            addCriterion("Org.manager_id <=", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdLike(String value) {
            addCriterion("Org.manager_id like", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotLike(String value) {
            addCriterion("Org.manager_id not like", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdIn(List<String> values) {
            addCriterion("Org.manager_id in", values, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotIn(List<String> values) {
            addCriterion("Org.manager_id not in", values, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdBetween(String value1, String value2) {
            addCriterion("Org.manager_id between", value1, value2, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotBetween(String value1, String value2) {
            addCriterion("Org.manager_id not between", value1, value2, "managerId");
            return (Criteria) this;
        }

        public Criteria andOrgPidIsNull() {
            addCriterion("Org.org_pid is null");
            return (Criteria) this;
        }

        public Criteria andOrgPidIsNotNull() {
            addCriterion("Org.org_pid is not null");
            return (Criteria) this;
        }

        public Criteria andOrgPidEqualTo(String value) {
            addCriterion("Org.org_pid =", value, "orgPid");
            return (Criteria) this;
        }

        public Criteria andOrgPidNotEqualTo(String value) {
            addCriterion("Org.org_pid <>", value, "orgPid");
            return (Criteria) this;
        }

        public Criteria andOrgPidGreaterThan(String value) {
            addCriterion("Org.org_pid >", value, "orgPid");
            return (Criteria) this;
        }

        public Criteria andOrgPidGreaterThanOrEqualTo(String value) {
            addCriterion("Org.org_pid >=", value, "orgPid");
            return (Criteria) this;
        }

        public Criteria andOrgPidLessThan(String value) {
            addCriterion("Org.org_pid <", value, "orgPid");
            return (Criteria) this;
        }

        public Criteria andOrgPidLessThanOrEqualTo(String value) {
            addCriterion("Org.org_pid <=", value, "orgPid");
            return (Criteria) this;
        }

        public Criteria andOrgPidLike(String value) {
            addCriterion("Org.org_pid like", value, "orgPid");
            return (Criteria) this;
        }

        public Criteria andOrgPidNotLike(String value) {
            addCriterion("Org.org_pid not like", value, "orgPid");
            return (Criteria) this;
        }

        public Criteria andOrgPidIn(List<String> values) {
            addCriterion("Org.org_pid in", values, "orgPid");
            return (Criteria) this;
        }

        public Criteria andOrgPidNotIn(List<String> values) {
            addCriterion("Org.org_pid not in", values, "orgPid");
            return (Criteria) this;
        }

        public Criteria andOrgPidBetween(String value1, String value2) {
            addCriterion("Org.org_pid between", value1, value2, "orgPid");
            return (Criteria) this;
        }

        public Criteria andOrgPidNotBetween(String value1, String value2) {
            addCriterion("Org.org_pid not between", value1, value2, "orgPid");
            return (Criteria) this;
        }

        public Criteria andOrgNameIsNull() {
            addCriterion("Org.org_name is null");
            return (Criteria) this;
        }

        public Criteria andOrgNameIsNotNull() {
            addCriterion("Org.org_name is not null");
            return (Criteria) this;
        }

        public Criteria andOrgNameEqualTo(String value) {
            addCriterion("Org.org_name =", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotEqualTo(String value) {
            addCriterion("Org.org_name <>", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThan(String value) {
            addCriterion("Org.org_name >", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThanOrEqualTo(String value) {
            addCriterion("Org.org_name >=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThan(String value) {
            addCriterion("Org.org_name <", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThanOrEqualTo(String value) {
            addCriterion("Org.org_name <=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLike(String value) {
            addCriterion("Org.org_name like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotLike(String value) {
            addCriterion("Org.org_name not like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameIn(List<String> values) {
            addCriterion("Org.org_name in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotIn(List<String> values) {
            addCriterion("Org.org_name not in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameBetween(String value1, String value2) {
            addCriterion("Org.org_name between", value1, value2, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotBetween(String value1, String value2) {
            addCriterion("Org.org_name not between", value1, value2, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgIdentIsNull() {
            addCriterion("Org.org_ident is null");
            return (Criteria) this;
        }

        public Criteria andOrgIdentIsNotNull() {
            addCriterion("Org.org_ident is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIdentEqualTo(String value) {
            addCriterion("Org.org_ident =", value, "orgIdent");
            return (Criteria) this;
        }

        public Criteria andOrgIdentNotEqualTo(String value) {
            addCriterion("Org.org_ident <>", value, "orgIdent");
            return (Criteria) this;
        }

        public Criteria andOrgIdentGreaterThan(String value) {
            addCriterion("Org.org_ident >", value, "orgIdent");
            return (Criteria) this;
        }

        public Criteria andOrgIdentGreaterThanOrEqualTo(String value) {
            addCriterion("Org.org_ident >=", value, "orgIdent");
            return (Criteria) this;
        }

        public Criteria andOrgIdentLessThan(String value) {
            addCriterion("Org.org_ident <", value, "orgIdent");
            return (Criteria) this;
        }

        public Criteria andOrgIdentLessThanOrEqualTo(String value) {
            addCriterion("Org.org_ident <=", value, "orgIdent");
            return (Criteria) this;
        }

        public Criteria andOrgIdentLike(String value) {
            addCriterion("Org.org_ident like", value, "orgIdent");
            return (Criteria) this;
        }

        public Criteria andOrgIdentNotLike(String value) {
            addCriterion("Org.org_ident not like", value, "orgIdent");
            return (Criteria) this;
        }

        public Criteria andOrgIdentIn(List<String> values) {
            addCriterion("Org.org_ident in", values, "orgIdent");
            return (Criteria) this;
        }

        public Criteria andOrgIdentNotIn(List<String> values) {
            addCriterion("Org.org_ident not in", values, "orgIdent");
            return (Criteria) this;
        }

        public Criteria andOrgIdentBetween(String value1, String value2) {
            addCriterion("Org.org_ident between", value1, value2, "orgIdent");
            return (Criteria) this;
        }

        public Criteria andOrgIdentNotBetween(String value1, String value2) {
            addCriterion("Org.org_ident not between", value1, value2, "orgIdent");
            return (Criteria) this;
        }

        public Criteria andOrgDescIsNull() {
            addCriterion("Org.org_desc is null");
            return (Criteria) this;
        }

        public Criteria andOrgDescIsNotNull() {
            addCriterion("Org.org_desc is not null");
            return (Criteria) this;
        }

        public Criteria andOrgDescEqualTo(String value) {
            addCriterion("Org.org_desc =", value, "orgDesc");
            return (Criteria) this;
        }

        public Criteria andOrgDescNotEqualTo(String value) {
            addCriterion("Org.org_desc <>", value, "orgDesc");
            return (Criteria) this;
        }

        public Criteria andOrgDescGreaterThan(String value) {
            addCriterion("Org.org_desc >", value, "orgDesc");
            return (Criteria) this;
        }

        public Criteria andOrgDescGreaterThanOrEqualTo(String value) {
            addCriterion("Org.org_desc >=", value, "orgDesc");
            return (Criteria) this;
        }

        public Criteria andOrgDescLessThan(String value) {
            addCriterion("Org.org_desc <", value, "orgDesc");
            return (Criteria) this;
        }

        public Criteria andOrgDescLessThanOrEqualTo(String value) {
            addCriterion("Org.org_desc <=", value, "orgDesc");
            return (Criteria) this;
        }

        public Criteria andOrgDescLike(String value) {
            addCriterion("Org.org_desc like", value, "orgDesc");
            return (Criteria) this;
        }

        public Criteria andOrgDescNotLike(String value) {
            addCriterion("Org.org_desc not like", value, "orgDesc");
            return (Criteria) this;
        }

        public Criteria andOrgDescIn(List<String> values) {
            addCriterion("Org.org_desc in", values, "orgDesc");
            return (Criteria) this;
        }

        public Criteria andOrgDescNotIn(List<String> values) {
            addCriterion("Org.org_desc not in", values, "orgDesc");
            return (Criteria) this;
        }

        public Criteria andOrgDescBetween(String value1, String value2) {
            addCriterion("Org.org_desc between", value1, value2, "orgDesc");
            return (Criteria) this;
        }

        public Criteria andOrgDescNotBetween(String value1, String value2) {
            addCriterion("Org.org_desc not between", value1, value2, "orgDesc");
            return (Criteria) this;
        }

        public Criteria andOrgModelbyIsNull() {
            addCriterion("Org.org_modelby is null");
            return (Criteria) this;
        }

        public Criteria andOrgModelbyIsNotNull() {
            addCriterion("Org.org_modelby is not null");
            return (Criteria) this;
        }

        public Criteria andOrgModelbyEqualTo(String value) {
            addCriterion("Org.org_modelby =", value, "orgModelby");
            return (Criteria) this;
        }

        public Criteria andOrgModelbyNotEqualTo(String value) {
            addCriterion("Org.org_modelby <>", value, "orgModelby");
            return (Criteria) this;
        }

        public Criteria andOrgModelbyGreaterThan(String value) {
            addCriterion("Org.org_modelby >", value, "orgModelby");
            return (Criteria) this;
        }

        public Criteria andOrgModelbyGreaterThanOrEqualTo(String value) {
            addCriterion("Org.org_modelby >=", value, "orgModelby");
            return (Criteria) this;
        }

        public Criteria andOrgModelbyLessThan(String value) {
            addCriterion("Org.org_modelby <", value, "orgModelby");
            return (Criteria) this;
        }

        public Criteria andOrgModelbyLessThanOrEqualTo(String value) {
            addCriterion("Org.org_modelby <=", value, "orgModelby");
            return (Criteria) this;
        }

        public Criteria andOrgModelbyLike(String value) {
            addCriterion("Org.org_modelby like", value, "orgModelby");
            return (Criteria) this;
        }

        public Criteria andOrgModelbyNotLike(String value) {
            addCriterion("Org.org_modelby not like", value, "orgModelby");
            return (Criteria) this;
        }

        public Criteria andOrgModelbyIn(List<String> values) {
            addCriterion("Org.org_modelby in", values, "orgModelby");
            return (Criteria) this;
        }

        public Criteria andOrgModelbyNotIn(List<String> values) {
            addCriterion("Org.org_modelby not in", values, "orgModelby");
            return (Criteria) this;
        }

        public Criteria andOrgModelbyBetween(String value1, String value2) {
            addCriterion("Org.org_modelby between", value1, value2, "orgModelby");
            return (Criteria) this;
        }

        public Criteria andOrgModelbyNotBetween(String value1, String value2) {
            addCriterion("Org.org_modelby not between", value1, value2, "orgModelby");
            return (Criteria) this;
        }

        public Criteria andOrgCreateIsNull() {
            addCriterion("Org.org_create is null");
            return (Criteria) this;
        }

        public Criteria andOrgCreateIsNotNull() {
            addCriterion("Org.org_create is not null");
            return (Criteria) this;
        }

        public Criteria andOrgCreateEqualTo(Date value) {
            addCriterionForJDBCDate("Org.org_create =", value, "orgCreate");
            return (Criteria) this;
        }

        public Criteria andOrgCreateNotEqualTo(Date value) {
            addCriterionForJDBCDate("Org.org_create <>", value, "orgCreate");
            return (Criteria) this;
        }

        public Criteria andOrgCreateGreaterThan(Date value) {
            addCriterionForJDBCDate("Org.org_create >", value, "orgCreate");
            return (Criteria) this;
        }

        public Criteria andOrgCreateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Org.org_create >=", value, "orgCreate");
            return (Criteria) this;
        }

        public Criteria andOrgCreateLessThan(Date value) {
            addCriterionForJDBCDate("Org.org_create <", value, "orgCreate");
            return (Criteria) this;
        }

        public Criteria andOrgCreateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Org.org_create <=", value, "orgCreate");
            return (Criteria) this;
        }

        public Criteria andOrgCreateIn(List<Date> values) {
            addCriterionForJDBCDate("Org.org_create in", values, "orgCreate");
            return (Criteria) this;
        }

        public Criteria andOrgCreateNotIn(List<Date> values) {
            addCriterionForJDBCDate("Org.org_create not in", values, "orgCreate");
            return (Criteria) this;
        }

        public Criteria andOrgCreateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Org.org_create between", value1, value2, "orgCreate");
            return (Criteria) this;
        }

        public Criteria andOrgCreateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Org.org_create not between", value1, value2, "orgCreate");
            return (Criteria) this;
        }

        public Criteria andOrgStatusIsNull() {
            addCriterion("Org.org_status is null");
            return (Criteria) this;
        }

        public Criteria andOrgStatusIsNotNull() {
            addCriterion("Org.org_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrgStatusEqualTo(Integer value) {
            addCriterion("Org.org_status =", value, "orgStatus");
            return (Criteria) this;
        }

        public Criteria andOrgStatusNotEqualTo(Integer value) {
            addCriterion("Org.org_status <>", value, "orgStatus");
            return (Criteria) this;
        }

        public Criteria andOrgStatusGreaterThan(Integer value) {
            addCriterion("Org.org_status >", value, "orgStatus");
            return (Criteria) this;
        }

        public Criteria andOrgStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("Org.org_status >=", value, "orgStatus");
            return (Criteria) this;
        }

        public Criteria andOrgStatusLessThan(Integer value) {
            addCriterion("Org.org_status <", value, "orgStatus");
            return (Criteria) this;
        }

        public Criteria andOrgStatusLessThanOrEqualTo(Integer value) {
            addCriterion("Org.org_status <=", value, "orgStatus");
            return (Criteria) this;
        }

        public Criteria andOrgStatusIn(List<Integer> values) {
            addCriterion("Org.org_status in", values, "orgStatus");
            return (Criteria) this;
        }

        public Criteria andOrgStatusNotIn(List<Integer> values) {
            addCriterion("Org.org_status not in", values, "orgStatus");
            return (Criteria) this;
        }

        public Criteria andOrgStatusBetween(Integer value1, Integer value2) {
            addCriterion("Org.org_status between", value1, value2, "orgStatus");
            return (Criteria) this;
        }

        public Criteria andOrgStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("Org.org_status not between", value1, value2, "orgStatus");
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