package com.colliers.mri.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PohdExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PohdExample() {
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

        public Criteria andPonumIsNull() {
            addCriterion("PONUM is null");
            return (Criteria) this;
        }

        public Criteria andPonumIsNotNull() {
            addCriterion("PONUM is not null");
            return (Criteria) this;
        }

        public Criteria andPonumEqualTo(String value) {
            addCriterion("PONUM =", value, "ponum");
            return (Criteria) this;
        }

        public Criteria andPonumNotEqualTo(String value) {
            addCriterion("PONUM <>", value, "ponum");
            return (Criteria) this;
        }

        public Criteria andPonumGreaterThan(String value) {
            addCriterion("PONUM >", value, "ponum");
            return (Criteria) this;
        }

        public Criteria andPonumGreaterThanOrEqualTo(String value) {
            addCriterion("PONUM >=", value, "ponum");
            return (Criteria) this;
        }

        public Criteria andPonumLessThan(String value) {
            addCriterion("PONUM <", value, "ponum");
            return (Criteria) this;
        }

        public Criteria andPonumLessThanOrEqualTo(String value) {
            addCriterion("PONUM <=", value, "ponum");
            return (Criteria) this;
        }

        public Criteria andPonumLike(String value) {
            addCriterion("PONUM like", value, "ponum");
            return (Criteria) this;
        }

        public Criteria andPonumNotLike(String value) {
            addCriterion("PONUM not like", value, "ponum");
            return (Criteria) this;
        }

        public Criteria andPonumIn(List<String> values) {
            addCriterion("PONUM in", values, "ponum");
            return (Criteria) this;
        }

        public Criteria andPonumNotIn(List<String> values) {
            addCriterion("PONUM not in", values, "ponum");
            return (Criteria) this;
        }

        public Criteria andPonumBetween(String value1, String value2) {
            addCriterion("PONUM between", value1, value2, "ponum");
            return (Criteria) this;
        }

        public Criteria andPonumNotBetween(String value1, String value2) {
            addCriterion("PONUM not between", value1, value2, "ponum");
            return (Criteria) this;
        }

        public Criteria andPoprefxIsNull() {
            addCriterion("POPREFX is null");
            return (Criteria) this;
        }

        public Criteria andPoprefxIsNotNull() {
            addCriterion("POPREFX is not null");
            return (Criteria) this;
        }

        public Criteria andPoprefxEqualTo(String value) {
            addCriterion("POPREFX =", value, "poprefx");
            return (Criteria) this;
        }

        public Criteria andPoprefxNotEqualTo(String value) {
            addCriterion("POPREFX <>", value, "poprefx");
            return (Criteria) this;
        }

        public Criteria andPoprefxGreaterThan(String value) {
            addCriterion("POPREFX >", value, "poprefx");
            return (Criteria) this;
        }

        public Criteria andPoprefxGreaterThanOrEqualTo(String value) {
            addCriterion("POPREFX >=", value, "poprefx");
            return (Criteria) this;
        }

        public Criteria andPoprefxLessThan(String value) {
            addCriterion("POPREFX <", value, "poprefx");
            return (Criteria) this;
        }

        public Criteria andPoprefxLessThanOrEqualTo(String value) {
            addCriterion("POPREFX <=", value, "poprefx");
            return (Criteria) this;
        }

        public Criteria andPoprefxLike(String value) {
            addCriterion("POPREFX like", value, "poprefx");
            return (Criteria) this;
        }

        public Criteria andPoprefxNotLike(String value) {
            addCriterion("POPREFX not like", value, "poprefx");
            return (Criteria) this;
        }

        public Criteria andPoprefxIn(List<String> values) {
            addCriterion("POPREFX in", values, "poprefx");
            return (Criteria) this;
        }

        public Criteria andPoprefxNotIn(List<String> values) {
            addCriterion("POPREFX not in", values, "poprefx");
            return (Criteria) this;
        }

        public Criteria andPoprefxBetween(String value1, String value2) {
            addCriterion("POPREFX between", value1, value2, "poprefx");
            return (Criteria) this;
        }

        public Criteria andPoprefxNotBetween(String value1, String value2) {
            addCriterion("POPREFX not between", value1, value2, "poprefx");
            return (Criteria) this;
        }

        public Criteria andVendidIsNull() {
            addCriterion("VENDID is null");
            return (Criteria) this;
        }

        public Criteria andVendidIsNotNull() {
            addCriterion("VENDID is not null");
            return (Criteria) this;
        }

        public Criteria andVendidEqualTo(String value) {
            addCriterion("VENDID =", value, "vendid");
            return (Criteria) this;
        }

        public Criteria andVendidNotEqualTo(String value) {
            addCriterion("VENDID <>", value, "vendid");
            return (Criteria) this;
        }

        public Criteria andVendidGreaterThan(String value) {
            addCriterion("VENDID >", value, "vendid");
            return (Criteria) this;
        }

        public Criteria andVendidGreaterThanOrEqualTo(String value) {
            addCriterion("VENDID >=", value, "vendid");
            return (Criteria) this;
        }

        public Criteria andVendidLessThan(String value) {
            addCriterion("VENDID <", value, "vendid");
            return (Criteria) this;
        }

        public Criteria andVendidLessThanOrEqualTo(String value) {
            addCriterion("VENDID <=", value, "vendid");
            return (Criteria) this;
        }

        public Criteria andVendidLike(String value) {
            addCriterion("VENDID like", value, "vendid");
            return (Criteria) this;
        }

        public Criteria andVendidNotLike(String value) {
            addCriterion("VENDID not like", value, "vendid");
            return (Criteria) this;
        }

        public Criteria andVendidIn(List<String> values) {
            addCriterion("VENDID in", values, "vendid");
            return (Criteria) this;
        }

        public Criteria andVendidNotIn(List<String> values) {
            addCriterion("VENDID not in", values, "vendid");
            return (Criteria) this;
        }

        public Criteria andVendidBetween(String value1, String value2) {
            addCriterion("VENDID between", value1, value2, "vendid");
            return (Criteria) this;
        }

        public Criteria andVendidNotBetween(String value1, String value2) {
            addCriterion("VENDID not between", value1, value2, "vendid");
            return (Criteria) this;
        }

        public Criteria andVendsubIsNull() {
            addCriterion("VENDSUB is null");
            return (Criteria) this;
        }

        public Criteria andVendsubIsNotNull() {
            addCriterion("VENDSUB is not null");
            return (Criteria) this;
        }

        public Criteria andVendsubEqualTo(String value) {
            addCriterion("VENDSUB =", value, "vendsub");
            return (Criteria) this;
        }

        public Criteria andVendsubNotEqualTo(String value) {
            addCriterion("VENDSUB <>", value, "vendsub");
            return (Criteria) this;
        }

        public Criteria andVendsubGreaterThan(String value) {
            addCriterion("VENDSUB >", value, "vendsub");
            return (Criteria) this;
        }

        public Criteria andVendsubGreaterThanOrEqualTo(String value) {
            addCriterion("VENDSUB >=", value, "vendsub");
            return (Criteria) this;
        }

        public Criteria andVendsubLessThan(String value) {
            addCriterion("VENDSUB <", value, "vendsub");
            return (Criteria) this;
        }

        public Criteria andVendsubLessThanOrEqualTo(String value) {
            addCriterion("VENDSUB <=", value, "vendsub");
            return (Criteria) this;
        }

        public Criteria andVendsubLike(String value) {
            addCriterion("VENDSUB like", value, "vendsub");
            return (Criteria) this;
        }

        public Criteria andVendsubNotLike(String value) {
            addCriterion("VENDSUB not like", value, "vendsub");
            return (Criteria) this;
        }

        public Criteria andVendsubIn(List<String> values) {
            addCriterion("VENDSUB in", values, "vendsub");
            return (Criteria) this;
        }

        public Criteria andVendsubNotIn(List<String> values) {
            addCriterion("VENDSUB not in", values, "vendsub");
            return (Criteria) this;
        }

        public Criteria andVendsubBetween(String value1, String value2) {
            addCriterion("VENDSUB between", value1, value2, "vendsub");
            return (Criteria) this;
        }

        public Criteria andVendsubNotBetween(String value1, String value2) {
            addCriterion("VENDSUB not between", value1, value2, "vendsub");
            return (Criteria) this;
        }

        public Criteria andEnteredIsNull() {
            addCriterion("ENTERED is null");
            return (Criteria) this;
        }

        public Criteria andEnteredIsNotNull() {
            addCriterion("ENTERED is not null");
            return (Criteria) this;
        }

        public Criteria andEnteredEqualTo(Date value) {
            addCriterion("ENTERED =", value, "entered");
            return (Criteria) this;
        }

        public Criteria andEnteredNotEqualTo(Date value) {
            addCriterion("ENTERED <>", value, "entered");
            return (Criteria) this;
        }

        public Criteria andEnteredGreaterThan(Date value) {
            addCriterion("ENTERED >", value, "entered");
            return (Criteria) this;
        }

        public Criteria andEnteredGreaterThanOrEqualTo(Date value) {
            addCriterion("ENTERED >=", value, "entered");
            return (Criteria) this;
        }

        public Criteria andEnteredLessThan(Date value) {
            addCriterion("ENTERED <", value, "entered");
            return (Criteria) this;
        }

        public Criteria andEnteredLessThanOrEqualTo(Date value) {
            addCriterion("ENTERED <=", value, "entered");
            return (Criteria) this;
        }

        public Criteria andEnteredIn(List<Date> values) {
            addCriterion("ENTERED in", values, "entered");
            return (Criteria) this;
        }

        public Criteria andEnteredNotIn(List<Date> values) {
            addCriterion("ENTERED not in", values, "entered");
            return (Criteria) this;
        }

        public Criteria andEnteredBetween(Date value1, Date value2) {
            addCriterion("ENTERED between", value1, value2, "entered");
            return (Criteria) this;
        }

        public Criteria andEnteredNotBetween(Date value1, Date value2) {
            addCriterion("ENTERED not between", value1, value2, "entered");
            return (Criteria) this;
        }

        public Criteria andPodescIsNull() {
            addCriterion("PODESC is null");
            return (Criteria) this;
        }

        public Criteria andPodescIsNotNull() {
            addCriterion("PODESC is not null");
            return (Criteria) this;
        }

        public Criteria andPodescEqualTo(String value) {
            addCriterion("PODESC =", value, "podesc");
            return (Criteria) this;
        }

        public Criteria andPodescNotEqualTo(String value) {
            addCriterion("PODESC <>", value, "podesc");
            return (Criteria) this;
        }

        public Criteria andPodescGreaterThan(String value) {
            addCriterion("PODESC >", value, "podesc");
            return (Criteria) this;
        }

        public Criteria andPodescGreaterThanOrEqualTo(String value) {
            addCriterion("PODESC >=", value, "podesc");
            return (Criteria) this;
        }

        public Criteria andPodescLessThan(String value) {
            addCriterion("PODESC <", value, "podesc");
            return (Criteria) this;
        }

        public Criteria andPodescLessThanOrEqualTo(String value) {
            addCriterion("PODESC <=", value, "podesc");
            return (Criteria) this;
        }

        public Criteria andPodescLike(String value) {
            addCriterion("PODESC like", value, "podesc");
            return (Criteria) this;
        }

        public Criteria andPodescNotLike(String value) {
            addCriterion("PODESC not like", value, "podesc");
            return (Criteria) this;
        }

        public Criteria andPodescIn(List<String> values) {
            addCriterion("PODESC in", values, "podesc");
            return (Criteria) this;
        }

        public Criteria andPodescNotIn(List<String> values) {
            addCriterion("PODESC not in", values, "podesc");
            return (Criteria) this;
        }

        public Criteria andPodescBetween(String value1, String value2) {
            addCriterion("PODESC between", value1, value2, "podesc");
            return (Criteria) this;
        }

        public Criteria andPodescNotBetween(String value1, String value2) {
            addCriterion("PODESC not between", value1, value2, "podesc");
            return (Criteria) this;
        }

        public Criteria andReqbyIsNull() {
            addCriterion("REQBY is null");
            return (Criteria) this;
        }

        public Criteria andReqbyIsNotNull() {
            addCriterion("REQBY is not null");
            return (Criteria) this;
        }

        public Criteria andReqbyEqualTo(String value) {
            addCriterion("REQBY =", value, "reqby");
            return (Criteria) this;
        }

        public Criteria andReqbyNotEqualTo(String value) {
            addCriterion("REQBY <>", value, "reqby");
            return (Criteria) this;
        }

        public Criteria andReqbyGreaterThan(String value) {
            addCriterion("REQBY >", value, "reqby");
            return (Criteria) this;
        }

        public Criteria andReqbyGreaterThanOrEqualTo(String value) {
            addCriterion("REQBY >=", value, "reqby");
            return (Criteria) this;
        }

        public Criteria andReqbyLessThan(String value) {
            addCriterion("REQBY <", value, "reqby");
            return (Criteria) this;
        }

        public Criteria andReqbyLessThanOrEqualTo(String value) {
            addCriterion("REQBY <=", value, "reqby");
            return (Criteria) this;
        }

        public Criteria andReqbyLike(String value) {
            addCriterion("REQBY like", value, "reqby");
            return (Criteria) this;
        }

        public Criteria andReqbyNotLike(String value) {
            addCriterion("REQBY not like", value, "reqby");
            return (Criteria) this;
        }

        public Criteria andReqbyIn(List<String> values) {
            addCriterion("REQBY in", values, "reqby");
            return (Criteria) this;
        }

        public Criteria andReqbyNotIn(List<String> values) {
            addCriterion("REQBY not in", values, "reqby");
            return (Criteria) this;
        }

        public Criteria andReqbyBetween(String value1, String value2) {
            addCriterion("REQBY between", value1, value2, "reqby");
            return (Criteria) this;
        }

        public Criteria andReqbyNotBetween(String value1, String value2) {
            addCriterion("REQBY not between", value1, value2, "reqby");
            return (Criteria) this;
        }

        public Criteria andTermsIsNull() {
            addCriterion("TERMS is null");
            return (Criteria) this;
        }

        public Criteria andTermsIsNotNull() {
            addCriterion("TERMS is not null");
            return (Criteria) this;
        }

        public Criteria andTermsEqualTo(String value) {
            addCriterion("TERMS =", value, "terms");
            return (Criteria) this;
        }

        public Criteria andTermsNotEqualTo(String value) {
            addCriterion("TERMS <>", value, "terms");
            return (Criteria) this;
        }

        public Criteria andTermsGreaterThan(String value) {
            addCriterion("TERMS >", value, "terms");
            return (Criteria) this;
        }

        public Criteria andTermsGreaterThanOrEqualTo(String value) {
            addCriterion("TERMS >=", value, "terms");
            return (Criteria) this;
        }

        public Criteria andTermsLessThan(String value) {
            addCriterion("TERMS <", value, "terms");
            return (Criteria) this;
        }

        public Criteria andTermsLessThanOrEqualTo(String value) {
            addCriterion("TERMS <=", value, "terms");
            return (Criteria) this;
        }

        public Criteria andTermsLike(String value) {
            addCriterion("TERMS like", value, "terms");
            return (Criteria) this;
        }

        public Criteria andTermsNotLike(String value) {
            addCriterion("TERMS not like", value, "terms");
            return (Criteria) this;
        }

        public Criteria andTermsIn(List<String> values) {
            addCriterion("TERMS in", values, "terms");
            return (Criteria) this;
        }

        public Criteria andTermsNotIn(List<String> values) {
            addCriterion("TERMS not in", values, "terms");
            return (Criteria) this;
        }

        public Criteria andTermsBetween(String value1, String value2) {
            addCriterion("TERMS between", value1, value2, "terms");
            return (Criteria) this;
        }

        public Criteria andTermsNotBetween(String value1, String value2) {
            addCriterion("TERMS not between", value1, value2, "terms");
            return (Criteria) this;
        }

        public Criteria andDelvdateIsNull() {
            addCriterion("DELVDATE is null");
            return (Criteria) this;
        }

        public Criteria andDelvdateIsNotNull() {
            addCriterion("DELVDATE is not null");
            return (Criteria) this;
        }

        public Criteria andDelvdateEqualTo(Date value) {
            addCriterion("DELVDATE =", value, "delvdate");
            return (Criteria) this;
        }

        public Criteria andDelvdateNotEqualTo(Date value) {
            addCriterion("DELVDATE <>", value, "delvdate");
            return (Criteria) this;
        }

        public Criteria andDelvdateGreaterThan(Date value) {
            addCriterion("DELVDATE >", value, "delvdate");
            return (Criteria) this;
        }

        public Criteria andDelvdateGreaterThanOrEqualTo(Date value) {
            addCriterion("DELVDATE >=", value, "delvdate");
            return (Criteria) this;
        }

        public Criteria andDelvdateLessThan(Date value) {
            addCriterion("DELVDATE <", value, "delvdate");
            return (Criteria) this;
        }

        public Criteria andDelvdateLessThanOrEqualTo(Date value) {
            addCriterion("DELVDATE <=", value, "delvdate");
            return (Criteria) this;
        }

        public Criteria andDelvdateIn(List<Date> values) {
            addCriterion("DELVDATE in", values, "delvdate");
            return (Criteria) this;
        }

        public Criteria andDelvdateNotIn(List<Date> values) {
            addCriterion("DELVDATE not in", values, "delvdate");
            return (Criteria) this;
        }

        public Criteria andDelvdateBetween(Date value1, Date value2) {
            addCriterion("DELVDATE between", value1, value2, "delvdate");
            return (Criteria) this;
        }

        public Criteria andDelvdateNotBetween(Date value1, Date value2) {
            addCriterion("DELVDATE not between", value1, value2, "delvdate");
            return (Criteria) this;
        }

        public Criteria andContactIsNull() {
            addCriterion("CONTACT is null");
            return (Criteria) this;
        }

        public Criteria andContactIsNotNull() {
            addCriterion("CONTACT is not null");
            return (Criteria) this;
        }

        public Criteria andContactEqualTo(String value) {
            addCriterion("CONTACT =", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotEqualTo(String value) {
            addCriterion("CONTACT <>", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThan(String value) {
            addCriterion("CONTACT >", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACT >=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThan(String value) {
            addCriterion("CONTACT <", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThanOrEqualTo(String value) {
            addCriterion("CONTACT <=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLike(String value) {
            addCriterion("CONTACT like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotLike(String value) {
            addCriterion("CONTACT not like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactIn(List<String> values) {
            addCriterion("CONTACT in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotIn(List<String> values) {
            addCriterion("CONTACT not in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactBetween(String value1, String value2) {
            addCriterion("CONTACT between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotBetween(String value1, String value2) {
            addCriterion("CONTACT not between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andContphonIsNull() {
            addCriterion("CONTPHON is null");
            return (Criteria) this;
        }

        public Criteria andContphonIsNotNull() {
            addCriterion("CONTPHON is not null");
            return (Criteria) this;
        }

        public Criteria andContphonEqualTo(String value) {
            addCriterion("CONTPHON =", value, "contphon");
            return (Criteria) this;
        }

        public Criteria andContphonNotEqualTo(String value) {
            addCriterion("CONTPHON <>", value, "contphon");
            return (Criteria) this;
        }

        public Criteria andContphonGreaterThan(String value) {
            addCriterion("CONTPHON >", value, "contphon");
            return (Criteria) this;
        }

        public Criteria andContphonGreaterThanOrEqualTo(String value) {
            addCriterion("CONTPHON >=", value, "contphon");
            return (Criteria) this;
        }

        public Criteria andContphonLessThan(String value) {
            addCriterion("CONTPHON <", value, "contphon");
            return (Criteria) this;
        }

        public Criteria andContphonLessThanOrEqualTo(String value) {
            addCriterion("CONTPHON <=", value, "contphon");
            return (Criteria) this;
        }

        public Criteria andContphonLike(String value) {
            addCriterion("CONTPHON like", value, "contphon");
            return (Criteria) this;
        }

        public Criteria andContphonNotLike(String value) {
            addCriterion("CONTPHON not like", value, "contphon");
            return (Criteria) this;
        }

        public Criteria andContphonIn(List<String> values) {
            addCriterion("CONTPHON in", values, "contphon");
            return (Criteria) this;
        }

        public Criteria andContphonNotIn(List<String> values) {
            addCriterion("CONTPHON not in", values, "contphon");
            return (Criteria) this;
        }

        public Criteria andContphonBetween(String value1, String value2) {
            addCriterion("CONTPHON between", value1, value2, "contphon");
            return (Criteria) this;
        }

        public Criteria andContphonNotBetween(String value1, String value2) {
            addCriterion("CONTPHON not between", value1, value2, "contphon");
            return (Criteria) this;
        }

        public Criteria andShipviaIsNull() {
            addCriterion("SHIPVIA is null");
            return (Criteria) this;
        }

        public Criteria andShipviaIsNotNull() {
            addCriterion("SHIPVIA is not null");
            return (Criteria) this;
        }

        public Criteria andShipviaEqualTo(String value) {
            addCriterion("SHIPVIA =", value, "shipvia");
            return (Criteria) this;
        }

        public Criteria andShipviaNotEqualTo(String value) {
            addCriterion("SHIPVIA <>", value, "shipvia");
            return (Criteria) this;
        }

        public Criteria andShipviaGreaterThan(String value) {
            addCriterion("SHIPVIA >", value, "shipvia");
            return (Criteria) this;
        }

        public Criteria andShipviaGreaterThanOrEqualTo(String value) {
            addCriterion("SHIPVIA >=", value, "shipvia");
            return (Criteria) this;
        }

        public Criteria andShipviaLessThan(String value) {
            addCriterion("SHIPVIA <", value, "shipvia");
            return (Criteria) this;
        }

        public Criteria andShipviaLessThanOrEqualTo(String value) {
            addCriterion("SHIPVIA <=", value, "shipvia");
            return (Criteria) this;
        }

        public Criteria andShipviaLike(String value) {
            addCriterion("SHIPVIA like", value, "shipvia");
            return (Criteria) this;
        }

        public Criteria andShipviaNotLike(String value) {
            addCriterion("SHIPVIA not like", value, "shipvia");
            return (Criteria) this;
        }

        public Criteria andShipviaIn(List<String> values) {
            addCriterion("SHIPVIA in", values, "shipvia");
            return (Criteria) this;
        }

        public Criteria andShipviaNotIn(List<String> values) {
            addCriterion("SHIPVIA not in", values, "shipvia");
            return (Criteria) this;
        }

        public Criteria andShipviaBetween(String value1, String value2) {
            addCriterion("SHIPVIA between", value1, value2, "shipvia");
            return (Criteria) this;
        }

        public Criteria andShipviaNotBetween(String value1, String value2) {
            addCriterion("SHIPVIA not between", value1, value2, "shipvia");
            return (Criteria) this;
        }

        public Criteria andCanclaftIsNull() {
            addCriterion("CANCLAFT is null");
            return (Criteria) this;
        }

        public Criteria andCanclaftIsNotNull() {
            addCriterion("CANCLAFT is not null");
            return (Criteria) this;
        }

        public Criteria andCanclaftEqualTo(Date value) {
            addCriterion("CANCLAFT =", value, "canclaft");
            return (Criteria) this;
        }

        public Criteria andCanclaftNotEqualTo(Date value) {
            addCriterion("CANCLAFT <>", value, "canclaft");
            return (Criteria) this;
        }

        public Criteria andCanclaftGreaterThan(Date value) {
            addCriterion("CANCLAFT >", value, "canclaft");
            return (Criteria) this;
        }

        public Criteria andCanclaftGreaterThanOrEqualTo(Date value) {
            addCriterion("CANCLAFT >=", value, "canclaft");
            return (Criteria) this;
        }

        public Criteria andCanclaftLessThan(Date value) {
            addCriterion("CANCLAFT <", value, "canclaft");
            return (Criteria) this;
        }

        public Criteria andCanclaftLessThanOrEqualTo(Date value) {
            addCriterion("CANCLAFT <=", value, "canclaft");
            return (Criteria) this;
        }

        public Criteria andCanclaftIn(List<Date> values) {
            addCriterion("CANCLAFT in", values, "canclaft");
            return (Criteria) this;
        }

        public Criteria andCanclaftNotIn(List<Date> values) {
            addCriterion("CANCLAFT not in", values, "canclaft");
            return (Criteria) this;
        }

        public Criteria andCanclaftBetween(Date value1, Date value2) {
            addCriterion("CANCLAFT between", value1, value2, "canclaft");
            return (Criteria) this;
        }

        public Criteria andCanclaftNotBetween(Date value1, Date value2) {
            addCriterion("CANCLAFT not between", value1, value2, "canclaft");
            return (Criteria) this;
        }

        public Criteria andApprovedIsNull() {
            addCriterion("APPROVED is null");
            return (Criteria) this;
        }

        public Criteria andApprovedIsNotNull() {
            addCriterion("APPROVED is not null");
            return (Criteria) this;
        }

        public Criteria andApprovedEqualTo(Date value) {
            addCriterion("APPROVED =", value, "approved");
            return (Criteria) this;
        }

        public Criteria andApprovedNotEqualTo(Date value) {
            addCriterion("APPROVED <>", value, "approved");
            return (Criteria) this;
        }

        public Criteria andApprovedGreaterThan(Date value) {
            addCriterion("APPROVED >", value, "approved");
            return (Criteria) this;
        }

        public Criteria andApprovedGreaterThanOrEqualTo(Date value) {
            addCriterion("APPROVED >=", value, "approved");
            return (Criteria) this;
        }

        public Criteria andApprovedLessThan(Date value) {
            addCriterion("APPROVED <", value, "approved");
            return (Criteria) this;
        }

        public Criteria andApprovedLessThanOrEqualTo(Date value) {
            addCriterion("APPROVED <=", value, "approved");
            return (Criteria) this;
        }

        public Criteria andApprovedIn(List<Date> values) {
            addCriterion("APPROVED in", values, "approved");
            return (Criteria) this;
        }

        public Criteria andApprovedNotIn(List<Date> values) {
            addCriterion("APPROVED not in", values, "approved");
            return (Criteria) this;
        }

        public Criteria andApprovedBetween(Date value1, Date value2) {
            addCriterion("APPROVED between", value1, value2, "approved");
            return (Criteria) this;
        }

        public Criteria andApprovedNotBetween(Date value1, Date value2) {
            addCriterion("APPROVED not between", value1, value2, "approved");
            return (Criteria) this;
        }

        public Criteria andApprvdbyIsNull() {
            addCriterion("APPRVDBY is null");
            return (Criteria) this;
        }

        public Criteria andApprvdbyIsNotNull() {
            addCriterion("APPRVDBY is not null");
            return (Criteria) this;
        }

        public Criteria andApprvdbyEqualTo(String value) {
            addCriterion("APPRVDBY =", value, "apprvdby");
            return (Criteria) this;
        }

        public Criteria andApprvdbyNotEqualTo(String value) {
            addCriterion("APPRVDBY <>", value, "apprvdby");
            return (Criteria) this;
        }

        public Criteria andApprvdbyGreaterThan(String value) {
            addCriterion("APPRVDBY >", value, "apprvdby");
            return (Criteria) this;
        }

        public Criteria andApprvdbyGreaterThanOrEqualTo(String value) {
            addCriterion("APPRVDBY >=", value, "apprvdby");
            return (Criteria) this;
        }

        public Criteria andApprvdbyLessThan(String value) {
            addCriterion("APPRVDBY <", value, "apprvdby");
            return (Criteria) this;
        }

        public Criteria andApprvdbyLessThanOrEqualTo(String value) {
            addCriterion("APPRVDBY <=", value, "apprvdby");
            return (Criteria) this;
        }

        public Criteria andApprvdbyLike(String value) {
            addCriterion("APPRVDBY like", value, "apprvdby");
            return (Criteria) this;
        }

        public Criteria andApprvdbyNotLike(String value) {
            addCriterion("APPRVDBY not like", value, "apprvdby");
            return (Criteria) this;
        }

        public Criteria andApprvdbyIn(List<String> values) {
            addCriterion("APPRVDBY in", values, "apprvdby");
            return (Criteria) this;
        }

        public Criteria andApprvdbyNotIn(List<String> values) {
            addCriterion("APPRVDBY not in", values, "apprvdby");
            return (Criteria) this;
        }

        public Criteria andApprvdbyBetween(String value1, String value2) {
            addCriterion("APPRVDBY between", value1, value2, "apprvdby");
            return (Criteria) this;
        }

        public Criteria andApprvdbyNotBetween(String value1, String value2) {
            addCriterion("APPRVDBY not between", value1, value2, "apprvdby");
            return (Criteria) this;
        }

        public Criteria andApprove2IsNull() {
            addCriterion("APPROVE2 is null");
            return (Criteria) this;
        }

        public Criteria andApprove2IsNotNull() {
            addCriterion("APPROVE2 is not null");
            return (Criteria) this;
        }

        public Criteria andApprove2EqualTo(Date value) {
            addCriterion("APPROVE2 =", value, "approve2");
            return (Criteria) this;
        }

        public Criteria andApprove2NotEqualTo(Date value) {
            addCriterion("APPROVE2 <>", value, "approve2");
            return (Criteria) this;
        }

        public Criteria andApprove2GreaterThan(Date value) {
            addCriterion("APPROVE2 >", value, "approve2");
            return (Criteria) this;
        }

        public Criteria andApprove2GreaterThanOrEqualTo(Date value) {
            addCriterion("APPROVE2 >=", value, "approve2");
            return (Criteria) this;
        }

        public Criteria andApprove2LessThan(Date value) {
            addCriterion("APPROVE2 <", value, "approve2");
            return (Criteria) this;
        }

        public Criteria andApprove2LessThanOrEqualTo(Date value) {
            addCriterion("APPROVE2 <=", value, "approve2");
            return (Criteria) this;
        }

        public Criteria andApprove2In(List<Date> values) {
            addCriterion("APPROVE2 in", values, "approve2");
            return (Criteria) this;
        }

        public Criteria andApprove2NotIn(List<Date> values) {
            addCriterion("APPROVE2 not in", values, "approve2");
            return (Criteria) this;
        }

        public Criteria andApprove2Between(Date value1, Date value2) {
            addCriterion("APPROVE2 between", value1, value2, "approve2");
            return (Criteria) this;
        }

        public Criteria andApprove2NotBetween(Date value1, Date value2) {
            addCriterion("APPROVE2 not between", value1, value2, "approve2");
            return (Criteria) this;
        }

        public Criteria andApprv2byIsNull() {
            addCriterion("APPRV2BY is null");
            return (Criteria) this;
        }

        public Criteria andApprv2byIsNotNull() {
            addCriterion("APPRV2BY is not null");
            return (Criteria) this;
        }

        public Criteria andApprv2byEqualTo(String value) {
            addCriterion("APPRV2BY =", value, "apprv2by");
            return (Criteria) this;
        }

        public Criteria andApprv2byNotEqualTo(String value) {
            addCriterion("APPRV2BY <>", value, "apprv2by");
            return (Criteria) this;
        }

        public Criteria andApprv2byGreaterThan(String value) {
            addCriterion("APPRV2BY >", value, "apprv2by");
            return (Criteria) this;
        }

        public Criteria andApprv2byGreaterThanOrEqualTo(String value) {
            addCriterion("APPRV2BY >=", value, "apprv2by");
            return (Criteria) this;
        }

        public Criteria andApprv2byLessThan(String value) {
            addCriterion("APPRV2BY <", value, "apprv2by");
            return (Criteria) this;
        }

        public Criteria andApprv2byLessThanOrEqualTo(String value) {
            addCriterion("APPRV2BY <=", value, "apprv2by");
            return (Criteria) this;
        }

        public Criteria andApprv2byLike(String value) {
            addCriterion("APPRV2BY like", value, "apprv2by");
            return (Criteria) this;
        }

        public Criteria andApprv2byNotLike(String value) {
            addCriterion("APPRV2BY not like", value, "apprv2by");
            return (Criteria) this;
        }

        public Criteria andApprv2byIn(List<String> values) {
            addCriterion("APPRV2BY in", values, "apprv2by");
            return (Criteria) this;
        }

        public Criteria andApprv2byNotIn(List<String> values) {
            addCriterion("APPRV2BY not in", values, "apprv2by");
            return (Criteria) this;
        }

        public Criteria andApprv2byBetween(String value1, String value2) {
            addCriterion("APPRV2BY between", value1, value2, "apprv2by");
            return (Criteria) this;
        }

        public Criteria andApprv2byNotBetween(String value1, String value2) {
            addCriterion("APPRV2BY not between", value1, value2, "apprv2by");
            return (Criteria) this;
        }

        public Criteria andOrdstatIsNull() {
            addCriterion("ORDSTAT is null");
            return (Criteria) this;
        }

        public Criteria andOrdstatIsNotNull() {
            addCriterion("ORDSTAT is not null");
            return (Criteria) this;
        }

        public Criteria andOrdstatEqualTo(String value) {
            addCriterion("ORDSTAT =", value, "ordstat");
            return (Criteria) this;
        }

        public Criteria andOrdstatNotEqualTo(String value) {
            addCriterion("ORDSTAT <>", value, "ordstat");
            return (Criteria) this;
        }

        public Criteria andOrdstatGreaterThan(String value) {
            addCriterion("ORDSTAT >", value, "ordstat");
            return (Criteria) this;
        }

        public Criteria andOrdstatGreaterThanOrEqualTo(String value) {
            addCriterion("ORDSTAT >=", value, "ordstat");
            return (Criteria) this;
        }

        public Criteria andOrdstatLessThan(String value) {
            addCriterion("ORDSTAT <", value, "ordstat");
            return (Criteria) this;
        }

        public Criteria andOrdstatLessThanOrEqualTo(String value) {
            addCriterion("ORDSTAT <=", value, "ordstat");
            return (Criteria) this;
        }

        public Criteria andOrdstatLike(String value) {
            addCriterion("ORDSTAT like", value, "ordstat");
            return (Criteria) this;
        }

        public Criteria andOrdstatNotLike(String value) {
            addCriterion("ORDSTAT not like", value, "ordstat");
            return (Criteria) this;
        }

        public Criteria andOrdstatIn(List<String> values) {
            addCriterion("ORDSTAT in", values, "ordstat");
            return (Criteria) this;
        }

        public Criteria andOrdstatNotIn(List<String> values) {
            addCriterion("ORDSTAT not in", values, "ordstat");
            return (Criteria) this;
        }

        public Criteria andOrdstatBetween(String value1, String value2) {
            addCriterion("ORDSTAT between", value1, value2, "ordstat");
            return (Criteria) this;
        }

        public Criteria andOrdstatNotBetween(String value1, String value2) {
            addCriterion("ORDSTAT not between", value1, value2, "ordstat");
            return (Criteria) this;
        }

        public Criteria andTaxableIsNull() {
            addCriterion("TAXABLE is null");
            return (Criteria) this;
        }

        public Criteria andTaxableIsNotNull() {
            addCriterion("TAXABLE is not null");
            return (Criteria) this;
        }

        public Criteria andTaxableEqualTo(String value) {
            addCriterion("TAXABLE =", value, "taxable");
            return (Criteria) this;
        }

        public Criteria andTaxableNotEqualTo(String value) {
            addCriterion("TAXABLE <>", value, "taxable");
            return (Criteria) this;
        }

        public Criteria andTaxableGreaterThan(String value) {
            addCriterion("TAXABLE >", value, "taxable");
            return (Criteria) this;
        }

        public Criteria andTaxableGreaterThanOrEqualTo(String value) {
            addCriterion("TAXABLE >=", value, "taxable");
            return (Criteria) this;
        }

        public Criteria andTaxableLessThan(String value) {
            addCriterion("TAXABLE <", value, "taxable");
            return (Criteria) this;
        }

        public Criteria andTaxableLessThanOrEqualTo(String value) {
            addCriterion("TAXABLE <=", value, "taxable");
            return (Criteria) this;
        }

        public Criteria andTaxableLike(String value) {
            addCriterion("TAXABLE like", value, "taxable");
            return (Criteria) this;
        }

        public Criteria andTaxableNotLike(String value) {
            addCriterion("TAXABLE not like", value, "taxable");
            return (Criteria) this;
        }

        public Criteria andTaxableIn(List<String> values) {
            addCriterion("TAXABLE in", values, "taxable");
            return (Criteria) this;
        }

        public Criteria andTaxableNotIn(List<String> values) {
            addCriterion("TAXABLE not in", values, "taxable");
            return (Criteria) this;
        }

        public Criteria andTaxableBetween(String value1, String value2) {
            addCriterion("TAXABLE between", value1, value2, "taxable");
            return (Criteria) this;
        }

        public Criteria andTaxableNotBetween(String value1, String value2) {
            addCriterion("TAXABLE not between", value1, value2, "taxable");
            return (Criteria) this;
        }

        public Criteria andTaxexempIsNull() {
            addCriterion("TAXEXEMP is null");
            return (Criteria) this;
        }

        public Criteria andTaxexempIsNotNull() {
            addCriterion("TAXEXEMP is not null");
            return (Criteria) this;
        }

        public Criteria andTaxexempEqualTo(String value) {
            addCriterion("TAXEXEMP =", value, "taxexemp");
            return (Criteria) this;
        }

        public Criteria andTaxexempNotEqualTo(String value) {
            addCriterion("TAXEXEMP <>", value, "taxexemp");
            return (Criteria) this;
        }

        public Criteria andTaxexempGreaterThan(String value) {
            addCriterion("TAXEXEMP >", value, "taxexemp");
            return (Criteria) this;
        }

        public Criteria andTaxexempGreaterThanOrEqualTo(String value) {
            addCriterion("TAXEXEMP >=", value, "taxexemp");
            return (Criteria) this;
        }

        public Criteria andTaxexempLessThan(String value) {
            addCriterion("TAXEXEMP <", value, "taxexemp");
            return (Criteria) this;
        }

        public Criteria andTaxexempLessThanOrEqualTo(String value) {
            addCriterion("TAXEXEMP <=", value, "taxexemp");
            return (Criteria) this;
        }

        public Criteria andTaxexempLike(String value) {
            addCriterion("TAXEXEMP like", value, "taxexemp");
            return (Criteria) this;
        }

        public Criteria andTaxexempNotLike(String value) {
            addCriterion("TAXEXEMP not like", value, "taxexemp");
            return (Criteria) this;
        }

        public Criteria andTaxexempIn(List<String> values) {
            addCriterion("TAXEXEMP in", values, "taxexemp");
            return (Criteria) this;
        }

        public Criteria andTaxexempNotIn(List<String> values) {
            addCriterion("TAXEXEMP not in", values, "taxexemp");
            return (Criteria) this;
        }

        public Criteria andTaxexempBetween(String value1, String value2) {
            addCriterion("TAXEXEMP between", value1, value2, "taxexemp");
            return (Criteria) this;
        }

        public Criteria andTaxexempNotBetween(String value1, String value2) {
            addCriterion("TAXEXEMP not between", value1, value2, "taxexemp");
            return (Criteria) this;
        }

        public Criteria andShipadr1IsNull() {
            addCriterion("SHIPADR1 is null");
            return (Criteria) this;
        }

        public Criteria andShipadr1IsNotNull() {
            addCriterion("SHIPADR1 is not null");
            return (Criteria) this;
        }

        public Criteria andShipadr1EqualTo(String value) {
            addCriterion("SHIPADR1 =", value, "shipadr1");
            return (Criteria) this;
        }

        public Criteria andShipadr1NotEqualTo(String value) {
            addCriterion("SHIPADR1 <>", value, "shipadr1");
            return (Criteria) this;
        }

        public Criteria andShipadr1GreaterThan(String value) {
            addCriterion("SHIPADR1 >", value, "shipadr1");
            return (Criteria) this;
        }

        public Criteria andShipadr1GreaterThanOrEqualTo(String value) {
            addCriterion("SHIPADR1 >=", value, "shipadr1");
            return (Criteria) this;
        }

        public Criteria andShipadr1LessThan(String value) {
            addCriterion("SHIPADR1 <", value, "shipadr1");
            return (Criteria) this;
        }

        public Criteria andShipadr1LessThanOrEqualTo(String value) {
            addCriterion("SHIPADR1 <=", value, "shipadr1");
            return (Criteria) this;
        }

        public Criteria andShipadr1Like(String value) {
            addCriterion("SHIPADR1 like", value, "shipadr1");
            return (Criteria) this;
        }

        public Criteria andShipadr1NotLike(String value) {
            addCriterion("SHIPADR1 not like", value, "shipadr1");
            return (Criteria) this;
        }

        public Criteria andShipadr1In(List<String> values) {
            addCriterion("SHIPADR1 in", values, "shipadr1");
            return (Criteria) this;
        }

        public Criteria andShipadr1NotIn(List<String> values) {
            addCriterion("SHIPADR1 not in", values, "shipadr1");
            return (Criteria) this;
        }

        public Criteria andShipadr1Between(String value1, String value2) {
            addCriterion("SHIPADR1 between", value1, value2, "shipadr1");
            return (Criteria) this;
        }

        public Criteria andShipadr1NotBetween(String value1, String value2) {
            addCriterion("SHIPADR1 not between", value1, value2, "shipadr1");
            return (Criteria) this;
        }

        public Criteria andShipadr2IsNull() {
            addCriterion("SHIPADR2 is null");
            return (Criteria) this;
        }

        public Criteria andShipadr2IsNotNull() {
            addCriterion("SHIPADR2 is not null");
            return (Criteria) this;
        }

        public Criteria andShipadr2EqualTo(String value) {
            addCriterion("SHIPADR2 =", value, "shipadr2");
            return (Criteria) this;
        }

        public Criteria andShipadr2NotEqualTo(String value) {
            addCriterion("SHIPADR2 <>", value, "shipadr2");
            return (Criteria) this;
        }

        public Criteria andShipadr2GreaterThan(String value) {
            addCriterion("SHIPADR2 >", value, "shipadr2");
            return (Criteria) this;
        }

        public Criteria andShipadr2GreaterThanOrEqualTo(String value) {
            addCriterion("SHIPADR2 >=", value, "shipadr2");
            return (Criteria) this;
        }

        public Criteria andShipadr2LessThan(String value) {
            addCriterion("SHIPADR2 <", value, "shipadr2");
            return (Criteria) this;
        }

        public Criteria andShipadr2LessThanOrEqualTo(String value) {
            addCriterion("SHIPADR2 <=", value, "shipadr2");
            return (Criteria) this;
        }

        public Criteria andShipadr2Like(String value) {
            addCriterion("SHIPADR2 like", value, "shipadr2");
            return (Criteria) this;
        }

        public Criteria andShipadr2NotLike(String value) {
            addCriterion("SHIPADR2 not like", value, "shipadr2");
            return (Criteria) this;
        }

        public Criteria andShipadr2In(List<String> values) {
            addCriterion("SHIPADR2 in", values, "shipadr2");
            return (Criteria) this;
        }

        public Criteria andShipadr2NotIn(List<String> values) {
            addCriterion("SHIPADR2 not in", values, "shipadr2");
            return (Criteria) this;
        }

        public Criteria andShipadr2Between(String value1, String value2) {
            addCriterion("SHIPADR2 between", value1, value2, "shipadr2");
            return (Criteria) this;
        }

        public Criteria andShipadr2NotBetween(String value1, String value2) {
            addCriterion("SHIPADR2 not between", value1, value2, "shipadr2");
            return (Criteria) this;
        }

        public Criteria andShipadr3IsNull() {
            addCriterion("SHIPADR3 is null");
            return (Criteria) this;
        }

        public Criteria andShipadr3IsNotNull() {
            addCriterion("SHIPADR3 is not null");
            return (Criteria) this;
        }

        public Criteria andShipadr3EqualTo(String value) {
            addCriterion("SHIPADR3 =", value, "shipadr3");
            return (Criteria) this;
        }

        public Criteria andShipadr3NotEqualTo(String value) {
            addCriterion("SHIPADR3 <>", value, "shipadr3");
            return (Criteria) this;
        }

        public Criteria andShipadr3GreaterThan(String value) {
            addCriterion("SHIPADR3 >", value, "shipadr3");
            return (Criteria) this;
        }

        public Criteria andShipadr3GreaterThanOrEqualTo(String value) {
            addCriterion("SHIPADR3 >=", value, "shipadr3");
            return (Criteria) this;
        }

        public Criteria andShipadr3LessThan(String value) {
            addCriterion("SHIPADR3 <", value, "shipadr3");
            return (Criteria) this;
        }

        public Criteria andShipadr3LessThanOrEqualTo(String value) {
            addCriterion("SHIPADR3 <=", value, "shipadr3");
            return (Criteria) this;
        }

        public Criteria andShipadr3Like(String value) {
            addCriterion("SHIPADR3 like", value, "shipadr3");
            return (Criteria) this;
        }

        public Criteria andShipadr3NotLike(String value) {
            addCriterion("SHIPADR3 not like", value, "shipadr3");
            return (Criteria) this;
        }

        public Criteria andShipadr3In(List<String> values) {
            addCriterion("SHIPADR3 in", values, "shipadr3");
            return (Criteria) this;
        }

        public Criteria andShipadr3NotIn(List<String> values) {
            addCriterion("SHIPADR3 not in", values, "shipadr3");
            return (Criteria) this;
        }

        public Criteria andShipadr3Between(String value1, String value2) {
            addCriterion("SHIPADR3 between", value1, value2, "shipadr3");
            return (Criteria) this;
        }

        public Criteria andShipadr3NotBetween(String value1, String value2) {
            addCriterion("SHIPADR3 not between", value1, value2, "shipadr3");
            return (Criteria) this;
        }

        public Criteria andShipcityIsNull() {
            addCriterion("SHIPCITY is null");
            return (Criteria) this;
        }

        public Criteria andShipcityIsNotNull() {
            addCriterion("SHIPCITY is not null");
            return (Criteria) this;
        }

        public Criteria andShipcityEqualTo(String value) {
            addCriterion("SHIPCITY =", value, "shipcity");
            return (Criteria) this;
        }

        public Criteria andShipcityNotEqualTo(String value) {
            addCriterion("SHIPCITY <>", value, "shipcity");
            return (Criteria) this;
        }

        public Criteria andShipcityGreaterThan(String value) {
            addCriterion("SHIPCITY >", value, "shipcity");
            return (Criteria) this;
        }

        public Criteria andShipcityGreaterThanOrEqualTo(String value) {
            addCriterion("SHIPCITY >=", value, "shipcity");
            return (Criteria) this;
        }

        public Criteria andShipcityLessThan(String value) {
            addCriterion("SHIPCITY <", value, "shipcity");
            return (Criteria) this;
        }

        public Criteria andShipcityLessThanOrEqualTo(String value) {
            addCriterion("SHIPCITY <=", value, "shipcity");
            return (Criteria) this;
        }

        public Criteria andShipcityLike(String value) {
            addCriterion("SHIPCITY like", value, "shipcity");
            return (Criteria) this;
        }

        public Criteria andShipcityNotLike(String value) {
            addCriterion("SHIPCITY not like", value, "shipcity");
            return (Criteria) this;
        }

        public Criteria andShipcityIn(List<String> values) {
            addCriterion("SHIPCITY in", values, "shipcity");
            return (Criteria) this;
        }

        public Criteria andShipcityNotIn(List<String> values) {
            addCriterion("SHIPCITY not in", values, "shipcity");
            return (Criteria) this;
        }

        public Criteria andShipcityBetween(String value1, String value2) {
            addCriterion("SHIPCITY between", value1, value2, "shipcity");
            return (Criteria) this;
        }

        public Criteria andShipcityNotBetween(String value1, String value2) {
            addCriterion("SHIPCITY not between", value1, value2, "shipcity");
            return (Criteria) this;
        }

        public Criteria andShipstIsNull() {
            addCriterion("SHIPST is null");
            return (Criteria) this;
        }

        public Criteria andShipstIsNotNull() {
            addCriterion("SHIPST is not null");
            return (Criteria) this;
        }

        public Criteria andShipstEqualTo(String value) {
            addCriterion("SHIPST =", value, "shipst");
            return (Criteria) this;
        }

        public Criteria andShipstNotEqualTo(String value) {
            addCriterion("SHIPST <>", value, "shipst");
            return (Criteria) this;
        }

        public Criteria andShipstGreaterThan(String value) {
            addCriterion("SHIPST >", value, "shipst");
            return (Criteria) this;
        }

        public Criteria andShipstGreaterThanOrEqualTo(String value) {
            addCriterion("SHIPST >=", value, "shipst");
            return (Criteria) this;
        }

        public Criteria andShipstLessThan(String value) {
            addCriterion("SHIPST <", value, "shipst");
            return (Criteria) this;
        }

        public Criteria andShipstLessThanOrEqualTo(String value) {
            addCriterion("SHIPST <=", value, "shipst");
            return (Criteria) this;
        }

        public Criteria andShipstLike(String value) {
            addCriterion("SHIPST like", value, "shipst");
            return (Criteria) this;
        }

        public Criteria andShipstNotLike(String value) {
            addCriterion("SHIPST not like", value, "shipst");
            return (Criteria) this;
        }

        public Criteria andShipstIn(List<String> values) {
            addCriterion("SHIPST in", values, "shipst");
            return (Criteria) this;
        }

        public Criteria andShipstNotIn(List<String> values) {
            addCriterion("SHIPST not in", values, "shipst");
            return (Criteria) this;
        }

        public Criteria andShipstBetween(String value1, String value2) {
            addCriterion("SHIPST between", value1, value2, "shipst");
            return (Criteria) this;
        }

        public Criteria andShipstNotBetween(String value1, String value2) {
            addCriterion("SHIPST not between", value1, value2, "shipst");
            return (Criteria) this;
        }

        public Criteria andShipzipIsNull() {
            addCriterion("SHIPZIP is null");
            return (Criteria) this;
        }

        public Criteria andShipzipIsNotNull() {
            addCriterion("SHIPZIP is not null");
            return (Criteria) this;
        }

        public Criteria andShipzipEqualTo(String value) {
            addCriterion("SHIPZIP =", value, "shipzip");
            return (Criteria) this;
        }

        public Criteria andShipzipNotEqualTo(String value) {
            addCriterion("SHIPZIP <>", value, "shipzip");
            return (Criteria) this;
        }

        public Criteria andShipzipGreaterThan(String value) {
            addCriterion("SHIPZIP >", value, "shipzip");
            return (Criteria) this;
        }

        public Criteria andShipzipGreaterThanOrEqualTo(String value) {
            addCriterion("SHIPZIP >=", value, "shipzip");
            return (Criteria) this;
        }

        public Criteria andShipzipLessThan(String value) {
            addCriterion("SHIPZIP <", value, "shipzip");
            return (Criteria) this;
        }

        public Criteria andShipzipLessThanOrEqualTo(String value) {
            addCriterion("SHIPZIP <=", value, "shipzip");
            return (Criteria) this;
        }

        public Criteria andShipzipLike(String value) {
            addCriterion("SHIPZIP like", value, "shipzip");
            return (Criteria) this;
        }

        public Criteria andShipzipNotLike(String value) {
            addCriterion("SHIPZIP not like", value, "shipzip");
            return (Criteria) this;
        }

        public Criteria andShipzipIn(List<String> values) {
            addCriterion("SHIPZIP in", values, "shipzip");
            return (Criteria) this;
        }

        public Criteria andShipzipNotIn(List<String> values) {
            addCriterion("SHIPZIP not in", values, "shipzip");
            return (Criteria) this;
        }

        public Criteria andShipzipBetween(String value1, String value2) {
            addCriterion("SHIPZIP between", value1, value2, "shipzip");
            return (Criteria) this;
        }

        public Criteria andShipzipNotBetween(String value1, String value2) {
            addCriterion("SHIPZIP not between", value1, value2, "shipzip");
            return (Criteria) this;
        }

        public Criteria andBilladr1IsNull() {
            addCriterion("BILLADR1 is null");
            return (Criteria) this;
        }

        public Criteria andBilladr1IsNotNull() {
            addCriterion("BILLADR1 is not null");
            return (Criteria) this;
        }

        public Criteria andBilladr1EqualTo(String value) {
            addCriterion("BILLADR1 =", value, "billadr1");
            return (Criteria) this;
        }

        public Criteria andBilladr1NotEqualTo(String value) {
            addCriterion("BILLADR1 <>", value, "billadr1");
            return (Criteria) this;
        }

        public Criteria andBilladr1GreaterThan(String value) {
            addCriterion("BILLADR1 >", value, "billadr1");
            return (Criteria) this;
        }

        public Criteria andBilladr1GreaterThanOrEqualTo(String value) {
            addCriterion("BILLADR1 >=", value, "billadr1");
            return (Criteria) this;
        }

        public Criteria andBilladr1LessThan(String value) {
            addCriterion("BILLADR1 <", value, "billadr1");
            return (Criteria) this;
        }

        public Criteria andBilladr1LessThanOrEqualTo(String value) {
            addCriterion("BILLADR1 <=", value, "billadr1");
            return (Criteria) this;
        }

        public Criteria andBilladr1Like(String value) {
            addCriterion("BILLADR1 like", value, "billadr1");
            return (Criteria) this;
        }

        public Criteria andBilladr1NotLike(String value) {
            addCriterion("BILLADR1 not like", value, "billadr1");
            return (Criteria) this;
        }

        public Criteria andBilladr1In(List<String> values) {
            addCriterion("BILLADR1 in", values, "billadr1");
            return (Criteria) this;
        }

        public Criteria andBilladr1NotIn(List<String> values) {
            addCriterion("BILLADR1 not in", values, "billadr1");
            return (Criteria) this;
        }

        public Criteria andBilladr1Between(String value1, String value2) {
            addCriterion("BILLADR1 between", value1, value2, "billadr1");
            return (Criteria) this;
        }

        public Criteria andBilladr1NotBetween(String value1, String value2) {
            addCriterion("BILLADR1 not between", value1, value2, "billadr1");
            return (Criteria) this;
        }

        public Criteria andBilladr2IsNull() {
            addCriterion("BILLADR2 is null");
            return (Criteria) this;
        }

        public Criteria andBilladr2IsNotNull() {
            addCriterion("BILLADR2 is not null");
            return (Criteria) this;
        }

        public Criteria andBilladr2EqualTo(String value) {
            addCriterion("BILLADR2 =", value, "billadr2");
            return (Criteria) this;
        }

        public Criteria andBilladr2NotEqualTo(String value) {
            addCriterion("BILLADR2 <>", value, "billadr2");
            return (Criteria) this;
        }

        public Criteria andBilladr2GreaterThan(String value) {
            addCriterion("BILLADR2 >", value, "billadr2");
            return (Criteria) this;
        }

        public Criteria andBilladr2GreaterThanOrEqualTo(String value) {
            addCriterion("BILLADR2 >=", value, "billadr2");
            return (Criteria) this;
        }

        public Criteria andBilladr2LessThan(String value) {
            addCriterion("BILLADR2 <", value, "billadr2");
            return (Criteria) this;
        }

        public Criteria andBilladr2LessThanOrEqualTo(String value) {
            addCriterion("BILLADR2 <=", value, "billadr2");
            return (Criteria) this;
        }

        public Criteria andBilladr2Like(String value) {
            addCriterion("BILLADR2 like", value, "billadr2");
            return (Criteria) this;
        }

        public Criteria andBilladr2NotLike(String value) {
            addCriterion("BILLADR2 not like", value, "billadr2");
            return (Criteria) this;
        }

        public Criteria andBilladr2In(List<String> values) {
            addCriterion("BILLADR2 in", values, "billadr2");
            return (Criteria) this;
        }

        public Criteria andBilladr2NotIn(List<String> values) {
            addCriterion("BILLADR2 not in", values, "billadr2");
            return (Criteria) this;
        }

        public Criteria andBilladr2Between(String value1, String value2) {
            addCriterion("BILLADR2 between", value1, value2, "billadr2");
            return (Criteria) this;
        }

        public Criteria andBilladr2NotBetween(String value1, String value2) {
            addCriterion("BILLADR2 not between", value1, value2, "billadr2");
            return (Criteria) this;
        }

        public Criteria andBilladr3IsNull() {
            addCriterion("BILLADR3 is null");
            return (Criteria) this;
        }

        public Criteria andBilladr3IsNotNull() {
            addCriterion("BILLADR3 is not null");
            return (Criteria) this;
        }

        public Criteria andBilladr3EqualTo(String value) {
            addCriterion("BILLADR3 =", value, "billadr3");
            return (Criteria) this;
        }

        public Criteria andBilladr3NotEqualTo(String value) {
            addCriterion("BILLADR3 <>", value, "billadr3");
            return (Criteria) this;
        }

        public Criteria andBilladr3GreaterThan(String value) {
            addCriterion("BILLADR3 >", value, "billadr3");
            return (Criteria) this;
        }

        public Criteria andBilladr3GreaterThanOrEqualTo(String value) {
            addCriterion("BILLADR3 >=", value, "billadr3");
            return (Criteria) this;
        }

        public Criteria andBilladr3LessThan(String value) {
            addCriterion("BILLADR3 <", value, "billadr3");
            return (Criteria) this;
        }

        public Criteria andBilladr3LessThanOrEqualTo(String value) {
            addCriterion("BILLADR3 <=", value, "billadr3");
            return (Criteria) this;
        }

        public Criteria andBilladr3Like(String value) {
            addCriterion("BILLADR3 like", value, "billadr3");
            return (Criteria) this;
        }

        public Criteria andBilladr3NotLike(String value) {
            addCriterion("BILLADR3 not like", value, "billadr3");
            return (Criteria) this;
        }

        public Criteria andBilladr3In(List<String> values) {
            addCriterion("BILLADR3 in", values, "billadr3");
            return (Criteria) this;
        }

        public Criteria andBilladr3NotIn(List<String> values) {
            addCriterion("BILLADR3 not in", values, "billadr3");
            return (Criteria) this;
        }

        public Criteria andBilladr3Between(String value1, String value2) {
            addCriterion("BILLADR3 between", value1, value2, "billadr3");
            return (Criteria) this;
        }

        public Criteria andBilladr3NotBetween(String value1, String value2) {
            addCriterion("BILLADR3 not between", value1, value2, "billadr3");
            return (Criteria) this;
        }

        public Criteria andBillcityIsNull() {
            addCriterion("BILLCITY is null");
            return (Criteria) this;
        }

        public Criteria andBillcityIsNotNull() {
            addCriterion("BILLCITY is not null");
            return (Criteria) this;
        }

        public Criteria andBillcityEqualTo(String value) {
            addCriterion("BILLCITY =", value, "billcity");
            return (Criteria) this;
        }

        public Criteria andBillcityNotEqualTo(String value) {
            addCriterion("BILLCITY <>", value, "billcity");
            return (Criteria) this;
        }

        public Criteria andBillcityGreaterThan(String value) {
            addCriterion("BILLCITY >", value, "billcity");
            return (Criteria) this;
        }

        public Criteria andBillcityGreaterThanOrEqualTo(String value) {
            addCriterion("BILLCITY >=", value, "billcity");
            return (Criteria) this;
        }

        public Criteria andBillcityLessThan(String value) {
            addCriterion("BILLCITY <", value, "billcity");
            return (Criteria) this;
        }

        public Criteria andBillcityLessThanOrEqualTo(String value) {
            addCriterion("BILLCITY <=", value, "billcity");
            return (Criteria) this;
        }

        public Criteria andBillcityLike(String value) {
            addCriterion("BILLCITY like", value, "billcity");
            return (Criteria) this;
        }

        public Criteria andBillcityNotLike(String value) {
            addCriterion("BILLCITY not like", value, "billcity");
            return (Criteria) this;
        }

        public Criteria andBillcityIn(List<String> values) {
            addCriterion("BILLCITY in", values, "billcity");
            return (Criteria) this;
        }

        public Criteria andBillcityNotIn(List<String> values) {
            addCriterion("BILLCITY not in", values, "billcity");
            return (Criteria) this;
        }

        public Criteria andBillcityBetween(String value1, String value2) {
            addCriterion("BILLCITY between", value1, value2, "billcity");
            return (Criteria) this;
        }

        public Criteria andBillcityNotBetween(String value1, String value2) {
            addCriterion("BILLCITY not between", value1, value2, "billcity");
            return (Criteria) this;
        }

        public Criteria andBillstIsNull() {
            addCriterion("BILLST is null");
            return (Criteria) this;
        }

        public Criteria andBillstIsNotNull() {
            addCriterion("BILLST is not null");
            return (Criteria) this;
        }

        public Criteria andBillstEqualTo(String value) {
            addCriterion("BILLST =", value, "billst");
            return (Criteria) this;
        }

        public Criteria andBillstNotEqualTo(String value) {
            addCriterion("BILLST <>", value, "billst");
            return (Criteria) this;
        }

        public Criteria andBillstGreaterThan(String value) {
            addCriterion("BILLST >", value, "billst");
            return (Criteria) this;
        }

        public Criteria andBillstGreaterThanOrEqualTo(String value) {
            addCriterion("BILLST >=", value, "billst");
            return (Criteria) this;
        }

        public Criteria andBillstLessThan(String value) {
            addCriterion("BILLST <", value, "billst");
            return (Criteria) this;
        }

        public Criteria andBillstLessThanOrEqualTo(String value) {
            addCriterion("BILLST <=", value, "billst");
            return (Criteria) this;
        }

        public Criteria andBillstLike(String value) {
            addCriterion("BILLST like", value, "billst");
            return (Criteria) this;
        }

        public Criteria andBillstNotLike(String value) {
            addCriterion("BILLST not like", value, "billst");
            return (Criteria) this;
        }

        public Criteria andBillstIn(List<String> values) {
            addCriterion("BILLST in", values, "billst");
            return (Criteria) this;
        }

        public Criteria andBillstNotIn(List<String> values) {
            addCriterion("BILLST not in", values, "billst");
            return (Criteria) this;
        }

        public Criteria andBillstBetween(String value1, String value2) {
            addCriterion("BILLST between", value1, value2, "billst");
            return (Criteria) this;
        }

        public Criteria andBillstNotBetween(String value1, String value2) {
            addCriterion("BILLST not between", value1, value2, "billst");
            return (Criteria) this;
        }

        public Criteria andBillzipIsNull() {
            addCriterion("BILLZIP is null");
            return (Criteria) this;
        }

        public Criteria andBillzipIsNotNull() {
            addCriterion("BILLZIP is not null");
            return (Criteria) this;
        }

        public Criteria andBillzipEqualTo(String value) {
            addCriterion("BILLZIP =", value, "billzip");
            return (Criteria) this;
        }

        public Criteria andBillzipNotEqualTo(String value) {
            addCriterion("BILLZIP <>", value, "billzip");
            return (Criteria) this;
        }

        public Criteria andBillzipGreaterThan(String value) {
            addCriterion("BILLZIP >", value, "billzip");
            return (Criteria) this;
        }

        public Criteria andBillzipGreaterThanOrEqualTo(String value) {
            addCriterion("BILLZIP >=", value, "billzip");
            return (Criteria) this;
        }

        public Criteria andBillzipLessThan(String value) {
            addCriterion("BILLZIP <", value, "billzip");
            return (Criteria) this;
        }

        public Criteria andBillzipLessThanOrEqualTo(String value) {
            addCriterion("BILLZIP <=", value, "billzip");
            return (Criteria) this;
        }

        public Criteria andBillzipLike(String value) {
            addCriterion("BILLZIP like", value, "billzip");
            return (Criteria) this;
        }

        public Criteria andBillzipNotLike(String value) {
            addCriterion("BILLZIP not like", value, "billzip");
            return (Criteria) this;
        }

        public Criteria andBillzipIn(List<String> values) {
            addCriterion("BILLZIP in", values, "billzip");
            return (Criteria) this;
        }

        public Criteria andBillzipNotIn(List<String> values) {
            addCriterion("BILLZIP not in", values, "billzip");
            return (Criteria) this;
        }

        public Criteria andBillzipBetween(String value1, String value2) {
            addCriterion("BILLZIP between", value1, value2, "billzip");
            return (Criteria) this;
        }

        public Criteria andBillzipNotBetween(String value1, String value2) {
            addCriterion("BILLZIP not between", value1, value2, "billzip");
            return (Criteria) this;
        }

        public Criteria andSiteidIsNull() {
            addCriterion("SITEID is null");
            return (Criteria) this;
        }

        public Criteria andSiteidIsNotNull() {
            addCriterion("SITEID is not null");
            return (Criteria) this;
        }

        public Criteria andSiteidEqualTo(String value) {
            addCriterion("SITEID =", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidNotEqualTo(String value) {
            addCriterion("SITEID <>", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidGreaterThan(String value) {
            addCriterion("SITEID >", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidGreaterThanOrEqualTo(String value) {
            addCriterion("SITEID >=", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidLessThan(String value) {
            addCriterion("SITEID <", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidLessThanOrEqualTo(String value) {
            addCriterion("SITEID <=", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidLike(String value) {
            addCriterion("SITEID like", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidNotLike(String value) {
            addCriterion("SITEID not like", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidIn(List<String> values) {
            addCriterion("SITEID in", values, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidNotIn(List<String> values) {
            addCriterion("SITEID not in", values, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidBetween(String value1, String value2) {
            addCriterion("SITEID between", value1, value2, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidNotBetween(String value1, String value2) {
            addCriterion("SITEID not between", value1, value2, "siteid");
            return (Criteria) this;
        }

        public Criteria andCurrcodeIsNull() {
            addCriterion("CURRCODE is null");
            return (Criteria) this;
        }

        public Criteria andCurrcodeIsNotNull() {
            addCriterion("CURRCODE is not null");
            return (Criteria) this;
        }

        public Criteria andCurrcodeEqualTo(String value) {
            addCriterion("CURRCODE =", value, "currcode");
            return (Criteria) this;
        }

        public Criteria andCurrcodeNotEqualTo(String value) {
            addCriterion("CURRCODE <>", value, "currcode");
            return (Criteria) this;
        }

        public Criteria andCurrcodeGreaterThan(String value) {
            addCriterion("CURRCODE >", value, "currcode");
            return (Criteria) this;
        }

        public Criteria andCurrcodeGreaterThanOrEqualTo(String value) {
            addCriterion("CURRCODE >=", value, "currcode");
            return (Criteria) this;
        }

        public Criteria andCurrcodeLessThan(String value) {
            addCriterion("CURRCODE <", value, "currcode");
            return (Criteria) this;
        }

        public Criteria andCurrcodeLessThanOrEqualTo(String value) {
            addCriterion("CURRCODE <=", value, "currcode");
            return (Criteria) this;
        }

        public Criteria andCurrcodeLike(String value) {
            addCriterion("CURRCODE like", value, "currcode");
            return (Criteria) this;
        }

        public Criteria andCurrcodeNotLike(String value) {
            addCriterion("CURRCODE not like", value, "currcode");
            return (Criteria) this;
        }

        public Criteria andCurrcodeIn(List<String> values) {
            addCriterion("CURRCODE in", values, "currcode");
            return (Criteria) this;
        }

        public Criteria andCurrcodeNotIn(List<String> values) {
            addCriterion("CURRCODE not in", values, "currcode");
            return (Criteria) this;
        }

        public Criteria andCurrcodeBetween(String value1, String value2) {
            addCriterion("CURRCODE between", value1, value2, "currcode");
            return (Criteria) this;
        }

        public Criteria andCurrcodeNotBetween(String value1, String value2) {
            addCriterion("CURRCODE not between", value1, value2, "currcode");
            return (Criteria) this;
        }

        public Criteria andTotalIsNull() {
            addCriterion("TOTAL is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsNotNull() {
            addCriterion("TOTAL is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEqualTo(BigDecimal value) {
            addCriterion("TOTAL =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(BigDecimal value) {
            addCriterion("TOTAL <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(BigDecimal value) {
            addCriterion("TOTAL >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(BigDecimal value) {
            addCriterion("TOTAL <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<BigDecimal> values) {
            addCriterion("TOTAL in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<BigDecimal> values) {
            addCriterion("TOTAL not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL not between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("TYPE like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("TYPE not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("TYPE not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andPrntdateIsNull() {
            addCriterion("PRNTDATE is null");
            return (Criteria) this;
        }

        public Criteria andPrntdateIsNotNull() {
            addCriterion("PRNTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andPrntdateEqualTo(Date value) {
            addCriterion("PRNTDATE =", value, "prntdate");
            return (Criteria) this;
        }

        public Criteria andPrntdateNotEqualTo(Date value) {
            addCriterion("PRNTDATE <>", value, "prntdate");
            return (Criteria) this;
        }

        public Criteria andPrntdateGreaterThan(Date value) {
            addCriterion("PRNTDATE >", value, "prntdate");
            return (Criteria) this;
        }

        public Criteria andPrntdateGreaterThanOrEqualTo(Date value) {
            addCriterion("PRNTDATE >=", value, "prntdate");
            return (Criteria) this;
        }

        public Criteria andPrntdateLessThan(Date value) {
            addCriterion("PRNTDATE <", value, "prntdate");
            return (Criteria) this;
        }

        public Criteria andPrntdateLessThanOrEqualTo(Date value) {
            addCriterion("PRNTDATE <=", value, "prntdate");
            return (Criteria) this;
        }

        public Criteria andPrntdateIn(List<Date> values) {
            addCriterion("PRNTDATE in", values, "prntdate");
            return (Criteria) this;
        }

        public Criteria andPrntdateNotIn(List<Date> values) {
            addCriterion("PRNTDATE not in", values, "prntdate");
            return (Criteria) this;
        }

        public Criteria andPrntdateBetween(Date value1, Date value2) {
            addCriterion("PRNTDATE between", value1, value2, "prntdate");
            return (Criteria) this;
        }

        public Criteria andPrntdateNotBetween(Date value1, Date value2) {
            addCriterion("PRNTDATE not between", value1, value2, "prntdate");
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

        public Criteria andInvoiceIsNull() {
            addCriterion("INVOICE is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceIsNotNull() {
            addCriterion("INVOICE is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceEqualTo(String value) {
            addCriterion("INVOICE =", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotEqualTo(String value) {
            addCriterion("INVOICE <>", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceGreaterThan(String value) {
            addCriterion("INVOICE >", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE >=", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceLessThan(String value) {
            addCriterion("INVOICE <", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceLessThanOrEqualTo(String value) {
            addCriterion("INVOICE <=", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceLike(String value) {
            addCriterion("INVOICE like", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotLike(String value) {
            addCriterion("INVOICE not like", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceIn(List<String> values) {
            addCriterion("INVOICE in", values, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotIn(List<String> values) {
            addCriterion("INVOICE not in", values, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceBetween(String value1, String value2) {
            addCriterion("INVOICE between", value1, value2, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotBetween(String value1, String value2) {
            addCriterion("INVOICE not between", value1, value2, "invoice");
            return (Criteria) this;
        }

        public Criteria andRefponumIsNull() {
            addCriterion("REFPONUM is null");
            return (Criteria) this;
        }

        public Criteria andRefponumIsNotNull() {
            addCriterion("REFPONUM is not null");
            return (Criteria) this;
        }

        public Criteria andRefponumEqualTo(String value) {
            addCriterion("REFPONUM =", value, "refponum");
            return (Criteria) this;
        }

        public Criteria andRefponumNotEqualTo(String value) {
            addCriterion("REFPONUM <>", value, "refponum");
            return (Criteria) this;
        }

        public Criteria andRefponumGreaterThan(String value) {
            addCriterion("REFPONUM >", value, "refponum");
            return (Criteria) this;
        }

        public Criteria andRefponumGreaterThanOrEqualTo(String value) {
            addCriterion("REFPONUM >=", value, "refponum");
            return (Criteria) this;
        }

        public Criteria andRefponumLessThan(String value) {
            addCriterion("REFPONUM <", value, "refponum");
            return (Criteria) this;
        }

        public Criteria andRefponumLessThanOrEqualTo(String value) {
            addCriterion("REFPONUM <=", value, "refponum");
            return (Criteria) this;
        }

        public Criteria andRefponumLike(String value) {
            addCriterion("REFPONUM like", value, "refponum");
            return (Criteria) this;
        }

        public Criteria andRefponumNotLike(String value) {
            addCriterion("REFPONUM not like", value, "refponum");
            return (Criteria) this;
        }

        public Criteria andRefponumIn(List<String> values) {
            addCriterion("REFPONUM in", values, "refponum");
            return (Criteria) this;
        }

        public Criteria andRefponumNotIn(List<String> values) {
            addCriterion("REFPONUM not in", values, "refponum");
            return (Criteria) this;
        }

        public Criteria andRefponumBetween(String value1, String value2) {
            addCriterion("REFPONUM between", value1, value2, "refponum");
            return (Criteria) this;
        }

        public Criteria andRefponumNotBetween(String value1, String value2) {
            addCriterion("REFPONUM not between", value1, value2, "refponum");
            return (Criteria) this;
        }

        public Criteria andInternalIsNull() {
            addCriterion("INTERNAL is null");
            return (Criteria) this;
        }

        public Criteria andInternalIsNotNull() {
            addCriterion("INTERNAL is not null");
            return (Criteria) this;
        }

        public Criteria andInternalEqualTo(String value) {
            addCriterion("INTERNAL =", value, "internal");
            return (Criteria) this;
        }

        public Criteria andInternalNotEqualTo(String value) {
            addCriterion("INTERNAL <>", value, "internal");
            return (Criteria) this;
        }

        public Criteria andInternalGreaterThan(String value) {
            addCriterion("INTERNAL >", value, "internal");
            return (Criteria) this;
        }

        public Criteria andInternalGreaterThanOrEqualTo(String value) {
            addCriterion("INTERNAL >=", value, "internal");
            return (Criteria) this;
        }

        public Criteria andInternalLessThan(String value) {
            addCriterion("INTERNAL <", value, "internal");
            return (Criteria) this;
        }

        public Criteria andInternalLessThanOrEqualTo(String value) {
            addCriterion("INTERNAL <=", value, "internal");
            return (Criteria) this;
        }

        public Criteria andInternalLike(String value) {
            addCriterion("INTERNAL like", value, "internal");
            return (Criteria) this;
        }

        public Criteria andInternalNotLike(String value) {
            addCriterion("INTERNAL not like", value, "internal");
            return (Criteria) this;
        }

        public Criteria andInternalIn(List<String> values) {
            addCriterion("INTERNAL in", values, "internal");
            return (Criteria) this;
        }

        public Criteria andInternalNotIn(List<String> values) {
            addCriterion("INTERNAL not in", values, "internal");
            return (Criteria) this;
        }

        public Criteria andInternalBetween(String value1, String value2) {
            addCriterion("INTERNAL between", value1, value2, "internal");
            return (Criteria) this;
        }

        public Criteria andInternalNotBetween(String value1, String value2) {
            addCriterion("INTERNAL not between", value1, value2, "internal");
            return (Criteria) this;
        }

        public Criteria andShipcostIsNull() {
            addCriterion("SHIPCOST is null");
            return (Criteria) this;
        }

        public Criteria andShipcostIsNotNull() {
            addCriterion("SHIPCOST is not null");
            return (Criteria) this;
        }

        public Criteria andShipcostEqualTo(BigDecimal value) {
            addCriterion("SHIPCOST =", value, "shipcost");
            return (Criteria) this;
        }

        public Criteria andShipcostNotEqualTo(BigDecimal value) {
            addCriterion("SHIPCOST <>", value, "shipcost");
            return (Criteria) this;
        }

        public Criteria andShipcostGreaterThan(BigDecimal value) {
            addCriterion("SHIPCOST >", value, "shipcost");
            return (Criteria) this;
        }

        public Criteria andShipcostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SHIPCOST >=", value, "shipcost");
            return (Criteria) this;
        }

        public Criteria andShipcostLessThan(BigDecimal value) {
            addCriterion("SHIPCOST <", value, "shipcost");
            return (Criteria) this;
        }

        public Criteria andShipcostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SHIPCOST <=", value, "shipcost");
            return (Criteria) this;
        }

        public Criteria andShipcostIn(List<BigDecimal> values) {
            addCriterion("SHIPCOST in", values, "shipcost");
            return (Criteria) this;
        }

        public Criteria andShipcostNotIn(List<BigDecimal> values) {
            addCriterion("SHIPCOST not in", values, "shipcost");
            return (Criteria) this;
        }

        public Criteria andShipcostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHIPCOST between", value1, value2, "shipcost");
            return (Criteria) this;
        }

        public Criteria andShipcostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHIPCOST not between", value1, value2, "shipcost");
            return (Criteria) this;
        }

        public Criteria andFreightIsNull() {
            addCriterion("FREIGHT is null");
            return (Criteria) this;
        }

        public Criteria andFreightIsNotNull() {
            addCriterion("FREIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andFreightEqualTo(String value) {
            addCriterion("FREIGHT =", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightNotEqualTo(String value) {
            addCriterion("FREIGHT <>", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightGreaterThan(String value) {
            addCriterion("FREIGHT >", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightGreaterThanOrEqualTo(String value) {
            addCriterion("FREIGHT >=", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightLessThan(String value) {
            addCriterion("FREIGHT <", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightLessThanOrEqualTo(String value) {
            addCriterion("FREIGHT <=", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightLike(String value) {
            addCriterion("FREIGHT like", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightNotLike(String value) {
            addCriterion("FREIGHT not like", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightIn(List<String> values) {
            addCriterion("FREIGHT in", values, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightNotIn(List<String> values) {
            addCriterion("FREIGHT not in", values, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightBetween(String value1, String value2) {
            addCriterion("FREIGHT between", value1, value2, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightNotBetween(String value1, String value2) {
            addCriterion("FREIGHT not between", value1, value2, "freight");
            return (Criteria) this;
        }

        public Criteria andBlktponumIsNull() {
            addCriterion("BLKTPONUM is null");
            return (Criteria) this;
        }

        public Criteria andBlktponumIsNotNull() {
            addCriterion("BLKTPONUM is not null");
            return (Criteria) this;
        }

        public Criteria andBlktponumEqualTo(String value) {
            addCriterion("BLKTPONUM =", value, "blktponum");
            return (Criteria) this;
        }

        public Criteria andBlktponumNotEqualTo(String value) {
            addCriterion("BLKTPONUM <>", value, "blktponum");
            return (Criteria) this;
        }

        public Criteria andBlktponumGreaterThan(String value) {
            addCriterion("BLKTPONUM >", value, "blktponum");
            return (Criteria) this;
        }

        public Criteria andBlktponumGreaterThanOrEqualTo(String value) {
            addCriterion("BLKTPONUM >=", value, "blktponum");
            return (Criteria) this;
        }

        public Criteria andBlktponumLessThan(String value) {
            addCriterion("BLKTPONUM <", value, "blktponum");
            return (Criteria) this;
        }

        public Criteria andBlktponumLessThanOrEqualTo(String value) {
            addCriterion("BLKTPONUM <=", value, "blktponum");
            return (Criteria) this;
        }

        public Criteria andBlktponumLike(String value) {
            addCriterion("BLKTPONUM like", value, "blktponum");
            return (Criteria) this;
        }

        public Criteria andBlktponumNotLike(String value) {
            addCriterion("BLKTPONUM not like", value, "blktponum");
            return (Criteria) this;
        }

        public Criteria andBlktponumIn(List<String> values) {
            addCriterion("BLKTPONUM in", values, "blktponum");
            return (Criteria) this;
        }

        public Criteria andBlktponumNotIn(List<String> values) {
            addCriterion("BLKTPONUM not in", values, "blktponum");
            return (Criteria) this;
        }

        public Criteria andBlktponumBetween(String value1, String value2) {
            addCriterion("BLKTPONUM between", value1, value2, "blktponum");
            return (Criteria) this;
        }

        public Criteria andBlktponumNotBetween(String value1, String value2) {
            addCriterion("BLKTPONUM not between", value1, value2, "blktponum");
            return (Criteria) this;
        }

        public Criteria andCrosssiteIsNull() {
            addCriterion("CROSSSITE is null");
            return (Criteria) this;
        }

        public Criteria andCrosssiteIsNotNull() {
            addCriterion("CROSSSITE is not null");
            return (Criteria) this;
        }

        public Criteria andCrosssiteEqualTo(String value) {
            addCriterion("CROSSSITE =", value, "crosssite");
            return (Criteria) this;
        }

        public Criteria andCrosssiteNotEqualTo(String value) {
            addCriterion("CROSSSITE <>", value, "crosssite");
            return (Criteria) this;
        }

        public Criteria andCrosssiteGreaterThan(String value) {
            addCriterion("CROSSSITE >", value, "crosssite");
            return (Criteria) this;
        }

        public Criteria andCrosssiteGreaterThanOrEqualTo(String value) {
            addCriterion("CROSSSITE >=", value, "crosssite");
            return (Criteria) this;
        }

        public Criteria andCrosssiteLessThan(String value) {
            addCriterion("CROSSSITE <", value, "crosssite");
            return (Criteria) this;
        }

        public Criteria andCrosssiteLessThanOrEqualTo(String value) {
            addCriterion("CROSSSITE <=", value, "crosssite");
            return (Criteria) this;
        }

        public Criteria andCrosssiteLike(String value) {
            addCriterion("CROSSSITE like", value, "crosssite");
            return (Criteria) this;
        }

        public Criteria andCrosssiteNotLike(String value) {
            addCriterion("CROSSSITE not like", value, "crosssite");
            return (Criteria) this;
        }

        public Criteria andCrosssiteIn(List<String> values) {
            addCriterion("CROSSSITE in", values, "crosssite");
            return (Criteria) this;
        }

        public Criteria andCrosssiteNotIn(List<String> values) {
            addCriterion("CROSSSITE not in", values, "crosssite");
            return (Criteria) this;
        }

        public Criteria andCrosssiteBetween(String value1, String value2) {
            addCriterion("CROSSSITE between", value1, value2, "crosssite");
            return (Criteria) this;
        }

        public Criteria andCrosssiteNotBetween(String value1, String value2) {
            addCriterion("CROSSSITE not between", value1, value2, "crosssite");
            return (Criteria) this;
        }

        public Criteria andAllocodeIsNull() {
            addCriterion("ALLOCODE is null");
            return (Criteria) this;
        }

        public Criteria andAllocodeIsNotNull() {
            addCriterion("ALLOCODE is not null");
            return (Criteria) this;
        }

        public Criteria andAllocodeEqualTo(String value) {
            addCriterion("ALLOCODE =", value, "allocode");
            return (Criteria) this;
        }

        public Criteria andAllocodeNotEqualTo(String value) {
            addCriterion("ALLOCODE <>", value, "allocode");
            return (Criteria) this;
        }

        public Criteria andAllocodeGreaterThan(String value) {
            addCriterion("ALLOCODE >", value, "allocode");
            return (Criteria) this;
        }

        public Criteria andAllocodeGreaterThanOrEqualTo(String value) {
            addCriterion("ALLOCODE >=", value, "allocode");
            return (Criteria) this;
        }

        public Criteria andAllocodeLessThan(String value) {
            addCriterion("ALLOCODE <", value, "allocode");
            return (Criteria) this;
        }

        public Criteria andAllocodeLessThanOrEqualTo(String value) {
            addCriterion("ALLOCODE <=", value, "allocode");
            return (Criteria) this;
        }

        public Criteria andAllocodeLike(String value) {
            addCriterion("ALLOCODE like", value, "allocode");
            return (Criteria) this;
        }

        public Criteria andAllocodeNotLike(String value) {
            addCriterion("ALLOCODE not like", value, "allocode");
            return (Criteria) this;
        }

        public Criteria andAllocodeIn(List<String> values) {
            addCriterion("ALLOCODE in", values, "allocode");
            return (Criteria) this;
        }

        public Criteria andAllocodeNotIn(List<String> values) {
            addCriterion("ALLOCODE not in", values, "allocode");
            return (Criteria) this;
        }

        public Criteria andAllocodeBetween(String value1, String value2) {
            addCriterion("ALLOCODE between", value1, value2, "allocode");
            return (Criteria) this;
        }

        public Criteria andAllocodeNotBetween(String value1, String value2) {
            addCriterion("ALLOCODE not between", value1, value2, "allocode");
            return (Criteria) this;
        }

        public Criteria andOutsidebudIsNull() {
            addCriterion("OUTSIDEBUD is null");
            return (Criteria) this;
        }

        public Criteria andOutsidebudIsNotNull() {
            addCriterion("OUTSIDEBUD is not null");
            return (Criteria) this;
        }

        public Criteria andOutsidebudEqualTo(String value) {
            addCriterion("OUTSIDEBUD =", value, "outsidebud");
            return (Criteria) this;
        }

        public Criteria andOutsidebudNotEqualTo(String value) {
            addCriterion("OUTSIDEBUD <>", value, "outsidebud");
            return (Criteria) this;
        }

        public Criteria andOutsidebudGreaterThan(String value) {
            addCriterion("OUTSIDEBUD >", value, "outsidebud");
            return (Criteria) this;
        }

        public Criteria andOutsidebudGreaterThanOrEqualTo(String value) {
            addCriterion("OUTSIDEBUD >=", value, "outsidebud");
            return (Criteria) this;
        }

        public Criteria andOutsidebudLessThan(String value) {
            addCriterion("OUTSIDEBUD <", value, "outsidebud");
            return (Criteria) this;
        }

        public Criteria andOutsidebudLessThanOrEqualTo(String value) {
            addCriterion("OUTSIDEBUD <=", value, "outsidebud");
            return (Criteria) this;
        }

        public Criteria andOutsidebudLike(String value) {
            addCriterion("OUTSIDEBUD like", value, "outsidebud");
            return (Criteria) this;
        }

        public Criteria andOutsidebudNotLike(String value) {
            addCriterion("OUTSIDEBUD not like", value, "outsidebud");
            return (Criteria) this;
        }

        public Criteria andOutsidebudIn(List<String> values) {
            addCriterion("OUTSIDEBUD in", values, "outsidebud");
            return (Criteria) this;
        }

        public Criteria andOutsidebudNotIn(List<String> values) {
            addCriterion("OUTSIDEBUD not in", values, "outsidebud");
            return (Criteria) this;
        }

        public Criteria andOutsidebudBetween(String value1, String value2) {
            addCriterion("OUTSIDEBUD between", value1, value2, "outsidebud");
            return (Criteria) this;
        }

        public Criteria andOutsidebudNotBetween(String value1, String value2) {
            addCriterion("OUTSIDEBUD not between", value1, value2, "outsidebud");
            return (Criteria) this;
        }

        public Criteria andEstexppedIsNull() {
            addCriterion("ESTEXPPED is null");
            return (Criteria) this;
        }

        public Criteria andEstexppedIsNotNull() {
            addCriterion("ESTEXPPED is not null");
            return (Criteria) this;
        }

        public Criteria andEstexppedEqualTo(String value) {
            addCriterion("ESTEXPPED =", value, "estexpped");
            return (Criteria) this;
        }

        public Criteria andEstexppedNotEqualTo(String value) {
            addCriterion("ESTEXPPED <>", value, "estexpped");
            return (Criteria) this;
        }

        public Criteria andEstexppedGreaterThan(String value) {
            addCriterion("ESTEXPPED >", value, "estexpped");
            return (Criteria) this;
        }

        public Criteria andEstexppedGreaterThanOrEqualTo(String value) {
            addCriterion("ESTEXPPED >=", value, "estexpped");
            return (Criteria) this;
        }

        public Criteria andEstexppedLessThan(String value) {
            addCriterion("ESTEXPPED <", value, "estexpped");
            return (Criteria) this;
        }

        public Criteria andEstexppedLessThanOrEqualTo(String value) {
            addCriterion("ESTEXPPED <=", value, "estexpped");
            return (Criteria) this;
        }

        public Criteria andEstexppedLike(String value) {
            addCriterion("ESTEXPPED like", value, "estexpped");
            return (Criteria) this;
        }

        public Criteria andEstexppedNotLike(String value) {
            addCriterion("ESTEXPPED not like", value, "estexpped");
            return (Criteria) this;
        }

        public Criteria andEstexppedIn(List<String> values) {
            addCriterion("ESTEXPPED in", values, "estexpped");
            return (Criteria) this;
        }

        public Criteria andEstexppedNotIn(List<String> values) {
            addCriterion("ESTEXPPED not in", values, "estexpped");
            return (Criteria) this;
        }

        public Criteria andEstexppedBetween(String value1, String value2) {
            addCriterion("ESTEXPPED between", value1, value2, "estexpped");
            return (Criteria) this;
        }

        public Criteria andEstexppedNotBetween(String value1, String value2) {
            addCriterion("ESTEXPPED not between", value1, value2, "estexpped");
            return (Criteria) this;
        }

        public Criteria andExpctrlflagIsNull() {
            addCriterion("EXPCTRLFLAG is null");
            return (Criteria) this;
        }

        public Criteria andExpctrlflagIsNotNull() {
            addCriterion("EXPCTRLFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andExpctrlflagEqualTo(String value) {
            addCriterion("EXPCTRLFLAG =", value, "expctrlflag");
            return (Criteria) this;
        }

        public Criteria andExpctrlflagNotEqualTo(String value) {
            addCriterion("EXPCTRLFLAG <>", value, "expctrlflag");
            return (Criteria) this;
        }

        public Criteria andExpctrlflagGreaterThan(String value) {
            addCriterion("EXPCTRLFLAG >", value, "expctrlflag");
            return (Criteria) this;
        }

        public Criteria andExpctrlflagGreaterThanOrEqualTo(String value) {
            addCriterion("EXPCTRLFLAG >=", value, "expctrlflag");
            return (Criteria) this;
        }

        public Criteria andExpctrlflagLessThan(String value) {
            addCriterion("EXPCTRLFLAG <", value, "expctrlflag");
            return (Criteria) this;
        }

        public Criteria andExpctrlflagLessThanOrEqualTo(String value) {
            addCriterion("EXPCTRLFLAG <=", value, "expctrlflag");
            return (Criteria) this;
        }

        public Criteria andExpctrlflagLike(String value) {
            addCriterion("EXPCTRLFLAG like", value, "expctrlflag");
            return (Criteria) this;
        }

        public Criteria andExpctrlflagNotLike(String value) {
            addCriterion("EXPCTRLFLAG not like", value, "expctrlflag");
            return (Criteria) this;
        }

        public Criteria andExpctrlflagIn(List<String> values) {
            addCriterion("EXPCTRLFLAG in", values, "expctrlflag");
            return (Criteria) this;
        }

        public Criteria andExpctrlflagNotIn(List<String> values) {
            addCriterion("EXPCTRLFLAG not in", values, "expctrlflag");
            return (Criteria) this;
        }

        public Criteria andExpctrlflagBetween(String value1, String value2) {
            addCriterion("EXPCTRLFLAG between", value1, value2, "expctrlflag");
            return (Criteria) this;
        }

        public Criteria andExpctrlflagNotBetween(String value1, String value2) {
            addCriterion("EXPCTRLFLAG not between", value1, value2, "expctrlflag");
            return (Criteria) this;
        }

        public Criteria andStdateIsNull() {
            addCriterion("STDATE is null");
            return (Criteria) this;
        }

        public Criteria andStdateIsNotNull() {
            addCriterion("STDATE is not null");
            return (Criteria) this;
        }

        public Criteria andStdateEqualTo(Date value) {
            addCriterion("STDATE =", value, "stdate");
            return (Criteria) this;
        }

        public Criteria andStdateNotEqualTo(Date value) {
            addCriterion("STDATE <>", value, "stdate");
            return (Criteria) this;
        }

        public Criteria andStdateGreaterThan(Date value) {
            addCriterion("STDATE >", value, "stdate");
            return (Criteria) this;
        }

        public Criteria andStdateGreaterThanOrEqualTo(Date value) {
            addCriterion("STDATE >=", value, "stdate");
            return (Criteria) this;
        }

        public Criteria andStdateLessThan(Date value) {
            addCriterion("STDATE <", value, "stdate");
            return (Criteria) this;
        }

        public Criteria andStdateLessThanOrEqualTo(Date value) {
            addCriterion("STDATE <=", value, "stdate");
            return (Criteria) this;
        }

        public Criteria andStdateIn(List<Date> values) {
            addCriterion("STDATE in", values, "stdate");
            return (Criteria) this;
        }

        public Criteria andStdateNotIn(List<Date> values) {
            addCriterion("STDATE not in", values, "stdate");
            return (Criteria) this;
        }

        public Criteria andStdateBetween(Date value1, Date value2) {
            addCriterion("STDATE between", value1, value2, "stdate");
            return (Criteria) this;
        }

        public Criteria andStdateNotBetween(Date value1, Date value2) {
            addCriterion("STDATE not between", value1, value2, "stdate");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNull() {
            addCriterion("ENDDATE is null");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNotNull() {
            addCriterion("ENDDATE is not null");
            return (Criteria) this;
        }

        public Criteria andEnddateEqualTo(Date value) {
            addCriterion("ENDDATE =", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotEqualTo(Date value) {
            addCriterion("ENDDATE <>", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThan(Date value) {
            addCriterion("ENDDATE >", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThanOrEqualTo(Date value) {
            addCriterion("ENDDATE >=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThan(Date value) {
            addCriterion("ENDDATE <", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThanOrEqualTo(Date value) {
            addCriterion("ENDDATE <=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateIn(List<Date> values) {
            addCriterion("ENDDATE in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotIn(List<Date> values) {
            addCriterion("ENDDATE not in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateBetween(Date value1, Date value2) {
            addCriterion("ENDDATE between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotBetween(Date value1, Date value2) {
            addCriterion("ENDDATE not between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andRechargeIsNull() {
            addCriterion("RECHARGE is null");
            return (Criteria) this;
        }

        public Criteria andRechargeIsNotNull() {
            addCriterion("RECHARGE is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeEqualTo(String value) {
            addCriterion("RECHARGE =", value, "recharge");
            return (Criteria) this;
        }

        public Criteria andRechargeNotEqualTo(String value) {
            addCriterion("RECHARGE <>", value, "recharge");
            return (Criteria) this;
        }

        public Criteria andRechargeGreaterThan(String value) {
            addCriterion("RECHARGE >", value, "recharge");
            return (Criteria) this;
        }

        public Criteria andRechargeGreaterThanOrEqualTo(String value) {
            addCriterion("RECHARGE >=", value, "recharge");
            return (Criteria) this;
        }

        public Criteria andRechargeLessThan(String value) {
            addCriterion("RECHARGE <", value, "recharge");
            return (Criteria) this;
        }

        public Criteria andRechargeLessThanOrEqualTo(String value) {
            addCriterion("RECHARGE <=", value, "recharge");
            return (Criteria) this;
        }

        public Criteria andRechargeLike(String value) {
            addCriterion("RECHARGE like", value, "recharge");
            return (Criteria) this;
        }

        public Criteria andRechargeNotLike(String value) {
            addCriterion("RECHARGE not like", value, "recharge");
            return (Criteria) this;
        }

        public Criteria andRechargeIn(List<String> values) {
            addCriterion("RECHARGE in", values, "recharge");
            return (Criteria) this;
        }

        public Criteria andRechargeNotIn(List<String> values) {
            addCriterion("RECHARGE not in", values, "recharge");
            return (Criteria) this;
        }

        public Criteria andRechargeBetween(String value1, String value2) {
            addCriterion("RECHARGE between", value1, value2, "recharge");
            return (Criteria) this;
        }

        public Criteria andRechargeNotBetween(String value1, String value2) {
            addCriterion("RECHARGE not between", value1, value2, "recharge");
            return (Criteria) this;
        }

        public Criteria andVoidbyIsNull() {
            addCriterion("VOIDBY is null");
            return (Criteria) this;
        }

        public Criteria andVoidbyIsNotNull() {
            addCriterion("VOIDBY is not null");
            return (Criteria) this;
        }

        public Criteria andVoidbyEqualTo(String value) {
            addCriterion("VOIDBY =", value, "voidby");
            return (Criteria) this;
        }

        public Criteria andVoidbyNotEqualTo(String value) {
            addCriterion("VOIDBY <>", value, "voidby");
            return (Criteria) this;
        }

        public Criteria andVoidbyGreaterThan(String value) {
            addCriterion("VOIDBY >", value, "voidby");
            return (Criteria) this;
        }

        public Criteria andVoidbyGreaterThanOrEqualTo(String value) {
            addCriterion("VOIDBY >=", value, "voidby");
            return (Criteria) this;
        }

        public Criteria andVoidbyLessThan(String value) {
            addCriterion("VOIDBY <", value, "voidby");
            return (Criteria) this;
        }

        public Criteria andVoidbyLessThanOrEqualTo(String value) {
            addCriterion("VOIDBY <=", value, "voidby");
            return (Criteria) this;
        }

        public Criteria andVoidbyLike(String value) {
            addCriterion("VOIDBY like", value, "voidby");
            return (Criteria) this;
        }

        public Criteria andVoidbyNotLike(String value) {
            addCriterion("VOIDBY not like", value, "voidby");
            return (Criteria) this;
        }

        public Criteria andVoidbyIn(List<String> values) {
            addCriterion("VOIDBY in", values, "voidby");
            return (Criteria) this;
        }

        public Criteria andVoidbyNotIn(List<String> values) {
            addCriterion("VOIDBY not in", values, "voidby");
            return (Criteria) this;
        }

        public Criteria andVoidbyBetween(String value1, String value2) {
            addCriterion("VOIDBY between", value1, value2, "voidby");
            return (Criteria) this;
        }

        public Criteria andVoidbyNotBetween(String value1, String value2) {
            addCriterion("VOIDBY not between", value1, value2, "voidby");
            return (Criteria) this;
        }

        public Criteria andVoiddateIsNull() {
            addCriterion("VOIDDATE is null");
            return (Criteria) this;
        }

        public Criteria andVoiddateIsNotNull() {
            addCriterion("VOIDDATE is not null");
            return (Criteria) this;
        }

        public Criteria andVoiddateEqualTo(Date value) {
            addCriterion("VOIDDATE =", value, "voiddate");
            return (Criteria) this;
        }

        public Criteria andVoiddateNotEqualTo(Date value) {
            addCriterion("VOIDDATE <>", value, "voiddate");
            return (Criteria) this;
        }

        public Criteria andVoiddateGreaterThan(Date value) {
            addCriterion("VOIDDATE >", value, "voiddate");
            return (Criteria) this;
        }

        public Criteria andVoiddateGreaterThanOrEqualTo(Date value) {
            addCriterion("VOIDDATE >=", value, "voiddate");
            return (Criteria) this;
        }

        public Criteria andVoiddateLessThan(Date value) {
            addCriterion("VOIDDATE <", value, "voiddate");
            return (Criteria) this;
        }

        public Criteria andVoiddateLessThanOrEqualTo(Date value) {
            addCriterion("VOIDDATE <=", value, "voiddate");
            return (Criteria) this;
        }

        public Criteria andVoiddateIn(List<Date> values) {
            addCriterion("VOIDDATE in", values, "voiddate");
            return (Criteria) this;
        }

        public Criteria andVoiddateNotIn(List<Date> values) {
            addCriterion("VOIDDATE not in", values, "voiddate");
            return (Criteria) this;
        }

        public Criteria andVoiddateBetween(Date value1, Date value2) {
            addCriterion("VOIDDATE between", value1, value2, "voiddate");
            return (Criteria) this;
        }

        public Criteria andVoiddateNotBetween(Date value1, Date value2) {
            addCriterion("VOIDDATE not between", value1, value2, "voiddate");
            return (Criteria) this;
        }

        public Criteria andAttachidIsNull() {
            addCriterion("ATTACHID is null");
            return (Criteria) this;
        }

        public Criteria andAttachidIsNotNull() {
            addCriterion("ATTACHID is not null");
            return (Criteria) this;
        }

        public Criteria andAttachidEqualTo(String value) {
            addCriterion("ATTACHID =", value, "attachid");
            return (Criteria) this;
        }

        public Criteria andAttachidNotEqualTo(String value) {
            addCriterion("ATTACHID <>", value, "attachid");
            return (Criteria) this;
        }

        public Criteria andAttachidGreaterThan(String value) {
            addCriterion("ATTACHID >", value, "attachid");
            return (Criteria) this;
        }

        public Criteria andAttachidGreaterThanOrEqualTo(String value) {
            addCriterion("ATTACHID >=", value, "attachid");
            return (Criteria) this;
        }

        public Criteria andAttachidLessThan(String value) {
            addCriterion("ATTACHID <", value, "attachid");
            return (Criteria) this;
        }

        public Criteria andAttachidLessThanOrEqualTo(String value) {
            addCriterion("ATTACHID <=", value, "attachid");
            return (Criteria) this;
        }

        public Criteria andAttachidLike(String value) {
            addCriterion("ATTACHID like", value, "attachid");
            return (Criteria) this;
        }

        public Criteria andAttachidNotLike(String value) {
            addCriterion("ATTACHID not like", value, "attachid");
            return (Criteria) this;
        }

        public Criteria andAttachidIn(List<String> values) {
            addCriterion("ATTACHID in", values, "attachid");
            return (Criteria) this;
        }

        public Criteria andAttachidNotIn(List<String> values) {
            addCriterion("ATTACHID not in", values, "attachid");
            return (Criteria) this;
        }

        public Criteria andAttachidBetween(String value1, String value2) {
            addCriterion("ATTACHID between", value1, value2, "attachid");
            return (Criteria) this;
        }

        public Criteria andAttachidNotBetween(String value1, String value2) {
            addCriterion("ATTACHID not between", value1, value2, "attachid");
            return (Criteria) this;
        }

        public Criteria andBpaybillcodeIsNull() {
            addCriterion("BPAYBILLCODE is null");
            return (Criteria) this;
        }

        public Criteria andBpaybillcodeIsNotNull() {
            addCriterion("BPAYBILLCODE is not null");
            return (Criteria) this;
        }

        public Criteria andBpaybillcodeEqualTo(String value) {
            addCriterion("BPAYBILLCODE =", value, "bpaybillcode");
            return (Criteria) this;
        }

        public Criteria andBpaybillcodeNotEqualTo(String value) {
            addCriterion("BPAYBILLCODE <>", value, "bpaybillcode");
            return (Criteria) this;
        }

        public Criteria andBpaybillcodeGreaterThan(String value) {
            addCriterion("BPAYBILLCODE >", value, "bpaybillcode");
            return (Criteria) this;
        }

        public Criteria andBpaybillcodeGreaterThanOrEqualTo(String value) {
            addCriterion("BPAYBILLCODE >=", value, "bpaybillcode");
            return (Criteria) this;
        }

        public Criteria andBpaybillcodeLessThan(String value) {
            addCriterion("BPAYBILLCODE <", value, "bpaybillcode");
            return (Criteria) this;
        }

        public Criteria andBpaybillcodeLessThanOrEqualTo(String value) {
            addCriterion("BPAYBILLCODE <=", value, "bpaybillcode");
            return (Criteria) this;
        }

        public Criteria andBpaybillcodeLike(String value) {
            addCriterion("BPAYBILLCODE like", value, "bpaybillcode");
            return (Criteria) this;
        }

        public Criteria andBpaybillcodeNotLike(String value) {
            addCriterion("BPAYBILLCODE not like", value, "bpaybillcode");
            return (Criteria) this;
        }

        public Criteria andBpaybillcodeIn(List<String> values) {
            addCriterion("BPAYBILLCODE in", values, "bpaybillcode");
            return (Criteria) this;
        }

        public Criteria andBpaybillcodeNotIn(List<String> values) {
            addCriterion("BPAYBILLCODE not in", values, "bpaybillcode");
            return (Criteria) this;
        }

        public Criteria andBpaybillcodeBetween(String value1, String value2) {
            addCriterion("BPAYBILLCODE between", value1, value2, "bpaybillcode");
            return (Criteria) this;
        }

        public Criteria andBpaybillcodeNotBetween(String value1, String value2) {
            addCriterion("BPAYBILLCODE not between", value1, value2, "bpaybillcode");
            return (Criteria) this;
        }

        public Criteria andBpaycustrefIsNull() {
            addCriterion("BPAYCUSTREF is null");
            return (Criteria) this;
        }

        public Criteria andBpaycustrefIsNotNull() {
            addCriterion("BPAYCUSTREF is not null");
            return (Criteria) this;
        }

        public Criteria andBpaycustrefEqualTo(String value) {
            addCriterion("BPAYCUSTREF =", value, "bpaycustref");
            return (Criteria) this;
        }

        public Criteria andBpaycustrefNotEqualTo(String value) {
            addCriterion("BPAYCUSTREF <>", value, "bpaycustref");
            return (Criteria) this;
        }

        public Criteria andBpaycustrefGreaterThan(String value) {
            addCriterion("BPAYCUSTREF >", value, "bpaycustref");
            return (Criteria) this;
        }

        public Criteria andBpaycustrefGreaterThanOrEqualTo(String value) {
            addCriterion("BPAYCUSTREF >=", value, "bpaycustref");
            return (Criteria) this;
        }

        public Criteria andBpaycustrefLessThan(String value) {
            addCriterion("BPAYCUSTREF <", value, "bpaycustref");
            return (Criteria) this;
        }

        public Criteria andBpaycustrefLessThanOrEqualTo(String value) {
            addCriterion("BPAYCUSTREF <=", value, "bpaycustref");
            return (Criteria) this;
        }

        public Criteria andBpaycustrefLike(String value) {
            addCriterion("BPAYCUSTREF like", value, "bpaycustref");
            return (Criteria) this;
        }

        public Criteria andBpaycustrefNotLike(String value) {
            addCriterion("BPAYCUSTREF not like", value, "bpaycustref");
            return (Criteria) this;
        }

        public Criteria andBpaycustrefIn(List<String> values) {
            addCriterion("BPAYCUSTREF in", values, "bpaycustref");
            return (Criteria) this;
        }

        public Criteria andBpaycustrefNotIn(List<String> values) {
            addCriterion("BPAYCUSTREF not in", values, "bpaycustref");
            return (Criteria) this;
        }

        public Criteria andBpaycustrefBetween(String value1, String value2) {
            addCriterion("BPAYCUSTREF between", value1, value2, "bpaycustref");
            return (Criteria) this;
        }

        public Criteria andBpaycustrefNotBetween(String value1, String value2) {
            addCriterion("BPAYCUSTREF not between", value1, value2, "bpaycustref");
            return (Criteria) this;
        }

        public Criteria andStageIsNull() {
            addCriterion("STAGE is null");
            return (Criteria) this;
        }

        public Criteria andStageIsNotNull() {
            addCriterion("STAGE is not null");
            return (Criteria) this;
        }

        public Criteria andStageEqualTo(String value) {
            addCriterion("STAGE =", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageNotEqualTo(String value) {
            addCriterion("STAGE <>", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageGreaterThan(String value) {
            addCriterion("STAGE >", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageGreaterThanOrEqualTo(String value) {
            addCriterion("STAGE >=", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageLessThan(String value) {
            addCriterion("STAGE <", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageLessThanOrEqualTo(String value) {
            addCriterion("STAGE <=", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageLike(String value) {
            addCriterion("STAGE like", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageNotLike(String value) {
            addCriterion("STAGE not like", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageIn(List<String> values) {
            addCriterion("STAGE in", values, "stage");
            return (Criteria) this;
        }

        public Criteria andStageNotIn(List<String> values) {
            addCriterion("STAGE not in", values, "stage");
            return (Criteria) this;
        }

        public Criteria andStageBetween(String value1, String value2) {
            addCriterion("STAGE between", value1, value2, "stage");
            return (Criteria) this;
        }

        public Criteria andStageNotBetween(String value1, String value2) {
            addCriterion("STAGE not between", value1, value2, "stage");
            return (Criteria) this;
        }

        public Criteria andClaritytransferIsNull() {
            addCriterion("CLARITYTRANSFER is null");
            return (Criteria) this;
        }

        public Criteria andClaritytransferIsNotNull() {
            addCriterion("CLARITYTRANSFER is not null");
            return (Criteria) this;
        }

        public Criteria andClaritytransferEqualTo(String value) {
            addCriterion("CLARITYTRANSFER =", value, "claritytransfer");
            return (Criteria) this;
        }

        public Criteria andClaritytransferNotEqualTo(String value) {
            addCriterion("CLARITYTRANSFER <>", value, "claritytransfer");
            return (Criteria) this;
        }

        public Criteria andClaritytransferGreaterThan(String value) {
            addCriterion("CLARITYTRANSFER >", value, "claritytransfer");
            return (Criteria) this;
        }

        public Criteria andClaritytransferGreaterThanOrEqualTo(String value) {
            addCriterion("CLARITYTRANSFER >=", value, "claritytransfer");
            return (Criteria) this;
        }

        public Criteria andClaritytransferLessThan(String value) {
            addCriterion("CLARITYTRANSFER <", value, "claritytransfer");
            return (Criteria) this;
        }

        public Criteria andClaritytransferLessThanOrEqualTo(String value) {
            addCriterion("CLARITYTRANSFER <=", value, "claritytransfer");
            return (Criteria) this;
        }

        public Criteria andClaritytransferLike(String value) {
            addCriterion("CLARITYTRANSFER like", value, "claritytransfer");
            return (Criteria) this;
        }

        public Criteria andClaritytransferNotLike(String value) {
            addCriterion("CLARITYTRANSFER not like", value, "claritytransfer");
            return (Criteria) this;
        }

        public Criteria andClaritytransferIn(List<String> values) {
            addCriterion("CLARITYTRANSFER in", values, "claritytransfer");
            return (Criteria) this;
        }

        public Criteria andClaritytransferNotIn(List<String> values) {
            addCriterion("CLARITYTRANSFER not in", values, "claritytransfer");
            return (Criteria) this;
        }

        public Criteria andClaritytransferBetween(String value1, String value2) {
            addCriterion("CLARITYTRANSFER between", value1, value2, "claritytransfer");
            return (Criteria) this;
        }

        public Criteria andClaritytransferNotBetween(String value1, String value2) {
            addCriterion("CLARITYTRANSFER not between", value1, value2, "claritytransfer");
            return (Criteria) this;
        }

        public Criteria andClattachidIsNull() {
            addCriterion("CLATTACHID is null");
            return (Criteria) this;
        }

        public Criteria andClattachidIsNotNull() {
            addCriterion("CLATTACHID is not null");
            return (Criteria) this;
        }

        public Criteria andClattachidEqualTo(String value) {
            addCriterion("CLATTACHID =", value, "clattachid");
            return (Criteria) this;
        }

        public Criteria andClattachidNotEqualTo(String value) {
            addCriterion("CLATTACHID <>", value, "clattachid");
            return (Criteria) this;
        }

        public Criteria andClattachidGreaterThan(String value) {
            addCriterion("CLATTACHID >", value, "clattachid");
            return (Criteria) this;
        }

        public Criteria andClattachidGreaterThanOrEqualTo(String value) {
            addCriterion("CLATTACHID >=", value, "clattachid");
            return (Criteria) this;
        }

        public Criteria andClattachidLessThan(String value) {
            addCriterion("CLATTACHID <", value, "clattachid");
            return (Criteria) this;
        }

        public Criteria andClattachidLessThanOrEqualTo(String value) {
            addCriterion("CLATTACHID <=", value, "clattachid");
            return (Criteria) this;
        }

        public Criteria andClattachidLike(String value) {
            addCriterion("CLATTACHID like", value, "clattachid");
            return (Criteria) this;
        }

        public Criteria andClattachidNotLike(String value) {
            addCriterion("CLATTACHID not like", value, "clattachid");
            return (Criteria) this;
        }

        public Criteria andClattachidIn(List<String> values) {
            addCriterion("CLATTACHID in", values, "clattachid");
            return (Criteria) this;
        }

        public Criteria andClattachidNotIn(List<String> values) {
            addCriterion("CLATTACHID not in", values, "clattachid");
            return (Criteria) this;
        }

        public Criteria andClattachidBetween(String value1, String value2) {
            addCriterion("CLATTACHID between", value1, value2, "clattachid");
            return (Criteria) this;
        }

        public Criteria andClattachidNotBetween(String value1, String value2) {
            addCriterion("CLATTACHID not between", value1, value2, "clattachid");
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