package com.manager.bean;

import java.util.ArrayList;
import java.util.List;


public class TMenuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TMenuExample() {
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

        public Criteria andMenuIdIsNull() {
            addCriterion("Menu.menu_id is null");
            return (Criteria) this;
        }

        public Criteria andMenuIdIsNotNull() {
            addCriterion("Menu.menu_id is not null");
            return (Criteria) this;
        }

        public Criteria andMenuIdEqualTo(String value) {
            addCriterion("Menu.menu_id =", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotEqualTo(String value) {
            addCriterion("Menu.menu_id <>", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThan(String value) {
            addCriterion("Menu.menu_id >", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThanOrEqualTo(String value) {
            addCriterion("Menu.menu_id >=", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThan(String value) {
            addCriterion("Menu.menu_id <", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThanOrEqualTo(String value) {
            addCriterion("Menu.menu_id <=", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLike(String value) {
            addCriterion("Menu.menu_id like", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotLike(String value) {
            addCriterion("Menu.menu_id not like", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdIn(List<String> values) {
            addCriterion("Menu.menu_id in", values, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotIn(List<String> values) {
            addCriterion("Menu.menu_id not in", values, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdBetween(String value1, String value2) {
            addCriterion("Menu.menu_id between", value1, value2, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotBetween(String value1, String value2) {
            addCriterion("Menu.menu_id not between", value1, value2, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuNameIsNull() {
            addCriterion("Menu.menu_name is null");
            return (Criteria) this;
        }

        public Criteria andMenuNameIsNotNull() {
            addCriterion("Menu.menu_name is not null");
            return (Criteria) this;
        }

        public Criteria andMenuNameEqualTo(String value) {
            addCriterion("Menu.menu_name =", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotEqualTo(String value) {
            addCriterion("Menu.menu_name <>", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameGreaterThan(String value) {
            addCriterion("Menu.menu_name >", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameGreaterThanOrEqualTo(String value) {
            addCriterion("Menu.menu_name >=", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLessThan(String value) {
            addCriterion("Menu.menu_name <", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLessThanOrEqualTo(String value) {
            addCriterion("Menu.menu_name <=", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLike(String value) {
            addCriterion("Menu.menu_name like", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotLike(String value) {
            addCriterion("Menu.menu_name not like", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameIn(List<String> values) {
            addCriterion("Menu.menu_name in", values, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotIn(List<String> values) {
            addCriterion("Menu.menu_name not in", values, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameBetween(String value1, String value2) {
            addCriterion("Menu.menu_name between", value1, value2, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotBetween(String value1, String value2) {
            addCriterion("Menu.menu_name not between", value1, value2, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuIdentIsNull() {
            addCriterion("Menu.menu_ident is null");
            return (Criteria) this;
        }

        public Criteria andMenuIdentIsNotNull() {
            addCriterion("Menu.menu_ident is not null");
            return (Criteria) this;
        }

        public Criteria andMenuIdentEqualTo(String value) {
            addCriterion("Menu.menu_ident =", value, "menuIdent");
            return (Criteria) this;
        }

        public Criteria andMenuIdentNotEqualTo(String value) {
            addCriterion("Menu.menu_ident <>", value, "menuIdent");
            return (Criteria) this;
        }

        public Criteria andMenuIdentGreaterThan(String value) {
            addCriterion("Menu.menu_ident >", value, "menuIdent");
            return (Criteria) this;
        }

        public Criteria andMenuIdentGreaterThanOrEqualTo(String value) {
            addCriterion("Menu.menu_ident >=", value, "menuIdent");
            return (Criteria) this;
        }

        public Criteria andMenuIdentLessThan(String value) {
            addCriterion("Menu.menu_ident <", value, "menuIdent");
            return (Criteria) this;
        }

        public Criteria andMenuIdentLessThanOrEqualTo(String value) {
            addCriterion("Menu.menu_ident <=", value, "menuIdent");
            return (Criteria) this;
        }

        public Criteria andMenuIdentLike(String value) {
            addCriterion("Menu.menu_ident like", value, "menuIdent");
            return (Criteria) this;
        }

        public Criteria andMenuIdentNotLike(String value) {
            addCriterion("Menu.menu_ident not like", value, "menuIdent");
            return (Criteria) this;
        }

        public Criteria andMenuIdentIn(List<String> values) {
            addCriterion("Menu.menu_ident in", values, "menuIdent");
            return (Criteria) this;
        }

        public Criteria andMenuIdentNotIn(List<String> values) {
            addCriterion("Menu.menu_ident not in", values, "menuIdent");
            return (Criteria) this;
        }

        public Criteria andMenuIdentBetween(String value1, String value2) {
            addCriterion("Menu.menu_ident between", value1, value2, "menuIdent");
            return (Criteria) this;
        }

        public Criteria andMenuIdentNotBetween(String value1, String value2) {
            addCriterion("Menu.menu_ident not between", value1, value2, "menuIdent");
            return (Criteria) this;
        }

        public Criteria andMenuUrlIsNull() {
            addCriterion("Menu.menu_url is null");
            return (Criteria) this;
        }

        public Criteria andMenuUrlIsNotNull() {
            addCriterion("Menu.menu_url is not null");
            return (Criteria) this;
        }

        public Criteria andMenuUrlEqualTo(String value) {
            addCriterion("Menu.menu_url =", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlNotEqualTo(String value) {
            addCriterion("Menu.menu_url <>", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlGreaterThan(String value) {
            addCriterion("Menu.menu_url >", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlGreaterThanOrEqualTo(String value) {
            addCriterion("Menu.menu_url >=", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlLessThan(String value) {
            addCriterion("Menu.menu_url <", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlLessThanOrEqualTo(String value) {
            addCriterion("Menu.menu_url <=", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlLike(String value) {
            addCriterion("Menu.menu_url like", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlNotLike(String value) {
            addCriterion("Menu.menu_url not like", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlIn(List<String> values) {
            addCriterion("Menu.menu_url in", values, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlNotIn(List<String> values) {
            addCriterion("Menu.menu_url not in", values, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlBetween(String value1, String value2) {
            addCriterion("Menu.menu_url between", value1, value2, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlNotBetween(String value1, String value2) {
            addCriterion("Menu.menu_url not between", value1, value2, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuParamIsNull() {
            addCriterion("Menu.menu_param is null");
            return (Criteria) this;
        }

        public Criteria andMenuParamIsNotNull() {
            addCriterion("Menu.menu_param is not null");
            return (Criteria) this;
        }

        public Criteria andMenuParamEqualTo(String value) {
            addCriterion("Menu.menu_param =", value, "menuParam");
            return (Criteria) this;
        }

        public Criteria andMenuParamNotEqualTo(String value) {
            addCriterion("Menu.menu_param <>", value, "menuParam");
            return (Criteria) this;
        }

        public Criteria andMenuParamGreaterThan(String value) {
            addCriterion("Menu.menu_param >", value, "menuParam");
            return (Criteria) this;
        }

        public Criteria andMenuParamGreaterThanOrEqualTo(String value) {
            addCriterion("Menu.menu_param >=", value, "menuParam");
            return (Criteria) this;
        }

        public Criteria andMenuParamLessThan(String value) {
            addCriterion("Menu.menu_param <", value, "menuParam");
            return (Criteria) this;
        }

        public Criteria andMenuParamLessThanOrEqualTo(String value) {
            addCriterion("Menu.menu_param <=", value, "menuParam");
            return (Criteria) this;
        }

        public Criteria andMenuParamLike(String value) {
            addCriterion("Menu.menu_param like", value, "menuParam");
            return (Criteria) this;
        }

        public Criteria andMenuParamNotLike(String value) {
            addCriterion("Menu.menu_param not like", value, "menuParam");
            return (Criteria) this;
        }

        public Criteria andMenuParamIn(List<String> values) {
            addCriterion("Menu.menu_param in", values, "menuParam");
            return (Criteria) this;
        }

        public Criteria andMenuParamNotIn(List<String> values) {
            addCriterion("Menu.menu_param not in", values, "menuParam");
            return (Criteria) this;
        }

        public Criteria andMenuParamBetween(String value1, String value2) {
            addCriterion("Menu.menu_param between", value1, value2, "menuParam");
            return (Criteria) this;
        }

        public Criteria andMenuParamNotBetween(String value1, String value2) {
            addCriterion("Menu.menu_param not between", value1, value2, "menuParam");
            return (Criteria) this;
        }

        public Criteria andMenuPidIsNull() {
            addCriterion("Menu.menu_pid is null");
            return (Criteria) this;
        }

        public Criteria andMenuPidIsNotNull() {
            addCriterion("Menu.menu_pid is not null");
            return (Criteria) this;
        }

        public Criteria andMenuPidEqualTo(String value) {
            addCriterion("Menu.menu_pid =", value, "menuPid");
            return (Criteria) this;
        }

        public Criteria andMenuPidNotEqualTo(String value) {
            addCriterion("Menu.menu_pid <>", value, "menuPid");
            return (Criteria) this;
        }

        public Criteria andMenuPidGreaterThan(String value) {
            addCriterion("Menu.menu_pid >", value, "menuPid");
            return (Criteria) this;
        }

        public Criteria andMenuPidGreaterThanOrEqualTo(String value) {
            addCriterion("Menu.menu_pid >=", value, "menuPid");
            return (Criteria) this;
        }

        public Criteria andMenuPidLessThan(String value) {
            addCriterion("Menu.menu_pid <", value, "menuPid");
            return (Criteria) this;
        }

        public Criteria andMenuPidLessThanOrEqualTo(String value) {
            addCriterion("Menu.menu_pid <=", value, "menuPid");
            return (Criteria) this;
        }

        public Criteria andMenuPidLike(String value) {
            addCriterion("Menu.menu_pid like", value, "menuPid");
            return (Criteria) this;
        }

        public Criteria andMenuPidNotLike(String value) {
            addCriterion("Menu.menu_pid not like", value, "menuPid");
            return (Criteria) this;
        }

        public Criteria andMenuPidIn(List<String> values) {
            addCriterion("Menu.menu_pid in", values, "menuPid");
            return (Criteria) this;
        }

        public Criteria andMenuPidNotIn(List<String> values) {
            addCriterion("Menu.menu_pid not in", values, "menuPid");
            return (Criteria) this;
        }

        public Criteria andMenuPidBetween(String value1, String value2) {
            addCriterion("Menu.menu_pid between", value1, value2, "menuPid");
            return (Criteria) this;
        }

        public Criteria andMenuPidNotBetween(String value1, String value2) {
            addCriterion("Menu.menu_pid not between", value1, value2, "menuPid");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIdIsNull() {
            addCriterion("Menu.menu_type_id is null");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIdIsNotNull() {
            addCriterion("Menu.menu_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIdEqualTo(String value) {
            addCriterion("Menu.menu_type_id =", value, "menuTypeId");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIdNotEqualTo(String value) {
            addCriterion("Menu.menu_type_id <>", value, "menuTypeId");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIdGreaterThan(String value) {
            addCriterion("Menu.menu_type_id >", value, "menuTypeId");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("Menu.menu_type_id >=", value, "menuTypeId");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIdLessThan(String value) {
            addCriterion("Menu.menu_type_id <", value, "menuTypeId");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIdLessThanOrEqualTo(String value) {
            addCriterion("Menu.menu_type_id <=", value, "menuTypeId");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIdLike(String value) {
            addCriterion("Menu.menu_type_id like", value, "menuTypeId");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIdNotLike(String value) {
            addCriterion("Menu.menu_type_id not like", value, "menuTypeId");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIdIn(List<String> values) {
            addCriterion("Menu.menu_type_id in", values, "menuTypeId");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIdNotIn(List<String> values) {
            addCriterion("Menu.menu_type_id not in", values, "menuTypeId");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIdBetween(String value1, String value2) {
            addCriterion("Menu.menu_type_id between", value1, value2, "menuTypeId");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIdNotBetween(String value1, String value2) {
            addCriterion("Menu.menu_type_id not between", value1, value2, "menuTypeId");
            return (Criteria) this;
        }

        public Criteria andModelIdIsNull() {
            addCriterion("Menu.model_id is null");
            return (Criteria) this;
        }

        public Criteria andModelIdIsNotNull() {
            addCriterion("Menu.model_id is not null");
            return (Criteria) this;
        }

        public Criteria andModelIdEqualTo(String value) {
            addCriterion("Menu.model_id =", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotEqualTo(String value) {
            addCriterion("Menu.model_id <>", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdGreaterThan(String value) {
            addCriterion("Menu.model_id >", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdGreaterThanOrEqualTo(String value) {
            addCriterion("Menu.model_id >=", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLessThan(String value) {
            addCriterion("Menu.model_id <", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLessThanOrEqualTo(String value) {
            addCriterion("Menu.model_id <=", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLike(String value) {
            addCriterion("Menu.model_id like", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotLike(String value) {
            addCriterion("Menu.model_id not like", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdIn(List<String> values) {
            addCriterion("Menu.model_id in", values, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotIn(List<String> values) {
            addCriterion("Menu.model_id not in", values, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdBetween(String value1, String value2) {
            addCriterion("Menu.model_id between", value1, value2, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotBetween(String value1, String value2) {
            addCriterion("Menu.model_id not between", value1, value2, "modelId");
            return (Criteria) this;
        }

        public Criteria andManagerIdIsNull() {
            addCriterion("Menu.manager_id is null");
            return (Criteria) this;
        }

        public Criteria andManagerIdIsNotNull() {
            addCriterion("Menu.manager_id is not null");
            return (Criteria) this;
        }

        public Criteria andManagerIdEqualTo(String value) {
            addCriterion("Menu.manager_id =", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotEqualTo(String value) {
            addCriterion("Menu.manager_id <>", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdGreaterThan(String value) {
            addCriterion("Menu.manager_id >", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdGreaterThanOrEqualTo(String value) {
            addCriterion("Menu.manager_id >=", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdLessThan(String value) {
            addCriterion("Menu.manager_id <", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdLessThanOrEqualTo(String value) {
            addCriterion("Menu.manager_id <=", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdLike(String value) {
            addCriterion("Menu.manager_id like", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotLike(String value) {
            addCriterion("Menu.manager_id not like", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdIn(List<String> values) {
            addCriterion("Menu.manager_id in", values, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotIn(List<String> values) {
            addCriterion("Menu.manager_id not in", values, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdBetween(String value1, String value2) {
            addCriterion("Menu.manager_id between", value1, value2, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotBetween(String value1, String value2) {
            addCriterion("Menu.manager_id not between", value1, value2, "managerId");
            return (Criteria) this;
        }

        public Criteria andMenuStatusIsNull() {
            addCriterion("Menu.menu_status is null");
            return (Criteria) this;
        }

        public Criteria andMenuStatusIsNotNull() {
            addCriterion("Menu.menu_status is not null");
            return (Criteria) this;
        }

        public Criteria andMenuStatusEqualTo(Integer value) {
            addCriterion("Menu.menu_status =", value, "menuStatus");
            return (Criteria) this;
        }

        public Criteria andMenuStatusNotEqualTo(Integer value) {
            addCriterion("Menu.menu_status <>", value, "menuStatus");
            return (Criteria) this;
        }

        public Criteria andMenuStatusGreaterThan(Integer value) {
            addCriterion("Menu.menu_status >", value, "menuStatus");
            return (Criteria) this;
        }

        public Criteria andMenuStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("Menu.menu_status >=", value, "menuStatus");
            return (Criteria) this;
        }

        public Criteria andMenuStatusLessThan(Integer value) {
            addCriterion("Menu.menu_status <", value, "menuStatus");
            return (Criteria) this;
        }

        public Criteria andMenuStatusLessThanOrEqualTo(Integer value) {
            addCriterion("Menu.menu_status <=", value, "menuStatus");
            return (Criteria) this;
        }

        public Criteria andMenuStatusIn(List<Integer> values) {
            addCriterion("Menu.menu_status in", values, "menuStatus");
            return (Criteria) this;
        }

        public Criteria andMenuStatusNotIn(List<Integer> values) {
            addCriterion("Menu.menu_status not in", values, "menuStatus");
            return (Criteria) this;
        }

        public Criteria andMenuStatusBetween(Integer value1, Integer value2) {
            addCriterion("Menu.menu_status between", value1, value2, "menuStatus");
            return (Criteria) this;
        }

        public Criteria andMenuStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("Menu.menu_status not between", value1, value2, "menuStatus");
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