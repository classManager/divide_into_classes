package com.baidu.domain;

import java.util.ArrayList;
import java.util.List;

public class SaasStudentExcelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SaasStudentExcelExample() {
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

        public Criteria andStudentGradeYearIdIsNull() {
            addCriterion("student_grade_year_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentGradeYearIdIsNotNull() {
            addCriterion("student_grade_year_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentGradeYearIdEqualTo(Double value) {
            addCriterion("student_grade_year_id =", value, "studentGradeYearId");
            return (Criteria) this;
        }

        public Criteria andStudentGradeYearIdNotEqualTo(Double value) {
            addCriterion("student_grade_year_id <>", value, "studentGradeYearId");
            return (Criteria) this;
        }

        public Criteria andStudentGradeYearIdGreaterThan(Double value) {
            addCriterion("student_grade_year_id >", value, "studentGradeYearId");
            return (Criteria) this;
        }

        public Criteria andStudentGradeYearIdGreaterThanOrEqualTo(Double value) {
            addCriterion("student_grade_year_id >=", value, "studentGradeYearId");
            return (Criteria) this;
        }

        public Criteria andStudentGradeYearIdLessThan(Double value) {
            addCriterion("student_grade_year_id <", value, "studentGradeYearId");
            return (Criteria) this;
        }

        public Criteria andStudentGradeYearIdLessThanOrEqualTo(Double value) {
            addCriterion("student_grade_year_id <=", value, "studentGradeYearId");
            return (Criteria) this;
        }

        public Criteria andStudentGradeYearIdIn(List<Double> values) {
            addCriterion("student_grade_year_id in", values, "studentGradeYearId");
            return (Criteria) this;
        }

        public Criteria andStudentGradeYearIdNotIn(List<Double> values) {
            addCriterion("student_grade_year_id not in", values, "studentGradeYearId");
            return (Criteria) this;
        }

        public Criteria andStudentGradeYearIdBetween(Double value1, Double value2) {
            addCriterion("student_grade_year_id between", value1, value2, "studentGradeYearId");
            return (Criteria) this;
        }

        public Criteria andStudentGradeYearIdNotBetween(Double value1, Double value2) {
            addCriterion("student_grade_year_id not between", value1, value2, "studentGradeYearId");
            return (Criteria) this;
        }

        public Criteria andStudentGradeIsNull() {
            addCriterion("student_grade is null");
            return (Criteria) this;
        }

        public Criteria andStudentGradeIsNotNull() {
            addCriterion("student_grade is not null");
            return (Criteria) this;
        }

        public Criteria andStudentGradeEqualTo(String value) {
            addCriterion("student_grade =", value, "studentGrade");
            return (Criteria) this;
        }

        public Criteria andStudentGradeNotEqualTo(String value) {
            addCriterion("student_grade <>", value, "studentGrade");
            return (Criteria) this;
        }

        public Criteria andStudentGradeGreaterThan(String value) {
            addCriterion("student_grade >", value, "studentGrade");
            return (Criteria) this;
        }

        public Criteria andStudentGradeGreaterThanOrEqualTo(String value) {
            addCriterion("student_grade >=", value, "studentGrade");
            return (Criteria) this;
        }

        public Criteria andStudentGradeLessThan(String value) {
            addCriterion("student_grade <", value, "studentGrade");
            return (Criteria) this;
        }

        public Criteria andStudentGradeLessThanOrEqualTo(String value) {
            addCriterion("student_grade <=", value, "studentGrade");
            return (Criteria) this;
        }

        public Criteria andStudentGradeLike(String value) {
            addCriterion("student_grade like", value, "studentGrade");
            return (Criteria) this;
        }

        public Criteria andStudentGradeNotLike(String value) {
            addCriterion("student_grade not like", value, "studentGrade");
            return (Criteria) this;
        }

        public Criteria andStudentGradeIn(List<String> values) {
            addCriterion("student_grade in", values, "studentGrade");
            return (Criteria) this;
        }

        public Criteria andStudentGradeNotIn(List<String> values) {
            addCriterion("student_grade not in", values, "studentGrade");
            return (Criteria) this;
        }

        public Criteria andStudentGradeBetween(String value1, String value2) {
            addCriterion("student_grade between", value1, value2, "studentGrade");
            return (Criteria) this;
        }

        public Criteria andStudentGradeNotBetween(String value1, String value2) {
            addCriterion("student_grade not between", value1, value2, "studentGrade");
            return (Criteria) this;
        }

        public Criteria andStudentClassIsNull() {
            addCriterion("student_class is null");
            return (Criteria) this;
        }

        public Criteria andStudentClassIsNotNull() {
            addCriterion("student_class is not null");
            return (Criteria) this;
        }

        public Criteria andStudentClassEqualTo(String value) {
            addCriterion("student_class =", value, "studentClass");
            return (Criteria) this;
        }

        public Criteria andStudentClassNotEqualTo(String value) {
            addCriterion("student_class <>", value, "studentClass");
            return (Criteria) this;
        }

        public Criteria andStudentClassGreaterThan(String value) {
            addCriterion("student_class >", value, "studentClass");
            return (Criteria) this;
        }

        public Criteria andStudentClassGreaterThanOrEqualTo(String value) {
            addCriterion("student_class >=", value, "studentClass");
            return (Criteria) this;
        }

        public Criteria andStudentClassLessThan(String value) {
            addCriterion("student_class <", value, "studentClass");
            return (Criteria) this;
        }

        public Criteria andStudentClassLessThanOrEqualTo(String value) {
            addCriterion("student_class <=", value, "studentClass");
            return (Criteria) this;
        }

        public Criteria andStudentClassLike(String value) {
            addCriterion("student_class like", value, "studentClass");
            return (Criteria) this;
        }

        public Criteria andStudentClassNotLike(String value) {
            addCriterion("student_class not like", value, "studentClass");
            return (Criteria) this;
        }

        public Criteria andStudentClassIn(List<String> values) {
            addCriterion("student_class in", values, "studentClass");
            return (Criteria) this;
        }

        public Criteria andStudentClassNotIn(List<String> values) {
            addCriterion("student_class not in", values, "studentClass");
            return (Criteria) this;
        }

        public Criteria andStudentClassBetween(String value1, String value2) {
            addCriterion("student_class between", value1, value2, "studentClass");
            return (Criteria) this;
        }

        public Criteria andStudentClassNotBetween(String value1, String value2) {
            addCriterion("student_class not between", value1, value2, "studentClass");
            return (Criteria) this;
        }

        public Criteria andStudentNoIsNull() {
            addCriterion("student_no is null");
            return (Criteria) this;
        }

        public Criteria andStudentNoIsNotNull() {
            addCriterion("student_no is not null");
            return (Criteria) this;
        }

        public Criteria andStudentNoEqualTo(Double value) {
            addCriterion("student_no =", value, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoNotEqualTo(Double value) {
            addCriterion("student_no <>", value, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoGreaterThan(Double value) {
            addCriterion("student_no >", value, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoGreaterThanOrEqualTo(Double value) {
            addCriterion("student_no >=", value, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoLessThan(Double value) {
            addCriterion("student_no <", value, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoLessThanOrEqualTo(Double value) {
            addCriterion("student_no <=", value, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoIn(List<Double> values) {
            addCriterion("student_no in", values, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoNotIn(List<Double> values) {
            addCriterion("student_no not in", values, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoBetween(Double value1, Double value2) {
            addCriterion("student_no between", value1, value2, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoNotBetween(Double value1, Double value2) {
            addCriterion("student_no not between", value1, value2, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNameIsNull() {
            addCriterion("student_name is null");
            return (Criteria) this;
        }

        public Criteria andStudentNameIsNotNull() {
            addCriterion("student_name is not null");
            return (Criteria) this;
        }

        public Criteria andStudentNameEqualTo(String value) {
            addCriterion("student_name =", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotEqualTo(String value) {
            addCriterion("student_name <>", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameGreaterThan(String value) {
            addCriterion("student_name >", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameGreaterThanOrEqualTo(String value) {
            addCriterion("student_name >=", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLessThan(String value) {
            addCriterion("student_name <", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLessThanOrEqualTo(String value) {
            addCriterion("student_name <=", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLike(String value) {
            addCriterion("student_name like", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotLike(String value) {
            addCriterion("student_name not like", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameIn(List<String> values) {
            addCriterion("student_name in", values, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotIn(List<String> values) {
            addCriterion("student_name not in", values, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameBetween(String value1, String value2) {
            addCriterion("student_name between", value1, value2, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotBetween(String value1, String value2) {
            addCriterion("student_name not between", value1, value2, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor1IsNull() {
            addCriterion("student_check_major1 is null");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor1IsNotNull() {
            addCriterion("student_check_major1 is not null");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor1EqualTo(String value) {
            addCriterion("student_check_major1 =", value, "studentCheckMajor1");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor1NotEqualTo(String value) {
            addCriterion("student_check_major1 <>", value, "studentCheckMajor1");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor1GreaterThan(String value) {
            addCriterion("student_check_major1 >", value, "studentCheckMajor1");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor1GreaterThanOrEqualTo(String value) {
            addCriterion("student_check_major1 >=", value, "studentCheckMajor1");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor1LessThan(String value) {
            addCriterion("student_check_major1 <", value, "studentCheckMajor1");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor1LessThanOrEqualTo(String value) {
            addCriterion("student_check_major1 <=", value, "studentCheckMajor1");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor1Like(String value) {
            addCriterion("student_check_major1 like", value, "studentCheckMajor1");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor1NotLike(String value) {
            addCriterion("student_check_major1 not like", value, "studentCheckMajor1");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor1In(List<String> values) {
            addCriterion("student_check_major1 in", values, "studentCheckMajor1");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor1NotIn(List<String> values) {
            addCriterion("student_check_major1 not in", values, "studentCheckMajor1");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor1Between(String value1, String value2) {
            addCriterion("student_check_major1 between", value1, value2, "studentCheckMajor1");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor1NotBetween(String value1, String value2) {
            addCriterion("student_check_major1 not between", value1, value2, "studentCheckMajor1");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass1IsNull() {
            addCriterion("student_check_major_class1 is null");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass1IsNotNull() {
            addCriterion("student_check_major_class1 is not null");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass1EqualTo(String value) {
            addCriterion("student_check_major_class1 =", value, "studentCheckMajorClass1");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass1NotEqualTo(String value) {
            addCriterion("student_check_major_class1 <>", value, "studentCheckMajorClass1");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass1GreaterThan(String value) {
            addCriterion("student_check_major_class1 >", value, "studentCheckMajorClass1");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass1GreaterThanOrEqualTo(String value) {
            addCriterion("student_check_major_class1 >=", value, "studentCheckMajorClass1");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass1LessThan(String value) {
            addCriterion("student_check_major_class1 <", value, "studentCheckMajorClass1");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass1LessThanOrEqualTo(String value) {
            addCriterion("student_check_major_class1 <=", value, "studentCheckMajorClass1");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass1Like(String value) {
            addCriterion("student_check_major_class1 like", value, "studentCheckMajorClass1");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass1NotLike(String value) {
            addCriterion("student_check_major_class1 not like", value, "studentCheckMajorClass1");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass1In(List<String> values) {
            addCriterion("student_check_major_class1 in", values, "studentCheckMajorClass1");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass1NotIn(List<String> values) {
            addCriterion("student_check_major_class1 not in", values, "studentCheckMajorClass1");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass1Between(String value1, String value2) {
            addCriterion("student_check_major_class1 between", value1, value2, "studentCheckMajorClass1");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass1NotBetween(String value1, String value2) {
            addCriterion("student_check_major_class1 not between", value1, value2, "studentCheckMajorClass1");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor2IsNull() {
            addCriterion("student_check_major2 is null");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor2IsNotNull() {
            addCriterion("student_check_major2 is not null");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor2EqualTo(String value) {
            addCriterion("student_check_major2 =", value, "studentCheckMajor2");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor2NotEqualTo(String value) {
            addCriterion("student_check_major2 <>", value, "studentCheckMajor2");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor2GreaterThan(String value) {
            addCriterion("student_check_major2 >", value, "studentCheckMajor2");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor2GreaterThanOrEqualTo(String value) {
            addCriterion("student_check_major2 >=", value, "studentCheckMajor2");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor2LessThan(String value) {
            addCriterion("student_check_major2 <", value, "studentCheckMajor2");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor2LessThanOrEqualTo(String value) {
            addCriterion("student_check_major2 <=", value, "studentCheckMajor2");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor2Like(String value) {
            addCriterion("student_check_major2 like", value, "studentCheckMajor2");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor2NotLike(String value) {
            addCriterion("student_check_major2 not like", value, "studentCheckMajor2");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor2In(List<String> values) {
            addCriterion("student_check_major2 in", values, "studentCheckMajor2");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor2NotIn(List<String> values) {
            addCriterion("student_check_major2 not in", values, "studentCheckMajor2");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor2Between(String value1, String value2) {
            addCriterion("student_check_major2 between", value1, value2, "studentCheckMajor2");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor2NotBetween(String value1, String value2) {
            addCriterion("student_check_major2 not between", value1, value2, "studentCheckMajor2");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass2IsNull() {
            addCriterion("student_check_major_class2 is null");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass2IsNotNull() {
            addCriterion("student_check_major_class2 is not null");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass2EqualTo(String value) {
            addCriterion("student_check_major_class2 =", value, "studentCheckMajorClass2");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass2NotEqualTo(String value) {
            addCriterion("student_check_major_class2 <>", value, "studentCheckMajorClass2");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass2GreaterThan(String value) {
            addCriterion("student_check_major_class2 >", value, "studentCheckMajorClass2");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass2GreaterThanOrEqualTo(String value) {
            addCriterion("student_check_major_class2 >=", value, "studentCheckMajorClass2");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass2LessThan(String value) {
            addCriterion("student_check_major_class2 <", value, "studentCheckMajorClass2");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass2LessThanOrEqualTo(String value) {
            addCriterion("student_check_major_class2 <=", value, "studentCheckMajorClass2");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass2Like(String value) {
            addCriterion("student_check_major_class2 like", value, "studentCheckMajorClass2");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass2NotLike(String value) {
            addCriterion("student_check_major_class2 not like", value, "studentCheckMajorClass2");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass2In(List<String> values) {
            addCriterion("student_check_major_class2 in", values, "studentCheckMajorClass2");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass2NotIn(List<String> values) {
            addCriterion("student_check_major_class2 not in", values, "studentCheckMajorClass2");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass2Between(String value1, String value2) {
            addCriterion("student_check_major_class2 between", value1, value2, "studentCheckMajorClass2");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass2NotBetween(String value1, String value2) {
            addCriterion("student_check_major_class2 not between", value1, value2, "studentCheckMajorClass2");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor3IsNull() {
            addCriterion("student_check_major3 is null");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor3IsNotNull() {
            addCriterion("student_check_major3 is not null");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor3EqualTo(String value) {
            addCriterion("student_check_major3 =", value, "studentCheckMajor3");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor3NotEqualTo(String value) {
            addCriterion("student_check_major3 <>", value, "studentCheckMajor3");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor3GreaterThan(String value) {
            addCriterion("student_check_major3 >", value, "studentCheckMajor3");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor3GreaterThanOrEqualTo(String value) {
            addCriterion("student_check_major3 >=", value, "studentCheckMajor3");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor3LessThan(String value) {
            addCriterion("student_check_major3 <", value, "studentCheckMajor3");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor3LessThanOrEqualTo(String value) {
            addCriterion("student_check_major3 <=", value, "studentCheckMajor3");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor3Like(String value) {
            addCriterion("student_check_major3 like", value, "studentCheckMajor3");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor3NotLike(String value) {
            addCriterion("student_check_major3 not like", value, "studentCheckMajor3");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor3In(List<String> values) {
            addCriterion("student_check_major3 in", values, "studentCheckMajor3");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor3NotIn(List<String> values) {
            addCriterion("student_check_major3 not in", values, "studentCheckMajor3");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor3Between(String value1, String value2) {
            addCriterion("student_check_major3 between", value1, value2, "studentCheckMajor3");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor3NotBetween(String value1, String value2) {
            addCriterion("student_check_major3 not between", value1, value2, "studentCheckMajor3");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass3IsNull() {
            addCriterion("student_check_major_class3 is null");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass3IsNotNull() {
            addCriterion("student_check_major_class3 is not null");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass3EqualTo(String value) {
            addCriterion("student_check_major_class3 =", value, "studentCheckMajorClass3");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass3NotEqualTo(String value) {
            addCriterion("student_check_major_class3 <>", value, "studentCheckMajorClass3");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass3GreaterThan(String value) {
            addCriterion("student_check_major_class3 >", value, "studentCheckMajorClass3");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass3GreaterThanOrEqualTo(String value) {
            addCriterion("student_check_major_class3 >=", value, "studentCheckMajorClass3");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass3LessThan(String value) {
            addCriterion("student_check_major_class3 <", value, "studentCheckMajorClass3");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass3LessThanOrEqualTo(String value) {
            addCriterion("student_check_major_class3 <=", value, "studentCheckMajorClass3");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass3Like(String value) {
            addCriterion("student_check_major_class3 like", value, "studentCheckMajorClass3");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass3NotLike(String value) {
            addCriterion("student_check_major_class3 not like", value, "studentCheckMajorClass3");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass3In(List<String> values) {
            addCriterion("student_check_major_class3 in", values, "studentCheckMajorClass3");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass3NotIn(List<String> values) {
            addCriterion("student_check_major_class3 not in", values, "studentCheckMajorClass3");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass3Between(String value1, String value2) {
            addCriterion("student_check_major_class3 between", value1, value2, "studentCheckMajorClass3");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass3NotBetween(String value1, String value2) {
            addCriterion("student_check_major_class3 not between", value1, value2, "studentCheckMajorClass3");
            return (Criteria) this;
        }

        public Criteria andStudentSexIsNull() {
            addCriterion("student_sex is null");
            return (Criteria) this;
        }

        public Criteria andStudentSexIsNotNull() {
            addCriterion("student_sex is not null");
            return (Criteria) this;
        }

        public Criteria andStudentSexEqualTo(String value) {
            addCriterion("student_sex =", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexNotEqualTo(String value) {
            addCriterion("student_sex <>", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexGreaterThan(String value) {
            addCriterion("student_sex >", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexGreaterThanOrEqualTo(String value) {
            addCriterion("student_sex >=", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexLessThan(String value) {
            addCriterion("student_sex <", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexLessThanOrEqualTo(String value) {
            addCriterion("student_sex <=", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexLike(String value) {
            addCriterion("student_sex like", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexNotLike(String value) {
            addCriterion("student_sex not like", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexIn(List<String> values) {
            addCriterion("student_sex in", values, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexNotIn(List<String> values) {
            addCriterion("student_sex not in", values, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexBetween(String value1, String value2) {
            addCriterion("student_sex between", value1, value2, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexNotBetween(String value1, String value2) {
            addCriterion("student_sex not between", value1, value2, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentLevelIsNull() {
            addCriterion("student_level is null");
            return (Criteria) this;
        }

        public Criteria andStudentLevelIsNotNull() {
            addCriterion("student_level is not null");
            return (Criteria) this;
        }

        public Criteria andStudentLevelEqualTo(String value) {
            addCriterion("student_level =", value, "studentLevel");
            return (Criteria) this;
        }

        public Criteria andStudentLevelNotEqualTo(String value) {
            addCriterion("student_level <>", value, "studentLevel");
            return (Criteria) this;
        }

        public Criteria andStudentLevelGreaterThan(String value) {
            addCriterion("student_level >", value, "studentLevel");
            return (Criteria) this;
        }

        public Criteria andStudentLevelGreaterThanOrEqualTo(String value) {
            addCriterion("student_level >=", value, "studentLevel");
            return (Criteria) this;
        }

        public Criteria andStudentLevelLessThan(String value) {
            addCriterion("student_level <", value, "studentLevel");
            return (Criteria) this;
        }

        public Criteria andStudentLevelLessThanOrEqualTo(String value) {
            addCriterion("student_level <=", value, "studentLevel");
            return (Criteria) this;
        }

        public Criteria andStudentLevelLike(String value) {
            addCriterion("student_level like", value, "studentLevel");
            return (Criteria) this;
        }

        public Criteria andStudentLevelNotLike(String value) {
            addCriterion("student_level not like", value, "studentLevel");
            return (Criteria) this;
        }

        public Criteria andStudentLevelIn(List<String> values) {
            addCriterion("student_level in", values, "studentLevel");
            return (Criteria) this;
        }

        public Criteria andStudentLevelNotIn(List<String> values) {
            addCriterion("student_level not in", values, "studentLevel");
            return (Criteria) this;
        }

        public Criteria andStudentLevelBetween(String value1, String value2) {
            addCriterion("student_level between", value1, value2, "studentLevel");
            return (Criteria) this;
        }

        public Criteria andStudentLevelNotBetween(String value1, String value2) {
            addCriterion("student_level not between", value1, value2, "studentLevel");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor4IsNull() {
            addCriterion("student_check_major4 is null");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor4IsNotNull() {
            addCriterion("student_check_major4 is not null");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor4EqualTo(String value) {
            addCriterion("student_check_major4 =", value, "studentCheckMajor4");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor4NotEqualTo(String value) {
            addCriterion("student_check_major4 <>", value, "studentCheckMajor4");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor4GreaterThan(String value) {
            addCriterion("student_check_major4 >", value, "studentCheckMajor4");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor4GreaterThanOrEqualTo(String value) {
            addCriterion("student_check_major4 >=", value, "studentCheckMajor4");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor4LessThan(String value) {
            addCriterion("student_check_major4 <", value, "studentCheckMajor4");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor4LessThanOrEqualTo(String value) {
            addCriterion("student_check_major4 <=", value, "studentCheckMajor4");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor4Like(String value) {
            addCriterion("student_check_major4 like", value, "studentCheckMajor4");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor4NotLike(String value) {
            addCriterion("student_check_major4 not like", value, "studentCheckMajor4");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor4In(List<String> values) {
            addCriterion("student_check_major4 in", values, "studentCheckMajor4");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor4NotIn(List<String> values) {
            addCriterion("student_check_major4 not in", values, "studentCheckMajor4");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor4Between(String value1, String value2) {
            addCriterion("student_check_major4 between", value1, value2, "studentCheckMajor4");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor4NotBetween(String value1, String value2) {
            addCriterion("student_check_major4 not between", value1, value2, "studentCheckMajor4");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass4IsNull() {
            addCriterion("student_check_major_class4 is null");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass4IsNotNull() {
            addCriterion("student_check_major_class4 is not null");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass4EqualTo(String value) {
            addCriterion("student_check_major_class4 =", value, "studentCheckMajorClass4");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass4NotEqualTo(String value) {
            addCriterion("student_check_major_class4 <>", value, "studentCheckMajorClass4");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass4GreaterThan(String value) {
            addCriterion("student_check_major_class4 >", value, "studentCheckMajorClass4");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass4GreaterThanOrEqualTo(String value) {
            addCriterion("student_check_major_class4 >=", value, "studentCheckMajorClass4");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass4LessThan(String value) {
            addCriterion("student_check_major_class4 <", value, "studentCheckMajorClass4");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass4LessThanOrEqualTo(String value) {
            addCriterion("student_check_major_class4 <=", value, "studentCheckMajorClass4");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass4Like(String value) {
            addCriterion("student_check_major_class4 like", value, "studentCheckMajorClass4");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass4NotLike(String value) {
            addCriterion("student_check_major_class4 not like", value, "studentCheckMajorClass4");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass4In(List<String> values) {
            addCriterion("student_check_major_class4 in", values, "studentCheckMajorClass4");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass4NotIn(List<String> values) {
            addCriterion("student_check_major_class4 not in", values, "studentCheckMajorClass4");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass4Between(String value1, String value2) {
            addCriterion("student_check_major_class4 between", value1, value2, "studentCheckMajorClass4");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass4NotBetween(String value1, String value2) {
            addCriterion("student_check_major_class4 not between", value1, value2, "studentCheckMajorClass4");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor5IsNull() {
            addCriterion("student_check_major5 is null");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor5IsNotNull() {
            addCriterion("student_check_major5 is not null");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor5EqualTo(String value) {
            addCriterion("student_check_major5 =", value, "studentCheckMajor5");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor5NotEqualTo(String value) {
            addCriterion("student_check_major5 <>", value, "studentCheckMajor5");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor5GreaterThan(String value) {
            addCriterion("student_check_major5 >", value, "studentCheckMajor5");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor5GreaterThanOrEqualTo(String value) {
            addCriterion("student_check_major5 >=", value, "studentCheckMajor5");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor5LessThan(String value) {
            addCriterion("student_check_major5 <", value, "studentCheckMajor5");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor5LessThanOrEqualTo(String value) {
            addCriterion("student_check_major5 <=", value, "studentCheckMajor5");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor5Like(String value) {
            addCriterion("student_check_major5 like", value, "studentCheckMajor5");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor5NotLike(String value) {
            addCriterion("student_check_major5 not like", value, "studentCheckMajor5");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor5In(List<String> values) {
            addCriterion("student_check_major5 in", values, "studentCheckMajor5");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor5NotIn(List<String> values) {
            addCriterion("student_check_major5 not in", values, "studentCheckMajor5");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor5Between(String value1, String value2) {
            addCriterion("student_check_major5 between", value1, value2, "studentCheckMajor5");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor5NotBetween(String value1, String value2) {
            addCriterion("student_check_major5 not between", value1, value2, "studentCheckMajor5");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass5IsNull() {
            addCriterion("student_check_major_class5 is null");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass5IsNotNull() {
            addCriterion("student_check_major_class5 is not null");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass5EqualTo(String value) {
            addCriterion("student_check_major_class5 =", value, "studentCheckMajorClass5");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass5NotEqualTo(String value) {
            addCriterion("student_check_major_class5 <>", value, "studentCheckMajorClass5");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass5GreaterThan(String value) {
            addCriterion("student_check_major_class5 >", value, "studentCheckMajorClass5");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass5GreaterThanOrEqualTo(String value) {
            addCriterion("student_check_major_class5 >=", value, "studentCheckMajorClass5");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass5LessThan(String value) {
            addCriterion("student_check_major_class5 <", value, "studentCheckMajorClass5");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass5LessThanOrEqualTo(String value) {
            addCriterion("student_check_major_class5 <=", value, "studentCheckMajorClass5");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass5Like(String value) {
            addCriterion("student_check_major_class5 like", value, "studentCheckMajorClass5");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass5NotLike(String value) {
            addCriterion("student_check_major_class5 not like", value, "studentCheckMajorClass5");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass5In(List<String> values) {
            addCriterion("student_check_major_class5 in", values, "studentCheckMajorClass5");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass5NotIn(List<String> values) {
            addCriterion("student_check_major_class5 not in", values, "studentCheckMajorClass5");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass5Between(String value1, String value2) {
            addCriterion("student_check_major_class5 between", value1, value2, "studentCheckMajorClass5");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass5NotBetween(String value1, String value2) {
            addCriterion("student_check_major_class5 not between", value1, value2, "studentCheckMajorClass5");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor6IsNull() {
            addCriterion("student_check_major6 is null");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor6IsNotNull() {
            addCriterion("student_check_major6 is not null");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor6EqualTo(String value) {
            addCriterion("student_check_major6 =", value, "studentCheckMajor6");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor6NotEqualTo(String value) {
            addCriterion("student_check_major6 <>", value, "studentCheckMajor6");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor6GreaterThan(String value) {
            addCriterion("student_check_major6 >", value, "studentCheckMajor6");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor6GreaterThanOrEqualTo(String value) {
            addCriterion("student_check_major6 >=", value, "studentCheckMajor6");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor6LessThan(String value) {
            addCriterion("student_check_major6 <", value, "studentCheckMajor6");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor6LessThanOrEqualTo(String value) {
            addCriterion("student_check_major6 <=", value, "studentCheckMajor6");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor6Like(String value) {
            addCriterion("student_check_major6 like", value, "studentCheckMajor6");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor6NotLike(String value) {
            addCriterion("student_check_major6 not like", value, "studentCheckMajor6");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor6In(List<String> values) {
            addCriterion("student_check_major6 in", values, "studentCheckMajor6");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor6NotIn(List<String> values) {
            addCriterion("student_check_major6 not in", values, "studentCheckMajor6");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor6Between(String value1, String value2) {
            addCriterion("student_check_major6 between", value1, value2, "studentCheckMajor6");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor6NotBetween(String value1, String value2) {
            addCriterion("student_check_major6 not between", value1, value2, "studentCheckMajor6");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass6IsNull() {
            addCriterion("student_check_major_class6 is null");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass6IsNotNull() {
            addCriterion("student_check_major_class6 is not null");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass6EqualTo(String value) {
            addCriterion("student_check_major_class6 =", value, "studentCheckMajorClass6");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass6NotEqualTo(String value) {
            addCriterion("student_check_major_class6 <>", value, "studentCheckMajorClass6");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass6GreaterThan(String value) {
            addCriterion("student_check_major_class6 >", value, "studentCheckMajorClass6");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass6GreaterThanOrEqualTo(String value) {
            addCriterion("student_check_major_class6 >=", value, "studentCheckMajorClass6");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass6LessThan(String value) {
            addCriterion("student_check_major_class6 <", value, "studentCheckMajorClass6");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass6LessThanOrEqualTo(String value) {
            addCriterion("student_check_major_class6 <=", value, "studentCheckMajorClass6");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass6Like(String value) {
            addCriterion("student_check_major_class6 like", value, "studentCheckMajorClass6");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass6NotLike(String value) {
            addCriterion("student_check_major_class6 not like", value, "studentCheckMajorClass6");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass6In(List<String> values) {
            addCriterion("student_check_major_class6 in", values, "studentCheckMajorClass6");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass6NotIn(List<String> values) {
            addCriterion("student_check_major_class6 not in", values, "studentCheckMajorClass6");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass6Between(String value1, String value2) {
            addCriterion("student_check_major_class6 between", value1, value2, "studentCheckMajorClass6");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass6NotBetween(String value1, String value2) {
            addCriterion("student_check_major_class6 not between", value1, value2, "studentCheckMajorClass6");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor7IsNull() {
            addCriterion("student_check_major7 is null");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor7IsNotNull() {
            addCriterion("student_check_major7 is not null");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor7EqualTo(String value) {
            addCriterion("student_check_major7 =", value, "studentCheckMajor7");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor7NotEqualTo(String value) {
            addCriterion("student_check_major7 <>", value, "studentCheckMajor7");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor7GreaterThan(String value) {
            addCriterion("student_check_major7 >", value, "studentCheckMajor7");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor7GreaterThanOrEqualTo(String value) {
            addCriterion("student_check_major7 >=", value, "studentCheckMajor7");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor7LessThan(String value) {
            addCriterion("student_check_major7 <", value, "studentCheckMajor7");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor7LessThanOrEqualTo(String value) {
            addCriterion("student_check_major7 <=", value, "studentCheckMajor7");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor7Like(String value) {
            addCriterion("student_check_major7 like", value, "studentCheckMajor7");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor7NotLike(String value) {
            addCriterion("student_check_major7 not like", value, "studentCheckMajor7");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor7In(List<String> values) {
            addCriterion("student_check_major7 in", values, "studentCheckMajor7");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor7NotIn(List<String> values) {
            addCriterion("student_check_major7 not in", values, "studentCheckMajor7");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor7Between(String value1, String value2) {
            addCriterion("student_check_major7 between", value1, value2, "studentCheckMajor7");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajor7NotBetween(String value1, String value2) {
            addCriterion("student_check_major7 not between", value1, value2, "studentCheckMajor7");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass7IsNull() {
            addCriterion("student_check_major_class7 is null");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass7IsNotNull() {
            addCriterion("student_check_major_class7 is not null");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass7EqualTo(String value) {
            addCriterion("student_check_major_class7 =", value, "studentCheckMajorClass7");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass7NotEqualTo(String value) {
            addCriterion("student_check_major_class7 <>", value, "studentCheckMajorClass7");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass7GreaterThan(String value) {
            addCriterion("student_check_major_class7 >", value, "studentCheckMajorClass7");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass7GreaterThanOrEqualTo(String value) {
            addCriterion("student_check_major_class7 >=", value, "studentCheckMajorClass7");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass7LessThan(String value) {
            addCriterion("student_check_major_class7 <", value, "studentCheckMajorClass7");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass7LessThanOrEqualTo(String value) {
            addCriterion("student_check_major_class7 <=", value, "studentCheckMajorClass7");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass7Like(String value) {
            addCriterion("student_check_major_class7 like", value, "studentCheckMajorClass7");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass7NotLike(String value) {
            addCriterion("student_check_major_class7 not like", value, "studentCheckMajorClass7");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass7In(List<String> values) {
            addCriterion("student_check_major_class7 in", values, "studentCheckMajorClass7");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass7NotIn(List<String> values) {
            addCriterion("student_check_major_class7 not in", values, "studentCheckMajorClass7");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass7Between(String value1, String value2) {
            addCriterion("student_check_major_class7 between", value1, value2, "studentCheckMajorClass7");
            return (Criteria) this;
        }

        public Criteria andStudentCheckMajorClass7NotBetween(String value1, String value2) {
            addCriterion("student_check_major_class7 not between", value1, value2, "studentCheckMajorClass7");
            return (Criteria) this;
        }

        public Criteria andStudentGraduateSchoolIsNull() {
            addCriterion("student_graduate_school is null");
            return (Criteria) this;
        }

        public Criteria andStudentGraduateSchoolIsNotNull() {
            addCriterion("student_graduate_school is not null");
            return (Criteria) this;
        }

        public Criteria andStudentGraduateSchoolEqualTo(String value) {
            addCriterion("student_graduate_school =", value, "studentGraduateSchool");
            return (Criteria) this;
        }

        public Criteria andStudentGraduateSchoolNotEqualTo(String value) {
            addCriterion("student_graduate_school <>", value, "studentGraduateSchool");
            return (Criteria) this;
        }

        public Criteria andStudentGraduateSchoolGreaterThan(String value) {
            addCriterion("student_graduate_school >", value, "studentGraduateSchool");
            return (Criteria) this;
        }

        public Criteria andStudentGraduateSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("student_graduate_school >=", value, "studentGraduateSchool");
            return (Criteria) this;
        }

        public Criteria andStudentGraduateSchoolLessThan(String value) {
            addCriterion("student_graduate_school <", value, "studentGraduateSchool");
            return (Criteria) this;
        }

        public Criteria andStudentGraduateSchoolLessThanOrEqualTo(String value) {
            addCriterion("student_graduate_school <=", value, "studentGraduateSchool");
            return (Criteria) this;
        }

        public Criteria andStudentGraduateSchoolLike(String value) {
            addCriterion("student_graduate_school like", value, "studentGraduateSchool");
            return (Criteria) this;
        }

        public Criteria andStudentGraduateSchoolNotLike(String value) {
            addCriterion("student_graduate_school not like", value, "studentGraduateSchool");
            return (Criteria) this;
        }

        public Criteria andStudentGraduateSchoolIn(List<String> values) {
            addCriterion("student_graduate_school in", values, "studentGraduateSchool");
            return (Criteria) this;
        }

        public Criteria andStudentGraduateSchoolNotIn(List<String> values) {
            addCriterion("student_graduate_school not in", values, "studentGraduateSchool");
            return (Criteria) this;
        }

        public Criteria andStudentGraduateSchoolBetween(String value1, String value2) {
            addCriterion("student_graduate_school between", value1, value2, "studentGraduateSchool");
            return (Criteria) this;
        }

        public Criteria andStudentGraduateSchoolNotBetween(String value1, String value2) {
            addCriterion("student_graduate_school not between", value1, value2, "studentGraduateSchool");
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