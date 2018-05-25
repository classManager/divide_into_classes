package com.baidu.domain;

import java.util.ArrayList;
import java.util.List;

public class StudentBaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentBaseExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andStudentcodeIsNull() {
            addCriterion("studentCode is null");
            return (Criteria) this;
        }

        public Criteria andStudentcodeIsNotNull() {
            addCriterion("studentCode is not null");
            return (Criteria) this;
        }

        public Criteria andStudentcodeEqualTo(String value) {
            addCriterion("studentCode =", value, "studentcode");
            return (Criteria) this;
        }

        public Criteria andStudentcodeNotEqualTo(String value) {
            addCriterion("studentCode <>", value, "studentcode");
            return (Criteria) this;
        }

        public Criteria andStudentcodeGreaterThan(String value) {
            addCriterion("studentCode >", value, "studentcode");
            return (Criteria) this;
        }

        public Criteria andStudentcodeGreaterThanOrEqualTo(String value) {
            addCriterion("studentCode >=", value, "studentcode");
            return (Criteria) this;
        }

        public Criteria andStudentcodeLessThan(String value) {
            addCriterion("studentCode <", value, "studentcode");
            return (Criteria) this;
        }

        public Criteria andStudentcodeLessThanOrEqualTo(String value) {
            addCriterion("studentCode <=", value, "studentcode");
            return (Criteria) this;
        }

        public Criteria andStudentcodeLike(String value) {
            addCriterion("studentCode like", value, "studentcode");
            return (Criteria) this;
        }

        public Criteria andStudentcodeNotLike(String value) {
            addCriterion("studentCode not like", value, "studentcode");
            return (Criteria) this;
        }

        public Criteria andStudentcodeIn(List<String> values) {
            addCriterion("studentCode in", values, "studentcode");
            return (Criteria) this;
        }

        public Criteria andStudentcodeNotIn(List<String> values) {
            addCriterion("studentCode not in", values, "studentcode");
            return (Criteria) this;
        }

        public Criteria andStudentcodeBetween(String value1, String value2) {
            addCriterion("studentCode between", value1, value2, "studentcode");
            return (Criteria) this;
        }

        public Criteria andStudentcodeNotBetween(String value1, String value2) {
            addCriterion("studentCode not between", value1, value2, "studentcode");
            return (Criteria) this;
        }

        public Criteria andSchoolidIsNull() {
            addCriterion("schoolId is null");
            return (Criteria) this;
        }

        public Criteria andSchoolidIsNotNull() {
            addCriterion("schoolId is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolidEqualTo(Integer value) {
            addCriterion("schoolId =", value, "schoolid");
            return (Criteria) this;
        }

        public Criteria andSchoolidNotEqualTo(Integer value) {
            addCriterion("schoolId <>", value, "schoolid");
            return (Criteria) this;
        }

        public Criteria andSchoolidGreaterThan(Integer value) {
            addCriterion("schoolId >", value, "schoolid");
            return (Criteria) this;
        }

        public Criteria andSchoolidGreaterThanOrEqualTo(Integer value) {
            addCriterion("schoolId >=", value, "schoolid");
            return (Criteria) this;
        }

        public Criteria andSchoolidLessThan(Integer value) {
            addCriterion("schoolId <", value, "schoolid");
            return (Criteria) this;
        }

        public Criteria andSchoolidLessThanOrEqualTo(Integer value) {
            addCriterion("schoolId <=", value, "schoolid");
            return (Criteria) this;
        }

        public Criteria andSchoolidIn(List<Integer> values) {
            addCriterion("schoolId in", values, "schoolid");
            return (Criteria) this;
        }

        public Criteria andSchoolidNotIn(List<Integer> values) {
            addCriterion("schoolId not in", values, "schoolid");
            return (Criteria) this;
        }

        public Criteria andSchoolidBetween(Integer value1, Integer value2) {
            addCriterion("schoolId between", value1, value2, "schoolid");
            return (Criteria) this;
        }

        public Criteria andSchoolidNotBetween(Integer value1, Integer value2) {
            addCriterion("schoolId not between", value1, value2, "schoolid");
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

        public Criteria andStudentidIsNull() {
            addCriterion("studentId is null");
            return (Criteria) this;
        }

        public Criteria andStudentidIsNotNull() {
            addCriterion("studentId is not null");
            return (Criteria) this;
        }

        public Criteria andStudentidEqualTo(Long value) {
            addCriterion("studentId =", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotEqualTo(Long value) {
            addCriterion("studentId <>", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidGreaterThan(Long value) {
            addCriterion("studentId >", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidGreaterThanOrEqualTo(Long value) {
            addCriterion("studentId >=", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidLessThan(Long value) {
            addCriterion("studentId <", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidLessThanOrEqualTo(Long value) {
            addCriterion("studentId <=", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidIn(List<Long> values) {
            addCriterion("studentId in", values, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotIn(List<Long> values) {
            addCriterion("studentId not in", values, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidBetween(Long value1, Long value2) {
            addCriterion("studentId between", value1, value2, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotBetween(Long value1, Long value2) {
            addCriterion("studentId not between", value1, value2, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentnameIsNull() {
            addCriterion("studentName is null");
            return (Criteria) this;
        }

        public Criteria andStudentnameIsNotNull() {
            addCriterion("studentName is not null");
            return (Criteria) this;
        }

        public Criteria andStudentnameEqualTo(String value) {
            addCriterion("studentName =", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameNotEqualTo(String value) {
            addCriterion("studentName <>", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameGreaterThan(String value) {
            addCriterion("studentName >", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameGreaterThanOrEqualTo(String value) {
            addCriterion("studentName >=", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameLessThan(String value) {
            addCriterion("studentName <", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameLessThanOrEqualTo(String value) {
            addCriterion("studentName <=", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameLike(String value) {
            addCriterion("studentName like", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameNotLike(String value) {
            addCriterion("studentName not like", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameIn(List<String> values) {
            addCriterion("studentName in", values, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameNotIn(List<String> values) {
            addCriterion("studentName not in", values, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameBetween(String value1, String value2) {
            addCriterion("studentName between", value1, value2, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameNotBetween(String value1, String value2) {
            addCriterion("studentName not between", value1, value2, "studentname");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Integer value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Integer value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Integer value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Integer value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Integer value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Integer> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Integer> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Integer value1, Integer value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Integer value1, Integer value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andStudentlevelIsNull() {
            addCriterion("studentLevel is null");
            return (Criteria) this;
        }

        public Criteria andStudentlevelIsNotNull() {
            addCriterion("studentLevel is not null");
            return (Criteria) this;
        }

        public Criteria andStudentlevelEqualTo(String value) {
            addCriterion("studentLevel =", value, "studentlevel");
            return (Criteria) this;
        }

        public Criteria andStudentlevelNotEqualTo(String value) {
            addCriterion("studentLevel <>", value, "studentlevel");
            return (Criteria) this;
        }

        public Criteria andStudentlevelGreaterThan(String value) {
            addCriterion("studentLevel >", value, "studentlevel");
            return (Criteria) this;
        }

        public Criteria andStudentlevelGreaterThanOrEqualTo(String value) {
            addCriterion("studentLevel >=", value, "studentlevel");
            return (Criteria) this;
        }

        public Criteria andStudentlevelLessThan(String value) {
            addCriterion("studentLevel <", value, "studentlevel");
            return (Criteria) this;
        }

        public Criteria andStudentlevelLessThanOrEqualTo(String value) {
            addCriterion("studentLevel <=", value, "studentlevel");
            return (Criteria) this;
        }

        public Criteria andStudentlevelLike(String value) {
            addCriterion("studentLevel like", value, "studentlevel");
            return (Criteria) this;
        }

        public Criteria andStudentlevelNotLike(String value) {
            addCriterion("studentLevel not like", value, "studentlevel");
            return (Criteria) this;
        }

        public Criteria andStudentlevelIn(List<String> values) {
            addCriterion("studentLevel in", values, "studentlevel");
            return (Criteria) this;
        }

        public Criteria andStudentlevelNotIn(List<String> values) {
            addCriterion("studentLevel not in", values, "studentlevel");
            return (Criteria) this;
        }

        public Criteria andStudentlevelBetween(String value1, String value2) {
            addCriterion("studentLevel between", value1, value2, "studentlevel");
            return (Criteria) this;
        }

        public Criteria andStudentlevelNotBetween(String value1, String value2) {
            addCriterion("studentLevel not between", value1, value2, "studentlevel");
            return (Criteria) this;
        }

        public Criteria andEnrolyearIsNull() {
            addCriterion("enrolYear is null");
            return (Criteria) this;
        }

        public Criteria andEnrolyearIsNotNull() {
            addCriterion("enrolYear is not null");
            return (Criteria) this;
        }

        public Criteria andEnrolyearEqualTo(String value) {
            addCriterion("enrolYear =", value, "enrolyear");
            return (Criteria) this;
        }

        public Criteria andEnrolyearNotEqualTo(String value) {
            addCriterion("enrolYear <>", value, "enrolyear");
            return (Criteria) this;
        }

        public Criteria andEnrolyearGreaterThan(String value) {
            addCriterion("enrolYear >", value, "enrolyear");
            return (Criteria) this;
        }

        public Criteria andEnrolyearGreaterThanOrEqualTo(String value) {
            addCriterion("enrolYear >=", value, "enrolyear");
            return (Criteria) this;
        }

        public Criteria andEnrolyearLessThan(String value) {
            addCriterion("enrolYear <", value, "enrolyear");
            return (Criteria) this;
        }

        public Criteria andEnrolyearLessThanOrEqualTo(String value) {
            addCriterion("enrolYear <=", value, "enrolyear");
            return (Criteria) this;
        }

        public Criteria andEnrolyearLike(String value) {
            addCriterion("enrolYear like", value, "enrolyear");
            return (Criteria) this;
        }

        public Criteria andEnrolyearNotLike(String value) {
            addCriterion("enrolYear not like", value, "enrolyear");
            return (Criteria) this;
        }

        public Criteria andEnrolyearIn(List<String> values) {
            addCriterion("enrolYear in", values, "enrolyear");
            return (Criteria) this;
        }

        public Criteria andEnrolyearNotIn(List<String> values) {
            addCriterion("enrolYear not in", values, "enrolyear");
            return (Criteria) this;
        }

        public Criteria andEnrolyearBetween(String value1, String value2) {
            addCriterion("enrolYear between", value1, value2, "enrolyear");
            return (Criteria) this;
        }

        public Criteria andEnrolyearNotBetween(String value1, String value2) {
            addCriterion("enrolYear not between", value1, value2, "enrolyear");
            return (Criteria) this;
        }

        public Criteria andComposeidIsNull() {
            addCriterion("composeId is null");
            return (Criteria) this;
        }

        public Criteria andComposeidIsNotNull() {
            addCriterion("composeId is not null");
            return (Criteria) this;
        }

        public Criteria andComposeidEqualTo(String value) {
            addCriterion("composeId =", value, "composeid");
            return (Criteria) this;
        }

        public Criteria andComposeidNotEqualTo(String value) {
            addCriterion("composeId <>", value, "composeid");
            return (Criteria) this;
        }

        public Criteria andComposeidGreaterThan(String value) {
            addCriterion("composeId >", value, "composeid");
            return (Criteria) this;
        }

        public Criteria andComposeidGreaterThanOrEqualTo(String value) {
            addCriterion("composeId >=", value, "composeid");
            return (Criteria) this;
        }

        public Criteria andComposeidLessThan(String value) {
            addCriterion("composeId <", value, "composeid");
            return (Criteria) this;
        }

        public Criteria andComposeidLessThanOrEqualTo(String value) {
            addCriterion("composeId <=", value, "composeid");
            return (Criteria) this;
        }

        public Criteria andComposeidLike(String value) {
            addCriterion("composeId like", value, "composeid");
            return (Criteria) this;
        }

        public Criteria andComposeidNotLike(String value) {
            addCriterion("composeId not like", value, "composeid");
            return (Criteria) this;
        }

        public Criteria andComposeidIn(List<String> values) {
            addCriterion("composeId in", values, "composeid");
            return (Criteria) this;
        }

        public Criteria andComposeidNotIn(List<String> values) {
            addCriterion("composeId not in", values, "composeid");
            return (Criteria) this;
        }

        public Criteria andComposeidBetween(String value1, String value2) {
            addCriterion("composeId between", value1, value2, "composeid");
            return (Criteria) this;
        }

        public Criteria andComposeidNotBetween(String value1, String value2) {
            addCriterion("composeId not between", value1, value2, "composeid");
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

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andPublisherIsNull() {
            addCriterion("publisher is null");
            return (Criteria) this;
        }

        public Criteria andPublisherIsNotNull() {
            addCriterion("publisher is not null");
            return (Criteria) this;
        }

        public Criteria andPublisherEqualTo(String value) {
            addCriterion("publisher =", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotEqualTo(String value) {
            addCriterion("publisher <>", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherGreaterThan(String value) {
            addCriterion("publisher >", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherGreaterThanOrEqualTo(String value) {
            addCriterion("publisher >=", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherLessThan(String value) {
            addCriterion("publisher <", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherLessThanOrEqualTo(String value) {
            addCriterion("publisher <=", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherLike(String value) {
            addCriterion("publisher like", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotLike(String value) {
            addCriterion("publisher not like", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherIn(List<String> values) {
            addCriterion("publisher in", values, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotIn(List<String> values) {
            addCriterion("publisher not in", values, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherBetween(String value1, String value2) {
            addCriterion("publisher between", value1, value2, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotBetween(String value1, String value2) {
            addCriterion("publisher not between", value1, value2, "publisher");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("createDate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("createDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Long value) {
            addCriterion("createDate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Long value) {
            addCriterion("createDate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Long value) {
            addCriterion("createDate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Long value) {
            addCriterion("createDate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Long value) {
            addCriterion("createDate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Long value) {
            addCriterion("createDate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Long> values) {
            addCriterion("createDate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Long> values) {
            addCriterion("createDate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Long value1, Long value2) {
            addCriterion("createDate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Long value1, Long value2) {
            addCriterion("createDate not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andLastmodifierIsNull() {
            addCriterion("lastModifier is null");
            return (Criteria) this;
        }

        public Criteria andLastmodifierIsNotNull() {
            addCriterion("lastModifier is not null");
            return (Criteria) this;
        }

        public Criteria andLastmodifierEqualTo(String value) {
            addCriterion("lastModifier =", value, "lastmodifier");
            return (Criteria) this;
        }

        public Criteria andLastmodifierNotEqualTo(String value) {
            addCriterion("lastModifier <>", value, "lastmodifier");
            return (Criteria) this;
        }

        public Criteria andLastmodifierGreaterThan(String value) {
            addCriterion("lastModifier >", value, "lastmodifier");
            return (Criteria) this;
        }

        public Criteria andLastmodifierGreaterThanOrEqualTo(String value) {
            addCriterion("lastModifier >=", value, "lastmodifier");
            return (Criteria) this;
        }

        public Criteria andLastmodifierLessThan(String value) {
            addCriterion("lastModifier <", value, "lastmodifier");
            return (Criteria) this;
        }

        public Criteria andLastmodifierLessThanOrEqualTo(String value) {
            addCriterion("lastModifier <=", value, "lastmodifier");
            return (Criteria) this;
        }

        public Criteria andLastmodifierLike(String value) {
            addCriterion("lastModifier like", value, "lastmodifier");
            return (Criteria) this;
        }

        public Criteria andLastmodifierNotLike(String value) {
            addCriterion("lastModifier not like", value, "lastmodifier");
            return (Criteria) this;
        }

        public Criteria andLastmodifierIn(List<String> values) {
            addCriterion("lastModifier in", values, "lastmodifier");
            return (Criteria) this;
        }

        public Criteria andLastmodifierNotIn(List<String> values) {
            addCriterion("lastModifier not in", values, "lastmodifier");
            return (Criteria) this;
        }

        public Criteria andLastmodifierBetween(String value1, String value2) {
            addCriterion("lastModifier between", value1, value2, "lastmodifier");
            return (Criteria) this;
        }

        public Criteria andLastmodifierNotBetween(String value1, String value2) {
            addCriterion("lastModifier not between", value1, value2, "lastmodifier");
            return (Criteria) this;
        }

        public Criteria andLastmoddateIsNull() {
            addCriterion("lastModDate is null");
            return (Criteria) this;
        }

        public Criteria andLastmoddateIsNotNull() {
            addCriterion("lastModDate is not null");
            return (Criteria) this;
        }

        public Criteria andLastmoddateEqualTo(Long value) {
            addCriterion("lastModDate =", value, "lastmoddate");
            return (Criteria) this;
        }

        public Criteria andLastmoddateNotEqualTo(Long value) {
            addCriterion("lastModDate <>", value, "lastmoddate");
            return (Criteria) this;
        }

        public Criteria andLastmoddateGreaterThan(Long value) {
            addCriterion("lastModDate >", value, "lastmoddate");
            return (Criteria) this;
        }

        public Criteria andLastmoddateGreaterThanOrEqualTo(Long value) {
            addCriterion("lastModDate >=", value, "lastmoddate");
            return (Criteria) this;
        }

        public Criteria andLastmoddateLessThan(Long value) {
            addCriterion("lastModDate <", value, "lastmoddate");
            return (Criteria) this;
        }

        public Criteria andLastmoddateLessThanOrEqualTo(Long value) {
            addCriterion("lastModDate <=", value, "lastmoddate");
            return (Criteria) this;
        }

        public Criteria andLastmoddateIn(List<Long> values) {
            addCriterion("lastModDate in", values, "lastmoddate");
            return (Criteria) this;
        }

        public Criteria andLastmoddateNotIn(List<Long> values) {
            addCriterion("lastModDate not in", values, "lastmoddate");
            return (Criteria) this;
        }

        public Criteria andLastmoddateBetween(Long value1, Long value2) {
            addCriterion("lastModDate between", value1, value2, "lastmoddate");
            return (Criteria) this;
        }

        public Criteria andLastmoddateNotBetween(Long value1, Long value2) {
            addCriterion("lastModDate not between", value1, value2, "lastmoddate");
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