package com.baidu.domain;

import java.util.ArrayList;
import java.util.List;

public class GradeInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GradeInfoExample() {
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

        public Criteria andTnidIsNull() {
            addCriterion("tnId is null");
            return (Criteria) this;
        }

        public Criteria andTnidIsNotNull() {
            addCriterion("tnId is not null");
            return (Criteria) this;
        }

        public Criteria andTnidEqualTo(Integer value) {
            addCriterion("tnId =", value, "tnid");
            return (Criteria) this;
        }

        public Criteria andTnidNotEqualTo(Integer value) {
            addCriterion("tnId <>", value, "tnid");
            return (Criteria) this;
        }

        public Criteria andTnidGreaterThan(Integer value) {
            addCriterion("tnId >", value, "tnid");
            return (Criteria) this;
        }

        public Criteria andTnidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tnId >=", value, "tnid");
            return (Criteria) this;
        }

        public Criteria andTnidLessThan(Integer value) {
            addCriterion("tnId <", value, "tnid");
            return (Criteria) this;
        }

        public Criteria andTnidLessThanOrEqualTo(Integer value) {
            addCriterion("tnId <=", value, "tnid");
            return (Criteria) this;
        }

        public Criteria andTnidIn(List<Integer> values) {
            addCriterion("tnId in", values, "tnid");
            return (Criteria) this;
        }

        public Criteria andTnidNotIn(List<Integer> values) {
            addCriterion("tnId not in", values, "tnid");
            return (Criteria) this;
        }

        public Criteria andTnidBetween(Integer value1, Integer value2) {
            addCriterion("tnId between", value1, value2, "tnid");
            return (Criteria) this;
        }

        public Criteria andTnidNotBetween(Integer value1, Integer value2) {
            addCriterion("tnId not between", value1, value2, "tnid");
            return (Criteria) this;
        }

        public Criteria andGradecodeIsNull() {
            addCriterion("gradeCode is null");
            return (Criteria) this;
        }

        public Criteria andGradecodeIsNotNull() {
            addCriterion("gradeCode is not null");
            return (Criteria) this;
        }

        public Criteria andGradecodeEqualTo(Integer value) {
            addCriterion("gradeCode =", value, "gradecode");
            return (Criteria) this;
        }

        public Criteria andGradecodeNotEqualTo(Integer value) {
            addCriterion("gradeCode <>", value, "gradecode");
            return (Criteria) this;
        }

        public Criteria andGradecodeGreaterThan(Integer value) {
            addCriterion("gradeCode >", value, "gradecode");
            return (Criteria) this;
        }

        public Criteria andGradecodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("gradeCode >=", value, "gradecode");
            return (Criteria) this;
        }

        public Criteria andGradecodeLessThan(Integer value) {
            addCriterion("gradeCode <", value, "gradecode");
            return (Criteria) this;
        }

        public Criteria andGradecodeLessThanOrEqualTo(Integer value) {
            addCriterion("gradeCode <=", value, "gradecode");
            return (Criteria) this;
        }

        public Criteria andGradecodeIn(List<Integer> values) {
            addCriterion("gradeCode in", values, "gradecode");
            return (Criteria) this;
        }

        public Criteria andGradecodeNotIn(List<Integer> values) {
            addCriterion("gradeCode not in", values, "gradecode");
            return (Criteria) this;
        }

        public Criteria andGradecodeBetween(Integer value1, Integer value2) {
            addCriterion("gradeCode between", value1, value2, "gradecode");
            return (Criteria) this;
        }

        public Criteria andGradecodeNotBetween(Integer value1, Integer value2) {
            addCriterion("gradeCode not between", value1, value2, "gradecode");
            return (Criteria) this;
        }

        public Criteria andGradeIsNull() {
            addCriterion("grade is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("grade is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(String value) {
            addCriterion("grade =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(String value) {
            addCriterion("grade <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(String value) {
            addCriterion("grade >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(String value) {
            addCriterion("grade >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(String value) {
            addCriterion("grade <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(String value) {
            addCriterion("grade <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLike(String value) {
            addCriterion("grade like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotLike(String value) {
            addCriterion("grade not like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<String> values) {
            addCriterion("grade in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<String> values) {
            addCriterion("grade not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(String value1, String value2) {
            addCriterion("grade between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(String value1, String value2) {
            addCriterion("grade not between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGOrderIsNull() {
            addCriterion("g_order is null");
            return (Criteria) this;
        }

        public Criteria andGOrderIsNotNull() {
            addCriterion("g_order is not null");
            return (Criteria) this;
        }

        public Criteria andGOrderEqualTo(Integer value) {
            addCriterion("g_order =", value, "gOrder");
            return (Criteria) this;
        }

        public Criteria andGOrderNotEqualTo(Integer value) {
            addCriterion("g_order <>", value, "gOrder");
            return (Criteria) this;
        }

        public Criteria andGOrderGreaterThan(Integer value) {
            addCriterion("g_order >", value, "gOrder");
            return (Criteria) this;
        }

        public Criteria andGOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("g_order >=", value, "gOrder");
            return (Criteria) this;
        }

        public Criteria andGOrderLessThan(Integer value) {
            addCriterion("g_order <", value, "gOrder");
            return (Criteria) this;
        }

        public Criteria andGOrderLessThanOrEqualTo(Integer value) {
            addCriterion("g_order <=", value, "gOrder");
            return (Criteria) this;
        }

        public Criteria andGOrderIn(List<Integer> values) {
            addCriterion("g_order in", values, "gOrder");
            return (Criteria) this;
        }

        public Criteria andGOrderNotIn(List<Integer> values) {
            addCriterion("g_order not in", values, "gOrder");
            return (Criteria) this;
        }

        public Criteria andGOrderBetween(Integer value1, Integer value2) {
            addCriterion("g_order between", value1, value2, "gOrder");
            return (Criteria) this;
        }

        public Criteria andGOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("g_order not between", value1, value2, "gOrder");
            return (Criteria) this;
        }

        public Criteria andYearIsNull() {
            addCriterion("year is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("year is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(Integer value) {
            addCriterion("year =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(Integer value) {
            addCriterion("year <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(Integer value) {
            addCriterion("year >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("year >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(Integer value) {
            addCriterion("year <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(Integer value) {
            addCriterion("year <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<Integer> values) {
            addCriterion("year in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<Integer> values) {
            addCriterion("year not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(Integer value1, Integer value2) {
            addCriterion("year between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(Integer value1, Integer value2) {
            addCriterion("year not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andClasstypeIsNull() {
            addCriterion("classType is null");
            return (Criteria) this;
        }

        public Criteria andClasstypeIsNotNull() {
            addCriterion("classType is not null");
            return (Criteria) this;
        }

        public Criteria andClasstypeEqualTo(Byte value) {
            addCriterion("classType =", value, "classtype");
            return (Criteria) this;
        }

        public Criteria andClasstypeNotEqualTo(Byte value) {
            addCriterion("classType <>", value, "classtype");
            return (Criteria) this;
        }

        public Criteria andClasstypeGreaterThan(Byte value) {
            addCriterion("classType >", value, "classtype");
            return (Criteria) this;
        }

        public Criteria andClasstypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("classType >=", value, "classtype");
            return (Criteria) this;
        }

        public Criteria andClasstypeLessThan(Byte value) {
            addCriterion("classType <", value, "classtype");
            return (Criteria) this;
        }

        public Criteria andClasstypeLessThanOrEqualTo(Byte value) {
            addCriterion("classType <=", value, "classtype");
            return (Criteria) this;
        }

        public Criteria andClasstypeIn(List<Byte> values) {
            addCriterion("classType in", values, "classtype");
            return (Criteria) this;
        }

        public Criteria andClasstypeNotIn(List<Byte> values) {
            addCriterion("classType not in", values, "classtype");
            return (Criteria) this;
        }

        public Criteria andClasstypeBetween(Byte value1, Byte value2) {
            addCriterion("classType between", value1, value2, "classtype");
            return (Criteria) this;
        }

        public Criteria andClasstypeNotBetween(Byte value1, Byte value2) {
            addCriterion("classType not between", value1, value2, "classtype");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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