package com.colliers.mri.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PodtExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PodtExample() {
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

        public Criteria andLinenmbrIsNull() {
            addCriterion("LINENMBR is null");
            return (Criteria) this;
        }

        public Criteria andLinenmbrIsNotNull() {
            addCriterion("LINENMBR is not null");
            return (Criteria) this;
        }

        public Criteria andLinenmbrEqualTo(Short value) {
            addCriterion("LINENMBR =", value, "linenmbr");
            return (Criteria) this;
        }

        public Criteria andLinenmbrNotEqualTo(Short value) {
            addCriterion("LINENMBR <>", value, "linenmbr");
            return (Criteria) this;
        }

        public Criteria andLinenmbrGreaterThan(Short value) {
            addCriterion("LINENMBR >", value, "linenmbr");
            return (Criteria) this;
        }

        public Criteria andLinenmbrGreaterThanOrEqualTo(Short value) {
            addCriterion("LINENMBR >=", value, "linenmbr");
            return (Criteria) this;
        }

        public Criteria andLinenmbrLessThan(Short value) {
            addCriterion("LINENMBR <", value, "linenmbr");
            return (Criteria) this;
        }

        public Criteria andLinenmbrLessThanOrEqualTo(Short value) {
            addCriterion("LINENMBR <=", value, "linenmbr");
            return (Criteria) this;
        }

        public Criteria andLinenmbrIn(List<Short> values) {
            addCriterion("LINENMBR in", values, "linenmbr");
            return (Criteria) this;
        }

        public Criteria andLinenmbrNotIn(List<Short> values) {
            addCriterion("LINENMBR not in", values, "linenmbr");
            return (Criteria) this;
        }

        public Criteria andLinenmbrBetween(Short value1, Short value2) {
            addCriterion("LINENMBR between", value1, value2, "linenmbr");
            return (Criteria) this;
        }

        public Criteria andLinenmbrNotBetween(Short value1, Short value2) {
            addCriterion("LINENMBR not between", value1, value2, "linenmbr");
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

        public Criteria andItemIsNull() {
            addCriterion("ITEM is null");
            return (Criteria) this;
        }

        public Criteria andItemIsNotNull() {
            addCriterion("ITEM is not null");
            return (Criteria) this;
        }

        public Criteria andItemEqualTo(String value) {
            addCriterion("ITEM =", value, "item");
            return (Criteria) this;
        }

        public Criteria andItemNotEqualTo(String value) {
            addCriterion("ITEM <>", value, "item");
            return (Criteria) this;
        }

        public Criteria andItemGreaterThan(String value) {
            addCriterion("ITEM >", value, "item");
            return (Criteria) this;
        }

        public Criteria andItemGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM >=", value, "item");
            return (Criteria) this;
        }

        public Criteria andItemLessThan(String value) {
            addCriterion("ITEM <", value, "item");
            return (Criteria) this;
        }

        public Criteria andItemLessThanOrEqualTo(String value) {
            addCriterion("ITEM <=", value, "item");
            return (Criteria) this;
        }

        public Criteria andItemLike(String value) {
            addCriterion("ITEM like", value, "item");
            return (Criteria) this;
        }

        public Criteria andItemNotLike(String value) {
            addCriterion("ITEM not like", value, "item");
            return (Criteria) this;
        }

        public Criteria andItemIn(List<String> values) {
            addCriterion("ITEM in", values, "item");
            return (Criteria) this;
        }

        public Criteria andItemNotIn(List<String> values) {
            addCriterion("ITEM not in", values, "item");
            return (Criteria) this;
        }

        public Criteria andItemBetween(String value1, String value2) {
            addCriterion("ITEM between", value1, value2, "item");
            return (Criteria) this;
        }

        public Criteria andItemNotBetween(String value1, String value2) {
            addCriterion("ITEM not between", value1, value2, "item");
            return (Criteria) this;
        }

        public Criteria andItemdescIsNull() {
            addCriterion("ITEMDESC is null");
            return (Criteria) this;
        }

        public Criteria andItemdescIsNotNull() {
            addCriterion("ITEMDESC is not null");
            return (Criteria) this;
        }

        public Criteria andItemdescEqualTo(String value) {
            addCriterion("ITEMDESC =", value, "itemdesc");
            return (Criteria) this;
        }

        public Criteria andItemdescNotEqualTo(String value) {
            addCriterion("ITEMDESC <>", value, "itemdesc");
            return (Criteria) this;
        }

        public Criteria andItemdescGreaterThan(String value) {
            addCriterion("ITEMDESC >", value, "itemdesc");
            return (Criteria) this;
        }

        public Criteria andItemdescGreaterThanOrEqualTo(String value) {
            addCriterion("ITEMDESC >=", value, "itemdesc");
            return (Criteria) this;
        }

        public Criteria andItemdescLessThan(String value) {
            addCriterion("ITEMDESC <", value, "itemdesc");
            return (Criteria) this;
        }

        public Criteria andItemdescLessThanOrEqualTo(String value) {
            addCriterion("ITEMDESC <=", value, "itemdesc");
            return (Criteria) this;
        }

        public Criteria andItemdescLike(String value) {
            addCriterion("ITEMDESC like", value, "itemdesc");
            return (Criteria) this;
        }

        public Criteria andItemdescNotLike(String value) {
            addCriterion("ITEMDESC not like", value, "itemdesc");
            return (Criteria) this;
        }

        public Criteria andItemdescIn(List<String> values) {
            addCriterion("ITEMDESC in", values, "itemdesc");
            return (Criteria) this;
        }

        public Criteria andItemdescNotIn(List<String> values) {
            addCriterion("ITEMDESC not in", values, "itemdesc");
            return (Criteria) this;
        }

        public Criteria andItemdescBetween(String value1, String value2) {
            addCriterion("ITEMDESC between", value1, value2, "itemdesc");
            return (Criteria) this;
        }

        public Criteria andItemdescNotBetween(String value1, String value2) {
            addCriterion("ITEMDESC not between", value1, value2, "itemdesc");
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

        public Criteria andQtyIsNull() {
            addCriterion("QTY is null");
            return (Criteria) this;
        }

        public Criteria andQtyIsNotNull() {
            addCriterion("QTY is not null");
            return (Criteria) this;
        }

        public Criteria andQtyEqualTo(BigDecimal value) {
            addCriterion("QTY =", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyNotEqualTo(BigDecimal value) {
            addCriterion("QTY <>", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyGreaterThan(BigDecimal value) {
            addCriterion("QTY >", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY >=", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyLessThan(BigDecimal value) {
            addCriterion("QTY <", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY <=", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyIn(List<BigDecimal> values) {
            addCriterion("QTY in", values, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyNotIn(List<BigDecimal> values) {
            addCriterion("QTY not in", values, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY between", value1, value2, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY not between", value1, value2, "qty");
            return (Criteria) this;
        }

        public Criteria andUnitmsrIsNull() {
            addCriterion("UNITMSR is null");
            return (Criteria) this;
        }

        public Criteria andUnitmsrIsNotNull() {
            addCriterion("UNITMSR is not null");
            return (Criteria) this;
        }

        public Criteria andUnitmsrEqualTo(String value) {
            addCriterion("UNITMSR =", value, "unitmsr");
            return (Criteria) this;
        }

        public Criteria andUnitmsrNotEqualTo(String value) {
            addCriterion("UNITMSR <>", value, "unitmsr");
            return (Criteria) this;
        }

        public Criteria andUnitmsrGreaterThan(String value) {
            addCriterion("UNITMSR >", value, "unitmsr");
            return (Criteria) this;
        }

        public Criteria andUnitmsrGreaterThanOrEqualTo(String value) {
            addCriterion("UNITMSR >=", value, "unitmsr");
            return (Criteria) this;
        }

        public Criteria andUnitmsrLessThan(String value) {
            addCriterion("UNITMSR <", value, "unitmsr");
            return (Criteria) this;
        }

        public Criteria andUnitmsrLessThanOrEqualTo(String value) {
            addCriterion("UNITMSR <=", value, "unitmsr");
            return (Criteria) this;
        }

        public Criteria andUnitmsrLike(String value) {
            addCriterion("UNITMSR like", value, "unitmsr");
            return (Criteria) this;
        }

        public Criteria andUnitmsrNotLike(String value) {
            addCriterion("UNITMSR not like", value, "unitmsr");
            return (Criteria) this;
        }

        public Criteria andUnitmsrIn(List<String> values) {
            addCriterion("UNITMSR in", values, "unitmsr");
            return (Criteria) this;
        }

        public Criteria andUnitmsrNotIn(List<String> values) {
            addCriterion("UNITMSR not in", values, "unitmsr");
            return (Criteria) this;
        }

        public Criteria andUnitmsrBetween(String value1, String value2) {
            addCriterion("UNITMSR between", value1, value2, "unitmsr");
            return (Criteria) this;
        }

        public Criteria andUnitmsrNotBetween(String value1, String value2) {
            addCriterion("UNITMSR not between", value1, value2, "unitmsr");
            return (Criteria) this;
        }

        public Criteria andUnitcostIsNull() {
            addCriterion("UNITCOST is null");
            return (Criteria) this;
        }

        public Criteria andUnitcostIsNotNull() {
            addCriterion("UNITCOST is not null");
            return (Criteria) this;
        }

        public Criteria andUnitcostEqualTo(BigDecimal value) {
            addCriterion("UNITCOST =", value, "unitcost");
            return (Criteria) this;
        }

        public Criteria andUnitcostNotEqualTo(BigDecimal value) {
            addCriterion("UNITCOST <>", value, "unitcost");
            return (Criteria) this;
        }

        public Criteria andUnitcostGreaterThan(BigDecimal value) {
            addCriterion("UNITCOST >", value, "unitcost");
            return (Criteria) this;
        }

        public Criteria andUnitcostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UNITCOST >=", value, "unitcost");
            return (Criteria) this;
        }

        public Criteria andUnitcostLessThan(BigDecimal value) {
            addCriterion("UNITCOST <", value, "unitcost");
            return (Criteria) this;
        }

        public Criteria andUnitcostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UNITCOST <=", value, "unitcost");
            return (Criteria) this;
        }

        public Criteria andUnitcostIn(List<BigDecimal> values) {
            addCriterion("UNITCOST in", values, "unitcost");
            return (Criteria) this;
        }

        public Criteria andUnitcostNotIn(List<BigDecimal> values) {
            addCriterion("UNITCOST not in", values, "unitcost");
            return (Criteria) this;
        }

        public Criteria andUnitcostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UNITCOST between", value1, value2, "unitcost");
            return (Criteria) this;
        }

        public Criteria andUnitcostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UNITCOST not between", value1, value2, "unitcost");
            return (Criteria) this;
        }

        public Criteria andNetcostIsNull() {
            addCriterion("NETCOST is null");
            return (Criteria) this;
        }

        public Criteria andNetcostIsNotNull() {
            addCriterion("NETCOST is not null");
            return (Criteria) this;
        }

        public Criteria andNetcostEqualTo(BigDecimal value) {
            addCriterion("NETCOST =", value, "netcost");
            return (Criteria) this;
        }

        public Criteria andNetcostNotEqualTo(BigDecimal value) {
            addCriterion("NETCOST <>", value, "netcost");
            return (Criteria) this;
        }

        public Criteria andNetcostGreaterThan(BigDecimal value) {
            addCriterion("NETCOST >", value, "netcost");
            return (Criteria) this;
        }

        public Criteria andNetcostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NETCOST >=", value, "netcost");
            return (Criteria) this;
        }

        public Criteria andNetcostLessThan(BigDecimal value) {
            addCriterion("NETCOST <", value, "netcost");
            return (Criteria) this;
        }

        public Criteria andNetcostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NETCOST <=", value, "netcost");
            return (Criteria) this;
        }

        public Criteria andNetcostIn(List<BigDecimal> values) {
            addCriterion("NETCOST in", values, "netcost");
            return (Criteria) this;
        }

        public Criteria andNetcostNotIn(List<BigDecimal> values) {
            addCriterion("NETCOST not in", values, "netcost");
            return (Criteria) this;
        }

        public Criteria andNetcostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NETCOST between", value1, value2, "netcost");
            return (Criteria) this;
        }

        public Criteria andNetcostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NETCOST not between", value1, value2, "netcost");
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

        public Criteria andAltitemIsNull() {
            addCriterion("ALTITEM is null");
            return (Criteria) this;
        }

        public Criteria andAltitemIsNotNull() {
            addCriterion("ALTITEM is not null");
            return (Criteria) this;
        }

        public Criteria andAltitemEqualTo(String value) {
            addCriterion("ALTITEM =", value, "altitem");
            return (Criteria) this;
        }

        public Criteria andAltitemNotEqualTo(String value) {
            addCriterion("ALTITEM <>", value, "altitem");
            return (Criteria) this;
        }

        public Criteria andAltitemGreaterThan(String value) {
            addCriterion("ALTITEM >", value, "altitem");
            return (Criteria) this;
        }

        public Criteria andAltitemGreaterThanOrEqualTo(String value) {
            addCriterion("ALTITEM >=", value, "altitem");
            return (Criteria) this;
        }

        public Criteria andAltitemLessThan(String value) {
            addCriterion("ALTITEM <", value, "altitem");
            return (Criteria) this;
        }

        public Criteria andAltitemLessThanOrEqualTo(String value) {
            addCriterion("ALTITEM <=", value, "altitem");
            return (Criteria) this;
        }

        public Criteria andAltitemLike(String value) {
            addCriterion("ALTITEM like", value, "altitem");
            return (Criteria) this;
        }

        public Criteria andAltitemNotLike(String value) {
            addCriterion("ALTITEM not like", value, "altitem");
            return (Criteria) this;
        }

        public Criteria andAltitemIn(List<String> values) {
            addCriterion("ALTITEM in", values, "altitem");
            return (Criteria) this;
        }

        public Criteria andAltitemNotIn(List<String> values) {
            addCriterion("ALTITEM not in", values, "altitem");
            return (Criteria) this;
        }

        public Criteria andAltitemBetween(String value1, String value2) {
            addCriterion("ALTITEM between", value1, value2, "altitem");
            return (Criteria) this;
        }

        public Criteria andAltitemNotBetween(String value1, String value2) {
            addCriterion("ALTITEM not between", value1, value2, "altitem");
            return (Criteria) this;
        }

        public Criteria andItemtypeIsNull() {
            addCriterion("ITEMTYPE is null");
            return (Criteria) this;
        }

        public Criteria andItemtypeIsNotNull() {
            addCriterion("ITEMTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andItemtypeEqualTo(String value) {
            addCriterion("ITEMTYPE =", value, "itemtype");
            return (Criteria) this;
        }

        public Criteria andItemtypeNotEqualTo(String value) {
            addCriterion("ITEMTYPE <>", value, "itemtype");
            return (Criteria) this;
        }

        public Criteria andItemtypeGreaterThan(String value) {
            addCriterion("ITEMTYPE >", value, "itemtype");
            return (Criteria) this;
        }

        public Criteria andItemtypeGreaterThanOrEqualTo(String value) {
            addCriterion("ITEMTYPE >=", value, "itemtype");
            return (Criteria) this;
        }

        public Criteria andItemtypeLessThan(String value) {
            addCriterion("ITEMTYPE <", value, "itemtype");
            return (Criteria) this;
        }

        public Criteria andItemtypeLessThanOrEqualTo(String value) {
            addCriterion("ITEMTYPE <=", value, "itemtype");
            return (Criteria) this;
        }

        public Criteria andItemtypeLike(String value) {
            addCriterion("ITEMTYPE like", value, "itemtype");
            return (Criteria) this;
        }

        public Criteria andItemtypeNotLike(String value) {
            addCriterion("ITEMTYPE not like", value, "itemtype");
            return (Criteria) this;
        }

        public Criteria andItemtypeIn(List<String> values) {
            addCriterion("ITEMTYPE in", values, "itemtype");
            return (Criteria) this;
        }

        public Criteria andItemtypeNotIn(List<String> values) {
            addCriterion("ITEMTYPE not in", values, "itemtype");
            return (Criteria) this;
        }

        public Criteria andItemtypeBetween(String value1, String value2) {
            addCriterion("ITEMTYPE between", value1, value2, "itemtype");
            return (Criteria) this;
        }

        public Criteria andItemtypeNotBetween(String value1, String value2) {
            addCriterion("ITEMTYPE not between", value1, value2, "itemtype");
            return (Criteria) this;
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

        public Criteria andJobcodeIsNull() {
            addCriterion("JOBCODE is null");
            return (Criteria) this;
        }

        public Criteria andJobcodeIsNotNull() {
            addCriterion("JOBCODE is not null");
            return (Criteria) this;
        }

        public Criteria andJobcodeEqualTo(String value) {
            addCriterion("JOBCODE =", value, "jobcode");
            return (Criteria) this;
        }

        public Criteria andJobcodeNotEqualTo(String value) {
            addCriterion("JOBCODE <>", value, "jobcode");
            return (Criteria) this;
        }

        public Criteria andJobcodeGreaterThan(String value) {
            addCriterion("JOBCODE >", value, "jobcode");
            return (Criteria) this;
        }

        public Criteria andJobcodeGreaterThanOrEqualTo(String value) {
            addCriterion("JOBCODE >=", value, "jobcode");
            return (Criteria) this;
        }

        public Criteria andJobcodeLessThan(String value) {
            addCriterion("JOBCODE <", value, "jobcode");
            return (Criteria) this;
        }

        public Criteria andJobcodeLessThanOrEqualTo(String value) {
            addCriterion("JOBCODE <=", value, "jobcode");
            return (Criteria) this;
        }

        public Criteria andJobcodeLike(String value) {
            addCriterion("JOBCODE like", value, "jobcode");
            return (Criteria) this;
        }

        public Criteria andJobcodeNotLike(String value) {
            addCriterion("JOBCODE not like", value, "jobcode");
            return (Criteria) this;
        }

        public Criteria andJobcodeIn(List<String> values) {
            addCriterion("JOBCODE in", values, "jobcode");
            return (Criteria) this;
        }

        public Criteria andJobcodeNotIn(List<String> values) {
            addCriterion("JOBCODE not in", values, "jobcode");
            return (Criteria) this;
        }

        public Criteria andJobcodeBetween(String value1, String value2) {
            addCriterion("JOBCODE between", value1, value2, "jobcode");
            return (Criteria) this;
        }

        public Criteria andJobcodeNotBetween(String value1, String value2) {
            addCriterion("JOBCODE not between", value1, value2, "jobcode");
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

        public Criteria andRecvqtyIsNull() {
            addCriterion("RECVQTY is null");
            return (Criteria) this;
        }

        public Criteria andRecvqtyIsNotNull() {
            addCriterion("RECVQTY is not null");
            return (Criteria) this;
        }

        public Criteria andRecvqtyEqualTo(Date value) {
            addCriterion("RECVQTY =", value, "recvqty");
            return (Criteria) this;
        }

        public Criteria andRecvqtyNotEqualTo(Date value) {
            addCriterion("RECVQTY <>", value, "recvqty");
            return (Criteria) this;
        }

        public Criteria andRecvqtyGreaterThan(Date value) {
            addCriterion("RECVQTY >", value, "recvqty");
            return (Criteria) this;
        }

        public Criteria andRecvqtyGreaterThanOrEqualTo(Date value) {
            addCriterion("RECVQTY >=", value, "recvqty");
            return (Criteria) this;
        }

        public Criteria andRecvqtyLessThan(Date value) {
            addCriterion("RECVQTY <", value, "recvqty");
            return (Criteria) this;
        }

        public Criteria andRecvqtyLessThanOrEqualTo(Date value) {
            addCriterion("RECVQTY <=", value, "recvqty");
            return (Criteria) this;
        }

        public Criteria andRecvqtyIn(List<Date> values) {
            addCriterion("RECVQTY in", values, "recvqty");
            return (Criteria) this;
        }

        public Criteria andRecvqtyNotIn(List<Date> values) {
            addCriterion("RECVQTY not in", values, "recvqty");
            return (Criteria) this;
        }

        public Criteria andRecvqtyBetween(Date value1, Date value2) {
            addCriterion("RECVQTY between", value1, value2, "recvqty");
            return (Criteria) this;
        }

        public Criteria andRecvqtyNotBetween(Date value1, Date value2) {
            addCriterion("RECVQTY not between", value1, value2, "recvqty");
            return (Criteria) this;
        }

        public Criteria andReceivedIsNull() {
            addCriterion("RECEIVED is null");
            return (Criteria) this;
        }

        public Criteria andReceivedIsNotNull() {
            addCriterion("RECEIVED is not null");
            return (Criteria) this;
        }

        public Criteria andReceivedEqualTo(BigDecimal value) {
            addCriterion("RECEIVED =", value, "received");
            return (Criteria) this;
        }

        public Criteria andReceivedNotEqualTo(BigDecimal value) {
            addCriterion("RECEIVED <>", value, "received");
            return (Criteria) this;
        }

        public Criteria andReceivedGreaterThan(BigDecimal value) {
            addCriterion("RECEIVED >", value, "received");
            return (Criteria) this;
        }

        public Criteria andReceivedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RECEIVED >=", value, "received");
            return (Criteria) this;
        }

        public Criteria andReceivedLessThan(BigDecimal value) {
            addCriterion("RECEIVED <", value, "received");
            return (Criteria) this;
        }

        public Criteria andReceivedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RECEIVED <=", value, "received");
            return (Criteria) this;
        }

        public Criteria andReceivedIn(List<BigDecimal> values) {
            addCriterion("RECEIVED in", values, "received");
            return (Criteria) this;
        }

        public Criteria andReceivedNotIn(List<BigDecimal> values) {
            addCriterion("RECEIVED not in", values, "received");
            return (Criteria) this;
        }

        public Criteria andReceivedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RECEIVED between", value1, value2, "received");
            return (Criteria) this;
        }

        public Criteria andReceivedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RECEIVED not between", value1, value2, "received");
            return (Criteria) this;
        }

        public Criteria andInvoicedIsNull() {
            addCriterion("INVOICED is null");
            return (Criteria) this;
        }

        public Criteria andInvoicedIsNotNull() {
            addCriterion("INVOICED is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicedEqualTo(BigDecimal value) {
            addCriterion("INVOICED =", value, "invoiced");
            return (Criteria) this;
        }

        public Criteria andInvoicedNotEqualTo(BigDecimal value) {
            addCriterion("INVOICED <>", value, "invoiced");
            return (Criteria) this;
        }

        public Criteria andInvoicedGreaterThan(BigDecimal value) {
            addCriterion("INVOICED >", value, "invoiced");
            return (Criteria) this;
        }

        public Criteria andInvoicedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INVOICED >=", value, "invoiced");
            return (Criteria) this;
        }

        public Criteria andInvoicedLessThan(BigDecimal value) {
            addCriterion("INVOICED <", value, "invoiced");
            return (Criteria) this;
        }

        public Criteria andInvoicedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INVOICED <=", value, "invoiced");
            return (Criteria) this;
        }

        public Criteria andInvoicedIn(List<BigDecimal> values) {
            addCriterion("INVOICED in", values, "invoiced");
            return (Criteria) this;
        }

        public Criteria andInvoicedNotIn(List<BigDecimal> values) {
            addCriterion("INVOICED not in", values, "invoiced");
            return (Criteria) this;
        }

        public Criteria andInvoicedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVOICED between", value1, value2, "invoiced");
            return (Criteria) this;
        }

        public Criteria andInvoicedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVOICED not between", value1, value2, "invoiced");
            return (Criteria) this;
        }

        public Criteria andReqnumIsNull() {
            addCriterion("REQNUM is null");
            return (Criteria) this;
        }

        public Criteria andReqnumIsNotNull() {
            addCriterion("REQNUM is not null");
            return (Criteria) this;
        }

        public Criteria andReqnumEqualTo(String value) {
            addCriterion("REQNUM =", value, "reqnum");
            return (Criteria) this;
        }

        public Criteria andReqnumNotEqualTo(String value) {
            addCriterion("REQNUM <>", value, "reqnum");
            return (Criteria) this;
        }

        public Criteria andReqnumGreaterThan(String value) {
            addCriterion("REQNUM >", value, "reqnum");
            return (Criteria) this;
        }

        public Criteria andReqnumGreaterThanOrEqualTo(String value) {
            addCriterion("REQNUM >=", value, "reqnum");
            return (Criteria) this;
        }

        public Criteria andReqnumLessThan(String value) {
            addCriterion("REQNUM <", value, "reqnum");
            return (Criteria) this;
        }

        public Criteria andReqnumLessThanOrEqualTo(String value) {
            addCriterion("REQNUM <=", value, "reqnum");
            return (Criteria) this;
        }

        public Criteria andReqnumLike(String value) {
            addCriterion("REQNUM like", value, "reqnum");
            return (Criteria) this;
        }

        public Criteria andReqnumNotLike(String value) {
            addCriterion("REQNUM not like", value, "reqnum");
            return (Criteria) this;
        }

        public Criteria andReqnumIn(List<String> values) {
            addCriterion("REQNUM in", values, "reqnum");
            return (Criteria) this;
        }

        public Criteria andReqnumNotIn(List<String> values) {
            addCriterion("REQNUM not in", values, "reqnum");
            return (Criteria) this;
        }

        public Criteria andReqnumBetween(String value1, String value2) {
            addCriterion("REQNUM between", value1, value2, "reqnum");
            return (Criteria) this;
        }

        public Criteria andReqnumNotBetween(String value1, String value2) {
            addCriterion("REQNUM not between", value1, value2, "reqnum");
            return (Criteria) this;
        }

        public Criteria andWrkoidIsNull() {
            addCriterion("WRKOID is null");
            return (Criteria) this;
        }

        public Criteria andWrkoidIsNotNull() {
            addCriterion("WRKOID is not null");
            return (Criteria) this;
        }

        public Criteria andWrkoidEqualTo(String value) {
            addCriterion("WRKOID =", value, "wrkoid");
            return (Criteria) this;
        }

        public Criteria andWrkoidNotEqualTo(String value) {
            addCriterion("WRKOID <>", value, "wrkoid");
            return (Criteria) this;
        }

        public Criteria andWrkoidGreaterThan(String value) {
            addCriterion("WRKOID >", value, "wrkoid");
            return (Criteria) this;
        }

        public Criteria andWrkoidGreaterThanOrEqualTo(String value) {
            addCriterion("WRKOID >=", value, "wrkoid");
            return (Criteria) this;
        }

        public Criteria andWrkoidLessThan(String value) {
            addCriterion("WRKOID <", value, "wrkoid");
            return (Criteria) this;
        }

        public Criteria andWrkoidLessThanOrEqualTo(String value) {
            addCriterion("WRKOID <=", value, "wrkoid");
            return (Criteria) this;
        }

        public Criteria andWrkoidLike(String value) {
            addCriterion("WRKOID like", value, "wrkoid");
            return (Criteria) this;
        }

        public Criteria andWrkoidNotLike(String value) {
            addCriterion("WRKOID not like", value, "wrkoid");
            return (Criteria) this;
        }

        public Criteria andWrkoidIn(List<String> values) {
            addCriterion("WRKOID in", values, "wrkoid");
            return (Criteria) this;
        }

        public Criteria andWrkoidNotIn(List<String> values) {
            addCriterion("WRKOID not in", values, "wrkoid");
            return (Criteria) this;
        }

        public Criteria andWrkoidBetween(String value1, String value2) {
            addCriterion("WRKOID between", value1, value2, "wrkoid");
            return (Criteria) this;
        }

        public Criteria andWrkoidNotBetween(String value1, String value2) {
            addCriterion("WRKOID not between", value1, value2, "wrkoid");
            return (Criteria) this;
        }

        public Criteria andAtaxgrpidIsNull() {
            addCriterion("ATAXGRPID is null");
            return (Criteria) this;
        }

        public Criteria andAtaxgrpidIsNotNull() {
            addCriterion("ATAXGRPID is not null");
            return (Criteria) this;
        }

        public Criteria andAtaxgrpidEqualTo(String value) {
            addCriterion("ATAXGRPID =", value, "ataxgrpid");
            return (Criteria) this;
        }

        public Criteria andAtaxgrpidNotEqualTo(String value) {
            addCriterion("ATAXGRPID <>", value, "ataxgrpid");
            return (Criteria) this;
        }

        public Criteria andAtaxgrpidGreaterThan(String value) {
            addCriterion("ATAXGRPID >", value, "ataxgrpid");
            return (Criteria) this;
        }

        public Criteria andAtaxgrpidGreaterThanOrEqualTo(String value) {
            addCriterion("ATAXGRPID >=", value, "ataxgrpid");
            return (Criteria) this;
        }

        public Criteria andAtaxgrpidLessThan(String value) {
            addCriterion("ATAXGRPID <", value, "ataxgrpid");
            return (Criteria) this;
        }

        public Criteria andAtaxgrpidLessThanOrEqualTo(String value) {
            addCriterion("ATAXGRPID <=", value, "ataxgrpid");
            return (Criteria) this;
        }

        public Criteria andAtaxgrpidLike(String value) {
            addCriterion("ATAXGRPID like", value, "ataxgrpid");
            return (Criteria) this;
        }

        public Criteria andAtaxgrpidNotLike(String value) {
            addCriterion("ATAXGRPID not like", value, "ataxgrpid");
            return (Criteria) this;
        }

        public Criteria andAtaxgrpidIn(List<String> values) {
            addCriterion("ATAXGRPID in", values, "ataxgrpid");
            return (Criteria) this;
        }

        public Criteria andAtaxgrpidNotIn(List<String> values) {
            addCriterion("ATAXGRPID not in", values, "ataxgrpid");
            return (Criteria) this;
        }

        public Criteria andAtaxgrpidBetween(String value1, String value2) {
            addCriterion("ATAXGRPID between", value1, value2, "ataxgrpid");
            return (Criteria) this;
        }

        public Criteria andAtaxgrpidNotBetween(String value1, String value2) {
            addCriterion("ATAXGRPID not between", value1, value2, "ataxgrpid");
            return (Criteria) this;
        }

        public Criteria andTaxcostIsNull() {
            addCriterion("TAXCOST is null");
            return (Criteria) this;
        }

        public Criteria andTaxcostIsNotNull() {
            addCriterion("TAXCOST is not null");
            return (Criteria) this;
        }

        public Criteria andTaxcostEqualTo(BigDecimal value) {
            addCriterion("TAXCOST =", value, "taxcost");
            return (Criteria) this;
        }

        public Criteria andTaxcostNotEqualTo(BigDecimal value) {
            addCriterion("TAXCOST <>", value, "taxcost");
            return (Criteria) this;
        }

        public Criteria andTaxcostGreaterThan(BigDecimal value) {
            addCriterion("TAXCOST >", value, "taxcost");
            return (Criteria) this;
        }

        public Criteria andTaxcostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXCOST >=", value, "taxcost");
            return (Criteria) this;
        }

        public Criteria andTaxcostLessThan(BigDecimal value) {
            addCriterion("TAXCOST <", value, "taxcost");
            return (Criteria) this;
        }

        public Criteria andTaxcostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXCOST <=", value, "taxcost");
            return (Criteria) this;
        }

        public Criteria andTaxcostIn(List<BigDecimal> values) {
            addCriterion("TAXCOST in", values, "taxcost");
            return (Criteria) this;
        }

        public Criteria andTaxcostNotIn(List<BigDecimal> values) {
            addCriterion("TAXCOST not in", values, "taxcost");
            return (Criteria) this;
        }

        public Criteria andTaxcostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXCOST between", value1, value2, "taxcost");
            return (Criteria) this;
        }

        public Criteria andTaxcostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXCOST not between", value1, value2, "taxcost");
            return (Criteria) this;
        }

        public Criteria andTotcostIsNull() {
            addCriterion("TOTCOST is null");
            return (Criteria) this;
        }

        public Criteria andTotcostIsNotNull() {
            addCriterion("TOTCOST is not null");
            return (Criteria) this;
        }

        public Criteria andTotcostEqualTo(BigDecimal value) {
            addCriterion("TOTCOST =", value, "totcost");
            return (Criteria) this;
        }

        public Criteria andTotcostNotEqualTo(BigDecimal value) {
            addCriterion("TOTCOST <>", value, "totcost");
            return (Criteria) this;
        }

        public Criteria andTotcostGreaterThan(BigDecimal value) {
            addCriterion("TOTCOST >", value, "totcost");
            return (Criteria) this;
        }

        public Criteria andTotcostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTCOST >=", value, "totcost");
            return (Criteria) this;
        }

        public Criteria andTotcostLessThan(BigDecimal value) {
            addCriterion("TOTCOST <", value, "totcost");
            return (Criteria) this;
        }

        public Criteria andTotcostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTCOST <=", value, "totcost");
            return (Criteria) this;
        }

        public Criteria andTotcostIn(List<BigDecimal> values) {
            addCriterion("TOTCOST in", values, "totcost");
            return (Criteria) this;
        }

        public Criteria andTotcostNotIn(List<BigDecimal> values) {
            addCriterion("TOTCOST not in", values, "totcost");
            return (Criteria) this;
        }

        public Criteria andTotcostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTCOST between", value1, value2, "totcost");
            return (Criteria) this;
        }

        public Criteria andTotcostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTCOST not between", value1, value2, "totcost");
            return (Criteria) this;
        }

        public Criteria andQtypeIsNull() {
            addCriterion("QTYPE is null");
            return (Criteria) this;
        }

        public Criteria andQtypeIsNotNull() {
            addCriterion("QTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andQtypeEqualTo(String value) {
            addCriterion("QTYPE =", value, "qtype");
            return (Criteria) this;
        }

        public Criteria andQtypeNotEqualTo(String value) {
            addCriterion("QTYPE <>", value, "qtype");
            return (Criteria) this;
        }

        public Criteria andQtypeGreaterThan(String value) {
            addCriterion("QTYPE >", value, "qtype");
            return (Criteria) this;
        }

        public Criteria andQtypeGreaterThanOrEqualTo(String value) {
            addCriterion("QTYPE >=", value, "qtype");
            return (Criteria) this;
        }

        public Criteria andQtypeLessThan(String value) {
            addCriterion("QTYPE <", value, "qtype");
            return (Criteria) this;
        }

        public Criteria andQtypeLessThanOrEqualTo(String value) {
            addCriterion("QTYPE <=", value, "qtype");
            return (Criteria) this;
        }

        public Criteria andQtypeLike(String value) {
            addCriterion("QTYPE like", value, "qtype");
            return (Criteria) this;
        }

        public Criteria andQtypeNotLike(String value) {
            addCriterion("QTYPE not like", value, "qtype");
            return (Criteria) this;
        }

        public Criteria andQtypeIn(List<String> values) {
            addCriterion("QTYPE in", values, "qtype");
            return (Criteria) this;
        }

        public Criteria andQtypeNotIn(List<String> values) {
            addCriterion("QTYPE not in", values, "qtype");
            return (Criteria) this;
        }

        public Criteria andQtypeBetween(String value1, String value2) {
            addCriterion("QTYPE between", value1, value2, "qtype");
            return (Criteria) this;
        }

        public Criteria andQtypeNotBetween(String value1, String value2) {
            addCriterion("QTYPE not between", value1, value2, "qtype");
            return (Criteria) this;
        }

        public Criteria andAmtrecvdIsNull() {
            addCriterion("AMTRECVD is null");
            return (Criteria) this;
        }

        public Criteria andAmtrecvdIsNotNull() {
            addCriterion("AMTRECVD is not null");
            return (Criteria) this;
        }

        public Criteria andAmtrecvdEqualTo(BigDecimal value) {
            addCriterion("AMTRECVD =", value, "amtrecvd");
            return (Criteria) this;
        }

        public Criteria andAmtrecvdNotEqualTo(BigDecimal value) {
            addCriterion("AMTRECVD <>", value, "amtrecvd");
            return (Criteria) this;
        }

        public Criteria andAmtrecvdGreaterThan(BigDecimal value) {
            addCriterion("AMTRECVD >", value, "amtrecvd");
            return (Criteria) this;
        }

        public Criteria andAmtrecvdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTRECVD >=", value, "amtrecvd");
            return (Criteria) this;
        }

        public Criteria andAmtrecvdLessThan(BigDecimal value) {
            addCriterion("AMTRECVD <", value, "amtrecvd");
            return (Criteria) this;
        }

        public Criteria andAmtrecvdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTRECVD <=", value, "amtrecvd");
            return (Criteria) this;
        }

        public Criteria andAmtrecvdIn(List<BigDecimal> values) {
            addCriterion("AMTRECVD in", values, "amtrecvd");
            return (Criteria) this;
        }

        public Criteria andAmtrecvdNotIn(List<BigDecimal> values) {
            addCriterion("AMTRECVD not in", values, "amtrecvd");
            return (Criteria) this;
        }

        public Criteria andAmtrecvdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTRECVD between", value1, value2, "amtrecvd");
            return (Criteria) this;
        }

        public Criteria andAmtrecvdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTRECVD not between", value1, value2, "amtrecvd");
            return (Criteria) this;
        }

        public Criteria andAmtinvcdIsNull() {
            addCriterion("AMTINVCD is null");
            return (Criteria) this;
        }

        public Criteria andAmtinvcdIsNotNull() {
            addCriterion("AMTINVCD is not null");
            return (Criteria) this;
        }

        public Criteria andAmtinvcdEqualTo(BigDecimal value) {
            addCriterion("AMTINVCD =", value, "amtinvcd");
            return (Criteria) this;
        }

        public Criteria andAmtinvcdNotEqualTo(BigDecimal value) {
            addCriterion("AMTINVCD <>", value, "amtinvcd");
            return (Criteria) this;
        }

        public Criteria andAmtinvcdGreaterThan(BigDecimal value) {
            addCriterion("AMTINVCD >", value, "amtinvcd");
            return (Criteria) this;
        }

        public Criteria andAmtinvcdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTINVCD >=", value, "amtinvcd");
            return (Criteria) this;
        }

        public Criteria andAmtinvcdLessThan(BigDecimal value) {
            addCriterion("AMTINVCD <", value, "amtinvcd");
            return (Criteria) this;
        }

        public Criteria andAmtinvcdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTINVCD <=", value, "amtinvcd");
            return (Criteria) this;
        }

        public Criteria andAmtinvcdIn(List<BigDecimal> values) {
            addCriterion("AMTINVCD in", values, "amtinvcd");
            return (Criteria) this;
        }

        public Criteria andAmtinvcdNotIn(List<BigDecimal> values) {
            addCriterion("AMTINVCD not in", values, "amtinvcd");
            return (Criteria) this;
        }

        public Criteria andAmtinvcdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTINVCD between", value1, value2, "amtinvcd");
            return (Criteria) this;
        }

        public Criteria andAmtinvcdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTINVCD not between", value1, value2, "amtinvcd");
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

        public Criteria andJcPhasecodeIsNull() {
            addCriterion("JC_PHASECODE is null");
            return (Criteria) this;
        }

        public Criteria andJcPhasecodeIsNotNull() {
            addCriterion("JC_PHASECODE is not null");
            return (Criteria) this;
        }

        public Criteria andJcPhasecodeEqualTo(String value) {
            addCriterion("JC_PHASECODE =", value, "jcPhasecode");
            return (Criteria) this;
        }

        public Criteria andJcPhasecodeNotEqualTo(String value) {
            addCriterion("JC_PHASECODE <>", value, "jcPhasecode");
            return (Criteria) this;
        }

        public Criteria andJcPhasecodeGreaterThan(String value) {
            addCriterion("JC_PHASECODE >", value, "jcPhasecode");
            return (Criteria) this;
        }

        public Criteria andJcPhasecodeGreaterThanOrEqualTo(String value) {
            addCriterion("JC_PHASECODE >=", value, "jcPhasecode");
            return (Criteria) this;
        }

        public Criteria andJcPhasecodeLessThan(String value) {
            addCriterion("JC_PHASECODE <", value, "jcPhasecode");
            return (Criteria) this;
        }

        public Criteria andJcPhasecodeLessThanOrEqualTo(String value) {
            addCriterion("JC_PHASECODE <=", value, "jcPhasecode");
            return (Criteria) this;
        }

        public Criteria andJcPhasecodeLike(String value) {
            addCriterion("JC_PHASECODE like", value, "jcPhasecode");
            return (Criteria) this;
        }

        public Criteria andJcPhasecodeNotLike(String value) {
            addCriterion("JC_PHASECODE not like", value, "jcPhasecode");
            return (Criteria) this;
        }

        public Criteria andJcPhasecodeIn(List<String> values) {
            addCriterion("JC_PHASECODE in", values, "jcPhasecode");
            return (Criteria) this;
        }

        public Criteria andJcPhasecodeNotIn(List<String> values) {
            addCriterion("JC_PHASECODE not in", values, "jcPhasecode");
            return (Criteria) this;
        }

        public Criteria andJcPhasecodeBetween(String value1, String value2) {
            addCriterion("JC_PHASECODE between", value1, value2, "jcPhasecode");
            return (Criteria) this;
        }

        public Criteria andJcPhasecodeNotBetween(String value1, String value2) {
            addCriterion("JC_PHASECODE not between", value1, value2, "jcPhasecode");
            return (Criteria) this;
        }

        public Criteria andJcCostlistIsNull() {
            addCriterion("JC_COSTLIST is null");
            return (Criteria) this;
        }

        public Criteria andJcCostlistIsNotNull() {
            addCriterion("JC_COSTLIST is not null");
            return (Criteria) this;
        }

        public Criteria andJcCostlistEqualTo(String value) {
            addCriterion("JC_COSTLIST =", value, "jcCostlist");
            return (Criteria) this;
        }

        public Criteria andJcCostlistNotEqualTo(String value) {
            addCriterion("JC_COSTLIST <>", value, "jcCostlist");
            return (Criteria) this;
        }

        public Criteria andJcCostlistGreaterThan(String value) {
            addCriterion("JC_COSTLIST >", value, "jcCostlist");
            return (Criteria) this;
        }

        public Criteria andJcCostlistGreaterThanOrEqualTo(String value) {
            addCriterion("JC_COSTLIST >=", value, "jcCostlist");
            return (Criteria) this;
        }

        public Criteria andJcCostlistLessThan(String value) {
            addCriterion("JC_COSTLIST <", value, "jcCostlist");
            return (Criteria) this;
        }

        public Criteria andJcCostlistLessThanOrEqualTo(String value) {
            addCriterion("JC_COSTLIST <=", value, "jcCostlist");
            return (Criteria) this;
        }

        public Criteria andJcCostlistLike(String value) {
            addCriterion("JC_COSTLIST like", value, "jcCostlist");
            return (Criteria) this;
        }

        public Criteria andJcCostlistNotLike(String value) {
            addCriterion("JC_COSTLIST not like", value, "jcCostlist");
            return (Criteria) this;
        }

        public Criteria andJcCostlistIn(List<String> values) {
            addCriterion("JC_COSTLIST in", values, "jcCostlist");
            return (Criteria) this;
        }

        public Criteria andJcCostlistNotIn(List<String> values) {
            addCriterion("JC_COSTLIST not in", values, "jcCostlist");
            return (Criteria) this;
        }

        public Criteria andJcCostlistBetween(String value1, String value2) {
            addCriterion("JC_COSTLIST between", value1, value2, "jcCostlist");
            return (Criteria) this;
        }

        public Criteria andJcCostlistNotBetween(String value1, String value2) {
            addCriterion("JC_COSTLIST not between", value1, value2, "jcCostlist");
            return (Criteria) this;
        }

        public Criteria andJcCostcodeIsNull() {
            addCriterion("JC_COSTCODE is null");
            return (Criteria) this;
        }

        public Criteria andJcCostcodeIsNotNull() {
            addCriterion("JC_COSTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andJcCostcodeEqualTo(String value) {
            addCriterion("JC_COSTCODE =", value, "jcCostcode");
            return (Criteria) this;
        }

        public Criteria andJcCostcodeNotEqualTo(String value) {
            addCriterion("JC_COSTCODE <>", value, "jcCostcode");
            return (Criteria) this;
        }

        public Criteria andJcCostcodeGreaterThan(String value) {
            addCriterion("JC_COSTCODE >", value, "jcCostcode");
            return (Criteria) this;
        }

        public Criteria andJcCostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("JC_COSTCODE >=", value, "jcCostcode");
            return (Criteria) this;
        }

        public Criteria andJcCostcodeLessThan(String value) {
            addCriterion("JC_COSTCODE <", value, "jcCostcode");
            return (Criteria) this;
        }

        public Criteria andJcCostcodeLessThanOrEqualTo(String value) {
            addCriterion("JC_COSTCODE <=", value, "jcCostcode");
            return (Criteria) this;
        }

        public Criteria andJcCostcodeLike(String value) {
            addCriterion("JC_COSTCODE like", value, "jcCostcode");
            return (Criteria) this;
        }

        public Criteria andJcCostcodeNotLike(String value) {
            addCriterion("JC_COSTCODE not like", value, "jcCostcode");
            return (Criteria) this;
        }

        public Criteria andJcCostcodeIn(List<String> values) {
            addCriterion("JC_COSTCODE in", values, "jcCostcode");
            return (Criteria) this;
        }

        public Criteria andJcCostcodeNotIn(List<String> values) {
            addCriterion("JC_COSTCODE not in", values, "jcCostcode");
            return (Criteria) this;
        }

        public Criteria andJcCostcodeBetween(String value1, String value2) {
            addCriterion("JC_COSTCODE between", value1, value2, "jcCostcode");
            return (Criteria) this;
        }

        public Criteria andJcCostcodeNotBetween(String value1, String value2) {
            addCriterion("JC_COSTCODE not between", value1, value2, "jcCostcode");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNull() {
            addCriterion("CATEGORY is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("CATEGORY is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(String value) {
            addCriterion("CATEGORY =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(String value) {
            addCriterion("CATEGORY <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(String value) {
            addCriterion("CATEGORY >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("CATEGORY >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(String value) {
            addCriterion("CATEGORY <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(String value) {
            addCriterion("CATEGORY <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLike(String value) {
            addCriterion("CATEGORY like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotLike(String value) {
            addCriterion("CATEGORY not like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<String> values) {
            addCriterion("CATEGORY in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<String> values) {
            addCriterion("CATEGORY not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(String value1, String value2) {
            addCriterion("CATEGORY between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(String value1, String value2) {
            addCriterion("CATEGORY not between", value1, value2, "category");
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

        public Criteria andAccrueIsNull() {
            addCriterion("ACCRUE is null");
            return (Criteria) this;
        }

        public Criteria andAccrueIsNotNull() {
            addCriterion("ACCRUE is not null");
            return (Criteria) this;
        }

        public Criteria andAccrueEqualTo(String value) {
            addCriterion("ACCRUE =", value, "accrue");
            return (Criteria) this;
        }

        public Criteria andAccrueNotEqualTo(String value) {
            addCriterion("ACCRUE <>", value, "accrue");
            return (Criteria) this;
        }

        public Criteria andAccrueGreaterThan(String value) {
            addCriterion("ACCRUE >", value, "accrue");
            return (Criteria) this;
        }

        public Criteria andAccrueGreaterThanOrEqualTo(String value) {
            addCriterion("ACCRUE >=", value, "accrue");
            return (Criteria) this;
        }

        public Criteria andAccrueLessThan(String value) {
            addCriterion("ACCRUE <", value, "accrue");
            return (Criteria) this;
        }

        public Criteria andAccrueLessThanOrEqualTo(String value) {
            addCriterion("ACCRUE <=", value, "accrue");
            return (Criteria) this;
        }

        public Criteria andAccrueLike(String value) {
            addCriterion("ACCRUE like", value, "accrue");
            return (Criteria) this;
        }

        public Criteria andAccrueNotLike(String value) {
            addCriterion("ACCRUE not like", value, "accrue");
            return (Criteria) this;
        }

        public Criteria andAccrueIn(List<String> values) {
            addCriterion("ACCRUE in", values, "accrue");
            return (Criteria) this;
        }

        public Criteria andAccrueNotIn(List<String> values) {
            addCriterion("ACCRUE not in", values, "accrue");
            return (Criteria) this;
        }

        public Criteria andAccrueBetween(String value1, String value2) {
            addCriterion("ACCRUE between", value1, value2, "accrue");
            return (Criteria) this;
        }

        public Criteria andAccrueNotBetween(String value1, String value2) {
            addCriterion("ACCRUE not between", value1, value2, "accrue");
            return (Criteria) this;
        }

        public Criteria andPrepayIsNull() {
            addCriterion("PREPAY is null");
            return (Criteria) this;
        }

        public Criteria andPrepayIsNotNull() {
            addCriterion("PREPAY is not null");
            return (Criteria) this;
        }

        public Criteria andPrepayEqualTo(String value) {
            addCriterion("PREPAY =", value, "prepay");
            return (Criteria) this;
        }

        public Criteria andPrepayNotEqualTo(String value) {
            addCriterion("PREPAY <>", value, "prepay");
            return (Criteria) this;
        }

        public Criteria andPrepayGreaterThan(String value) {
            addCriterion("PREPAY >", value, "prepay");
            return (Criteria) this;
        }

        public Criteria andPrepayGreaterThanOrEqualTo(String value) {
            addCriterion("PREPAY >=", value, "prepay");
            return (Criteria) this;
        }

        public Criteria andPrepayLessThan(String value) {
            addCriterion("PREPAY <", value, "prepay");
            return (Criteria) this;
        }

        public Criteria andPrepayLessThanOrEqualTo(String value) {
            addCriterion("PREPAY <=", value, "prepay");
            return (Criteria) this;
        }

        public Criteria andPrepayLike(String value) {
            addCriterion("PREPAY like", value, "prepay");
            return (Criteria) this;
        }

        public Criteria andPrepayNotLike(String value) {
            addCriterion("PREPAY not like", value, "prepay");
            return (Criteria) this;
        }

        public Criteria andPrepayIn(List<String> values) {
            addCriterion("PREPAY in", values, "prepay");
            return (Criteria) this;
        }

        public Criteria andPrepayNotIn(List<String> values) {
            addCriterion("PREPAY not in", values, "prepay");
            return (Criteria) this;
        }

        public Criteria andPrepayBetween(String value1, String value2) {
            addCriterion("PREPAY between", value1, value2, "prepay");
            return (Criteria) this;
        }

        public Criteria andPrepayNotBetween(String value1, String value2) {
            addCriterion("PREPAY not between", value1, value2, "prepay");
            return (Criteria) this;
        }

        public Criteria andLaccperIsNull() {
            addCriterion("LACCPER is null");
            return (Criteria) this;
        }

        public Criteria andLaccperIsNotNull() {
            addCriterion("LACCPER is not null");
            return (Criteria) this;
        }

        public Criteria andLaccperEqualTo(String value) {
            addCriterion("LACCPER =", value, "laccper");
            return (Criteria) this;
        }

        public Criteria andLaccperNotEqualTo(String value) {
            addCriterion("LACCPER <>", value, "laccper");
            return (Criteria) this;
        }

        public Criteria andLaccperGreaterThan(String value) {
            addCriterion("LACCPER >", value, "laccper");
            return (Criteria) this;
        }

        public Criteria andLaccperGreaterThanOrEqualTo(String value) {
            addCriterion("LACCPER >=", value, "laccper");
            return (Criteria) this;
        }

        public Criteria andLaccperLessThan(String value) {
            addCriterion("LACCPER <", value, "laccper");
            return (Criteria) this;
        }

        public Criteria andLaccperLessThanOrEqualTo(String value) {
            addCriterion("LACCPER <=", value, "laccper");
            return (Criteria) this;
        }

        public Criteria andLaccperLike(String value) {
            addCriterion("LACCPER like", value, "laccper");
            return (Criteria) this;
        }

        public Criteria andLaccperNotLike(String value) {
            addCriterion("LACCPER not like", value, "laccper");
            return (Criteria) this;
        }

        public Criteria andLaccperIn(List<String> values) {
            addCriterion("LACCPER in", values, "laccper");
            return (Criteria) this;
        }

        public Criteria andLaccperNotIn(List<String> values) {
            addCriterion("LACCPER not in", values, "laccper");
            return (Criteria) this;
        }

        public Criteria andLaccperBetween(String value1, String value2) {
            addCriterion("LACCPER between", value1, value2, "laccper");
            return (Criteria) this;
        }

        public Criteria andLaccperNotBetween(String value1, String value2) {
            addCriterion("LACCPER not between", value1, value2, "laccper");
            return (Criteria) this;
        }

        public Criteria andLprepperIsNull() {
            addCriterion("LPREPPER is null");
            return (Criteria) this;
        }

        public Criteria andLprepperIsNotNull() {
            addCriterion("LPREPPER is not null");
            return (Criteria) this;
        }

        public Criteria andLprepperEqualTo(String value) {
            addCriterion("LPREPPER =", value, "lprepper");
            return (Criteria) this;
        }

        public Criteria andLprepperNotEqualTo(String value) {
            addCriterion("LPREPPER <>", value, "lprepper");
            return (Criteria) this;
        }

        public Criteria andLprepperGreaterThan(String value) {
            addCriterion("LPREPPER >", value, "lprepper");
            return (Criteria) this;
        }

        public Criteria andLprepperGreaterThanOrEqualTo(String value) {
            addCriterion("LPREPPER >=", value, "lprepper");
            return (Criteria) this;
        }

        public Criteria andLprepperLessThan(String value) {
            addCriterion("LPREPPER <", value, "lprepper");
            return (Criteria) this;
        }

        public Criteria andLprepperLessThanOrEqualTo(String value) {
            addCriterion("LPREPPER <=", value, "lprepper");
            return (Criteria) this;
        }

        public Criteria andLprepperLike(String value) {
            addCriterion("LPREPPER like", value, "lprepper");
            return (Criteria) this;
        }

        public Criteria andLprepperNotLike(String value) {
            addCriterion("LPREPPER not like", value, "lprepper");
            return (Criteria) this;
        }

        public Criteria andLprepperIn(List<String> values) {
            addCriterion("LPREPPER in", values, "lprepper");
            return (Criteria) this;
        }

        public Criteria andLprepperNotIn(List<String> values) {
            addCriterion("LPREPPER not in", values, "lprepper");
            return (Criteria) this;
        }

        public Criteria andLprepperBetween(String value1, String value2) {
            addCriterion("LPREPPER between", value1, value2, "lprepper");
            return (Criteria) this;
        }

        public Criteria andLprepperNotBetween(String value1, String value2) {
            addCriterion("LPREPPER not between", value1, value2, "lprepper");
            return (Criteria) this;
        }

        public Criteria andRwstdateIsNull() {
            addCriterion("RWSTDATE is null");
            return (Criteria) this;
        }

        public Criteria andRwstdateIsNotNull() {
            addCriterion("RWSTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andRwstdateEqualTo(Date value) {
            addCriterion("RWSTDATE =", value, "rwstdate");
            return (Criteria) this;
        }

        public Criteria andRwstdateNotEqualTo(Date value) {
            addCriterion("RWSTDATE <>", value, "rwstdate");
            return (Criteria) this;
        }

        public Criteria andRwstdateGreaterThan(Date value) {
            addCriterion("RWSTDATE >", value, "rwstdate");
            return (Criteria) this;
        }

        public Criteria andRwstdateGreaterThanOrEqualTo(Date value) {
            addCriterion("RWSTDATE >=", value, "rwstdate");
            return (Criteria) this;
        }

        public Criteria andRwstdateLessThan(Date value) {
            addCriterion("RWSTDATE <", value, "rwstdate");
            return (Criteria) this;
        }

        public Criteria andRwstdateLessThanOrEqualTo(Date value) {
            addCriterion("RWSTDATE <=", value, "rwstdate");
            return (Criteria) this;
        }

        public Criteria andRwstdateIn(List<Date> values) {
            addCriterion("RWSTDATE in", values, "rwstdate");
            return (Criteria) this;
        }

        public Criteria andRwstdateNotIn(List<Date> values) {
            addCriterion("RWSTDATE not in", values, "rwstdate");
            return (Criteria) this;
        }

        public Criteria andRwstdateBetween(Date value1, Date value2) {
            addCriterion("RWSTDATE between", value1, value2, "rwstdate");
            return (Criteria) this;
        }

        public Criteria andRwstdateNotBetween(Date value1, Date value2) {
            addCriterion("RWSTDATE not between", value1, value2, "rwstdate");
            return (Criteria) this;
        }

        public Criteria andRwendateIsNull() {
            addCriterion("RWENDATE is null");
            return (Criteria) this;
        }

        public Criteria andRwendateIsNotNull() {
            addCriterion("RWENDATE is not null");
            return (Criteria) this;
        }

        public Criteria andRwendateEqualTo(Date value) {
            addCriterion("RWENDATE =", value, "rwendate");
            return (Criteria) this;
        }

        public Criteria andRwendateNotEqualTo(Date value) {
            addCriterion("RWENDATE <>", value, "rwendate");
            return (Criteria) this;
        }

        public Criteria andRwendateGreaterThan(Date value) {
            addCriterion("RWENDATE >", value, "rwendate");
            return (Criteria) this;
        }

        public Criteria andRwendateGreaterThanOrEqualTo(Date value) {
            addCriterion("RWENDATE >=", value, "rwendate");
            return (Criteria) this;
        }

        public Criteria andRwendateLessThan(Date value) {
            addCriterion("RWENDATE <", value, "rwendate");
            return (Criteria) this;
        }

        public Criteria andRwendateLessThanOrEqualTo(Date value) {
            addCriterion("RWENDATE <=", value, "rwendate");
            return (Criteria) this;
        }

        public Criteria andRwendateIn(List<Date> values) {
            addCriterion("RWENDATE in", values, "rwendate");
            return (Criteria) this;
        }

        public Criteria andRwendateNotIn(List<Date> values) {
            addCriterion("RWENDATE not in", values, "rwendate");
            return (Criteria) this;
        }

        public Criteria andRwendateBetween(Date value1, Date value2) {
            addCriterion("RWENDATE between", value1, value2, "rwendate");
            return (Criteria) this;
        }

        public Criteria andRwendateNotBetween(Date value1, Date value2) {
            addCriterion("RWENDATE not between", value1, value2, "rwendate");
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