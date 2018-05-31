package com.baidu.domain;

import java.util.ArrayList;
import java.util.List;

public class SaasClassExcelMapperExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SaasClassExcelMapperExample() {
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

        public Criteria andIdEqualTo(Double value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Double value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Double value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Double value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Double value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Double value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Double> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Double> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Double value1, Double value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Double value1, Double value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andClassGradeIdIsNull() {
            addCriterion("class_grade_id is null");
            return (Criteria) this;
        }

        public Criteria andClassGradeIdIsNotNull() {
            addCriterion("class_grade_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassGradeIdEqualTo(Double value) {
            addCriterion("class_grade_id =", value, "classGradeId");
            return (Criteria) this;
        }

        public Criteria andClassGradeIdNotEqualTo(Double value) {
            addCriterion("class_grade_id <>", value, "classGradeId");
            return (Criteria) this;
        }

        public Criteria andClassGradeIdGreaterThan(Double value) {
            addCriterion("class_grade_id >", value, "classGradeId");
            return (Criteria) this;
        }

        public Criteria andClassGradeIdGreaterThanOrEqualTo(Double value) {
            addCriterion("class_grade_id >=", value, "classGradeId");
            return (Criteria) this;
        }

        public Criteria andClassGradeIdLessThan(Double value) {
            addCriterion("class_grade_id <", value, "classGradeId");
            return (Criteria) this;
        }

        public Criteria andClassGradeIdLessThanOrEqualTo(Double value) {
            addCriterion("class_grade_id <=", value, "classGradeId");
            return (Criteria) this;
        }

        public Criteria andClassGradeIdIn(List<Double> values) {
            addCriterion("class_grade_id in", values, "classGradeId");
            return (Criteria) this;
        }

        public Criteria andClassGradeIdNotIn(List<Double> values) {
            addCriterion("class_grade_id not in", values, "classGradeId");
            return (Criteria) this;
        }

        public Criteria andClassGradeIdBetween(Double value1, Double value2) {
            addCriterion("class_grade_id between", value1, value2, "classGradeId");
            return (Criteria) this;
        }

        public Criteria andClassGradeIdNotBetween(Double value1, Double value2) {
            addCriterion("class_grade_id not between", value1, value2, "classGradeId");
            return (Criteria) this;
        }

        public Criteria andClassGradeIsNull() {
            addCriterion("class_grade is null");
            return (Criteria) this;
        }

        public Criteria andClassGradeIsNotNull() {
            addCriterion("class_grade is not null");
            return (Criteria) this;
        }

        public Criteria andClassGradeEqualTo(String value) {
            addCriterion("class_grade =", value, "classGrade");
            return (Criteria) this;
        }

        public Criteria andClassGradeNotEqualTo(String value) {
            addCriterion("class_grade <>", value, "classGrade");
            return (Criteria) this;
        }

        public Criteria andClassGradeGreaterThan(String value) {
            addCriterion("class_grade >", value, "classGrade");
            return (Criteria) this;
        }

        public Criteria andClassGradeGreaterThanOrEqualTo(String value) {
            addCriterion("class_grade >=", value, "classGrade");
            return (Criteria) this;
        }

        public Criteria andClassGradeLessThan(String value) {
            addCriterion("class_grade <", value, "classGrade");
            return (Criteria) this;
        }

        public Criteria andClassGradeLessThanOrEqualTo(String value) {
            addCriterion("class_grade <=", value, "classGrade");
            return (Criteria) this;
        }

        public Criteria andClassGradeLike(String value) {
            addCriterion("class_grade like", value, "classGrade");
            return (Criteria) this;
        }

        public Criteria andClassGradeNotLike(String value) {
            addCriterion("class_grade not like", value, "classGrade");
            return (Criteria) this;
        }

        public Criteria andClassGradeIn(List<String> values) {
            addCriterion("class_grade in", values, "classGrade");
            return (Criteria) this;
        }

        public Criteria andClassGradeNotIn(List<String> values) {
            addCriterion("class_grade not in", values, "classGrade");
            return (Criteria) this;
        }

        public Criteria andClassGradeBetween(String value1, String value2) {
            addCriterion("class_grade between", value1, value2, "classGrade");
            return (Criteria) this;
        }

        public Criteria andClassGradeNotBetween(String value1, String value2) {
            addCriterion("class_grade not between", value1, value2, "classGrade");
            return (Criteria) this;
        }

        public Criteria andClassGroupIsNull() {
            addCriterion("class_group is null");
            return (Criteria) this;
        }

        public Criteria andClassGroupIsNotNull() {
            addCriterion("class_group is not null");
            return (Criteria) this;
        }

        public Criteria andClassGroupEqualTo(String value) {
            addCriterion("class_group =", value, "classGroup");
            return (Criteria) this;
        }

        public Criteria andClassGroupNotEqualTo(String value) {
            addCriterion("class_group <>", value, "classGroup");
            return (Criteria) this;
        }

        public Criteria andClassGroupGreaterThan(String value) {
            addCriterion("class_group >", value, "classGroup");
            return (Criteria) this;
        }

        public Criteria andClassGroupGreaterThanOrEqualTo(String value) {
            addCriterion("class_group >=", value, "classGroup");
            return (Criteria) this;
        }

        public Criteria andClassGroupLessThan(String value) {
            addCriterion("class_group <", value, "classGroup");
            return (Criteria) this;
        }

        public Criteria andClassGroupLessThanOrEqualTo(String value) {
            addCriterion("class_group <=", value, "classGroup");
            return (Criteria) this;
        }

        public Criteria andClassGroupLike(String value) {
            addCriterion("class_group like", value, "classGroup");
            return (Criteria) this;
        }

        public Criteria andClassGroupNotLike(String value) {
            addCriterion("class_group not like", value, "classGroup");
            return (Criteria) this;
        }

        public Criteria andClassGroupIn(List<String> values) {
            addCriterion("class_group in", values, "classGroup");
            return (Criteria) this;
        }

        public Criteria andClassGroupNotIn(List<String> values) {
            addCriterion("class_group not in", values, "classGroup");
            return (Criteria) this;
        }

        public Criteria andClassGroupBetween(String value1, String value2) {
            addCriterion("class_group between", value1, value2, "classGroup");
            return (Criteria) this;
        }

        public Criteria andClassGroupNotBetween(String value1, String value2) {
            addCriterion("class_group not between", value1, value2, "classGroup");
            return (Criteria) this;
        }

        public Criteria andClassNameIsNull() {
            addCriterion("class_name is null");
            return (Criteria) this;
        }

        public Criteria andClassNameIsNotNull() {
            addCriterion("class_name is not null");
            return (Criteria) this;
        }

        public Criteria andClassNameEqualTo(String value) {
            addCriterion("class_name =", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotEqualTo(String value) {
            addCriterion("class_name <>", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameGreaterThan(String value) {
            addCriterion("class_name >", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameGreaterThanOrEqualTo(String value) {
            addCriterion("class_name >=", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLessThan(String value) {
            addCriterion("class_name <", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLessThanOrEqualTo(String value) {
            addCriterion("class_name <=", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLike(String value) {
            addCriterion("class_name like", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotLike(String value) {
            addCriterion("class_name not like", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameIn(List<String> values) {
            addCriterion("class_name in", values, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotIn(List<String> values) {
            addCriterion("class_name not in", values, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameBetween(String value1, String value2) {
            addCriterion("class_name between", value1, value2, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotBetween(String value1, String value2) {
            addCriterion("class_name not between", value1, value2, "className");
            return (Criteria) this;
        }

        public Criteria andTeacherCodeIsNull() {
            addCriterion("teacher_code is null");
            return (Criteria) this;
        }

        public Criteria andTeacherCodeIsNotNull() {
            addCriterion("teacher_code is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherCodeEqualTo(String value) {
            addCriterion("teacher_code =", value, "teacherCode");
            return (Criteria) this;
        }

        public Criteria andTeacherCodeNotEqualTo(String value) {
            addCriterion("teacher_code <>", value, "teacherCode");
            return (Criteria) this;
        }

        public Criteria andTeacherCodeGreaterThan(String value) {
            addCriterion("teacher_code >", value, "teacherCode");
            return (Criteria) this;
        }

        public Criteria andTeacherCodeGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_code >=", value, "teacherCode");
            return (Criteria) this;
        }

        public Criteria andTeacherCodeLessThan(String value) {
            addCriterion("teacher_code <", value, "teacherCode");
            return (Criteria) this;
        }

        public Criteria andTeacherCodeLessThanOrEqualTo(String value) {
            addCriterion("teacher_code <=", value, "teacherCode");
            return (Criteria) this;
        }

        public Criteria andTeacherCodeLike(String value) {
            addCriterion("teacher_code like", value, "teacherCode");
            return (Criteria) this;
        }

        public Criteria andTeacherCodeNotLike(String value) {
            addCriterion("teacher_code not like", value, "teacherCode");
            return (Criteria) this;
        }

        public Criteria andTeacherCodeIn(List<String> values) {
            addCriterion("teacher_code in", values, "teacherCode");
            return (Criteria) this;
        }

        public Criteria andTeacherCodeNotIn(List<String> values) {
            addCriterion("teacher_code not in", values, "teacherCode");
            return (Criteria) this;
        }

        public Criteria andTeacherCodeBetween(String value1, String value2) {
            addCriterion("teacher_code between", value1, value2, "teacherCode");
            return (Criteria) this;
        }

        public Criteria andTeacherCodeNotBetween(String value1, String value2) {
            addCriterion("teacher_code not between", value1, value2, "teacherCode");
            return (Criteria) this;
        }

        public Criteria andClassTypeIsNull() {
            addCriterion("class_type is null");
            return (Criteria) this;
        }

        public Criteria andClassTypeIsNotNull() {
            addCriterion("class_type is not null");
            return (Criteria) this;
        }

        public Criteria andClassTypeEqualTo(String value) {
            addCriterion("class_type =", value, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeNotEqualTo(String value) {
            addCriterion("class_type <>", value, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeGreaterThan(String value) {
            addCriterion("class_type >", value, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeGreaterThanOrEqualTo(String value) {
            addCriterion("class_type >=", value, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeLessThan(String value) {
            addCriterion("class_type <", value, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeLessThanOrEqualTo(String value) {
            addCriterion("class_type <=", value, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeLike(String value) {
            addCriterion("class_type like", value, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeNotLike(String value) {
            addCriterion("class_type not like", value, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeIn(List<String> values) {
            addCriterion("class_type in", values, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeNotIn(List<String> values) {
            addCriterion("class_type not in", values, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeBetween(String value1, String value2) {
            addCriterion("class_type between", value1, value2, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeNotBetween(String value1, String value2) {
            addCriterion("class_type not between", value1, value2, "classType");
            return (Criteria) this;
        }

        public Criteria andClassCodeIsNull() {
            addCriterion("class_code is null");
            return (Criteria) this;
        }

        public Criteria andClassCodeIsNotNull() {
            addCriterion("class_code is not null");
            return (Criteria) this;
        }

        public Criteria andClassCodeEqualTo(String value) {
            addCriterion("class_code =", value, "classCode");
            return (Criteria) this;
        }

        public Criteria andClassCodeNotEqualTo(String value) {
            addCriterion("class_code <>", value, "classCode");
            return (Criteria) this;
        }

        public Criteria andClassCodeGreaterThan(String value) {
            addCriterion("class_code >", value, "classCode");
            return (Criteria) this;
        }

        public Criteria andClassCodeGreaterThanOrEqualTo(String value) {
            addCriterion("class_code >=", value, "classCode");
            return (Criteria) this;
        }

        public Criteria andClassCodeLessThan(String value) {
            addCriterion("class_code <", value, "classCode");
            return (Criteria) this;
        }

        public Criteria andClassCodeLessThanOrEqualTo(String value) {
            addCriterion("class_code <=", value, "classCode");
            return (Criteria) this;
        }

        public Criteria andClassCodeLike(String value) {
            addCriterion("class_code like", value, "classCode");
            return (Criteria) this;
        }

        public Criteria andClassCodeNotLike(String value) {
            addCriterion("class_code not like", value, "classCode");
            return (Criteria) this;
        }

        public Criteria andClassCodeIn(List<String> values) {
            addCriterion("class_code in", values, "classCode");
            return (Criteria) this;
        }

        public Criteria andClassCodeNotIn(List<String> values) {
            addCriterion("class_code not in", values, "classCode");
            return (Criteria) this;
        }

        public Criteria andClassCodeBetween(String value1, String value2) {
            addCriterion("class_code between", value1, value2, "classCode");
            return (Criteria) this;
        }

        public Criteria andClassCodeNotBetween(String value1, String value2) {
            addCriterion("class_code not between", value1, value2, "classCode");
            return (Criteria) this;
        }

        public Criteria andClassRemarkIsNull() {
            addCriterion("class_remark is null");
            return (Criteria) this;
        }

        public Criteria andClassRemarkIsNotNull() {
            addCriterion("class_remark is not null");
            return (Criteria) this;
        }

        public Criteria andClassRemarkEqualTo(String value) {
            addCriterion("class_remark =", value, "classRemark");
            return (Criteria) this;
        }

        public Criteria andClassRemarkNotEqualTo(String value) {
            addCriterion("class_remark <>", value, "classRemark");
            return (Criteria) this;
        }

        public Criteria andClassRemarkGreaterThan(String value) {
            addCriterion("class_remark >", value, "classRemark");
            return (Criteria) this;
        }

        public Criteria andClassRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("class_remark >=", value, "classRemark");
            return (Criteria) this;
        }

        public Criteria andClassRemarkLessThan(String value) {
            addCriterion("class_remark <", value, "classRemark");
            return (Criteria) this;
        }

        public Criteria andClassRemarkLessThanOrEqualTo(String value) {
            addCriterion("class_remark <=", value, "classRemark");
            return (Criteria) this;
        }

        public Criteria andClassRemarkLike(String value) {
            addCriterion("class_remark like", value, "classRemark");
            return (Criteria) this;
        }

        public Criteria andClassRemarkNotLike(String value) {
            addCriterion("class_remark not like", value, "classRemark");
            return (Criteria) this;
        }

        public Criteria andClassRemarkIn(List<String> values) {
            addCriterion("class_remark in", values, "classRemark");
            return (Criteria) this;
        }

        public Criteria andClassRemarkNotIn(List<String> values) {
            addCriterion("class_remark not in", values, "classRemark");
            return (Criteria) this;
        }

        public Criteria andClassRemarkBetween(String value1, String value2) {
            addCriterion("class_remark between", value1, value2, "classRemark");
            return (Criteria) this;
        }

        public Criteria andClassRemarkNotBetween(String value1, String value2) {
            addCriterion("class_remark not between", value1, value2, "classRemark");
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