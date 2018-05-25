package com.baidu.domain;

import java.util.ArrayList;
import java.util.List;

public class CourseComposeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseComposeExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andCourse1idIsNull() {
            addCriterion("course1Id is null");
            return (Criteria) this;
        }

        public Criteria andCourse1idIsNotNull() {
            addCriterion("course1Id is not null");
            return (Criteria) this;
        }

        public Criteria andCourse1idEqualTo(String value) {
            addCriterion("course1Id =", value, "course1id");
            return (Criteria) this;
        }

        public Criteria andCourse1idNotEqualTo(String value) {
            addCriterion("course1Id <>", value, "course1id");
            return (Criteria) this;
        }

        public Criteria andCourse1idGreaterThan(String value) {
            addCriterion("course1Id >", value, "course1id");
            return (Criteria) this;
        }

        public Criteria andCourse1idGreaterThanOrEqualTo(String value) {
            addCriterion("course1Id >=", value, "course1id");
            return (Criteria) this;
        }

        public Criteria andCourse1idLessThan(String value) {
            addCriterion("course1Id <", value, "course1id");
            return (Criteria) this;
        }

        public Criteria andCourse1idLessThanOrEqualTo(String value) {
            addCriterion("course1Id <=", value, "course1id");
            return (Criteria) this;
        }

        public Criteria andCourse1idLike(String value) {
            addCriterion("course1Id like", value, "course1id");
            return (Criteria) this;
        }

        public Criteria andCourse1idNotLike(String value) {
            addCriterion("course1Id not like", value, "course1id");
            return (Criteria) this;
        }

        public Criteria andCourse1idIn(List<String> values) {
            addCriterion("course1Id in", values, "course1id");
            return (Criteria) this;
        }

        public Criteria andCourse1idNotIn(List<String> values) {
            addCriterion("course1Id not in", values, "course1id");
            return (Criteria) this;
        }

        public Criteria andCourse1idBetween(String value1, String value2) {
            addCriterion("course1Id between", value1, value2, "course1id");
            return (Criteria) this;
        }

        public Criteria andCourse1idNotBetween(String value1, String value2) {
            addCriterion("course1Id not between", value1, value2, "course1id");
            return (Criteria) this;
        }

        public Criteria andCourse2idIsNull() {
            addCriterion("course2Id is null");
            return (Criteria) this;
        }

        public Criteria andCourse2idIsNotNull() {
            addCriterion("course2Id is not null");
            return (Criteria) this;
        }

        public Criteria andCourse2idEqualTo(String value) {
            addCriterion("course2Id =", value, "course2id");
            return (Criteria) this;
        }

        public Criteria andCourse2idNotEqualTo(String value) {
            addCriterion("course2Id <>", value, "course2id");
            return (Criteria) this;
        }

        public Criteria andCourse2idGreaterThan(String value) {
            addCriterion("course2Id >", value, "course2id");
            return (Criteria) this;
        }

        public Criteria andCourse2idGreaterThanOrEqualTo(String value) {
            addCriterion("course2Id >=", value, "course2id");
            return (Criteria) this;
        }

        public Criteria andCourse2idLessThan(String value) {
            addCriterion("course2Id <", value, "course2id");
            return (Criteria) this;
        }

        public Criteria andCourse2idLessThanOrEqualTo(String value) {
            addCriterion("course2Id <=", value, "course2id");
            return (Criteria) this;
        }

        public Criteria andCourse2idLike(String value) {
            addCriterion("course2Id like", value, "course2id");
            return (Criteria) this;
        }

        public Criteria andCourse2idNotLike(String value) {
            addCriterion("course2Id not like", value, "course2id");
            return (Criteria) this;
        }

        public Criteria andCourse2idIn(List<String> values) {
            addCriterion("course2Id in", values, "course2id");
            return (Criteria) this;
        }

        public Criteria andCourse2idNotIn(List<String> values) {
            addCriterion("course2Id not in", values, "course2id");
            return (Criteria) this;
        }

        public Criteria andCourse2idBetween(String value1, String value2) {
            addCriterion("course2Id between", value1, value2, "course2id");
            return (Criteria) this;
        }

        public Criteria andCourse2idNotBetween(String value1, String value2) {
            addCriterion("course2Id not between", value1, value2, "course2id");
            return (Criteria) this;
        }

        public Criteria andCourse3idIsNull() {
            addCriterion("course3Id is null");
            return (Criteria) this;
        }

        public Criteria andCourse3idIsNotNull() {
            addCriterion("course3Id is not null");
            return (Criteria) this;
        }

        public Criteria andCourse3idEqualTo(String value) {
            addCriterion("course3Id =", value, "course3id");
            return (Criteria) this;
        }

        public Criteria andCourse3idNotEqualTo(String value) {
            addCriterion("course3Id <>", value, "course3id");
            return (Criteria) this;
        }

        public Criteria andCourse3idGreaterThan(String value) {
            addCriterion("course3Id >", value, "course3id");
            return (Criteria) this;
        }

        public Criteria andCourse3idGreaterThanOrEqualTo(String value) {
            addCriterion("course3Id >=", value, "course3id");
            return (Criteria) this;
        }

        public Criteria andCourse3idLessThan(String value) {
            addCriterion("course3Id <", value, "course3id");
            return (Criteria) this;
        }

        public Criteria andCourse3idLessThanOrEqualTo(String value) {
            addCriterion("course3Id <=", value, "course3id");
            return (Criteria) this;
        }

        public Criteria andCourse3idLike(String value) {
            addCriterion("course3Id like", value, "course3id");
            return (Criteria) this;
        }

        public Criteria andCourse3idNotLike(String value) {
            addCriterion("course3Id not like", value, "course3id");
            return (Criteria) this;
        }

        public Criteria andCourse3idIn(List<String> values) {
            addCriterion("course3Id in", values, "course3id");
            return (Criteria) this;
        }

        public Criteria andCourse3idNotIn(List<String> values) {
            addCriterion("course3Id not in", values, "course3id");
            return (Criteria) this;
        }

        public Criteria andCourse3idBetween(String value1, String value2) {
            addCriterion("course3Id between", value1, value2, "course3id");
            return (Criteria) this;
        }

        public Criteria andCourse3idNotBetween(String value1, String value2) {
            addCriterion("course3Id not between", value1, value2, "course3id");
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

        public Criteria andTypeEqualTo(Byte value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Byte value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Byte value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Byte value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Byte value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Byte> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Byte> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Byte value1, Byte value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("type not between", value1, value2, "type");
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

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("creator like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("creator not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("creator not between", value1, value2, "creator");
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