package com.room.backend.data._generated.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsersLoginExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table users_login
     *
     * @mbg.generated Tue Mar 21 06:11:41 CDT 2023
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table users_login
     *
     * @mbg.generated Tue Mar 21 06:11:41 CDT 2023
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table users_login
     *
     * @mbg.generated Tue Mar 21 06:11:41 CDT 2023
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_login
     *
     * @mbg.generated Tue Mar 21 06:11:41 CDT 2023
     */
    public UsersLoginExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_login
     *
     * @mbg.generated Tue Mar 21 06:11:41 CDT 2023
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_login
     *
     * @mbg.generated Tue Mar 21 06:11:41 CDT 2023
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_login
     *
     * @mbg.generated Tue Mar 21 06:11:41 CDT 2023
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_login
     *
     * @mbg.generated Tue Mar 21 06:11:41 CDT 2023
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_login
     *
     * @mbg.generated Tue Mar 21 06:11:41 CDT 2023
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_login
     *
     * @mbg.generated Tue Mar 21 06:11:41 CDT 2023
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_login
     *
     * @mbg.generated Tue Mar 21 06:11:41 CDT 2023
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_login
     *
     * @mbg.generated Tue Mar 21 06:11:41 CDT 2023
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
     * This method corresponds to the database table users_login
     *
     * @mbg.generated Tue Mar 21 06:11:41 CDT 2023
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_login
     *
     * @mbg.generated Tue Mar 21 06:11:41 CDT 2023
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table users_login
     *
     * @mbg.generated Tue Mar 21 06:11:41 CDT 2023
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPassword_encodedIsNull() {
            addCriterion("password_encoded is null");
            return (Criteria) this;
        }

        public Criteria andPassword_encodedIsNotNull() {
            addCriterion("password_encoded is not null");
            return (Criteria) this;
        }

        public Criteria andPassword_encodedEqualTo(String value) {
            addCriterion("password_encoded =", value, "password_encoded");
            return (Criteria) this;
        }

        public Criteria andPassword_encodedNotEqualTo(String value) {
            addCriterion("password_encoded <>", value, "password_encoded");
            return (Criteria) this;
        }

        public Criteria andPassword_encodedGreaterThan(String value) {
            addCriterion("password_encoded >", value, "password_encoded");
            return (Criteria) this;
        }

        public Criteria andPassword_encodedGreaterThanOrEqualTo(String value) {
            addCriterion("password_encoded >=", value, "password_encoded");
            return (Criteria) this;
        }

        public Criteria andPassword_encodedLessThan(String value) {
            addCriterion("password_encoded <", value, "password_encoded");
            return (Criteria) this;
        }

        public Criteria andPassword_encodedLessThanOrEqualTo(String value) {
            addCriterion("password_encoded <=", value, "password_encoded");
            return (Criteria) this;
        }

        public Criteria andPassword_encodedLike(String value) {
            addCriterion("password_encoded like", value, "password_encoded");
            return (Criteria) this;
        }

        public Criteria andPassword_encodedNotLike(String value) {
            addCriterion("password_encoded not like", value, "password_encoded");
            return (Criteria) this;
        }

        public Criteria andPassword_encodedIn(List<String> values) {
            addCriterion("password_encoded in", values, "password_encoded");
            return (Criteria) this;
        }

        public Criteria andPassword_encodedNotIn(List<String> values) {
            addCriterion("password_encoded not in", values, "password_encoded");
            return (Criteria) this;
        }

        public Criteria andPassword_encodedBetween(String value1, String value2) {
            addCriterion("password_encoded between", value1, value2, "password_encoded");
            return (Criteria) this;
        }

        public Criteria andPassword_encodedNotBetween(String value1, String value2) {
            addCriterion("password_encoded not between", value1, value2, "password_encoded");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeEqualTo(Date value) {
            addCriterion("create_time =", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThan(Date value) {
            addCriterion("create_time >", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThan(Date value) {
            addCriterion("create_time <", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIn(List<Date> values) {
            addCriterion("create_time in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "create_time");
            return (Criteria) this;
        }

        public Criteria andLast_modifyIsNull() {
            addCriterion("last_modify is null");
            return (Criteria) this;
        }

        public Criteria andLast_modifyIsNotNull() {
            addCriterion("last_modify is not null");
            return (Criteria) this;
        }

        public Criteria andLast_modifyEqualTo(Date value) {
            addCriterion("last_modify =", value, "last_modify");
            return (Criteria) this;
        }

        public Criteria andLast_modifyNotEqualTo(Date value) {
            addCriterion("last_modify <>", value, "last_modify");
            return (Criteria) this;
        }

        public Criteria andLast_modifyGreaterThan(Date value) {
            addCriterion("last_modify >", value, "last_modify");
            return (Criteria) this;
        }

        public Criteria andLast_modifyGreaterThanOrEqualTo(Date value) {
            addCriterion("last_modify >=", value, "last_modify");
            return (Criteria) this;
        }

        public Criteria andLast_modifyLessThan(Date value) {
            addCriterion("last_modify <", value, "last_modify");
            return (Criteria) this;
        }

        public Criteria andLast_modifyLessThanOrEqualTo(Date value) {
            addCriterion("last_modify <=", value, "last_modify");
            return (Criteria) this;
        }

        public Criteria andLast_modifyIn(List<Date> values) {
            addCriterion("last_modify in", values, "last_modify");
            return (Criteria) this;
        }

        public Criteria andLast_modifyNotIn(List<Date> values) {
            addCriterion("last_modify not in", values, "last_modify");
            return (Criteria) this;
        }

        public Criteria andLast_modifyBetween(Date value1, Date value2) {
            addCriterion("last_modify between", value1, value2, "last_modify");
            return (Criteria) this;
        }

        public Criteria andLast_modifyNotBetween(Date value1, Date value2) {
            addCriterion("last_modify not between", value1, value2, "last_modify");
            return (Criteria) this;
        }

        public Criteria andRole_idIsNull() {
            addCriterion("role_id is null");
            return (Criteria) this;
        }

        public Criteria andRole_idIsNotNull() {
            addCriterion("role_id is not null");
            return (Criteria) this;
        }

        public Criteria andRole_idEqualTo(Integer value) {
            addCriterion("role_id =", value, "role_id");
            return (Criteria) this;
        }

        public Criteria andRole_idNotEqualTo(Integer value) {
            addCriterion("role_id <>", value, "role_id");
            return (Criteria) this;
        }

        public Criteria andRole_idGreaterThan(Integer value) {
            addCriterion("role_id >", value, "role_id");
            return (Criteria) this;
        }

        public Criteria andRole_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("role_id >=", value, "role_id");
            return (Criteria) this;
        }

        public Criteria andRole_idLessThan(Integer value) {
            addCriterion("role_id <", value, "role_id");
            return (Criteria) this;
        }

        public Criteria andRole_idLessThanOrEqualTo(Integer value) {
            addCriterion("role_id <=", value, "role_id");
            return (Criteria) this;
        }

        public Criteria andRole_idIn(List<Integer> values) {
            addCriterion("role_id in", values, "role_id");
            return (Criteria) this;
        }

        public Criteria andRole_idNotIn(List<Integer> values) {
            addCriterion("role_id not in", values, "role_id");
            return (Criteria) this;
        }

        public Criteria andRole_idBetween(Integer value1, Integer value2) {
            addCriterion("role_id between", value1, value2, "role_id");
            return (Criteria) this;
        }

        public Criteria andRole_idNotBetween(Integer value1, Integer value2) {
            addCriterion("role_id not between", value1, value2, "role_id");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table users_login
     *
     * @mbg.generated do_not_delete_during_merge Tue Mar 21 06:11:41 CDT 2023
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table users_login
     *
     * @mbg.generated Tue Mar 21 06:11:41 CDT 2023
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