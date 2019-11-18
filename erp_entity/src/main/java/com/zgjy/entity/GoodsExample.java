package com.zgjy.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsExample() {
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

        public Criteria andGidIsNull() {
            addCriterion("gid is null");
            return (Criteria) this;
        }

        public Criteria andGidIsNotNull() {
            addCriterion("gid is not null");
            return (Criteria) this;
        }

        public Criteria andGidEqualTo(Integer value) {
            addCriterion("gid =", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotEqualTo(Integer value) {
            addCriterion("gid <>", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThan(Integer value) {
            addCriterion("gid >", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gid >=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThan(Integer value) {
            addCriterion("gid <", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThanOrEqualTo(Integer value) {
            addCriterion("gid <=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidIn(List<Integer> values) {
            addCriterion("gid in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotIn(List<Integer> values) {
            addCriterion("gid not in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidBetween(Integer value1, Integer value2) {
            addCriterion("gid between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotBetween(Integer value1, Integer value2) {
            addCriterion("gid not between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andGnameIsNull() {
            addCriterion("gname is null");
            return (Criteria) this;
        }

        public Criteria andGnameIsNotNull() {
            addCriterion("gname is not null");
            return (Criteria) this;
        }

        public Criteria andGnameEqualTo(String value) {
            addCriterion("gname =", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotEqualTo(String value) {
            addCriterion("gname <>", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameGreaterThan(String value) {
            addCriterion("gname >", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameGreaterThanOrEqualTo(String value) {
            addCriterion("gname >=", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLessThan(String value) {
            addCriterion("gname <", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLessThanOrEqualTo(String value) {
            addCriterion("gname <=", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLike(String value) {
            addCriterion("gname like", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotLike(String value) {
            addCriterion("gname not like", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameIn(List<String> values) {
            addCriterion("gname in", values, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotIn(List<String> values) {
            addCriterion("gname not in", values, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameBetween(String value1, String value2) {
            addCriterion("gname between", value1, value2, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotBetween(String value1, String value2) {
            addCriterion("gname not between", value1, value2, "gname");
            return (Criteria) this;
        }

        public Criteria andOriginIsNull() {
            addCriterion("origin is null");
            return (Criteria) this;
        }

        public Criteria andOriginIsNotNull() {
            addCriterion("origin is not null");
            return (Criteria) this;
        }

        public Criteria andOriginEqualTo(String value) {
            addCriterion("origin =", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotEqualTo(String value) {
            addCriterion("origin <>", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginGreaterThan(String value) {
            addCriterion("origin >", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginGreaterThanOrEqualTo(String value) {
            addCriterion("origin >=", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginLessThan(String value) {
            addCriterion("origin <", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginLessThanOrEqualTo(String value) {
            addCriterion("origin <=", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginLike(String value) {
            addCriterion("origin like", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotLike(String value) {
            addCriterion("origin not like", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginIn(List<String> values) {
            addCriterion("origin in", values, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotIn(List<String> values) {
            addCriterion("origin not in", values, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginBetween(String value1, String value2) {
            addCriterion("origin between", value1, value2, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotBetween(String value1, String value2) {
            addCriterion("origin not between", value1, value2, "origin");
            return (Criteria) this;
        }

        public Criteria andProducterIsNull() {
            addCriterion("producter is null");
            return (Criteria) this;
        }

        public Criteria andProducterIsNotNull() {
            addCriterion("producter is not null");
            return (Criteria) this;
        }

        public Criteria andProducterEqualTo(String value) {
            addCriterion("producter =", value, "producter");
            return (Criteria) this;
        }

        public Criteria andProducterNotEqualTo(String value) {
            addCriterion("producter <>", value, "producter");
            return (Criteria) this;
        }

        public Criteria andProducterGreaterThan(String value) {
            addCriterion("producter >", value, "producter");
            return (Criteria) this;
        }

        public Criteria andProducterGreaterThanOrEqualTo(String value) {
            addCriterion("producter >=", value, "producter");
            return (Criteria) this;
        }

        public Criteria andProducterLessThan(String value) {
            addCriterion("producter <", value, "producter");
            return (Criteria) this;
        }

        public Criteria andProducterLessThanOrEqualTo(String value) {
            addCriterion("producter <=", value, "producter");
            return (Criteria) this;
        }

        public Criteria andProducterLike(String value) {
            addCriterion("producter like", value, "producter");
            return (Criteria) this;
        }

        public Criteria andProducterNotLike(String value) {
            addCriterion("producter not like", value, "producter");
            return (Criteria) this;
        }

        public Criteria andProducterIn(List<String> values) {
            addCriterion("producter in", values, "producter");
            return (Criteria) this;
        }

        public Criteria andProducterNotIn(List<String> values) {
            addCriterion("producter not in", values, "producter");
            return (Criteria) this;
        }

        public Criteria andProducterBetween(String value1, String value2) {
            addCriterion("producter between", value1, value2, "producter");
            return (Criteria) this;
        }

        public Criteria andProducterNotBetween(String value1, String value2) {
            addCriterion("producter not between", value1, value2, "producter");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andInpriceIsNull() {
            addCriterion("inprice is null");
            return (Criteria) this;
        }

        public Criteria andInpriceIsNotNull() {
            addCriterion("inprice is not null");
            return (Criteria) this;
        }

        public Criteria andInpriceEqualTo(BigDecimal value) {
            addCriterion("inprice =", value, "inprice");
            return (Criteria) this;
        }

        public Criteria andInpriceNotEqualTo(BigDecimal value) {
            addCriterion("inprice <>", value, "inprice");
            return (Criteria) this;
        }

        public Criteria andInpriceGreaterThan(BigDecimal value) {
            addCriterion("inprice >", value, "inprice");
            return (Criteria) this;
        }

        public Criteria andInpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("inprice >=", value, "inprice");
            return (Criteria) this;
        }

        public Criteria andInpriceLessThan(BigDecimal value) {
            addCriterion("inprice <", value, "inprice");
            return (Criteria) this;
        }

        public Criteria andInpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("inprice <=", value, "inprice");
            return (Criteria) this;
        }

        public Criteria andInpriceIn(List<BigDecimal> values) {
            addCriterion("inprice in", values, "inprice");
            return (Criteria) this;
        }

        public Criteria andInpriceNotIn(List<BigDecimal> values) {
            addCriterion("inprice not in", values, "inprice");
            return (Criteria) this;
        }

        public Criteria andInpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("inprice between", value1, value2, "inprice");
            return (Criteria) this;
        }

        public Criteria andInpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("inprice not between", value1, value2, "inprice");
            return (Criteria) this;
        }

        public Criteria andOutpriceIsNull() {
            addCriterion("outprice is null");
            return (Criteria) this;
        }

        public Criteria andOutpriceIsNotNull() {
            addCriterion("outprice is not null");
            return (Criteria) this;
        }

        public Criteria andOutpriceEqualTo(BigDecimal value) {
            addCriterion("outprice =", value, "outprice");
            return (Criteria) this;
        }

        public Criteria andOutpriceNotEqualTo(BigDecimal value) {
            addCriterion("outprice <>", value, "outprice");
            return (Criteria) this;
        }

        public Criteria andOutpriceGreaterThan(BigDecimal value) {
            addCriterion("outprice >", value, "outprice");
            return (Criteria) this;
        }

        public Criteria andOutpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("outprice >=", value, "outprice");
            return (Criteria) this;
        }

        public Criteria andOutpriceLessThan(BigDecimal value) {
            addCriterion("outprice <", value, "outprice");
            return (Criteria) this;
        }

        public Criteria andOutpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("outprice <=", value, "outprice");
            return (Criteria) this;
        }

        public Criteria andOutpriceIn(List<BigDecimal> values) {
            addCriterion("outprice in", values, "outprice");
            return (Criteria) this;
        }

        public Criteria andOutpriceNotIn(List<BigDecimal> values) {
            addCriterion("outprice not in", values, "outprice");
            return (Criteria) this;
        }

        public Criteria andOutpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("outprice between", value1, value2, "outprice");
            return (Criteria) this;
        }

        public Criteria andOutpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("outprice not between", value1, value2, "outprice");
            return (Criteria) this;
        }

        public Criteria andGcidIsNull() {
            addCriterion("gcid is null");
            return (Criteria) this;
        }

        public Criteria andGcidIsNotNull() {
            addCriterion("gcid is not null");
            return (Criteria) this;
        }

        public Criteria andGcidEqualTo(Integer value) {
            addCriterion("gcid =", value, "gcid");
            return (Criteria) this;
        }

        public Criteria andGcidNotEqualTo(Integer value) {
            addCriterion("gcid <>", value, "gcid");
            return (Criteria) this;
        }

        public Criteria andGcidGreaterThan(Integer value) {
            addCriterion("gcid >", value, "gcid");
            return (Criteria) this;
        }

        public Criteria andGcidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gcid >=", value, "gcid");
            return (Criteria) this;
        }

        public Criteria andGcidLessThan(Integer value) {
            addCriterion("gcid <", value, "gcid");
            return (Criteria) this;
        }

        public Criteria andGcidLessThanOrEqualTo(Integer value) {
            addCriterion("gcid <=", value, "gcid");
            return (Criteria) this;
        }

        public Criteria andGcidIn(List<Integer> values) {
            addCriterion("gcid in", values, "gcid");
            return (Criteria) this;
        }

        public Criteria andGcidNotIn(List<Integer> values) {
            addCriterion("gcid not in", values, "gcid");
            return (Criteria) this;
        }

        public Criteria andGcidBetween(Integer value1, Integer value2) {
            addCriterion("gcid between", value1, value2, "gcid");
            return (Criteria) this;
        }

        public Criteria andGcidNotBetween(Integer value1, Integer value2) {
            addCriterion("gcid not between", value1, value2, "gcid");
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