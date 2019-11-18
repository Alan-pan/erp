package com.zgjy.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersExample() {
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

        public Criteria andOidIsNull() {
            addCriterion("oid is null");
            return (Criteria) this;
        }

        public Criteria andOidIsNotNull() {
            addCriterion("oid is not null");
            return (Criteria) this;
        }

        public Criteria andOidEqualTo(Integer value) {
            addCriterion("oid =", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotEqualTo(Integer value) {
            addCriterion("oid <>", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThan(Integer value) {
            addCriterion("oid >", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThanOrEqualTo(Integer value) {
            addCriterion("oid >=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThan(Integer value) {
            addCriterion("oid <", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThanOrEqualTo(Integer value) {
            addCriterion("oid <=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidIn(List<Integer> values) {
            addCriterion("oid in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotIn(List<Integer> values) {
            addCriterion("oid not in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidBetween(Integer value1, Integer value2) {
            addCriterion("oid between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotBetween(Integer value1, Integer value2) {
            addCriterion("oid not between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andChecktimeIsNull() {
            addCriterion("checktime is null");
            return (Criteria) this;
        }

        public Criteria andChecktimeIsNotNull() {
            addCriterion("checktime is not null");
            return (Criteria) this;
        }

        public Criteria andChecktimeEqualTo(Date value) {
            addCriterion("checktime =", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotEqualTo(Date value) {
            addCriterion("checktime <>", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeGreaterThan(Date value) {
            addCriterion("checktime >", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeGreaterThanOrEqualTo(Date value) {
            addCriterion("checktime >=", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLessThan(Date value) {
            addCriterion("checktime <", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLessThanOrEqualTo(Date value) {
            addCriterion("checktime <=", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeIn(List<Date> values) {
            addCriterion("checktime in", values, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotIn(List<Date> values) {
            addCriterion("checktime not in", values, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeBetween(Date value1, Date value2) {
            addCriterion("checktime between", value1, value2, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotBetween(Date value1, Date value2) {
            addCriterion("checktime not between", value1, value2, "checktime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("starttime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("starttime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterion("starttime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterion("starttime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterion("starttime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("starttime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterion("starttime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("starttime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterion("starttime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterion("starttime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterion("starttime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("starttime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endtime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endtime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterion("endtime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterion("endtime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterion("endtime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("endtime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterion("endtime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("endtime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterion("endtime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterion("endtime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterion("endtime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("endtime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(Integer value) {
            addCriterion("creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(Integer value) {
            addCriterion("creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(Integer value) {
            addCriterion("creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(Integer value) {
            addCriterion("creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(Integer value) {
            addCriterion("creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(Integer value) {
            addCriterion("creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<Integer> values) {
            addCriterion("creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<Integer> values) {
            addCriterion("creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(Integer value1, Integer value2) {
            addCriterion("creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(Integer value1, Integer value2) {
            addCriterion("creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaternameIsNull() {
            addCriterion("createrName is null");
            return (Criteria) this;
        }

        public Criteria andCreaternameIsNotNull() {
            addCriterion("createrName is not null");
            return (Criteria) this;
        }

        public Criteria andCreaternameEqualTo(String value) {
            addCriterion("createrName =", value, "creatername");
            return (Criteria) this;
        }

        public Criteria andCreaternameNotEqualTo(String value) {
            addCriterion("createrName <>", value, "creatername");
            return (Criteria) this;
        }

        public Criteria andCreaternameGreaterThan(String value) {
            addCriterion("createrName >", value, "creatername");
            return (Criteria) this;
        }

        public Criteria andCreaternameGreaterThanOrEqualTo(String value) {
            addCriterion("createrName >=", value, "creatername");
            return (Criteria) this;
        }

        public Criteria andCreaternameLessThan(String value) {
            addCriterion("createrName <", value, "creatername");
            return (Criteria) this;
        }

        public Criteria andCreaternameLessThanOrEqualTo(String value) {
            addCriterion("createrName <=", value, "creatername");
            return (Criteria) this;
        }

        public Criteria andCreaternameLike(String value) {
            addCriterion("createrName like", value, "creatername");
            return (Criteria) this;
        }

        public Criteria andCreaternameNotLike(String value) {
            addCriterion("createrName not like", value, "creatername");
            return (Criteria) this;
        }

        public Criteria andCreaternameIn(List<String> values) {
            addCriterion("createrName in", values, "creatername");
            return (Criteria) this;
        }

        public Criteria andCreaternameNotIn(List<String> values) {
            addCriterion("createrName not in", values, "creatername");
            return (Criteria) this;
        }

        public Criteria andCreaternameBetween(String value1, String value2) {
            addCriterion("createrName between", value1, value2, "creatername");
            return (Criteria) this;
        }

        public Criteria andCreaternameNotBetween(String value1, String value2) {
            addCriterion("createrName not between", value1, value2, "creatername");
            return (Criteria) this;
        }

        public Criteria andCheckerIsNull() {
            addCriterion("checker is null");
            return (Criteria) this;
        }

        public Criteria andCheckerIsNotNull() {
            addCriterion("checker is not null");
            return (Criteria) this;
        }

        public Criteria andCheckerEqualTo(Integer value) {
            addCriterion("checker =", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerNotEqualTo(Integer value) {
            addCriterion("checker <>", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerGreaterThan(Integer value) {
            addCriterion("checker >", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerGreaterThanOrEqualTo(Integer value) {
            addCriterion("checker >=", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerLessThan(Integer value) {
            addCriterion("checker <", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerLessThanOrEqualTo(Integer value) {
            addCriterion("checker <=", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerIn(List<Integer> values) {
            addCriterion("checker in", values, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerNotIn(List<Integer> values) {
            addCriterion("checker not in", values, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerBetween(Integer value1, Integer value2) {
            addCriterion("checker between", value1, value2, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerNotBetween(Integer value1, Integer value2) {
            addCriterion("checker not between", value1, value2, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckernameIsNull() {
            addCriterion("checkerName is null");
            return (Criteria) this;
        }

        public Criteria andCheckernameIsNotNull() {
            addCriterion("checkerName is not null");
            return (Criteria) this;
        }

        public Criteria andCheckernameEqualTo(String value) {
            addCriterion("checkerName =", value, "checkername");
            return (Criteria) this;
        }

        public Criteria andCheckernameNotEqualTo(String value) {
            addCriterion("checkerName <>", value, "checkername");
            return (Criteria) this;
        }

        public Criteria andCheckernameGreaterThan(String value) {
            addCriterion("checkerName >", value, "checkername");
            return (Criteria) this;
        }

        public Criteria andCheckernameGreaterThanOrEqualTo(String value) {
            addCriterion("checkerName >=", value, "checkername");
            return (Criteria) this;
        }

        public Criteria andCheckernameLessThan(String value) {
            addCriterion("checkerName <", value, "checkername");
            return (Criteria) this;
        }

        public Criteria andCheckernameLessThanOrEqualTo(String value) {
            addCriterion("checkerName <=", value, "checkername");
            return (Criteria) this;
        }

        public Criteria andCheckernameLike(String value) {
            addCriterion("checkerName like", value, "checkername");
            return (Criteria) this;
        }

        public Criteria andCheckernameNotLike(String value) {
            addCriterion("checkerName not like", value, "checkername");
            return (Criteria) this;
        }

        public Criteria andCheckernameIn(List<String> values) {
            addCriterion("checkerName in", values, "checkername");
            return (Criteria) this;
        }

        public Criteria andCheckernameNotIn(List<String> values) {
            addCriterion("checkerName not in", values, "checkername");
            return (Criteria) this;
        }

        public Criteria andCheckernameBetween(String value1, String value2) {
            addCriterion("checkerName between", value1, value2, "checkername");
            return (Criteria) this;
        }

        public Criteria andCheckernameNotBetween(String value1, String value2) {
            addCriterion("checkerName not between", value1, value2, "checkername");
            return (Criteria) this;
        }

        public Criteria andStarterIsNull() {
            addCriterion("starter is null");
            return (Criteria) this;
        }

        public Criteria andStarterIsNotNull() {
            addCriterion("starter is not null");
            return (Criteria) this;
        }

        public Criteria andStarterEqualTo(Integer value) {
            addCriterion("starter =", value, "starter");
            return (Criteria) this;
        }

        public Criteria andStarterNotEqualTo(Integer value) {
            addCriterion("starter <>", value, "starter");
            return (Criteria) this;
        }

        public Criteria andStarterGreaterThan(Integer value) {
            addCriterion("starter >", value, "starter");
            return (Criteria) this;
        }

        public Criteria andStarterGreaterThanOrEqualTo(Integer value) {
            addCriterion("starter >=", value, "starter");
            return (Criteria) this;
        }

        public Criteria andStarterLessThan(Integer value) {
            addCriterion("starter <", value, "starter");
            return (Criteria) this;
        }

        public Criteria andStarterLessThanOrEqualTo(Integer value) {
            addCriterion("starter <=", value, "starter");
            return (Criteria) this;
        }

        public Criteria andStarterIn(List<Integer> values) {
            addCriterion("starter in", values, "starter");
            return (Criteria) this;
        }

        public Criteria andStarterNotIn(List<Integer> values) {
            addCriterion("starter not in", values, "starter");
            return (Criteria) this;
        }

        public Criteria andStarterBetween(Integer value1, Integer value2) {
            addCriterion("starter between", value1, value2, "starter");
            return (Criteria) this;
        }

        public Criteria andStarterNotBetween(Integer value1, Integer value2) {
            addCriterion("starter not between", value1, value2, "starter");
            return (Criteria) this;
        }

        public Criteria andStarternameIsNull() {
            addCriterion("starterName is null");
            return (Criteria) this;
        }

        public Criteria andStarternameIsNotNull() {
            addCriterion("starterName is not null");
            return (Criteria) this;
        }

        public Criteria andStarternameEqualTo(String value) {
            addCriterion("starterName =", value, "startername");
            return (Criteria) this;
        }

        public Criteria andStarternameNotEqualTo(String value) {
            addCriterion("starterName <>", value, "startername");
            return (Criteria) this;
        }

        public Criteria andStarternameGreaterThan(String value) {
            addCriterion("starterName >", value, "startername");
            return (Criteria) this;
        }

        public Criteria andStarternameGreaterThanOrEqualTo(String value) {
            addCriterion("starterName >=", value, "startername");
            return (Criteria) this;
        }

        public Criteria andStarternameLessThan(String value) {
            addCriterion("starterName <", value, "startername");
            return (Criteria) this;
        }

        public Criteria andStarternameLessThanOrEqualTo(String value) {
            addCriterion("starterName <=", value, "startername");
            return (Criteria) this;
        }

        public Criteria andStarternameLike(String value) {
            addCriterion("starterName like", value, "startername");
            return (Criteria) this;
        }

        public Criteria andStarternameNotLike(String value) {
            addCriterion("starterName not like", value, "startername");
            return (Criteria) this;
        }

        public Criteria andStarternameIn(List<String> values) {
            addCriterion("starterName in", values, "startername");
            return (Criteria) this;
        }

        public Criteria andStarternameNotIn(List<String> values) {
            addCriterion("starterName not in", values, "startername");
            return (Criteria) this;
        }

        public Criteria andStarternameBetween(String value1, String value2) {
            addCriterion("starterName between", value1, value2, "startername");
            return (Criteria) this;
        }

        public Criteria andStarternameNotBetween(String value1, String value2) {
            addCriterion("starterName not between", value1, value2, "startername");
            return (Criteria) this;
        }

        public Criteria andEnderIsNull() {
            addCriterion("ender is null");
            return (Criteria) this;
        }

        public Criteria andEnderIsNotNull() {
            addCriterion("ender is not null");
            return (Criteria) this;
        }

        public Criteria andEnderEqualTo(Integer value) {
            addCriterion("ender =", value, "ender");
            return (Criteria) this;
        }

        public Criteria andEnderNotEqualTo(Integer value) {
            addCriterion("ender <>", value, "ender");
            return (Criteria) this;
        }

        public Criteria andEnderGreaterThan(Integer value) {
            addCriterion("ender >", value, "ender");
            return (Criteria) this;
        }

        public Criteria andEnderGreaterThanOrEqualTo(Integer value) {
            addCriterion("ender >=", value, "ender");
            return (Criteria) this;
        }

        public Criteria andEnderLessThan(Integer value) {
            addCriterion("ender <", value, "ender");
            return (Criteria) this;
        }

        public Criteria andEnderLessThanOrEqualTo(Integer value) {
            addCriterion("ender <=", value, "ender");
            return (Criteria) this;
        }

        public Criteria andEnderIn(List<Integer> values) {
            addCriterion("ender in", values, "ender");
            return (Criteria) this;
        }

        public Criteria andEnderNotIn(List<Integer> values) {
            addCriterion("ender not in", values, "ender");
            return (Criteria) this;
        }

        public Criteria andEnderBetween(Integer value1, Integer value2) {
            addCriterion("ender between", value1, value2, "ender");
            return (Criteria) this;
        }

        public Criteria andEnderNotBetween(Integer value1, Integer value2) {
            addCriterion("ender not between", value1, value2, "ender");
            return (Criteria) this;
        }

        public Criteria andEndernameIsNull() {
            addCriterion("enderName is null");
            return (Criteria) this;
        }

        public Criteria andEndernameIsNotNull() {
            addCriterion("enderName is not null");
            return (Criteria) this;
        }

        public Criteria andEndernameEqualTo(String value) {
            addCriterion("enderName =", value, "endername");
            return (Criteria) this;
        }

        public Criteria andEndernameNotEqualTo(String value) {
            addCriterion("enderName <>", value, "endername");
            return (Criteria) this;
        }

        public Criteria andEndernameGreaterThan(String value) {
            addCriterion("enderName >", value, "endername");
            return (Criteria) this;
        }

        public Criteria andEndernameGreaterThanOrEqualTo(String value) {
            addCriterion("enderName >=", value, "endername");
            return (Criteria) this;
        }

        public Criteria andEndernameLessThan(String value) {
            addCriterion("enderName <", value, "endername");
            return (Criteria) this;
        }

        public Criteria andEndernameLessThanOrEqualTo(String value) {
            addCriterion("enderName <=", value, "endername");
            return (Criteria) this;
        }

        public Criteria andEndernameLike(String value) {
            addCriterion("enderName like", value, "endername");
            return (Criteria) this;
        }

        public Criteria andEndernameNotLike(String value) {
            addCriterion("enderName not like", value, "endername");
            return (Criteria) this;
        }

        public Criteria andEndernameIn(List<String> values) {
            addCriterion("enderName in", values, "endername");
            return (Criteria) this;
        }

        public Criteria andEndernameNotIn(List<String> values) {
            addCriterion("enderName not in", values, "endername");
            return (Criteria) this;
        }

        public Criteria andEndernameBetween(String value1, String value2) {
            addCriterion("enderName between", value1, value2, "endername");
            return (Criteria) this;
        }

        public Criteria andEndernameNotBetween(String value1, String value2) {
            addCriterion("enderName not between", value1, value2, "endername");
            return (Criteria) this;
        }

        public Criteria andSupplierIsNull() {
            addCriterion("supplier is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIsNotNull() {
            addCriterion("supplier is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierEqualTo(Integer value) {
            addCriterion("supplier =", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotEqualTo(Integer value) {
            addCriterion("supplier <>", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierGreaterThan(Integer value) {
            addCriterion("supplier >", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierGreaterThanOrEqualTo(Integer value) {
            addCriterion("supplier >=", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLessThan(Integer value) {
            addCriterion("supplier <", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLessThanOrEqualTo(Integer value) {
            addCriterion("supplier <=", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierIn(List<Integer> values) {
            addCriterion("supplier in", values, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotIn(List<Integer> values) {
            addCriterion("supplier not in", values, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierBetween(Integer value1, Integer value2) {
            addCriterion("supplier between", value1, value2, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotBetween(Integer value1, Integer value2) {
            addCriterion("supplier not between", value1, value2, "supplier");
            return (Criteria) this;
        }

        public Criteria andSuppliernameIsNull() {
            addCriterion("supplierName is null");
            return (Criteria) this;
        }

        public Criteria andSuppliernameIsNotNull() {
            addCriterion("supplierName is not null");
            return (Criteria) this;
        }

        public Criteria andSuppliernameEqualTo(String value) {
            addCriterion("supplierName =", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameNotEqualTo(String value) {
            addCriterion("supplierName <>", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameGreaterThan(String value) {
            addCriterion("supplierName >", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameGreaterThanOrEqualTo(String value) {
            addCriterion("supplierName >=", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameLessThan(String value) {
            addCriterion("supplierName <", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameLessThanOrEqualTo(String value) {
            addCriterion("supplierName <=", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameLike(String value) {
            addCriterion("supplierName like", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameNotLike(String value) {
            addCriterion("supplierName not like", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameIn(List<String> values) {
            addCriterion("supplierName in", values, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameNotIn(List<String> values) {
            addCriterion("supplierName not in", values, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameBetween(String value1, String value2) {
            addCriterion("supplierName between", value1, value2, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameNotBetween(String value1, String value2) {
            addCriterion("supplierName not between", value1, value2, "suppliername");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyIsNull() {
            addCriterion("totalmoney is null");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyIsNotNull() {
            addCriterion("totalmoney is not null");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyEqualTo(BigDecimal value) {
            addCriterion("totalmoney =", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyNotEqualTo(BigDecimal value) {
            addCriterion("totalmoney <>", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyGreaterThan(BigDecimal value) {
            addCriterion("totalmoney >", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("totalmoney >=", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyLessThan(BigDecimal value) {
            addCriterion("totalmoney <", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("totalmoney <=", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyIn(List<BigDecimal> values) {
            addCriterion("totalmoney in", values, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyNotIn(List<BigDecimal> values) {
            addCriterion("totalmoney not in", values, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totalmoney between", value1, value2, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totalmoney not between", value1, value2, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andWaybillsnoIsNull() {
            addCriterion("waybillsno is null");
            return (Criteria) this;
        }

        public Criteria andWaybillsnoIsNotNull() {
            addCriterion("waybillsno is not null");
            return (Criteria) this;
        }

        public Criteria andWaybillsnoEqualTo(Integer value) {
            addCriterion("waybillsno =", value, "waybillsno");
            return (Criteria) this;
        }

        public Criteria andWaybillsnoNotEqualTo(Integer value) {
            addCriterion("waybillsno <>", value, "waybillsno");
            return (Criteria) this;
        }

        public Criteria andWaybillsnoGreaterThan(Integer value) {
            addCriterion("waybillsno >", value, "waybillsno");
            return (Criteria) this;
        }

        public Criteria andWaybillsnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("waybillsno >=", value, "waybillsno");
            return (Criteria) this;
        }

        public Criteria andWaybillsnoLessThan(Integer value) {
            addCriterion("waybillsno <", value, "waybillsno");
            return (Criteria) this;
        }

        public Criteria andWaybillsnoLessThanOrEqualTo(Integer value) {
            addCriterion("waybillsno <=", value, "waybillsno");
            return (Criteria) this;
        }

        public Criteria andWaybillsnoIn(List<Integer> values) {
            addCriterion("waybillsno in", values, "waybillsno");
            return (Criteria) this;
        }

        public Criteria andWaybillsnoNotIn(List<Integer> values) {
            addCriterion("waybillsno not in", values, "waybillsno");
            return (Criteria) this;
        }

        public Criteria andWaybillsnoBetween(Integer value1, Integer value2) {
            addCriterion("waybillsno between", value1, value2, "waybillsno");
            return (Criteria) this;
        }

        public Criteria andWaybillsnoNotBetween(Integer value1, Integer value2) {
            addCriterion("waybillsno not between", value1, value2, "waybillsno");
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