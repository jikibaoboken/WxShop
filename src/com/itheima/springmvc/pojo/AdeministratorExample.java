package com.itheima.springmvc.pojo;

import java.util.ArrayList;
import java.util.List;

public class AdeministratorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdeministratorExample() {
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

        public Criteria andAdminIdIsNull() {
            addCriterion("admin_id is null");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNotNull() {
            addCriterion("admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdminIdEqualTo(Integer value) {
            addCriterion("admin_id =", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotEqualTo(Integer value) {
            addCriterion("admin_id <>", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThan(Integer value) {
            addCriterion("admin_id >", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_id >=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThan(Integer value) {
            addCriterion("admin_id <", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThanOrEqualTo(Integer value) {
            addCriterion("admin_id <=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdIn(List<Integer> values) {
            addCriterion("admin_id in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotIn(List<Integer> values) {
            addCriterion("admin_id not in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdBetween(Integer value1, Integer value2) {
            addCriterion("admin_id between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_id not between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andPowerLevelIsNull() {
            addCriterion("power_level is null");
            return (Criteria) this;
        }

        public Criteria andPowerLevelIsNotNull() {
            addCriterion("power_level is not null");
            return (Criteria) this;
        }

        public Criteria andPowerLevelEqualTo(Integer value) {
            addCriterion("power_level =", value, "powerLevel");
            return (Criteria) this;
        }

        public Criteria andPowerLevelNotEqualTo(Integer value) {
            addCriterion("power_level <>", value, "powerLevel");
            return (Criteria) this;
        }

        public Criteria andPowerLevelGreaterThan(Integer value) {
            addCriterion("power_level >", value, "powerLevel");
            return (Criteria) this;
        }

        public Criteria andPowerLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("power_level >=", value, "powerLevel");
            return (Criteria) this;
        }

        public Criteria andPowerLevelLessThan(Integer value) {
            addCriterion("power_level <", value, "powerLevel");
            return (Criteria) this;
        }

        public Criteria andPowerLevelLessThanOrEqualTo(Integer value) {
            addCriterion("power_level <=", value, "powerLevel");
            return (Criteria) this;
        }

        public Criteria andPowerLevelIn(List<Integer> values) {
            addCriterion("power_level in", values, "powerLevel");
            return (Criteria) this;
        }

        public Criteria andPowerLevelNotIn(List<Integer> values) {
            addCriterion("power_level not in", values, "powerLevel");
            return (Criteria) this;
        }

        public Criteria andPowerLevelBetween(Integer value1, Integer value2) {
            addCriterion("power_level between", value1, value2, "powerLevel");
            return (Criteria) this;
        }

        public Criteria andPowerLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("power_level not between", value1, value2, "powerLevel");
            return (Criteria) this;
        }

        public Criteria andAdministratorNameIsNull() {
            addCriterion("administrator_name is null");
            return (Criteria) this;
        }

        public Criteria andAdministratorNameIsNotNull() {
            addCriterion("administrator_name is not null");
            return (Criteria) this;
        }

        public Criteria andAdministratorNameEqualTo(String value) {
            addCriterion("administrator_name =", value, "administratorName");
            return (Criteria) this;
        }

        public Criteria andAdministratorNameNotEqualTo(String value) {
            addCriterion("administrator_name <>", value, "administratorName");
            return (Criteria) this;
        }

        public Criteria andAdministratorNameGreaterThan(String value) {
            addCriterion("administrator_name >", value, "administratorName");
            return (Criteria) this;
        }

        public Criteria andAdministratorNameGreaterThanOrEqualTo(String value) {
            addCriterion("administrator_name >=", value, "administratorName");
            return (Criteria) this;
        }

        public Criteria andAdministratorNameLessThan(String value) {
            addCriterion("administrator_name <", value, "administratorName");
            return (Criteria) this;
        }

        public Criteria andAdministratorNameLessThanOrEqualTo(String value) {
            addCriterion("administrator_name <=", value, "administratorName");
            return (Criteria) this;
        }

        public Criteria andAdministratorNameLike(String value) {
            addCriterion("administrator_name like", value, "administratorName");
            return (Criteria) this;
        }

        public Criteria andAdministratorNameNotLike(String value) {
            addCriterion("administrator_name not like", value, "administratorName");
            return (Criteria) this;
        }

        public Criteria andAdministratorNameIn(List<String> values) {
            addCriterion("administrator_name in", values, "administratorName");
            return (Criteria) this;
        }

        public Criteria andAdministratorNameNotIn(List<String> values) {
            addCriterion("administrator_name not in", values, "administratorName");
            return (Criteria) this;
        }

        public Criteria andAdministratorNameBetween(String value1, String value2) {
            addCriterion("administrator_name between", value1, value2, "administratorName");
            return (Criteria) this;
        }

        public Criteria andAdministratorNameNotBetween(String value1, String value2) {
            addCriterion("administrator_name not between", value1, value2, "administratorName");
            return (Criteria) this;
        }

        public Criteria andAdministratorPwdIsNull() {
            addCriterion("administrator_pwd is null");
            return (Criteria) this;
        }

        public Criteria andAdministratorPwdIsNotNull() {
            addCriterion("administrator_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andAdministratorPwdEqualTo(String value) {
            addCriterion("administrator_pwd =", value, "administratorPwd");
            return (Criteria) this;
        }

        public Criteria andAdministratorPwdNotEqualTo(String value) {
            addCriterion("administrator_pwd <>", value, "administratorPwd");
            return (Criteria) this;
        }

        public Criteria andAdministratorPwdGreaterThan(String value) {
            addCriterion("administrator_pwd >", value, "administratorPwd");
            return (Criteria) this;
        }

        public Criteria andAdministratorPwdGreaterThanOrEqualTo(String value) {
            addCriterion("administrator_pwd >=", value, "administratorPwd");
            return (Criteria) this;
        }

        public Criteria andAdministratorPwdLessThan(String value) {
            addCriterion("administrator_pwd <", value, "administratorPwd");
            return (Criteria) this;
        }

        public Criteria andAdministratorPwdLessThanOrEqualTo(String value) {
            addCriterion("administrator_pwd <=", value, "administratorPwd");
            return (Criteria) this;
        }

        public Criteria andAdministratorPwdLike(String value) {
            addCriterion("administrator_pwd like", value, "administratorPwd");
            return (Criteria) this;
        }

        public Criteria andAdministratorPwdNotLike(String value) {
            addCriterion("administrator_pwd not like", value, "administratorPwd");
            return (Criteria) this;
        }

        public Criteria andAdministratorPwdIn(List<String> values) {
            addCriterion("administrator_pwd in", values, "administratorPwd");
            return (Criteria) this;
        }

        public Criteria andAdministratorPwdNotIn(List<String> values) {
            addCriterion("administrator_pwd not in", values, "administratorPwd");
            return (Criteria) this;
        }

        public Criteria andAdministratorPwdBetween(String value1, String value2) {
            addCriterion("administrator_pwd between", value1, value2, "administratorPwd");
            return (Criteria) this;
        }

        public Criteria andAdministratorPwdNotBetween(String value1, String value2) {
            addCriterion("administrator_pwd not between", value1, value2, "administratorPwd");
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