package com.baidu.domain;

import java.util.ArrayList;
import java.util.List;

public class ScoreCourseDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScoreCourseDetailExample() {
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

        public Criteria andWuliexscoreIsNull() {
            addCriterion("wuLiExScore is null");
            return (Criteria) this;
        }

        public Criteria andWuliexscoreIsNotNull() {
            addCriterion("wuLiExScore is not null");
            return (Criteria) this;
        }

        public Criteria andWuliexscoreEqualTo(Double value) {
            addCriterion("wuLiExScore =", value, "wuliexscore");
            return (Criteria) this;
        }

        public Criteria andWuliexscoreNotEqualTo(Double value) {
            addCriterion("wuLiExScore <>", value, "wuliexscore");
            return (Criteria) this;
        }

        public Criteria andWuliexscoreGreaterThan(Double value) {
            addCriterion("wuLiExScore >", value, "wuliexscore");
            return (Criteria) this;
        }

        public Criteria andWuliexscoreGreaterThanOrEqualTo(Double value) {
            addCriterion("wuLiExScore >=", value, "wuliexscore");
            return (Criteria) this;
        }

        public Criteria andWuliexscoreLessThan(Double value) {
            addCriterion("wuLiExScore <", value, "wuliexscore");
            return (Criteria) this;
        }

        public Criteria andWuliexscoreLessThanOrEqualTo(Double value) {
            addCriterion("wuLiExScore <=", value, "wuliexscore");
            return (Criteria) this;
        }

        public Criteria andWuliexscoreIn(List<Double> values) {
            addCriterion("wuLiExScore in", values, "wuliexscore");
            return (Criteria) this;
        }

        public Criteria andWuliexscoreNotIn(List<Double> values) {
            addCriterion("wuLiExScore not in", values, "wuliexscore");
            return (Criteria) this;
        }

        public Criteria andWuliexscoreBetween(Double value1, Double value2) {
            addCriterion("wuLiExScore between", value1, value2, "wuliexscore");
            return (Criteria) this;
        }

        public Criteria andWuliexscoreNotBetween(Double value1, Double value2) {
            addCriterion("wuLiExScore not between", value1, value2, "wuliexscore");
            return (Criteria) this;
        }

        public Criteria andWulirankIsNull() {
            addCriterion("wuLiRank is null");
            return (Criteria) this;
        }

        public Criteria andWulirankIsNotNull() {
            addCriterion("wuLiRank is not null");
            return (Criteria) this;
        }

        public Criteria andWulirankEqualTo(Integer value) {
            addCriterion("wuLiRank =", value, "wulirank");
            return (Criteria) this;
        }

        public Criteria andWulirankNotEqualTo(Integer value) {
            addCriterion("wuLiRank <>", value, "wulirank");
            return (Criteria) this;
        }

        public Criteria andWulirankGreaterThan(Integer value) {
            addCriterion("wuLiRank >", value, "wulirank");
            return (Criteria) this;
        }

        public Criteria andWulirankGreaterThanOrEqualTo(Integer value) {
            addCriterion("wuLiRank >=", value, "wulirank");
            return (Criteria) this;
        }

        public Criteria andWulirankLessThan(Integer value) {
            addCriterion("wuLiRank <", value, "wulirank");
            return (Criteria) this;
        }

        public Criteria andWulirankLessThanOrEqualTo(Integer value) {
            addCriterion("wuLiRank <=", value, "wulirank");
            return (Criteria) this;
        }

        public Criteria andWulirankIn(List<Integer> values) {
            addCriterion("wuLiRank in", values, "wulirank");
            return (Criteria) this;
        }

        public Criteria andWulirankNotIn(List<Integer> values) {
            addCriterion("wuLiRank not in", values, "wulirank");
            return (Criteria) this;
        }

        public Criteria andWulirankBetween(Integer value1, Integer value2) {
            addCriterion("wuLiRank between", value1, value2, "wulirank");
            return (Criteria) this;
        }

        public Criteria andWulirankNotBetween(Integer value1, Integer value2) {
            addCriterion("wuLiRank not between", value1, value2, "wulirank");
            return (Criteria) this;
        }

        public Criteria andWuliisweekIsNull() {
            addCriterion("wuLiIsWeek is null");
            return (Criteria) this;
        }

        public Criteria andWuliisweekIsNotNull() {
            addCriterion("wuLiIsWeek is not null");
            return (Criteria) this;
        }

        public Criteria andWuliisweekEqualTo(Integer value) {
            addCriterion("wuLiIsWeek =", value, "wuliisweek");
            return (Criteria) this;
        }

        public Criteria andWuliisweekNotEqualTo(Integer value) {
            addCriterion("wuLiIsWeek <>", value, "wuliisweek");
            return (Criteria) this;
        }

        public Criteria andWuliisweekGreaterThan(Integer value) {
            addCriterion("wuLiIsWeek >", value, "wuliisweek");
            return (Criteria) this;
        }

        public Criteria andWuliisweekGreaterThanOrEqualTo(Integer value) {
            addCriterion("wuLiIsWeek >=", value, "wuliisweek");
            return (Criteria) this;
        }

        public Criteria andWuliisweekLessThan(Integer value) {
            addCriterion("wuLiIsWeek <", value, "wuliisweek");
            return (Criteria) this;
        }

        public Criteria andWuliisweekLessThanOrEqualTo(Integer value) {
            addCriterion("wuLiIsWeek <=", value, "wuliisweek");
            return (Criteria) this;
        }

        public Criteria andWuliisweekIn(List<Integer> values) {
            addCriterion("wuLiIsWeek in", values, "wuliisweek");
            return (Criteria) this;
        }

        public Criteria andWuliisweekNotIn(List<Integer> values) {
            addCriterion("wuLiIsWeek not in", values, "wuliisweek");
            return (Criteria) this;
        }

        public Criteria andWuliisweekBetween(Integer value1, Integer value2) {
            addCriterion("wuLiIsWeek between", value1, value2, "wuliisweek");
            return (Criteria) this;
        }

        public Criteria andWuliisweekNotBetween(Integer value1, Integer value2) {
            addCriterion("wuLiIsWeek not between", value1, value2, "wuliisweek");
            return (Criteria) this;
        }

        public Criteria andHuaxueexscoreIsNull() {
            addCriterion("huaXueExScore is null");
            return (Criteria) this;
        }

        public Criteria andHuaxueexscoreIsNotNull() {
            addCriterion("huaXueExScore is not null");
            return (Criteria) this;
        }

        public Criteria andHuaxueexscoreEqualTo(Double value) {
            addCriterion("huaXueExScore =", value, "huaxueexscore");
            return (Criteria) this;
        }

        public Criteria andHuaxueexscoreNotEqualTo(Double value) {
            addCriterion("huaXueExScore <>", value, "huaxueexscore");
            return (Criteria) this;
        }

        public Criteria andHuaxueexscoreGreaterThan(Double value) {
            addCriterion("huaXueExScore >", value, "huaxueexscore");
            return (Criteria) this;
        }

        public Criteria andHuaxueexscoreGreaterThanOrEqualTo(Double value) {
            addCriterion("huaXueExScore >=", value, "huaxueexscore");
            return (Criteria) this;
        }

        public Criteria andHuaxueexscoreLessThan(Double value) {
            addCriterion("huaXueExScore <", value, "huaxueexscore");
            return (Criteria) this;
        }

        public Criteria andHuaxueexscoreLessThanOrEqualTo(Double value) {
            addCriterion("huaXueExScore <=", value, "huaxueexscore");
            return (Criteria) this;
        }

        public Criteria andHuaxueexscoreIn(List<Double> values) {
            addCriterion("huaXueExScore in", values, "huaxueexscore");
            return (Criteria) this;
        }

        public Criteria andHuaxueexscoreNotIn(List<Double> values) {
            addCriterion("huaXueExScore not in", values, "huaxueexscore");
            return (Criteria) this;
        }

        public Criteria andHuaxueexscoreBetween(Double value1, Double value2) {
            addCriterion("huaXueExScore between", value1, value2, "huaxueexscore");
            return (Criteria) this;
        }

        public Criteria andHuaxueexscoreNotBetween(Double value1, Double value2) {
            addCriterion("huaXueExScore not between", value1, value2, "huaxueexscore");
            return (Criteria) this;
        }

        public Criteria andHuaxuerankIsNull() {
            addCriterion("huaXueRank is null");
            return (Criteria) this;
        }

        public Criteria andHuaxuerankIsNotNull() {
            addCriterion("huaXueRank is not null");
            return (Criteria) this;
        }

        public Criteria andHuaxuerankEqualTo(Integer value) {
            addCriterion("huaXueRank =", value, "huaxuerank");
            return (Criteria) this;
        }

        public Criteria andHuaxuerankNotEqualTo(Integer value) {
            addCriterion("huaXueRank <>", value, "huaxuerank");
            return (Criteria) this;
        }

        public Criteria andHuaxuerankGreaterThan(Integer value) {
            addCriterion("huaXueRank >", value, "huaxuerank");
            return (Criteria) this;
        }

        public Criteria andHuaxuerankGreaterThanOrEqualTo(Integer value) {
            addCriterion("huaXueRank >=", value, "huaxuerank");
            return (Criteria) this;
        }

        public Criteria andHuaxuerankLessThan(Integer value) {
            addCriterion("huaXueRank <", value, "huaxuerank");
            return (Criteria) this;
        }

        public Criteria andHuaxuerankLessThanOrEqualTo(Integer value) {
            addCriterion("huaXueRank <=", value, "huaxuerank");
            return (Criteria) this;
        }

        public Criteria andHuaxuerankIn(List<Integer> values) {
            addCriterion("huaXueRank in", values, "huaxuerank");
            return (Criteria) this;
        }

        public Criteria andHuaxuerankNotIn(List<Integer> values) {
            addCriterion("huaXueRank not in", values, "huaxuerank");
            return (Criteria) this;
        }

        public Criteria andHuaxuerankBetween(Integer value1, Integer value2) {
            addCriterion("huaXueRank between", value1, value2, "huaxuerank");
            return (Criteria) this;
        }

        public Criteria andHuaxuerankNotBetween(Integer value1, Integer value2) {
            addCriterion("huaXueRank not between", value1, value2, "huaxuerank");
            return (Criteria) this;
        }

        public Criteria andHuaxueisweekIsNull() {
            addCriterion("huaXueIsWeek is null");
            return (Criteria) this;
        }

        public Criteria andHuaxueisweekIsNotNull() {
            addCriterion("huaXueIsWeek is not null");
            return (Criteria) this;
        }

        public Criteria andHuaxueisweekEqualTo(Integer value) {
            addCriterion("huaXueIsWeek =", value, "huaxueisweek");
            return (Criteria) this;
        }

        public Criteria andHuaxueisweekNotEqualTo(Integer value) {
            addCriterion("huaXueIsWeek <>", value, "huaxueisweek");
            return (Criteria) this;
        }

        public Criteria andHuaxueisweekGreaterThan(Integer value) {
            addCriterion("huaXueIsWeek >", value, "huaxueisweek");
            return (Criteria) this;
        }

        public Criteria andHuaxueisweekGreaterThanOrEqualTo(Integer value) {
            addCriterion("huaXueIsWeek >=", value, "huaxueisweek");
            return (Criteria) this;
        }

        public Criteria andHuaxueisweekLessThan(Integer value) {
            addCriterion("huaXueIsWeek <", value, "huaxueisweek");
            return (Criteria) this;
        }

        public Criteria andHuaxueisweekLessThanOrEqualTo(Integer value) {
            addCriterion("huaXueIsWeek <=", value, "huaxueisweek");
            return (Criteria) this;
        }

        public Criteria andHuaxueisweekIn(List<Integer> values) {
            addCriterion("huaXueIsWeek in", values, "huaxueisweek");
            return (Criteria) this;
        }

        public Criteria andHuaxueisweekNotIn(List<Integer> values) {
            addCriterion("huaXueIsWeek not in", values, "huaxueisweek");
            return (Criteria) this;
        }

        public Criteria andHuaxueisweekBetween(Integer value1, Integer value2) {
            addCriterion("huaXueIsWeek between", value1, value2, "huaxueisweek");
            return (Criteria) this;
        }

        public Criteria andHuaxueisweekNotBetween(Integer value1, Integer value2) {
            addCriterion("huaXueIsWeek not between", value1, value2, "huaxueisweek");
            return (Criteria) this;
        }

        public Criteria andShengwuexscoreIsNull() {
            addCriterion("shengWuExScore is null");
            return (Criteria) this;
        }

        public Criteria andShengwuexscoreIsNotNull() {
            addCriterion("shengWuExScore is not null");
            return (Criteria) this;
        }

        public Criteria andShengwuexscoreEqualTo(Double value) {
            addCriterion("shengWuExScore =", value, "shengwuexscore");
            return (Criteria) this;
        }

        public Criteria andShengwuexscoreNotEqualTo(Double value) {
            addCriterion("shengWuExScore <>", value, "shengwuexscore");
            return (Criteria) this;
        }

        public Criteria andShengwuexscoreGreaterThan(Double value) {
            addCriterion("shengWuExScore >", value, "shengwuexscore");
            return (Criteria) this;
        }

        public Criteria andShengwuexscoreGreaterThanOrEqualTo(Double value) {
            addCriterion("shengWuExScore >=", value, "shengwuexscore");
            return (Criteria) this;
        }

        public Criteria andShengwuexscoreLessThan(Double value) {
            addCriterion("shengWuExScore <", value, "shengwuexscore");
            return (Criteria) this;
        }

        public Criteria andShengwuexscoreLessThanOrEqualTo(Double value) {
            addCriterion("shengWuExScore <=", value, "shengwuexscore");
            return (Criteria) this;
        }

        public Criteria andShengwuexscoreIn(List<Double> values) {
            addCriterion("shengWuExScore in", values, "shengwuexscore");
            return (Criteria) this;
        }

        public Criteria andShengwuexscoreNotIn(List<Double> values) {
            addCriterion("shengWuExScore not in", values, "shengwuexscore");
            return (Criteria) this;
        }

        public Criteria andShengwuexscoreBetween(Double value1, Double value2) {
            addCriterion("shengWuExScore between", value1, value2, "shengwuexscore");
            return (Criteria) this;
        }

        public Criteria andShengwuexscoreNotBetween(Double value1, Double value2) {
            addCriterion("shengWuExScore not between", value1, value2, "shengwuexscore");
            return (Criteria) this;
        }

        public Criteria andShengwurankIsNull() {
            addCriterion("shengWuRank is null");
            return (Criteria) this;
        }

        public Criteria andShengwurankIsNotNull() {
            addCriterion("shengWuRank is not null");
            return (Criteria) this;
        }

        public Criteria andShengwurankEqualTo(Integer value) {
            addCriterion("shengWuRank =", value, "shengwurank");
            return (Criteria) this;
        }

        public Criteria andShengwurankNotEqualTo(Integer value) {
            addCriterion("shengWuRank <>", value, "shengwurank");
            return (Criteria) this;
        }

        public Criteria andShengwurankGreaterThan(Integer value) {
            addCriterion("shengWuRank >", value, "shengwurank");
            return (Criteria) this;
        }

        public Criteria andShengwurankGreaterThanOrEqualTo(Integer value) {
            addCriterion("shengWuRank >=", value, "shengwurank");
            return (Criteria) this;
        }

        public Criteria andShengwurankLessThan(Integer value) {
            addCriterion("shengWuRank <", value, "shengwurank");
            return (Criteria) this;
        }

        public Criteria andShengwurankLessThanOrEqualTo(Integer value) {
            addCriterion("shengWuRank <=", value, "shengwurank");
            return (Criteria) this;
        }

        public Criteria andShengwurankIn(List<Integer> values) {
            addCriterion("shengWuRank in", values, "shengwurank");
            return (Criteria) this;
        }

        public Criteria andShengwurankNotIn(List<Integer> values) {
            addCriterion("shengWuRank not in", values, "shengwurank");
            return (Criteria) this;
        }

        public Criteria andShengwurankBetween(Integer value1, Integer value2) {
            addCriterion("shengWuRank between", value1, value2, "shengwurank");
            return (Criteria) this;
        }

        public Criteria andShengwurankNotBetween(Integer value1, Integer value2) {
            addCriterion("shengWuRank not between", value1, value2, "shengwurank");
            return (Criteria) this;
        }

        public Criteria andShengwuisweekIsNull() {
            addCriterion("shengWuIsWeek is null");
            return (Criteria) this;
        }

        public Criteria andShengwuisweekIsNotNull() {
            addCriterion("shengWuIsWeek is not null");
            return (Criteria) this;
        }

        public Criteria andShengwuisweekEqualTo(Integer value) {
            addCriterion("shengWuIsWeek =", value, "shengwuisweek");
            return (Criteria) this;
        }

        public Criteria andShengwuisweekNotEqualTo(Integer value) {
            addCriterion("shengWuIsWeek <>", value, "shengwuisweek");
            return (Criteria) this;
        }

        public Criteria andShengwuisweekGreaterThan(Integer value) {
            addCriterion("shengWuIsWeek >", value, "shengwuisweek");
            return (Criteria) this;
        }

        public Criteria andShengwuisweekGreaterThanOrEqualTo(Integer value) {
            addCriterion("shengWuIsWeek >=", value, "shengwuisweek");
            return (Criteria) this;
        }

        public Criteria andShengwuisweekLessThan(Integer value) {
            addCriterion("shengWuIsWeek <", value, "shengwuisweek");
            return (Criteria) this;
        }

        public Criteria andShengwuisweekLessThanOrEqualTo(Integer value) {
            addCriterion("shengWuIsWeek <=", value, "shengwuisweek");
            return (Criteria) this;
        }

        public Criteria andShengwuisweekIn(List<Integer> values) {
            addCriterion("shengWuIsWeek in", values, "shengwuisweek");
            return (Criteria) this;
        }

        public Criteria andShengwuisweekNotIn(List<Integer> values) {
            addCriterion("shengWuIsWeek not in", values, "shengwuisweek");
            return (Criteria) this;
        }

        public Criteria andShengwuisweekBetween(Integer value1, Integer value2) {
            addCriterion("shengWuIsWeek between", value1, value2, "shengwuisweek");
            return (Criteria) this;
        }

        public Criteria andShengwuisweekNotBetween(Integer value1, Integer value2) {
            addCriterion("shengWuIsWeek not between", value1, value2, "shengwuisweek");
            return (Criteria) this;
        }

        public Criteria andZhengzhiexscoreIsNull() {
            addCriterion("zhengZhiExScore is null");
            return (Criteria) this;
        }

        public Criteria andZhengzhiexscoreIsNotNull() {
            addCriterion("zhengZhiExScore is not null");
            return (Criteria) this;
        }

        public Criteria andZhengzhiexscoreEqualTo(Double value) {
            addCriterion("zhengZhiExScore =", value, "zhengzhiexscore");
            return (Criteria) this;
        }

        public Criteria andZhengzhiexscoreNotEqualTo(Double value) {
            addCriterion("zhengZhiExScore <>", value, "zhengzhiexscore");
            return (Criteria) this;
        }

        public Criteria andZhengzhiexscoreGreaterThan(Double value) {
            addCriterion("zhengZhiExScore >", value, "zhengzhiexscore");
            return (Criteria) this;
        }

        public Criteria andZhengzhiexscoreGreaterThanOrEqualTo(Double value) {
            addCriterion("zhengZhiExScore >=", value, "zhengzhiexscore");
            return (Criteria) this;
        }

        public Criteria andZhengzhiexscoreLessThan(Double value) {
            addCriterion("zhengZhiExScore <", value, "zhengzhiexscore");
            return (Criteria) this;
        }

        public Criteria andZhengzhiexscoreLessThanOrEqualTo(Double value) {
            addCriterion("zhengZhiExScore <=", value, "zhengzhiexscore");
            return (Criteria) this;
        }

        public Criteria andZhengzhiexscoreIn(List<Double> values) {
            addCriterion("zhengZhiExScore in", values, "zhengzhiexscore");
            return (Criteria) this;
        }

        public Criteria andZhengzhiexscoreNotIn(List<Double> values) {
            addCriterion("zhengZhiExScore not in", values, "zhengzhiexscore");
            return (Criteria) this;
        }

        public Criteria andZhengzhiexscoreBetween(Double value1, Double value2) {
            addCriterion("zhengZhiExScore between", value1, value2, "zhengzhiexscore");
            return (Criteria) this;
        }

        public Criteria andZhengzhiexscoreNotBetween(Double value1, Double value2) {
            addCriterion("zhengZhiExScore not between", value1, value2, "zhengzhiexscore");
            return (Criteria) this;
        }

        public Criteria andZhengzhirankIsNull() {
            addCriterion("zhengZhiRank is null");
            return (Criteria) this;
        }

        public Criteria andZhengzhirankIsNotNull() {
            addCriterion("zhengZhiRank is not null");
            return (Criteria) this;
        }

        public Criteria andZhengzhirankEqualTo(Integer value) {
            addCriterion("zhengZhiRank =", value, "zhengzhirank");
            return (Criteria) this;
        }

        public Criteria andZhengzhirankNotEqualTo(Integer value) {
            addCriterion("zhengZhiRank <>", value, "zhengzhirank");
            return (Criteria) this;
        }

        public Criteria andZhengzhirankGreaterThan(Integer value) {
            addCriterion("zhengZhiRank >", value, "zhengzhirank");
            return (Criteria) this;
        }

        public Criteria andZhengzhirankGreaterThanOrEqualTo(Integer value) {
            addCriterion("zhengZhiRank >=", value, "zhengzhirank");
            return (Criteria) this;
        }

        public Criteria andZhengzhirankLessThan(Integer value) {
            addCriterion("zhengZhiRank <", value, "zhengzhirank");
            return (Criteria) this;
        }

        public Criteria andZhengzhirankLessThanOrEqualTo(Integer value) {
            addCriterion("zhengZhiRank <=", value, "zhengzhirank");
            return (Criteria) this;
        }

        public Criteria andZhengzhirankIn(List<Integer> values) {
            addCriterion("zhengZhiRank in", values, "zhengzhirank");
            return (Criteria) this;
        }

        public Criteria andZhengzhirankNotIn(List<Integer> values) {
            addCriterion("zhengZhiRank not in", values, "zhengzhirank");
            return (Criteria) this;
        }

        public Criteria andZhengzhirankBetween(Integer value1, Integer value2) {
            addCriterion("zhengZhiRank between", value1, value2, "zhengzhirank");
            return (Criteria) this;
        }

        public Criteria andZhengzhirankNotBetween(Integer value1, Integer value2) {
            addCriterion("zhengZhiRank not between", value1, value2, "zhengzhirank");
            return (Criteria) this;
        }

        public Criteria andZhengzhiisweekIsNull() {
            addCriterion("zhengZhiIsWeek is null");
            return (Criteria) this;
        }

        public Criteria andZhengzhiisweekIsNotNull() {
            addCriterion("zhengZhiIsWeek is not null");
            return (Criteria) this;
        }

        public Criteria andZhengzhiisweekEqualTo(Integer value) {
            addCriterion("zhengZhiIsWeek =", value, "zhengzhiisweek");
            return (Criteria) this;
        }

        public Criteria andZhengzhiisweekNotEqualTo(Integer value) {
            addCriterion("zhengZhiIsWeek <>", value, "zhengzhiisweek");
            return (Criteria) this;
        }

        public Criteria andZhengzhiisweekGreaterThan(Integer value) {
            addCriterion("zhengZhiIsWeek >", value, "zhengzhiisweek");
            return (Criteria) this;
        }

        public Criteria andZhengzhiisweekGreaterThanOrEqualTo(Integer value) {
            addCriterion("zhengZhiIsWeek >=", value, "zhengzhiisweek");
            return (Criteria) this;
        }

        public Criteria andZhengzhiisweekLessThan(Integer value) {
            addCriterion("zhengZhiIsWeek <", value, "zhengzhiisweek");
            return (Criteria) this;
        }

        public Criteria andZhengzhiisweekLessThanOrEqualTo(Integer value) {
            addCriterion("zhengZhiIsWeek <=", value, "zhengzhiisweek");
            return (Criteria) this;
        }

        public Criteria andZhengzhiisweekIn(List<Integer> values) {
            addCriterion("zhengZhiIsWeek in", values, "zhengzhiisweek");
            return (Criteria) this;
        }

        public Criteria andZhengzhiisweekNotIn(List<Integer> values) {
            addCriterion("zhengZhiIsWeek not in", values, "zhengzhiisweek");
            return (Criteria) this;
        }

        public Criteria andZhengzhiisweekBetween(Integer value1, Integer value2) {
            addCriterion("zhengZhiIsWeek between", value1, value2, "zhengzhiisweek");
            return (Criteria) this;
        }

        public Criteria andZhengzhiisweekNotBetween(Integer value1, Integer value2) {
            addCriterion("zhengZhiIsWeek not between", value1, value2, "zhengzhiisweek");
            return (Criteria) this;
        }

        public Criteria andDiliexscoreIsNull() {
            addCriterion("diLiExScore is null");
            return (Criteria) this;
        }

        public Criteria andDiliexscoreIsNotNull() {
            addCriterion("diLiExScore is not null");
            return (Criteria) this;
        }

        public Criteria andDiliexscoreEqualTo(Double value) {
            addCriterion("diLiExScore =", value, "diliexscore");
            return (Criteria) this;
        }

        public Criteria andDiliexscoreNotEqualTo(Double value) {
            addCriterion("diLiExScore <>", value, "diliexscore");
            return (Criteria) this;
        }

        public Criteria andDiliexscoreGreaterThan(Double value) {
            addCriterion("diLiExScore >", value, "diliexscore");
            return (Criteria) this;
        }

        public Criteria andDiliexscoreGreaterThanOrEqualTo(Double value) {
            addCriterion("diLiExScore >=", value, "diliexscore");
            return (Criteria) this;
        }

        public Criteria andDiliexscoreLessThan(Double value) {
            addCriterion("diLiExScore <", value, "diliexscore");
            return (Criteria) this;
        }

        public Criteria andDiliexscoreLessThanOrEqualTo(Double value) {
            addCriterion("diLiExScore <=", value, "diliexscore");
            return (Criteria) this;
        }

        public Criteria andDiliexscoreIn(List<Double> values) {
            addCriterion("diLiExScore in", values, "diliexscore");
            return (Criteria) this;
        }

        public Criteria andDiliexscoreNotIn(List<Double> values) {
            addCriterion("diLiExScore not in", values, "diliexscore");
            return (Criteria) this;
        }

        public Criteria andDiliexscoreBetween(Double value1, Double value2) {
            addCriterion("diLiExScore between", value1, value2, "diliexscore");
            return (Criteria) this;
        }

        public Criteria andDiliexscoreNotBetween(Double value1, Double value2) {
            addCriterion("diLiExScore not between", value1, value2, "diliexscore");
            return (Criteria) this;
        }

        public Criteria andDilirankIsNull() {
            addCriterion("diLiRank is null");
            return (Criteria) this;
        }

        public Criteria andDilirankIsNotNull() {
            addCriterion("diLiRank is not null");
            return (Criteria) this;
        }

        public Criteria andDilirankEqualTo(Integer value) {
            addCriterion("diLiRank =", value, "dilirank");
            return (Criteria) this;
        }

        public Criteria andDilirankNotEqualTo(Integer value) {
            addCriterion("diLiRank <>", value, "dilirank");
            return (Criteria) this;
        }

        public Criteria andDilirankGreaterThan(Integer value) {
            addCriterion("diLiRank >", value, "dilirank");
            return (Criteria) this;
        }

        public Criteria andDilirankGreaterThanOrEqualTo(Integer value) {
            addCriterion("diLiRank >=", value, "dilirank");
            return (Criteria) this;
        }

        public Criteria andDilirankLessThan(Integer value) {
            addCriterion("diLiRank <", value, "dilirank");
            return (Criteria) this;
        }

        public Criteria andDilirankLessThanOrEqualTo(Integer value) {
            addCriterion("diLiRank <=", value, "dilirank");
            return (Criteria) this;
        }

        public Criteria andDilirankIn(List<Integer> values) {
            addCriterion("diLiRank in", values, "dilirank");
            return (Criteria) this;
        }

        public Criteria andDilirankNotIn(List<Integer> values) {
            addCriterion("diLiRank not in", values, "dilirank");
            return (Criteria) this;
        }

        public Criteria andDilirankBetween(Integer value1, Integer value2) {
            addCriterion("diLiRank between", value1, value2, "dilirank");
            return (Criteria) this;
        }

        public Criteria andDilirankNotBetween(Integer value1, Integer value2) {
            addCriterion("diLiRank not between", value1, value2, "dilirank");
            return (Criteria) this;
        }

        public Criteria andDiliisweekIsNull() {
            addCriterion("diLiIsWeek is null");
            return (Criteria) this;
        }

        public Criteria andDiliisweekIsNotNull() {
            addCriterion("diLiIsWeek is not null");
            return (Criteria) this;
        }

        public Criteria andDiliisweekEqualTo(Integer value) {
            addCriterion("diLiIsWeek =", value, "diliisweek");
            return (Criteria) this;
        }

        public Criteria andDiliisweekNotEqualTo(Integer value) {
            addCriterion("diLiIsWeek <>", value, "diliisweek");
            return (Criteria) this;
        }

        public Criteria andDiliisweekGreaterThan(Integer value) {
            addCriterion("diLiIsWeek >", value, "diliisweek");
            return (Criteria) this;
        }

        public Criteria andDiliisweekGreaterThanOrEqualTo(Integer value) {
            addCriterion("diLiIsWeek >=", value, "diliisweek");
            return (Criteria) this;
        }

        public Criteria andDiliisweekLessThan(Integer value) {
            addCriterion("diLiIsWeek <", value, "diliisweek");
            return (Criteria) this;
        }

        public Criteria andDiliisweekLessThanOrEqualTo(Integer value) {
            addCriterion("diLiIsWeek <=", value, "diliisweek");
            return (Criteria) this;
        }

        public Criteria andDiliisweekIn(List<Integer> values) {
            addCriterion("diLiIsWeek in", values, "diliisweek");
            return (Criteria) this;
        }

        public Criteria andDiliisweekNotIn(List<Integer> values) {
            addCriterion("diLiIsWeek not in", values, "diliisweek");
            return (Criteria) this;
        }

        public Criteria andDiliisweekBetween(Integer value1, Integer value2) {
            addCriterion("diLiIsWeek between", value1, value2, "diliisweek");
            return (Criteria) this;
        }

        public Criteria andDiliisweekNotBetween(Integer value1, Integer value2) {
            addCriterion("diLiIsWeek not between", value1, value2, "diliisweek");
            return (Criteria) this;
        }

        public Criteria andLishiexscoreIsNull() {
            addCriterion("liShiExScore is null");
            return (Criteria) this;
        }

        public Criteria andLishiexscoreIsNotNull() {
            addCriterion("liShiExScore is not null");
            return (Criteria) this;
        }

        public Criteria andLishiexscoreEqualTo(Double value) {
            addCriterion("liShiExScore =", value, "lishiexscore");
            return (Criteria) this;
        }

        public Criteria andLishiexscoreNotEqualTo(Double value) {
            addCriterion("liShiExScore <>", value, "lishiexscore");
            return (Criteria) this;
        }

        public Criteria andLishiexscoreGreaterThan(Double value) {
            addCriterion("liShiExScore >", value, "lishiexscore");
            return (Criteria) this;
        }

        public Criteria andLishiexscoreGreaterThanOrEqualTo(Double value) {
            addCriterion("liShiExScore >=", value, "lishiexscore");
            return (Criteria) this;
        }

        public Criteria andLishiexscoreLessThan(Double value) {
            addCriterion("liShiExScore <", value, "lishiexscore");
            return (Criteria) this;
        }

        public Criteria andLishiexscoreLessThanOrEqualTo(Double value) {
            addCriterion("liShiExScore <=", value, "lishiexscore");
            return (Criteria) this;
        }

        public Criteria andLishiexscoreIn(List<Double> values) {
            addCriterion("liShiExScore in", values, "lishiexscore");
            return (Criteria) this;
        }

        public Criteria andLishiexscoreNotIn(List<Double> values) {
            addCriterion("liShiExScore not in", values, "lishiexscore");
            return (Criteria) this;
        }

        public Criteria andLishiexscoreBetween(Double value1, Double value2) {
            addCriterion("liShiExScore between", value1, value2, "lishiexscore");
            return (Criteria) this;
        }

        public Criteria andLishiexscoreNotBetween(Double value1, Double value2) {
            addCriterion("liShiExScore not between", value1, value2, "lishiexscore");
            return (Criteria) this;
        }

        public Criteria andLishirankIsNull() {
            addCriterion("liShiRank is null");
            return (Criteria) this;
        }

        public Criteria andLishirankIsNotNull() {
            addCriterion("liShiRank is not null");
            return (Criteria) this;
        }

        public Criteria andLishirankEqualTo(Integer value) {
            addCriterion("liShiRank =", value, "lishirank");
            return (Criteria) this;
        }

        public Criteria andLishirankNotEqualTo(Integer value) {
            addCriterion("liShiRank <>", value, "lishirank");
            return (Criteria) this;
        }

        public Criteria andLishirankGreaterThan(Integer value) {
            addCriterion("liShiRank >", value, "lishirank");
            return (Criteria) this;
        }

        public Criteria andLishirankGreaterThanOrEqualTo(Integer value) {
            addCriterion("liShiRank >=", value, "lishirank");
            return (Criteria) this;
        }

        public Criteria andLishirankLessThan(Integer value) {
            addCriterion("liShiRank <", value, "lishirank");
            return (Criteria) this;
        }

        public Criteria andLishirankLessThanOrEqualTo(Integer value) {
            addCriterion("liShiRank <=", value, "lishirank");
            return (Criteria) this;
        }

        public Criteria andLishirankIn(List<Integer> values) {
            addCriterion("liShiRank in", values, "lishirank");
            return (Criteria) this;
        }

        public Criteria andLishirankNotIn(List<Integer> values) {
            addCriterion("liShiRank not in", values, "lishirank");
            return (Criteria) this;
        }

        public Criteria andLishirankBetween(Integer value1, Integer value2) {
            addCriterion("liShiRank between", value1, value2, "lishirank");
            return (Criteria) this;
        }

        public Criteria andLishirankNotBetween(Integer value1, Integer value2) {
            addCriterion("liShiRank not between", value1, value2, "lishirank");
            return (Criteria) this;
        }

        public Criteria andLishiisweekIsNull() {
            addCriterion("liShiIsWeek is null");
            return (Criteria) this;
        }

        public Criteria andLishiisweekIsNotNull() {
            addCriterion("liShiIsWeek is not null");
            return (Criteria) this;
        }

        public Criteria andLishiisweekEqualTo(Integer value) {
            addCriterion("liShiIsWeek =", value, "lishiisweek");
            return (Criteria) this;
        }

        public Criteria andLishiisweekNotEqualTo(Integer value) {
            addCriterion("liShiIsWeek <>", value, "lishiisweek");
            return (Criteria) this;
        }

        public Criteria andLishiisweekGreaterThan(Integer value) {
            addCriterion("liShiIsWeek >", value, "lishiisweek");
            return (Criteria) this;
        }

        public Criteria andLishiisweekGreaterThanOrEqualTo(Integer value) {
            addCriterion("liShiIsWeek >=", value, "lishiisweek");
            return (Criteria) this;
        }

        public Criteria andLishiisweekLessThan(Integer value) {
            addCriterion("liShiIsWeek <", value, "lishiisweek");
            return (Criteria) this;
        }

        public Criteria andLishiisweekLessThanOrEqualTo(Integer value) {
            addCriterion("liShiIsWeek <=", value, "lishiisweek");
            return (Criteria) this;
        }

        public Criteria andLishiisweekIn(List<Integer> values) {
            addCriterion("liShiIsWeek in", values, "lishiisweek");
            return (Criteria) this;
        }

        public Criteria andLishiisweekNotIn(List<Integer> values) {
            addCriterion("liShiIsWeek not in", values, "lishiisweek");
            return (Criteria) this;
        }

        public Criteria andLishiisweekBetween(Integer value1, Integer value2) {
            addCriterion("liShiIsWeek between", value1, value2, "lishiisweek");
            return (Criteria) this;
        }

        public Criteria andLishiisweekNotBetween(Integer value1, Integer value2) {
            addCriterion("liShiIsWeek not between", value1, value2, "lishiisweek");
            return (Criteria) this;
        }

        public Criteria andJishuexscoreIsNull() {
            addCriterion("jiShuExScore is null");
            return (Criteria) this;
        }

        public Criteria andJishuexscoreIsNotNull() {
            addCriterion("jiShuExScore is not null");
            return (Criteria) this;
        }

        public Criteria andJishuexscoreEqualTo(Double value) {
            addCriterion("jiShuExScore =", value, "jishuexscore");
            return (Criteria) this;
        }

        public Criteria andJishuexscoreNotEqualTo(Double value) {
            addCriterion("jiShuExScore <>", value, "jishuexscore");
            return (Criteria) this;
        }

        public Criteria andJishuexscoreGreaterThan(Double value) {
            addCriterion("jiShuExScore >", value, "jishuexscore");
            return (Criteria) this;
        }

        public Criteria andJishuexscoreGreaterThanOrEqualTo(Double value) {
            addCriterion("jiShuExScore >=", value, "jishuexscore");
            return (Criteria) this;
        }

        public Criteria andJishuexscoreLessThan(Double value) {
            addCriterion("jiShuExScore <", value, "jishuexscore");
            return (Criteria) this;
        }

        public Criteria andJishuexscoreLessThanOrEqualTo(Double value) {
            addCriterion("jiShuExScore <=", value, "jishuexscore");
            return (Criteria) this;
        }

        public Criteria andJishuexscoreIn(List<Double> values) {
            addCriterion("jiShuExScore in", values, "jishuexscore");
            return (Criteria) this;
        }

        public Criteria andJishuexscoreNotIn(List<Double> values) {
            addCriterion("jiShuExScore not in", values, "jishuexscore");
            return (Criteria) this;
        }

        public Criteria andJishuexscoreBetween(Double value1, Double value2) {
            addCriterion("jiShuExScore between", value1, value2, "jishuexscore");
            return (Criteria) this;
        }

        public Criteria andJishuexscoreNotBetween(Double value1, Double value2) {
            addCriterion("jiShuExScore not between", value1, value2, "jishuexscore");
            return (Criteria) this;
        }

        public Criteria andJishurankIsNull() {
            addCriterion("jiShuRank is null");
            return (Criteria) this;
        }

        public Criteria andJishurankIsNotNull() {
            addCriterion("jiShuRank is not null");
            return (Criteria) this;
        }

        public Criteria andJishurankEqualTo(Integer value) {
            addCriterion("jiShuRank =", value, "jishurank");
            return (Criteria) this;
        }

        public Criteria andJishurankNotEqualTo(Integer value) {
            addCriterion("jiShuRank <>", value, "jishurank");
            return (Criteria) this;
        }

        public Criteria andJishurankGreaterThan(Integer value) {
            addCriterion("jiShuRank >", value, "jishurank");
            return (Criteria) this;
        }

        public Criteria andJishurankGreaterThanOrEqualTo(Integer value) {
            addCriterion("jiShuRank >=", value, "jishurank");
            return (Criteria) this;
        }

        public Criteria andJishurankLessThan(Integer value) {
            addCriterion("jiShuRank <", value, "jishurank");
            return (Criteria) this;
        }

        public Criteria andJishurankLessThanOrEqualTo(Integer value) {
            addCriterion("jiShuRank <=", value, "jishurank");
            return (Criteria) this;
        }

        public Criteria andJishurankIn(List<Integer> values) {
            addCriterion("jiShuRank in", values, "jishurank");
            return (Criteria) this;
        }

        public Criteria andJishurankNotIn(List<Integer> values) {
            addCriterion("jiShuRank not in", values, "jishurank");
            return (Criteria) this;
        }

        public Criteria andJishurankBetween(Integer value1, Integer value2) {
            addCriterion("jiShuRank between", value1, value2, "jishurank");
            return (Criteria) this;
        }

        public Criteria andJishurankNotBetween(Integer value1, Integer value2) {
            addCriterion("jiShuRank not between", value1, value2, "jishurank");
            return (Criteria) this;
        }

        public Criteria andJishuisweekIsNull() {
            addCriterion("jiShuIsWeek is null");
            return (Criteria) this;
        }

        public Criteria andJishuisweekIsNotNull() {
            addCriterion("jiShuIsWeek is not null");
            return (Criteria) this;
        }

        public Criteria andJishuisweekEqualTo(Integer value) {
            addCriterion("jiShuIsWeek =", value, "jishuisweek");
            return (Criteria) this;
        }

        public Criteria andJishuisweekNotEqualTo(Integer value) {
            addCriterion("jiShuIsWeek <>", value, "jishuisweek");
            return (Criteria) this;
        }

        public Criteria andJishuisweekGreaterThan(Integer value) {
            addCriterion("jiShuIsWeek >", value, "jishuisweek");
            return (Criteria) this;
        }

        public Criteria andJishuisweekGreaterThanOrEqualTo(Integer value) {
            addCriterion("jiShuIsWeek >=", value, "jishuisweek");
            return (Criteria) this;
        }

        public Criteria andJishuisweekLessThan(Integer value) {
            addCriterion("jiShuIsWeek <", value, "jishuisweek");
            return (Criteria) this;
        }

        public Criteria andJishuisweekLessThanOrEqualTo(Integer value) {
            addCriterion("jiShuIsWeek <=", value, "jishuisweek");
            return (Criteria) this;
        }

        public Criteria andJishuisweekIn(List<Integer> values) {
            addCriterion("jiShuIsWeek in", values, "jishuisweek");
            return (Criteria) this;
        }

        public Criteria andJishuisweekNotIn(List<Integer> values) {
            addCriterion("jiShuIsWeek not in", values, "jishuisweek");
            return (Criteria) this;
        }

        public Criteria andJishuisweekBetween(Integer value1, Integer value2) {
            addCriterion("jiShuIsWeek between", value1, value2, "jishuisweek");
            return (Criteria) this;
        }

        public Criteria andJishuisweekNotBetween(Integer value1, Integer value2) {
            addCriterion("jiShuIsWeek not between", value1, value2, "jishuisweek");
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