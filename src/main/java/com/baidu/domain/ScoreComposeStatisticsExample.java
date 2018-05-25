package com.baidu.domain;

import java.util.ArrayList;
import java.util.List;

public class ScoreComposeStatisticsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScoreComposeStatisticsExample() {
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

        public Criteria andExscoreIsNull() {
            addCriterion("exScore is null");
            return (Criteria) this;
        }

        public Criteria andExscoreIsNotNull() {
            addCriterion("exScore is not null");
            return (Criteria) this;
        }

        public Criteria andExscoreEqualTo(Double value) {
            addCriterion("exScore =", value, "exscore");
            return (Criteria) this;
        }

        public Criteria andExscoreNotEqualTo(Double value) {
            addCriterion("exScore <>", value, "exscore");
            return (Criteria) this;
        }

        public Criteria andExscoreGreaterThan(Double value) {
            addCriterion("exScore >", value, "exscore");
            return (Criteria) this;
        }

        public Criteria andExscoreGreaterThanOrEqualTo(Double value) {
            addCriterion("exScore >=", value, "exscore");
            return (Criteria) this;
        }

        public Criteria andExscoreLessThan(Double value) {
            addCriterion("exScore <", value, "exscore");
            return (Criteria) this;
        }

        public Criteria andExscoreLessThanOrEqualTo(Double value) {
            addCriterion("exScore <=", value, "exscore");
            return (Criteria) this;
        }

        public Criteria andExscoreIn(List<Double> values) {
            addCriterion("exScore in", values, "exscore");
            return (Criteria) this;
        }

        public Criteria andExscoreNotIn(List<Double> values) {
            addCriterion("exScore not in", values, "exscore");
            return (Criteria) this;
        }

        public Criteria andExscoreBetween(Double value1, Double value2) {
            addCriterion("exScore between", value1, value2, "exscore");
            return (Criteria) this;
        }

        public Criteria andExscoreNotBetween(Double value1, Double value2) {
            addCriterion("exScore not between", value1, value2, "exscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreIsNull() {
            addCriterion("totalScore is null");
            return (Criteria) this;
        }

        public Criteria andTotalscoreIsNotNull() {
            addCriterion("totalScore is not null");
            return (Criteria) this;
        }

        public Criteria andTotalscoreEqualTo(Integer value) {
            addCriterion("totalScore =", value, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreNotEqualTo(Integer value) {
            addCriterion("totalScore <>", value, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreGreaterThan(Integer value) {
            addCriterion("totalScore >", value, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("totalScore >=", value, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreLessThan(Integer value) {
            addCriterion("totalScore <", value, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreLessThanOrEqualTo(Integer value) {
            addCriterion("totalScore <=", value, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreIn(List<Integer> values) {
            addCriterion("totalScore in", values, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreNotIn(List<Integer> values) {
            addCriterion("totalScore not in", values, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreBetween(Integer value1, Integer value2) {
            addCriterion("totalScore between", value1, value2, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreNotBetween(Integer value1, Integer value2) {
            addCriterion("totalScore not between", value1, value2, "totalscore");
            return (Criteria) this;
        }

        public Criteria andRankIsNull() {
            addCriterion("rank is null");
            return (Criteria) this;
        }

        public Criteria andRankIsNotNull() {
            addCriterion("rank is not null");
            return (Criteria) this;
        }

        public Criteria andRankEqualTo(Integer value) {
            addCriterion("rank =", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotEqualTo(Integer value) {
            addCriterion("rank <>", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankGreaterThan(Integer value) {
            addCriterion("rank >", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankGreaterThanOrEqualTo(Integer value) {
            addCriterion("rank >=", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLessThan(Integer value) {
            addCriterion("rank <", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLessThanOrEqualTo(Integer value) {
            addCriterion("rank <=", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankIn(List<Integer> values) {
            addCriterion("rank in", values, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotIn(List<Integer> values) {
            addCriterion("rank not in", values, "rank");
            return (Criteria) this;
        }

        public Criteria andRankBetween(Integer value1, Integer value2) {
            addCriterion("rank between", value1, value2, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotBetween(Integer value1, Integer value2) {
            addCriterion("rank not between", value1, value2, "rank");
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