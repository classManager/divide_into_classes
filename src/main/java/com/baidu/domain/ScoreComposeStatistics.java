package com.baidu.domain;

public class ScoreComposeStatistics {
    private Long id;

    private String scoreid;

    private String detailid;

    private String composeid;

    private Double exscore;

    private Integer totalscore;

    private Integer rank;

    private Byte status;

    private String publisher;

    private Long createdate;

    private String lastmodifier;

    private Long lastmoddate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getScoreid() {
        return scoreid;
    }

    public void setScoreid(String scoreid) {
        this.scoreid = scoreid == null ? null : scoreid.trim();
    }

    public String getDetailid() {
        return detailid;
    }

    public void setDetailid(String detailid) {
        this.detailid = detailid == null ? null : detailid.trim();
    }

    public String getComposeid() {
        return composeid;
    }

    public void setComposeid(String composeid) {
        this.composeid = composeid == null ? null : composeid.trim();
    }

    public Double getExscore() {
        return exscore;
    }

    public void setExscore(Double exscore) {
        this.exscore = exscore;
    }

    public Integer getTotalscore() {
        return totalscore;
    }

    public void setTotalscore(Integer totalscore) {
        this.totalscore = totalscore;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher == null ? null : publisher.trim();
    }

    public Long getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Long createdate) {
        this.createdate = createdate;
    }

    public String getLastmodifier() {
        return lastmodifier;
    }

    public void setLastmodifier(String lastmodifier) {
        this.lastmodifier = lastmodifier == null ? null : lastmodifier.trim();
    }

    public Long getLastmoddate() {
        return lastmoddate;
    }

    public void setLastmoddate(Long lastmoddate) {
        this.lastmoddate = lastmoddate;
    }
}