package com.colliers.mri.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BudnoteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BudnoteExample() {
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

        public Criteria andEndpdIsNull() {
            addCriterion("ENDPD is null");
            return (Criteria) this;
        }

        public Criteria andEndpdIsNotNull() {
            addCriterion("ENDPD is not null");
            return (Criteria) this;
        }

        public Criteria andEndpdEqualTo(String value) {
            addCriterion("ENDPD =", value, "endpd");
            return (Criteria) this;
        }

        public Criteria andEndpdNotEqualTo(String value) {
            addCriterion("ENDPD <>", value, "endpd");
            return (Criteria) this;
        }

        public Criteria andEndpdGreaterThan(String value) {
            addCriterion("ENDPD >", value, "endpd");
            return (Criteria) this;
        }

        public Criteria andEndpdGreaterThanOrEqualTo(String value) {
            addCriterion("ENDPD >=", value, "endpd");
            return (Criteria) this;
        }

        public Criteria andEndpdLessThan(String value) {
            addCriterion("ENDPD <", value, "endpd");
            return (Criteria) this;
        }

        public Criteria andEndpdLessThanOrEqualTo(String value) {
            addCriterion("ENDPD <=", value, "endpd");
            return (Criteria) this;
        }

        public Criteria andEndpdLike(String value) {
            addCriterion("ENDPD like", value, "endpd");
            return (Criteria) this;
        }

        public Criteria andEndpdNotLike(String value) {
            addCriterion("ENDPD not like", value, "endpd");
            return (Criteria) this;
        }

        public Criteria andEndpdIn(List<String> values) {
            addCriterion("ENDPD in", values, "endpd");
            return (Criteria) this;
        }

        public Criteria andEndpdNotIn(List<String> values) {
            addCriterion("ENDPD not in", values, "endpd");
            return (Criteria) this;
        }

        public Criteria andEndpdBetween(String value1, String value2) {
            addCriterion("ENDPD between", value1, value2, "endpd");
            return (Criteria) this;
        }

        public Criteria andEndpdNotBetween(String value1, String value2) {
            addCriterion("ENDPD not between", value1, value2, "endpd");
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

        public Criteria andNotetypeIsNull() {
            addCriterion("NOTETYPE is null");
            return (Criteria) this;
        }

        public Criteria andNotetypeIsNotNull() {
            addCriterion("NOTETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andNotetypeEqualTo(String value) {
            addCriterion("NOTETYPE =", value, "notetype");
            return (Criteria) this;
        }

        public Criteria andNotetypeNotEqualTo(String value) {
            addCriterion("NOTETYPE <>", value, "notetype");
            return (Criteria) this;
        }

        public Criteria andNotetypeGreaterThan(String value) {
            addCriterion("NOTETYPE >", value, "notetype");
            return (Criteria) this;
        }

        public Criteria andNotetypeGreaterThanOrEqualTo(String value) {
            addCriterion("NOTETYPE >=", value, "notetype");
            return (Criteria) this;
        }

        public Criteria andNotetypeLessThan(String value) {
            addCriterion("NOTETYPE <", value, "notetype");
            return (Criteria) this;
        }

        public Criteria andNotetypeLessThanOrEqualTo(String value) {
            addCriterion("NOTETYPE <=", value, "notetype");
            return (Criteria) this;
        }

        public Criteria andNotetypeLike(String value) {
            addCriterion("NOTETYPE like", value, "notetype");
            return (Criteria) this;
        }

        public Criteria andNotetypeNotLike(String value) {
            addCriterion("NOTETYPE not like", value, "notetype");
            return (Criteria) this;
        }

        public Criteria andNotetypeIn(List<String> values) {
            addCriterion("NOTETYPE in", values, "notetype");
            return (Criteria) this;
        }

        public Criteria andNotetypeNotIn(List<String> values) {
            addCriterion("NOTETYPE not in", values, "notetype");
            return (Criteria) this;
        }

        public Criteria andNotetypeBetween(String value1, String value2) {
            addCriterion("NOTETYPE between", value1, value2, "notetype");
            return (Criteria) this;
        }

        public Criteria andNotetypeNotBetween(String value1, String value2) {
            addCriterion("NOTETYPE not between", value1, value2, "notetype");
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

        public Criteria andBegpdIsNull() {
            addCriterion("BEGPD is null");
            return (Criteria) this;
        }

        public Criteria andBegpdIsNotNull() {
            addCriterion("BEGPD is not null");
            return (Criteria) this;
        }

        public Criteria andBegpdEqualTo(String value) {
            addCriterion("BEGPD =", value, "begpd");
            return (Criteria) this;
        }

        public Criteria andBegpdNotEqualTo(String value) {
            addCriterion("BEGPD <>", value, "begpd");
            return (Criteria) this;
        }

        public Criteria andBegpdGreaterThan(String value) {
            addCriterion("BEGPD >", value, "begpd");
            return (Criteria) this;
        }

        public Criteria andBegpdGreaterThanOrEqualTo(String value) {
            addCriterion("BEGPD >=", value, "begpd");
            return (Criteria) this;
        }

        public Criteria andBegpdLessThan(String value) {
            addCriterion("BEGPD <", value, "begpd");
            return (Criteria) this;
        }

        public Criteria andBegpdLessThanOrEqualTo(String value) {
            addCriterion("BEGPD <=", value, "begpd");
            return (Criteria) this;
        }

        public Criteria andBegpdLike(String value) {
            addCriterion("BEGPD like", value, "begpd");
            return (Criteria) this;
        }

        public Criteria andBegpdNotLike(String value) {
            addCriterion("BEGPD not like", value, "begpd");
            return (Criteria) this;
        }

        public Criteria andBegpdIn(List<String> values) {
            addCriterion("BEGPD in", values, "begpd");
            return (Criteria) this;
        }

        public Criteria andBegpdNotIn(List<String> values) {
            addCriterion("BEGPD not in", values, "begpd");
            return (Criteria) this;
        }

        public Criteria andBegpdBetween(String value1, String value2) {
            addCriterion("BEGPD between", value1, value2, "begpd");
            return (Criteria) this;
        }

        public Criteria andBegpdNotBetween(String value1, String value2) {
            addCriterion("BEGPD not between", value1, value2, "begpd");
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

        public Criteria andRecuseridIsNull() {
            addCriterion("RECUSERID is null");
            return (Criteria) this;
        }

        public Criteria andRecuseridIsNotNull() {
            addCriterion("RECUSERID is not null");
            return (Criteria) this;
        }

        public Criteria andRecuseridEqualTo(String value) {
            addCriterion("RECUSERID =", value, "recuserid");
            return (Criteria) this;
        }

        public Criteria andRecuseridNotEqualTo(String value) {
            addCriterion("RECUSERID <>", value, "recuserid");
            return (Criteria) this;
        }

        public Criteria andRecuseridGreaterThan(String value) {
            addCriterion("RECUSERID >", value, "recuserid");
            return (Criteria) this;
        }

        public Criteria andRecuseridGreaterThanOrEqualTo(String value) {
            addCriterion("RECUSERID >=", value, "recuserid");
            return (Criteria) this;
        }

        public Criteria andRecuseridLessThan(String value) {
            addCriterion("RECUSERID <", value, "recuserid");
            return (Criteria) this;
        }

        public Criteria andRecuseridLessThanOrEqualTo(String value) {
            addCriterion("RECUSERID <=", value, "recuserid");
            return (Criteria) this;
        }

        public Criteria andRecuseridLike(String value) {
            addCriterion("RECUSERID like", value, "recuserid");
            return (Criteria) this;
        }

        public Criteria andRecuseridNotLike(String value) {
            addCriterion("RECUSERID not like", value, "recuserid");
            return (Criteria) this;
        }

        public Criteria andRecuseridIn(List<String> values) {
            addCriterion("RECUSERID in", values, "recuserid");
            return (Criteria) this;
        }

        public Criteria andRecuseridNotIn(List<String> values) {
            addCriterion("RECUSERID not in", values, "recuserid");
            return (Criteria) this;
        }

        public Criteria andRecuseridBetween(String value1, String value2) {
            addCriterion("RECUSERID between", value1, value2, "recuserid");
            return (Criteria) this;
        }

        public Criteria andRecuseridNotBetween(String value1, String value2) {
            addCriterion("RECUSERID not between", value1, value2, "recuserid");
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