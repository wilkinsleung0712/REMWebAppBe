package com.colliers.mri.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GarhExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GarhExample() {
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

        public Criteria andGroupidIsNull() {
            addCriterion("GROUPID is null");
            return (Criteria) this;
        }

        public Criteria andGroupidIsNotNull() {
            addCriterion("GROUPID is not null");
            return (Criteria) this;
        }

        public Criteria andGroupidEqualTo(String value) {
            addCriterion("GROUPID =", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotEqualTo(String value) {
            addCriterion("GROUPID <>", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidGreaterThan(String value) {
            addCriterion("GROUPID >", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidGreaterThanOrEqualTo(String value) {
            addCriterion("GROUPID >=", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidLessThan(String value) {
            addCriterion("GROUPID <", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidLessThanOrEqualTo(String value) {
            addCriterion("GROUPID <=", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidLike(String value) {
            addCriterion("GROUPID like", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotLike(String value) {
            addCriterion("GROUPID not like", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidIn(List<String> values) {
            addCriterion("GROUPID in", values, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotIn(List<String> values) {
            addCriterion("GROUPID not in", values, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidBetween(String value1, String value2) {
            addCriterion("GROUPID between", value1, value2, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotBetween(String value1, String value2) {
            addCriterion("GROUPID not between", value1, value2, "groupid");
            return (Criteria) this;
        }

        public Criteria andLedgcodeIsNull() {
            addCriterion("LEDGCODE is null");
            return (Criteria) this;
        }

        public Criteria andLedgcodeIsNotNull() {
            addCriterion("LEDGCODE is not null");
            return (Criteria) this;
        }

        public Criteria andLedgcodeEqualTo(String value) {
            addCriterion("LEDGCODE =", value, "ledgcode");
            return (Criteria) this;
        }

        public Criteria andLedgcodeNotEqualTo(String value) {
            addCriterion("LEDGCODE <>", value, "ledgcode");
            return (Criteria) this;
        }

        public Criteria andLedgcodeGreaterThan(String value) {
            addCriterion("LEDGCODE >", value, "ledgcode");
            return (Criteria) this;
        }

        public Criteria andLedgcodeGreaterThanOrEqualTo(String value) {
            addCriterion("LEDGCODE >=", value, "ledgcode");
            return (Criteria) this;
        }

        public Criteria andLedgcodeLessThan(String value) {
            addCriterion("LEDGCODE <", value, "ledgcode");
            return (Criteria) this;
        }

        public Criteria andLedgcodeLessThanOrEqualTo(String value) {
            addCriterion("LEDGCODE <=", value, "ledgcode");
            return (Criteria) this;
        }

        public Criteria andLedgcodeLike(String value) {
            addCriterion("LEDGCODE like", value, "ledgcode");
            return (Criteria) this;
        }

        public Criteria andLedgcodeNotLike(String value) {
            addCriterion("LEDGCODE not like", value, "ledgcode");
            return (Criteria) this;
        }

        public Criteria andLedgcodeIn(List<String> values) {
            addCriterion("LEDGCODE in", values, "ledgcode");
            return (Criteria) this;
        }

        public Criteria andLedgcodeNotIn(List<String> values) {
            addCriterion("LEDGCODE not in", values, "ledgcode");
            return (Criteria) this;
        }

        public Criteria andLedgcodeBetween(String value1, String value2) {
            addCriterion("LEDGCODE between", value1, value2, "ledgcode");
            return (Criteria) this;
        }

        public Criteria andLedgcodeNotBetween(String value1, String value2) {
            addCriterion("LEDGCODE not between", value1, value2, "ledgcode");
            return (Criteria) this;
        }

        public Criteria andDescrptnIsNull() {
            addCriterion("DESCRPTN is null");
            return (Criteria) this;
        }

        public Criteria andDescrptnIsNotNull() {
            addCriterion("DESCRPTN is not null");
            return (Criteria) this;
        }

        public Criteria andDescrptnEqualTo(String value) {
            addCriterion("DESCRPTN =", value, "descrptn");
            return (Criteria) this;
        }

        public Criteria andDescrptnNotEqualTo(String value) {
            addCriterion("DESCRPTN <>", value, "descrptn");
            return (Criteria) this;
        }

        public Criteria andDescrptnGreaterThan(String value) {
            addCriterion("DESCRPTN >", value, "descrptn");
            return (Criteria) this;
        }

        public Criteria andDescrptnGreaterThanOrEqualTo(String value) {
            addCriterion("DESCRPTN >=", value, "descrptn");
            return (Criteria) this;
        }

        public Criteria andDescrptnLessThan(String value) {
            addCriterion("DESCRPTN <", value, "descrptn");
            return (Criteria) this;
        }

        public Criteria andDescrptnLessThanOrEqualTo(String value) {
            addCriterion("DESCRPTN <=", value, "descrptn");
            return (Criteria) this;
        }

        public Criteria andDescrptnLike(String value) {
            addCriterion("DESCRPTN like", value, "descrptn");
            return (Criteria) this;
        }

        public Criteria andDescrptnNotLike(String value) {
            addCriterion("DESCRPTN not like", value, "descrptn");
            return (Criteria) this;
        }

        public Criteria andDescrptnIn(List<String> values) {
            addCriterion("DESCRPTN in", values, "descrptn");
            return (Criteria) this;
        }

        public Criteria andDescrptnNotIn(List<String> values) {
            addCriterion("DESCRPTN not in", values, "descrptn");
            return (Criteria) this;
        }

        public Criteria andDescrptnBetween(String value1, String value2) {
            addCriterion("DESCRPTN between", value1, value2, "descrptn");
            return (Criteria) this;
        }

        public Criteria andDescrptnNotBetween(String value1, String value2) {
            addCriterion("DESCRPTN not between", value1, value2, "descrptn");
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