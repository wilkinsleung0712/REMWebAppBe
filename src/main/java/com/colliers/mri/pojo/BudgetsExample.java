package com.colliers.mri.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BudgetsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BudgetsExample() {
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

        public Criteria andAcctnumIsNull() {
            addCriterion("ACCTNUM is null");
            return (Criteria) this;
        }

        public Criteria andAcctnumIsNotNull() {
            addCriterion("ACCTNUM is not null");
            return (Criteria) this;
        }

        public Criteria andAcctnumEqualTo(String value) {
            addCriterion("ACCTNUM =", value, "acctnum");
            return (Criteria) this;
        }

        public Criteria andAcctnumNotEqualTo(String value) {
            addCriterion("ACCTNUM <>", value, "acctnum");
            return (Criteria) this;
        }

        public Criteria andAcctnumGreaterThan(String value) {
            addCriterion("ACCTNUM >", value, "acctnum");
            return (Criteria) this;
        }

        public Criteria andAcctnumGreaterThanOrEqualTo(String value) {
            addCriterion("ACCTNUM >=", value, "acctnum");
            return (Criteria) this;
        }

        public Criteria andAcctnumLessThan(String value) {
            addCriterion("ACCTNUM <", value, "acctnum");
            return (Criteria) this;
        }

        public Criteria andAcctnumLessThanOrEqualTo(String value) {
            addCriterion("ACCTNUM <=", value, "acctnum");
            return (Criteria) this;
        }

        public Criteria andAcctnumLike(String value) {
            addCriterion("ACCTNUM like", value, "acctnum");
            return (Criteria) this;
        }

        public Criteria andAcctnumNotLike(String value) {
            addCriterion("ACCTNUM not like", value, "acctnum");
            return (Criteria) this;
        }

        public Criteria andAcctnumIn(List<String> values) {
            addCriterion("ACCTNUM in", values, "acctnum");
            return (Criteria) this;
        }

        public Criteria andAcctnumNotIn(List<String> values) {
            addCriterion("ACCTNUM not in", values, "acctnum");
            return (Criteria) this;
        }

        public Criteria andAcctnumBetween(String value1, String value2) {
            addCriterion("ACCTNUM between", value1, value2, "acctnum");
            return (Criteria) this;
        }

        public Criteria andAcctnumNotBetween(String value1, String value2) {
            addCriterion("ACCTNUM not between", value1, value2, "acctnum");
            return (Criteria) this;
        }

        public Criteria andEntityidIsNull() {
            addCriterion("ENTITYID is null");
            return (Criteria) this;
        }

        public Criteria andEntityidIsNotNull() {
            addCriterion("ENTITYID is not null");
            return (Criteria) this;
        }

        public Criteria andEntityidEqualTo(String value) {
            addCriterion("ENTITYID =", value, "entityid");
            return (Criteria) this;
        }

        public Criteria andEntityidNotEqualTo(String value) {
            addCriterion("ENTITYID <>", value, "entityid");
            return (Criteria) this;
        }

        public Criteria andEntityidGreaterThan(String value) {
            addCriterion("ENTITYID >", value, "entityid");
            return (Criteria) this;
        }

        public Criteria andEntityidGreaterThanOrEqualTo(String value) {
            addCriterion("ENTITYID >=", value, "entityid");
            return (Criteria) this;
        }

        public Criteria andEntityidLessThan(String value) {
            addCriterion("ENTITYID <", value, "entityid");
            return (Criteria) this;
        }

        public Criteria andEntityidLessThanOrEqualTo(String value) {
            addCriterion("ENTITYID <=", value, "entityid");
            return (Criteria) this;
        }

        public Criteria andEntityidLike(String value) {
            addCriterion("ENTITYID like", value, "entityid");
            return (Criteria) this;
        }

        public Criteria andEntityidNotLike(String value) {
            addCriterion("ENTITYID not like", value, "entityid");
            return (Criteria) this;
        }

        public Criteria andEntityidIn(List<String> values) {
            addCriterion("ENTITYID in", values, "entityid");
            return (Criteria) this;
        }

        public Criteria andEntityidNotIn(List<String> values) {
            addCriterion("ENTITYID not in", values, "entityid");
            return (Criteria) this;
        }

        public Criteria andEntityidBetween(String value1, String value2) {
            addCriterion("ENTITYID between", value1, value2, "entityid");
            return (Criteria) this;
        }

        public Criteria andEntityidNotBetween(String value1, String value2) {
            addCriterion("ENTITYID not between", value1, value2, "entityid");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("DEPARTMENT is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("DEPARTMENT is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(String value) {
            addCriterion("DEPARTMENT =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(String value) {
            addCriterion("DEPARTMENT <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(String value) {
            addCriterion("DEPARTMENT >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(String value) {
            addCriterion("DEPARTMENT <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLike(String value) {
            addCriterion("DEPARTMENT like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotLike(String value) {
            addCriterion("DEPARTMENT not like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<String> values) {
            addCriterion("DEPARTMENT in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<String> values) {
            addCriterion("DEPARTMENT not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(String value1, String value2) {
            addCriterion("DEPARTMENT between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(String value1, String value2) {
            addCriterion("DEPARTMENT not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andBasisIsNull() {
            addCriterion("BASIS is null");
            return (Criteria) this;
        }

        public Criteria andBasisIsNotNull() {
            addCriterion("BASIS is not null");
            return (Criteria) this;
        }

        public Criteria andBasisEqualTo(String value) {
            addCriterion("BASIS =", value, "basis");
            return (Criteria) this;
        }

        public Criteria andBasisNotEqualTo(String value) {
            addCriterion("BASIS <>", value, "basis");
            return (Criteria) this;
        }

        public Criteria andBasisGreaterThan(String value) {
            addCriterion("BASIS >", value, "basis");
            return (Criteria) this;
        }

        public Criteria andBasisGreaterThanOrEqualTo(String value) {
            addCriterion("BASIS >=", value, "basis");
            return (Criteria) this;
        }

        public Criteria andBasisLessThan(String value) {
            addCriterion("BASIS <", value, "basis");
            return (Criteria) this;
        }

        public Criteria andBasisLessThanOrEqualTo(String value) {
            addCriterion("BASIS <=", value, "basis");
            return (Criteria) this;
        }

        public Criteria andBasisLike(String value) {
            addCriterion("BASIS like", value, "basis");
            return (Criteria) this;
        }

        public Criteria andBasisNotLike(String value) {
            addCriterion("BASIS not like", value, "basis");
            return (Criteria) this;
        }

        public Criteria andBasisIn(List<String> values) {
            addCriterion("BASIS in", values, "basis");
            return (Criteria) this;
        }

        public Criteria andBasisNotIn(List<String> values) {
            addCriterion("BASIS not in", values, "basis");
            return (Criteria) this;
        }

        public Criteria andBasisBetween(String value1, String value2) {
            addCriterion("BASIS between", value1, value2, "basis");
            return (Criteria) this;
        }

        public Criteria andBasisNotBetween(String value1, String value2) {
            addCriterion("BASIS not between", value1, value2, "basis");
            return (Criteria) this;
        }

        public Criteria andBudtypeIsNull() {
            addCriterion("BUDTYPE is null");
            return (Criteria) this;
        }

        public Criteria andBudtypeIsNotNull() {
            addCriterion("BUDTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBudtypeEqualTo(String value) {
            addCriterion("BUDTYPE =", value, "budtype");
            return (Criteria) this;
        }

        public Criteria andBudtypeNotEqualTo(String value) {
            addCriterion("BUDTYPE <>", value, "budtype");
            return (Criteria) this;
        }

        public Criteria andBudtypeGreaterThan(String value) {
            addCriterion("BUDTYPE >", value, "budtype");
            return (Criteria) this;
        }

        public Criteria andBudtypeGreaterThanOrEqualTo(String value) {
            addCriterion("BUDTYPE >=", value, "budtype");
            return (Criteria) this;
        }

        public Criteria andBudtypeLessThan(String value) {
            addCriterion("BUDTYPE <", value, "budtype");
            return (Criteria) this;
        }

        public Criteria andBudtypeLessThanOrEqualTo(String value) {
            addCriterion("BUDTYPE <=", value, "budtype");
            return (Criteria) this;
        }

        public Criteria andBudtypeLike(String value) {
            addCriterion("BUDTYPE like", value, "budtype");
            return (Criteria) this;
        }

        public Criteria andBudtypeNotLike(String value) {
            addCriterion("BUDTYPE not like", value, "budtype");
            return (Criteria) this;
        }

        public Criteria andBudtypeIn(List<String> values) {
            addCriterion("BUDTYPE in", values, "budtype");
            return (Criteria) this;
        }

        public Criteria andBudtypeNotIn(List<String> values) {
            addCriterion("BUDTYPE not in", values, "budtype");
            return (Criteria) this;
        }

        public Criteria andBudtypeBetween(String value1, String value2) {
            addCriterion("BUDTYPE between", value1, value2, "budtype");
            return (Criteria) this;
        }

        public Criteria andBudtypeNotBetween(String value1, String value2) {
            addCriterion("BUDTYPE not between", value1, value2, "budtype");
            return (Criteria) this;
        }

        public Criteria andPeriodIsNull() {
            addCriterion("PERIOD is null");
            return (Criteria) this;
        }

        public Criteria andPeriodIsNotNull() {
            addCriterion("PERIOD is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodEqualTo(String value) {
            addCriterion("PERIOD =", value, "endPeriod");
            return (Criteria) this;
        }

        public Criteria andPeriodNotEqualTo(String value) {
            addCriterion("PERIOD <>", value, "endPeriod");
            return (Criteria) this;
        }

        public Criteria andPeriodGreaterThan(String value) {
            addCriterion("PERIOD >", value, "endPeriod");
            return (Criteria) this;
        }

        public Criteria andPeriodGreaterThanOrEqualTo(String value) {
            addCriterion("PERIOD >=", value, "endPeriod");
            return (Criteria) this;
        }

        public Criteria andPeriodLessThan(String value) {
            addCriterion("PERIOD <", value, "endPeriod");
            return (Criteria) this;
        }

        public Criteria andPeriodLessThanOrEqualTo(String value) {
            addCriterion("PERIOD <=", value, "endPeriod");
            return (Criteria) this;
        }

        public Criteria andPeriodLike(String value) {
            addCriterion("PERIOD like", value, "endPeriod");
            return (Criteria) this;
        }

        public Criteria andPeriodNotLike(String value) {
            addCriterion("PERIOD not like", value, "endPeriod");
            return (Criteria) this;
        }

        public Criteria andPeriodIn(List<String> values) {
            addCriterion("PERIOD in", values, "endPeriod");
            return (Criteria) this;
        }

        public Criteria andPeriodNotIn(List<String> values) {
            addCriterion("PERIOD not in", values, "endPeriod");
            return (Criteria) this;
        }

        public Criteria andPeriodBetween(String value1, String value2) {
            addCriterion("PERIOD between", value1, value2, "endPeriod");
            return (Criteria) this;
        }

        public Criteria andPeriodNotBetween(String value1, String value2) {
            addCriterion("PERIOD not between", value1, value2, "endPeriod");
            return (Criteria) this;
        }

        public Criteria andActivityIsNull() {
            addCriterion("ACTIVITY is null");
            return (Criteria) this;
        }

        public Criteria andActivityIsNotNull() {
            addCriterion("ACTIVITY is not null");
            return (Criteria) this;
        }

        public Criteria andActivityEqualTo(BigDecimal value) {
            addCriterion("ACTIVITY =", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityNotEqualTo(BigDecimal value) {
            addCriterion("ACTIVITY <>", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityGreaterThan(BigDecimal value) {
            addCriterion("ACTIVITY >", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTIVITY >=", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityLessThan(BigDecimal value) {
            addCriterion("ACTIVITY <", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTIVITY <=", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityIn(List<BigDecimal> values) {
            addCriterion("ACTIVITY in", values, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityNotIn(List<BigDecimal> values) {
            addCriterion("ACTIVITY not in", values, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTIVITY between", value1, value2, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTIVITY not between", value1, value2, "activity");
            return (Criteria) this;
        }

        public Criteria andLastdateIsNull() {
            addCriterion("LASTDATE is null");
            return (Criteria) this;
        }

        public Criteria andLastdateIsNotNull() {
            addCriterion("LASTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andLastdateEqualTo(Date value) {
            addCriterion("LASTDATE =", value, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateNotEqualTo(Date value) {
            addCriterion("LASTDATE <>", value, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateGreaterThan(Date value) {
            addCriterion("LASTDATE >", value, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateGreaterThanOrEqualTo(Date value) {
            addCriterion("LASTDATE >=", value, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateLessThan(Date value) {
            addCriterion("LASTDATE <", value, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateLessThanOrEqualTo(Date value) {
            addCriterion("LASTDATE <=", value, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateIn(List<Date> values) {
            addCriterion("LASTDATE in", values, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateNotIn(List<Date> values) {
            addCriterion("LASTDATE not in", values, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateBetween(Date value1, Date value2) {
            addCriterion("LASTDATE between", value1, value2, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateNotBetween(Date value1, Date value2) {
            addCriterion("LASTDATE not between", value1, value2, "lastdate");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("USERID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("USERID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("USERID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("USERID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("USERID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("USERID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("USERID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("USERID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("USERID like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("USERID not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("USERID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("USERID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("USERID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("USERID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andLockedIsNull() {
            addCriterion("LOCKED is null");
            return (Criteria) this;
        }

        public Criteria andLockedIsNotNull() {
            addCriterion("LOCKED is not null");
            return (Criteria) this;
        }

        public Criteria andLockedEqualTo(String value) {
            addCriterion("LOCKED =", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedNotEqualTo(String value) {
            addCriterion("LOCKED <>", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedGreaterThan(String value) {
            addCriterion("LOCKED >", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedGreaterThanOrEqualTo(String value) {
            addCriterion("LOCKED >=", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedLessThan(String value) {
            addCriterion("LOCKED <", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedLessThanOrEqualTo(String value) {
            addCriterion("LOCKED <=", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedLike(String value) {
            addCriterion("LOCKED like", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedNotLike(String value) {
            addCriterion("LOCKED not like", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedIn(List<String> values) {
            addCriterion("LOCKED in", values, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedNotIn(List<String> values) {
            addCriterion("LOCKED not in", values, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedBetween(String value1, String value2) {
            addCriterion("LOCKED between", value1, value2, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedNotBetween(String value1, String value2) {
            addCriterion("LOCKED not between", value1, value2, "locked");
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