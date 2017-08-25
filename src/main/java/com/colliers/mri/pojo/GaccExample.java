package com.colliers.mri.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GaccExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GaccExample() {
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

        public Criteria andAcctnameIsNull() {
            addCriterion("ACCTNAME is null");
            return (Criteria) this;
        }

        public Criteria andAcctnameIsNotNull() {
            addCriterion("ACCTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andAcctnameEqualTo(String value) {
            addCriterion("ACCTNAME =", value, "acctname");
            return (Criteria) this;
        }

        public Criteria andAcctnameNotEqualTo(String value) {
            addCriterion("ACCTNAME <>", value, "acctname");
            return (Criteria) this;
        }

        public Criteria andAcctnameGreaterThan(String value) {
            addCriterion("ACCTNAME >", value, "acctname");
            return (Criteria) this;
        }

        public Criteria andAcctnameGreaterThanOrEqualTo(String value) {
            addCriterion("ACCTNAME >=", value, "acctname");
            return (Criteria) this;
        }

        public Criteria andAcctnameLessThan(String value) {
            addCriterion("ACCTNAME <", value, "acctname");
            return (Criteria) this;
        }

        public Criteria andAcctnameLessThanOrEqualTo(String value) {
            addCriterion("ACCTNAME <=", value, "acctname");
            return (Criteria) this;
        }

        public Criteria andAcctnameLike(String value) {
            addCriterion("ACCTNAME like", value, "acctname");
            return (Criteria) this;
        }

        public Criteria andAcctnameNotLike(String value) {
            addCriterion("ACCTNAME not like", value, "acctname");
            return (Criteria) this;
        }

        public Criteria andAcctnameIn(List<String> values) {
            addCriterion("ACCTNAME in", values, "acctname");
            return (Criteria) this;
        }

        public Criteria andAcctnameNotIn(List<String> values) {
            addCriterion("ACCTNAME not in", values, "acctname");
            return (Criteria) this;
        }

        public Criteria andAcctnameBetween(String value1, String value2) {
            addCriterion("ACCTNAME between", value1, value2, "acctname");
            return (Criteria) this;
        }

        public Criteria andAcctnameNotBetween(String value1, String value2) {
            addCriterion("ACCTNAME not between", value1, value2, "acctname");
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

        public Criteria andM1099acctIsNull() {
            addCriterion("M_1099ACCT is null");
            return (Criteria) this;
        }

        public Criteria andM1099acctIsNotNull() {
            addCriterion("M_1099ACCT is not null");
            return (Criteria) this;
        }

        public Criteria andM1099acctEqualTo(String value) {
            addCriterion("M_1099ACCT =", value, "m1099acct");
            return (Criteria) this;
        }

        public Criteria andM1099acctNotEqualTo(String value) {
            addCriterion("M_1099ACCT <>", value, "m1099acct");
            return (Criteria) this;
        }

        public Criteria andM1099acctGreaterThan(String value) {
            addCriterion("M_1099ACCT >", value, "m1099acct");
            return (Criteria) this;
        }

        public Criteria andM1099acctGreaterThanOrEqualTo(String value) {
            addCriterion("M_1099ACCT >=", value, "m1099acct");
            return (Criteria) this;
        }

        public Criteria andM1099acctLessThan(String value) {
            addCriterion("M_1099ACCT <", value, "m1099acct");
            return (Criteria) this;
        }

        public Criteria andM1099acctLessThanOrEqualTo(String value) {
            addCriterion("M_1099ACCT <=", value, "m1099acct");
            return (Criteria) this;
        }

        public Criteria andM1099acctLike(String value) {
            addCriterion("M_1099ACCT like", value, "m1099acct");
            return (Criteria) this;
        }

        public Criteria andM1099acctNotLike(String value) {
            addCriterion("M_1099ACCT not like", value, "m1099acct");
            return (Criteria) this;
        }

        public Criteria andM1099acctIn(List<String> values) {
            addCriterion("M_1099ACCT in", values, "m1099acct");
            return (Criteria) this;
        }

        public Criteria andM1099acctNotIn(List<String> values) {
            addCriterion("M_1099ACCT not in", values, "m1099acct");
            return (Criteria) this;
        }

        public Criteria andM1099acctBetween(String value1, String value2) {
            addCriterion("M_1099ACCT between", value1, value2, "m1099acct");
            return (Criteria) this;
        }

        public Criteria andM1099acctNotBetween(String value1, String value2) {
            addCriterion("M_1099ACCT not between", value1, value2, "m1099acct");
            return (Criteria) this;
        }

        public Criteria andDprstrIsNull() {
            addCriterion("DPRSTR is null");
            return (Criteria) this;
        }

        public Criteria andDprstrIsNotNull() {
            addCriterion("DPRSTR is not null");
            return (Criteria) this;
        }

        public Criteria andDprstrEqualTo(String value) {
            addCriterion("DPRSTR =", value, "dprstr");
            return (Criteria) this;
        }

        public Criteria andDprstrNotEqualTo(String value) {
            addCriterion("DPRSTR <>", value, "dprstr");
            return (Criteria) this;
        }

        public Criteria andDprstrGreaterThan(String value) {
            addCriterion("DPRSTR >", value, "dprstr");
            return (Criteria) this;
        }

        public Criteria andDprstrGreaterThanOrEqualTo(String value) {
            addCriterion("DPRSTR >=", value, "dprstr");
            return (Criteria) this;
        }

        public Criteria andDprstrLessThan(String value) {
            addCriterion("DPRSTR <", value, "dprstr");
            return (Criteria) this;
        }

        public Criteria andDprstrLessThanOrEqualTo(String value) {
            addCriterion("DPRSTR <=", value, "dprstr");
            return (Criteria) this;
        }

        public Criteria andDprstrLike(String value) {
            addCriterion("DPRSTR like", value, "dprstr");
            return (Criteria) this;
        }

        public Criteria andDprstrNotLike(String value) {
            addCriterion("DPRSTR not like", value, "dprstr");
            return (Criteria) this;
        }

        public Criteria andDprstrIn(List<String> values) {
            addCriterion("DPRSTR in", values, "dprstr");
            return (Criteria) this;
        }

        public Criteria andDprstrNotIn(List<String> values) {
            addCriterion("DPRSTR not in", values, "dprstr");
            return (Criteria) this;
        }

        public Criteria andDprstrBetween(String value1, String value2) {
            addCriterion("DPRSTR between", value1, value2, "dprstr");
            return (Criteria) this;
        }

        public Criteria andDprstrNotBetween(String value1, String value2) {
            addCriterion("DPRSTR not between", value1, value2, "dprstr");
            return (Criteria) this;
        }

        public Criteria andPexchtypeIsNull() {
            addCriterion("PEXCHTYPE is null");
            return (Criteria) this;
        }

        public Criteria andPexchtypeIsNotNull() {
            addCriterion("PEXCHTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPexchtypeEqualTo(String value) {
            addCriterion("PEXCHTYPE =", value, "pexchtype");
            return (Criteria) this;
        }

        public Criteria andPexchtypeNotEqualTo(String value) {
            addCriterion("PEXCHTYPE <>", value, "pexchtype");
            return (Criteria) this;
        }

        public Criteria andPexchtypeGreaterThan(String value) {
            addCriterion("PEXCHTYPE >", value, "pexchtype");
            return (Criteria) this;
        }

        public Criteria andPexchtypeGreaterThanOrEqualTo(String value) {
            addCriterion("PEXCHTYPE >=", value, "pexchtype");
            return (Criteria) this;
        }

        public Criteria andPexchtypeLessThan(String value) {
            addCriterion("PEXCHTYPE <", value, "pexchtype");
            return (Criteria) this;
        }

        public Criteria andPexchtypeLessThanOrEqualTo(String value) {
            addCriterion("PEXCHTYPE <=", value, "pexchtype");
            return (Criteria) this;
        }

        public Criteria andPexchtypeLike(String value) {
            addCriterion("PEXCHTYPE like", value, "pexchtype");
            return (Criteria) this;
        }

        public Criteria andPexchtypeNotLike(String value) {
            addCriterion("PEXCHTYPE not like", value, "pexchtype");
            return (Criteria) this;
        }

        public Criteria andPexchtypeIn(List<String> values) {
            addCriterion("PEXCHTYPE in", values, "pexchtype");
            return (Criteria) this;
        }

        public Criteria andPexchtypeNotIn(List<String> values) {
            addCriterion("PEXCHTYPE not in", values, "pexchtype");
            return (Criteria) this;
        }

        public Criteria andPexchtypeBetween(String value1, String value2) {
            addCriterion("PEXCHTYPE between", value1, value2, "pexchtype");
            return (Criteria) this;
        }

        public Criteria andPexchtypeNotBetween(String value1, String value2) {
            addCriterion("PEXCHTYPE not between", value1, value2, "pexchtype");
            return (Criteria) this;
        }

        public Criteria andOwnertaxIsNull() {
            addCriterion("OWNERTAX is null");
            return (Criteria) this;
        }

        public Criteria andOwnertaxIsNotNull() {
            addCriterion("OWNERTAX is not null");
            return (Criteria) this;
        }

        public Criteria andOwnertaxEqualTo(String value) {
            addCriterion("OWNERTAX =", value, "ownertax");
            return (Criteria) this;
        }

        public Criteria andOwnertaxNotEqualTo(String value) {
            addCriterion("OWNERTAX <>", value, "ownertax");
            return (Criteria) this;
        }

        public Criteria andOwnertaxGreaterThan(String value) {
            addCriterion("OWNERTAX >", value, "ownertax");
            return (Criteria) this;
        }

        public Criteria andOwnertaxGreaterThanOrEqualTo(String value) {
            addCriterion("OWNERTAX >=", value, "ownertax");
            return (Criteria) this;
        }

        public Criteria andOwnertaxLessThan(String value) {
            addCriterion("OWNERTAX <", value, "ownertax");
            return (Criteria) this;
        }

        public Criteria andOwnertaxLessThanOrEqualTo(String value) {
            addCriterion("OWNERTAX <=", value, "ownertax");
            return (Criteria) this;
        }

        public Criteria andOwnertaxLike(String value) {
            addCriterion("OWNERTAX like", value, "ownertax");
            return (Criteria) this;
        }

        public Criteria andOwnertaxNotLike(String value) {
            addCriterion("OWNERTAX not like", value, "ownertax");
            return (Criteria) this;
        }

        public Criteria andOwnertaxIn(List<String> values) {
            addCriterion("OWNERTAX in", values, "ownertax");
            return (Criteria) this;
        }

        public Criteria andOwnertaxNotIn(List<String> values) {
            addCriterion("OWNERTAX not in", values, "ownertax");
            return (Criteria) this;
        }

        public Criteria andOwnertaxBetween(String value1, String value2) {
            addCriterion("OWNERTAX between", value1, value2, "ownertax");
            return (Criteria) this;
        }

        public Criteria andOwnertaxNotBetween(String value1, String value2) {
            addCriterion("OWNERTAX not between", value1, value2, "ownertax");
            return (Criteria) this;
        }

        public Criteria andSubwithIsNull() {
            addCriterion("SUBWITH is null");
            return (Criteria) this;
        }

        public Criteria andSubwithIsNotNull() {
            addCriterion("SUBWITH is not null");
            return (Criteria) this;
        }

        public Criteria andSubwithEqualTo(String value) {
            addCriterion("SUBWITH =", value, "subwith");
            return (Criteria) this;
        }

        public Criteria andSubwithNotEqualTo(String value) {
            addCriterion("SUBWITH <>", value, "subwith");
            return (Criteria) this;
        }

        public Criteria andSubwithGreaterThan(String value) {
            addCriterion("SUBWITH >", value, "subwith");
            return (Criteria) this;
        }

        public Criteria andSubwithGreaterThanOrEqualTo(String value) {
            addCriterion("SUBWITH >=", value, "subwith");
            return (Criteria) this;
        }

        public Criteria andSubwithLessThan(String value) {
            addCriterion("SUBWITH <", value, "subwith");
            return (Criteria) this;
        }

        public Criteria andSubwithLessThanOrEqualTo(String value) {
            addCriterion("SUBWITH <=", value, "subwith");
            return (Criteria) this;
        }

        public Criteria andSubwithLike(String value) {
            addCriterion("SUBWITH like", value, "subwith");
            return (Criteria) this;
        }

        public Criteria andSubwithNotLike(String value) {
            addCriterion("SUBWITH not like", value, "subwith");
            return (Criteria) this;
        }

        public Criteria andSubwithIn(List<String> values) {
            addCriterion("SUBWITH in", values, "subwith");
            return (Criteria) this;
        }

        public Criteria andSubwithNotIn(List<String> values) {
            addCriterion("SUBWITH not in", values, "subwith");
            return (Criteria) this;
        }

        public Criteria andSubwithBetween(String value1, String value2) {
            addCriterion("SUBWITH between", value1, value2, "subwith");
            return (Criteria) this;
        }

        public Criteria andSubwithNotBetween(String value1, String value2) {
            addCriterion("SUBWITH not between", value1, value2, "subwith");
            return (Criteria) this;
        }

        public Criteria andAcctbasisIsNull() {
            addCriterion("ACCTBASIS is null");
            return (Criteria) this;
        }

        public Criteria andAcctbasisIsNotNull() {
            addCriterion("ACCTBASIS is not null");
            return (Criteria) this;
        }

        public Criteria andAcctbasisEqualTo(String value) {
            addCriterion("ACCTBASIS =", value, "acctbasis");
            return (Criteria) this;
        }

        public Criteria andAcctbasisNotEqualTo(String value) {
            addCriterion("ACCTBASIS <>", value, "acctbasis");
            return (Criteria) this;
        }

        public Criteria andAcctbasisGreaterThan(String value) {
            addCriterion("ACCTBASIS >", value, "acctbasis");
            return (Criteria) this;
        }

        public Criteria andAcctbasisGreaterThanOrEqualTo(String value) {
            addCriterion("ACCTBASIS >=", value, "acctbasis");
            return (Criteria) this;
        }

        public Criteria andAcctbasisLessThan(String value) {
            addCriterion("ACCTBASIS <", value, "acctbasis");
            return (Criteria) this;
        }

        public Criteria andAcctbasisLessThanOrEqualTo(String value) {
            addCriterion("ACCTBASIS <=", value, "acctbasis");
            return (Criteria) this;
        }

        public Criteria andAcctbasisLike(String value) {
            addCriterion("ACCTBASIS like", value, "acctbasis");
            return (Criteria) this;
        }

        public Criteria andAcctbasisNotLike(String value) {
            addCriterion("ACCTBASIS not like", value, "acctbasis");
            return (Criteria) this;
        }

        public Criteria andAcctbasisIn(List<String> values) {
            addCriterion("ACCTBASIS in", values, "acctbasis");
            return (Criteria) this;
        }

        public Criteria andAcctbasisNotIn(List<String> values) {
            addCriterion("ACCTBASIS not in", values, "acctbasis");
            return (Criteria) this;
        }

        public Criteria andAcctbasisBetween(String value1, String value2) {
            addCriterion("ACCTBASIS between", value1, value2, "acctbasis");
            return (Criteria) this;
        }

        public Criteria andAcctbasisNotBetween(String value1, String value2) {
            addCriterion("ACCTBASIS not between", value1, value2, "acctbasis");
            return (Criteria) this;
        }

        public Criteria andLegalacctIsNull() {
            addCriterion("LEGALACCT is null");
            return (Criteria) this;
        }

        public Criteria andLegalacctIsNotNull() {
            addCriterion("LEGALACCT is not null");
            return (Criteria) this;
        }

        public Criteria andLegalacctEqualTo(String value) {
            addCriterion("LEGALACCT =", value, "legalacct");
            return (Criteria) this;
        }

        public Criteria andLegalacctNotEqualTo(String value) {
            addCriterion("LEGALACCT <>", value, "legalacct");
            return (Criteria) this;
        }

        public Criteria andLegalacctGreaterThan(String value) {
            addCriterion("LEGALACCT >", value, "legalacct");
            return (Criteria) this;
        }

        public Criteria andLegalacctGreaterThanOrEqualTo(String value) {
            addCriterion("LEGALACCT >=", value, "legalacct");
            return (Criteria) this;
        }

        public Criteria andLegalacctLessThan(String value) {
            addCriterion("LEGALACCT <", value, "legalacct");
            return (Criteria) this;
        }

        public Criteria andLegalacctLessThanOrEqualTo(String value) {
            addCriterion("LEGALACCT <=", value, "legalacct");
            return (Criteria) this;
        }

        public Criteria andLegalacctLike(String value) {
            addCriterion("LEGALACCT like", value, "legalacct");
            return (Criteria) this;
        }

        public Criteria andLegalacctNotLike(String value) {
            addCriterion("LEGALACCT not like", value, "legalacct");
            return (Criteria) this;
        }

        public Criteria andLegalacctIn(List<String> values) {
            addCriterion("LEGALACCT in", values, "legalacct");
            return (Criteria) this;
        }

        public Criteria andLegalacctNotIn(List<String> values) {
            addCriterion("LEGALACCT not in", values, "legalacct");
            return (Criteria) this;
        }

        public Criteria andLegalacctBetween(String value1, String value2) {
            addCriterion("LEGALACCT between", value1, value2, "legalacct");
            return (Criteria) this;
        }

        public Criteria andLegalacctNotBetween(String value1, String value2) {
            addCriterion("LEGALACCT not between", value1, value2, "legalacct");
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