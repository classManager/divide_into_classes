package com.baidu.domain;

import java.util.ArrayList;
import java.util.List;

public class ScoreDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScoreDetailExample() {
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

        public Criteria andScoreidIsNull() {
            addCriterion("scoreId is null");
            return (Criteria) this;
        }

        public Criteria andScoreidIsNotNull() {
            addCriterion("scoreId is not null");
            return (Criteria) this;
        }

        public Criteria andScoreidEqualTo(String value) {
            addCriterion("scoreId =", value, "scoreid");
            return (Criteria) this;
        }

        public Criteria andScoreidNotEqualTo(String value) {
            addCriterion("scoreId <>", value, "scoreid");
            return (Criteria) this;
        }

        public Criteria andScoreidGreaterThan(String value) {
            addCriterion("scoreId >", value, "scoreid");
            return (Criteria) this;
        }

        public Criteria andScoreidGreaterThanOrEqualTo(String value) {
            addCriterion("scoreId >=", value, "scoreid");
            return (Criteria) this;
        }

        public Criteria andScoreidLessThan(String value) {
            addCriterion("scoreId <", value, "scoreid");
            return (Criteria) this;
        }

        public Criteria andScoreidLessThanOrEqualTo(String value) {
            addCriterion("scoreId <=", value, "scoreid");
            return (Criteria) this;
        }

        public Criteria andScoreidLike(String value) {
            addCriterion("scoreId like", value, "scoreid");
            return (Criteria) this;
        }

        public Criteria andScoreidNotLike(String value) {
            addCriterion("scoreId not like", value, "scoreid");
            return (Criteria) this;
        }

        public Criteria andScoreidIn(List<String> values) {
            addCriterion("scoreId in", values, "scoreid");
            return (Criteria) this;
        }

        public Criteria andScoreidNotIn(List<String> values) {
            addCriterion("scoreId not in", values, "scoreid");
            return (Criteria) this;
        }

        public Criteria andScoreidBetween(String value1, String value2) {
            addCriterion("scoreId between", value1, value2, "scoreid");
            return (Criteria) this;
        }

        public Criteria andScoreidNotBetween(String value1, String value2) {
            addCriterion("scoreId not between", value1, value2, "scoreid");
            return (Criteria) this;
        }

        public Criteria andDetailidIsNull() {
            addCriterion("detailId is null");
            return (Criteria) this;
        }

        public Criteria andDetailidIsNotNull() {
            addCriterion("detailId is not null");
            return (Criteria) this;
        }

        public Criteria andDetailidEqualTo(String value) {
            addCriterion("detailId =", value, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidNotEqualTo(String value) {
            addCriterion("detailId <>", value, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidGreaterThan(String value) {
            addCriterion("detailId >", value, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidGreaterThanOrEqualTo(String value) {
            addCriterion("detailId >=", value, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidLessThan(String value) {
            addCriterion("detailId <", value, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidLessThanOrEqualTo(String value) {
            addCriterion("detailId <=", value, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidLike(String value) {
            addCriterion("detailId like", value, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidNotLike(String value) {
            addCriterion("detailId not like", value, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidIn(List<String> values) {
            addCriterion("detailId in", values, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidNotIn(List<String> values) {
            addCriterion("detailId not in", values, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidBetween(String value1, String value2) {
            addCriterion("detailId between", value1, value2, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidNotBetween(String value1, String value2) {
            addCriterion("detailId not between", value1, value2, "detailid");
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

        public Criteria andYuwenscoreIsNull() {
            addCriterion("yuWenScore is null");
            return (Criteria) this;
        }

        public Criteria andYuwenscoreIsNotNull() {
            addCriterion("yuWenScore is not null");
            return (Criteria) this;
        }

        public Criteria andYuwenscoreEqualTo(Double value) {
            addCriterion("yuWenScore =", value, "yuwenscore");
            return (Criteria) this;
        }

        public Criteria andYuwenscoreNotEqualTo(Double value) {
            addCriterion("yuWenScore <>", value, "yuwenscore");
            return (Criteria) this;
        }

        public Criteria andYuwenscoreGreaterThan(Double value) {
            addCriterion("yuWenScore >", value, "yuwenscore");
            return (Criteria) this;
        }

        public Criteria andYuwenscoreGreaterThanOrEqualTo(Double value) {
            addCriterion("yuWenScore >=", value, "yuwenscore");
            return (Criteria) this;
        }

        public Criteria andYuwenscoreLessThan(Double value) {
            addCriterion("yuWenScore <", value, "yuwenscore");
            return (Criteria) this;
        }

        public Criteria andYuwenscoreLessThanOrEqualTo(Double value) {
            addCriterion("yuWenScore <=", value, "yuwenscore");
            return (Criteria) this;
        }

        public Criteria andYuwenscoreIn(List<Double> values) {
            addCriterion("yuWenScore in", values, "yuwenscore");
            return (Criteria) this;
        }

        public Criteria andYuwenscoreNotIn(List<Double> values) {
            addCriterion("yuWenScore not in", values, "yuwenscore");
            return (Criteria) this;
        }

        public Criteria andYuwenscoreBetween(Double value1, Double value2) {
            addCriterion("yuWenScore between", value1, value2, "yuwenscore");
            return (Criteria) this;
        }

        public Criteria andYuwenscoreNotBetween(Double value1, Double value2) {
            addCriterion("yuWenScore not between", value1, value2, "yuwenscore");
            return (Criteria) this;
        }

        public Criteria andShuxuescoreIsNull() {
            addCriterion("shuXueScore is null");
            return (Criteria) this;
        }

        public Criteria andShuxuescoreIsNotNull() {
            addCriterion("shuXueScore is not null");
            return (Criteria) this;
        }

        public Criteria andShuxuescoreEqualTo(Double value) {
            addCriterion("shuXueScore =", value, "shuxuescore");
            return (Criteria) this;
        }

        public Criteria andShuxuescoreNotEqualTo(Double value) {
            addCriterion("shuXueScore <>", value, "shuxuescore");
            return (Criteria) this;
        }

        public Criteria andShuxuescoreGreaterThan(Double value) {
            addCriterion("shuXueScore >", value, "shuxuescore");
            return (Criteria) this;
        }

        public Criteria andShuxuescoreGreaterThanOrEqualTo(Double value) {
            addCriterion("shuXueScore >=", value, "shuxuescore");
            return (Criteria) this;
        }

        public Criteria andShuxuescoreLessThan(Double value) {
            addCriterion("shuXueScore <", value, "shuxuescore");
            return (Criteria) this;
        }

        public Criteria andShuxuescoreLessThanOrEqualTo(Double value) {
            addCriterion("shuXueScore <=", value, "shuxuescore");
            return (Criteria) this;
        }

        public Criteria andShuxuescoreIn(List<Double> values) {
            addCriterion("shuXueScore in", values, "shuxuescore");
            return (Criteria) this;
        }

        public Criteria andShuxuescoreNotIn(List<Double> values) {
            addCriterion("shuXueScore not in", values, "shuxuescore");
            return (Criteria) this;
        }

        public Criteria andShuxuescoreBetween(Double value1, Double value2) {
            addCriterion("shuXueScore between", value1, value2, "shuxuescore");
            return (Criteria) this;
        }

        public Criteria andShuxuescoreNotBetween(Double value1, Double value2) {
            addCriterion("shuXueScore not between", value1, value2, "shuxuescore");
            return (Criteria) this;
        }

        public Criteria andYingyuscoreIsNull() {
            addCriterion("yingYuScore is null");
            return (Criteria) this;
        }

        public Criteria andYingyuscoreIsNotNull() {
            addCriterion("yingYuScore is not null");
            return (Criteria) this;
        }

        public Criteria andYingyuscoreEqualTo(Double value) {
            addCriterion("yingYuScore =", value, "yingyuscore");
            return (Criteria) this;
        }

        public Criteria andYingyuscoreNotEqualTo(Double value) {
            addCriterion("yingYuScore <>", value, "yingyuscore");
            return (Criteria) this;
        }

        public Criteria andYingyuscoreGreaterThan(Double value) {
            addCriterion("yingYuScore >", value, "yingyuscore");
            return (Criteria) this;
        }

        public Criteria andYingyuscoreGreaterThanOrEqualTo(Double value) {
            addCriterion("yingYuScore >=", value, "yingyuscore");
            return (Criteria) this;
        }

        public Criteria andYingyuscoreLessThan(Double value) {
            addCriterion("yingYuScore <", value, "yingyuscore");
            return (Criteria) this;
        }

        public Criteria andYingyuscoreLessThanOrEqualTo(Double value) {
            addCriterion("yingYuScore <=", value, "yingyuscore");
            return (Criteria) this;
        }

        public Criteria andYingyuscoreIn(List<Double> values) {
            addCriterion("yingYuScore in", values, "yingyuscore");
            return (Criteria) this;
        }

        public Criteria andYingyuscoreNotIn(List<Double> values) {
            addCriterion("yingYuScore not in", values, "yingyuscore");
            return (Criteria) this;
        }

        public Criteria andYingyuscoreBetween(Double value1, Double value2) {
            addCriterion("yingYuScore between", value1, value2, "yingyuscore");
            return (Criteria) this;
        }

        public Criteria andYingyuscoreNotBetween(Double value1, Double value2) {
            addCriterion("yingYuScore not between", value1, value2, "yingyuscore");
            return (Criteria) this;
        }

        public Criteria andWuliscoreIsNull() {
            addCriterion("wuLiScore is null");
            return (Criteria) this;
        }

        public Criteria andWuliscoreIsNotNull() {
            addCriterion("wuLiScore is not null");
            return (Criteria) this;
        }

        public Criteria andWuliscoreEqualTo(Double value) {
            addCriterion("wuLiScore =", value, "wuliscore");
            return (Criteria) this;
        }

        public Criteria andWuliscoreNotEqualTo(Double value) {
            addCriterion("wuLiScore <>", value, "wuliscore");
            return (Criteria) this;
        }

        public Criteria andWuliscoreGreaterThan(Double value) {
            addCriterion("wuLiScore >", value, "wuliscore");
            return (Criteria) this;
        }

        public Criteria andWuliscoreGreaterThanOrEqualTo(Double value) {
            addCriterion("wuLiScore >=", value, "wuliscore");
            return (Criteria) this;
        }

        public Criteria andWuliscoreLessThan(Double value) {
            addCriterion("wuLiScore <", value, "wuliscore");
            return (Criteria) this;
        }

        public Criteria andWuliscoreLessThanOrEqualTo(Double value) {
            addCriterion("wuLiScore <=", value, "wuliscore");
            return (Criteria) this;
        }

        public Criteria andWuliscoreIn(List<Double> values) {
            addCriterion("wuLiScore in", values, "wuliscore");
            return (Criteria) this;
        }

        public Criteria andWuliscoreNotIn(List<Double> values) {
            addCriterion("wuLiScore not in", values, "wuliscore");
            return (Criteria) this;
        }

        public Criteria andWuliscoreBetween(Double value1, Double value2) {
            addCriterion("wuLiScore between", value1, value2, "wuliscore");
            return (Criteria) this;
        }

        public Criteria andWuliscoreNotBetween(Double value1, Double value2) {
            addCriterion("wuLiScore not between", value1, value2, "wuliscore");
            return (Criteria) this;
        }

        public Criteria andHuaxuescoreIsNull() {
            addCriterion("huaXueScore is null");
            return (Criteria) this;
        }

        public Criteria andHuaxuescoreIsNotNull() {
            addCriterion("huaXueScore is not null");
            return (Criteria) this;
        }

        public Criteria andHuaxuescoreEqualTo(Double value) {
            addCriterion("huaXueScore =", value, "huaxuescore");
            return (Criteria) this;
        }

        public Criteria andHuaxuescoreNotEqualTo(Double value) {
            addCriterion("huaXueScore <>", value, "huaxuescore");
            return (Criteria) this;
        }

        public Criteria andHuaxuescoreGreaterThan(Double value) {
            addCriterion("huaXueScore >", value, "huaxuescore");
            return (Criteria) this;
        }

        public Criteria andHuaxuescoreGreaterThanOrEqualTo(Double value) {
            addCriterion("huaXueScore >=", value, "huaxuescore");
            return (Criteria) this;
        }

        public Criteria andHuaxuescoreLessThan(Double value) {
            addCriterion("huaXueScore <", value, "huaxuescore");
            return (Criteria) this;
        }

        public Criteria andHuaxuescoreLessThanOrEqualTo(Double value) {
            addCriterion("huaXueScore <=", value, "huaxuescore");
            return (Criteria) this;
        }

        public Criteria andHuaxuescoreIn(List<Double> values) {
            addCriterion("huaXueScore in", values, "huaxuescore");
            return (Criteria) this;
        }

        public Criteria andHuaxuescoreNotIn(List<Double> values) {
            addCriterion("huaXueScore not in", values, "huaxuescore");
            return (Criteria) this;
        }

        public Criteria andHuaxuescoreBetween(Double value1, Double value2) {
            addCriterion("huaXueScore between", value1, value2, "huaxuescore");
            return (Criteria) this;
        }

        public Criteria andHuaxuescoreNotBetween(Double value1, Double value2) {
            addCriterion("huaXueScore not between", value1, value2, "huaxuescore");
            return (Criteria) this;
        }

        public Criteria andShengwuscoreIsNull() {
            addCriterion("shengWuScore is null");
            return (Criteria) this;
        }

        public Criteria andShengwuscoreIsNotNull() {
            addCriterion("shengWuScore is not null");
            return (Criteria) this;
        }

        public Criteria andShengwuscoreEqualTo(Double value) {
            addCriterion("shengWuScore =", value, "shengwuscore");
            return (Criteria) this;
        }

        public Criteria andShengwuscoreNotEqualTo(Double value) {
            addCriterion("shengWuScore <>", value, "shengwuscore");
            return (Criteria) this;
        }

        public Criteria andShengwuscoreGreaterThan(Double value) {
            addCriterion("shengWuScore >", value, "shengwuscore");
            return (Criteria) this;
        }

        public Criteria andShengwuscoreGreaterThanOrEqualTo(Double value) {
            addCriterion("shengWuScore >=", value, "shengwuscore");
            return (Criteria) this;
        }

        public Criteria andShengwuscoreLessThan(Double value) {
            addCriterion("shengWuScore <", value, "shengwuscore");
            return (Criteria) this;
        }

        public Criteria andShengwuscoreLessThanOrEqualTo(Double value) {
            addCriterion("shengWuScore <=", value, "shengwuscore");
            return (Criteria) this;
        }

        public Criteria andShengwuscoreIn(List<Double> values) {
            addCriterion("shengWuScore in", values, "shengwuscore");
            return (Criteria) this;
        }

        public Criteria andShengwuscoreNotIn(List<Double> values) {
            addCriterion("shengWuScore not in", values, "shengwuscore");
            return (Criteria) this;
        }

        public Criteria andShengwuscoreBetween(Double value1, Double value2) {
            addCriterion("shengWuScore between", value1, value2, "shengwuscore");
            return (Criteria) this;
        }

        public Criteria andShengwuscoreNotBetween(Double value1, Double value2) {
            addCriterion("shengWuScore not between", value1, value2, "shengwuscore");
            return (Criteria) this;
        }

        public Criteria andZhengzhiscoreIsNull() {
            addCriterion("zhengZhiScore is null");
            return (Criteria) this;
        }

        public Criteria andZhengzhiscoreIsNotNull() {
            addCriterion("zhengZhiScore is not null");
            return (Criteria) this;
        }

        public Criteria andZhengzhiscoreEqualTo(Double value) {
            addCriterion("zhengZhiScore =", value, "zhengzhiscore");
            return (Criteria) this;
        }

        public Criteria andZhengzhiscoreNotEqualTo(Double value) {
            addCriterion("zhengZhiScore <>", value, "zhengzhiscore");
            return (Criteria) this;
        }

        public Criteria andZhengzhiscoreGreaterThan(Double value) {
            addCriterion("zhengZhiScore >", value, "zhengzhiscore");
            return (Criteria) this;
        }

        public Criteria andZhengzhiscoreGreaterThanOrEqualTo(Double value) {
            addCriterion("zhengZhiScore >=", value, "zhengzhiscore");
            return (Criteria) this;
        }

        public Criteria andZhengzhiscoreLessThan(Double value) {
            addCriterion("zhengZhiScore <", value, "zhengzhiscore");
            return (Criteria) this;
        }

        public Criteria andZhengzhiscoreLessThanOrEqualTo(Double value) {
            addCriterion("zhengZhiScore <=", value, "zhengzhiscore");
            return (Criteria) this;
        }

        public Criteria andZhengzhiscoreIn(List<Double> values) {
            addCriterion("zhengZhiScore in", values, "zhengzhiscore");
            return (Criteria) this;
        }

        public Criteria andZhengzhiscoreNotIn(List<Double> values) {
            addCriterion("zhengZhiScore not in", values, "zhengzhiscore");
            return (Criteria) this;
        }

        public Criteria andZhengzhiscoreBetween(Double value1, Double value2) {
            addCriterion("zhengZhiScore between", value1, value2, "zhengzhiscore");
            return (Criteria) this;
        }

        public Criteria andZhengzhiscoreNotBetween(Double value1, Double value2) {
            addCriterion("zhengZhiScore not between", value1, value2, "zhengzhiscore");
            return (Criteria) this;
        }

        public Criteria andDiliscoreIsNull() {
            addCriterion("diLiScore is null");
            return (Criteria) this;
        }

        public Criteria andDiliscoreIsNotNull() {
            addCriterion("diLiScore is not null");
            return (Criteria) this;
        }

        public Criteria andDiliscoreEqualTo(Double value) {
            addCriterion("diLiScore =", value, "diliscore");
            return (Criteria) this;
        }

        public Criteria andDiliscoreNotEqualTo(Double value) {
            addCriterion("diLiScore <>", value, "diliscore");
            return (Criteria) this;
        }

        public Criteria andDiliscoreGreaterThan(Double value) {
            addCriterion("diLiScore >", value, "diliscore");
            return (Criteria) this;
        }

        public Criteria andDiliscoreGreaterThanOrEqualTo(Double value) {
            addCriterion("diLiScore >=", value, "diliscore");
            return (Criteria) this;
        }

        public Criteria andDiliscoreLessThan(Double value) {
            addCriterion("diLiScore <", value, "diliscore");
            return (Criteria) this;
        }

        public Criteria andDiliscoreLessThanOrEqualTo(Double value) {
            addCriterion("diLiScore <=", value, "diliscore");
            return (Criteria) this;
        }

        public Criteria andDiliscoreIn(List<Double> values) {
            addCriterion("diLiScore in", values, "diliscore");
            return (Criteria) this;
        }

        public Criteria andDiliscoreNotIn(List<Double> values) {
            addCriterion("diLiScore not in", values, "diliscore");
            return (Criteria) this;
        }

        public Criteria andDiliscoreBetween(Double value1, Double value2) {
            addCriterion("diLiScore between", value1, value2, "diliscore");
            return (Criteria) this;
        }

        public Criteria andDiliscoreNotBetween(Double value1, Double value2) {
            addCriterion("diLiScore not between", value1, value2, "diliscore");
            return (Criteria) this;
        }

        public Criteria andLishiscoreIsNull() {
            addCriterion("liShiScore is null");
            return (Criteria) this;
        }

        public Criteria andLishiscoreIsNotNull() {
            addCriterion("liShiScore is not null");
            return (Criteria) this;
        }

        public Criteria andLishiscoreEqualTo(Double value) {
            addCriterion("liShiScore =", value, "lishiscore");
            return (Criteria) this;
        }

        public Criteria andLishiscoreNotEqualTo(Double value) {
            addCriterion("liShiScore <>", value, "lishiscore");
            return (Criteria) this;
        }

        public Criteria andLishiscoreGreaterThan(Double value) {
            addCriterion("liShiScore >", value, "lishiscore");
            return (Criteria) this;
        }

        public Criteria andLishiscoreGreaterThanOrEqualTo(Double value) {
            addCriterion("liShiScore >=", value, "lishiscore");
            return (Criteria) this;
        }

        public Criteria andLishiscoreLessThan(Double value) {
            addCriterion("liShiScore <", value, "lishiscore");
            return (Criteria) this;
        }

        public Criteria andLishiscoreLessThanOrEqualTo(Double value) {
            addCriterion("liShiScore <=", value, "lishiscore");
            return (Criteria) this;
        }

        public Criteria andLishiscoreIn(List<Double> values) {
            addCriterion("liShiScore in", values, "lishiscore");
            return (Criteria) this;
        }

        public Criteria andLishiscoreNotIn(List<Double> values) {
            addCriterion("liShiScore not in", values, "lishiscore");
            return (Criteria) this;
        }

        public Criteria andLishiscoreBetween(Double value1, Double value2) {
            addCriterion("liShiScore between", value1, value2, "lishiscore");
            return (Criteria) this;
        }

        public Criteria andLishiscoreNotBetween(Double value1, Double value2) {
            addCriterion("liShiScore not between", value1, value2, "lishiscore");
            return (Criteria) this;
        }

        public Criteria andJishuscoreIsNull() {
            addCriterion("jiShuScore is null");
            return (Criteria) this;
        }

        public Criteria andJishuscoreIsNotNull() {
            addCriterion("jiShuScore is not null");
            return (Criteria) this;
        }

        public Criteria andJishuscoreEqualTo(Double value) {
            addCriterion("jiShuScore =", value, "jishuscore");
            return (Criteria) this;
        }

        public Criteria andJishuscoreNotEqualTo(Double value) {
            addCriterion("jiShuScore <>", value, "jishuscore");
            return (Criteria) this;
        }

        public Criteria andJishuscoreGreaterThan(Double value) {
            addCriterion("jiShuScore >", value, "jishuscore");
            return (Criteria) this;
        }

        public Criteria andJishuscoreGreaterThanOrEqualTo(Double value) {
            addCriterion("jiShuScore >=", value, "jishuscore");
            return (Criteria) this;
        }

        public Criteria andJishuscoreLessThan(Double value) {
            addCriterion("jiShuScore <", value, "jishuscore");
            return (Criteria) this;
        }

        public Criteria andJishuscoreLessThanOrEqualTo(Double value) {
            addCriterion("jiShuScore <=", value, "jishuscore");
            return (Criteria) this;
        }

        public Criteria andJishuscoreIn(List<Double> values) {
            addCriterion("jiShuScore in", values, "jishuscore");
            return (Criteria) this;
        }

        public Criteria andJishuscoreNotIn(List<Double> values) {
            addCriterion("jiShuScore not in", values, "jishuscore");
            return (Criteria) this;
        }

        public Criteria andJishuscoreBetween(Double value1, Double value2) {
            addCriterion("jiShuScore between", value1, value2, "jishuscore");
            return (Criteria) this;
        }

        public Criteria andJishuscoreNotBetween(Double value1, Double value2) {
            addCriterion("jiShuScore not between", value1, value2, "jishuscore");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(Integer value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(Integer value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(Integer value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(Integer value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(Integer value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(Integer value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<Integer> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<Integer> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(Integer value1, Integer value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(Integer value1, Integer value2) {
            addCriterion("remark not between", value1, value2, "remark");
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