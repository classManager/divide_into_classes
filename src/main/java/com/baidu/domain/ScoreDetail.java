package com.baidu.domain;

public class ScoreDetail {
    private Long id;

    private String scoreid;

    private String detailid;

    private Integer schoolid;

    private Long studentid;

    private Double yuwenscore;

    private Double shuxuescore;

    private Double yingyuscore;

    private Double wuliscore;

    private Double huaxuescore;

    private Double shengwuscore;

    private Double zhengzhiscore;

    private Double diliscore;

    private Double lishiscore;

    private Double jishuscore;

    private Integer remark;

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

    public Integer getSchoolid() {
        return schoolid;
    }

    public void setSchoolid(Integer schoolid) {
        this.schoolid = schoolid;
    }

    public Long getStudentid() {
        return studentid;
    }

    public void setStudentid(Long studentid) {
        this.studentid = studentid;
    }

    public Double getYuwenscore() {
        return yuwenscore;
    }

    public void setYuwenscore(Double yuwenscore) {
        this.yuwenscore = yuwenscore;
    }

    public Double getShuxuescore() {
        return shuxuescore;
    }

    public void setShuxuescore(Double shuxuescore) {
        this.shuxuescore = shuxuescore;
    }

    public Double getYingyuscore() {
        return yingyuscore;
    }

    public void setYingyuscore(Double yingyuscore) {
        this.yingyuscore = yingyuscore;
    }

    public Double getWuliscore() {
        return wuliscore;
    }

    public void setWuliscore(Double wuliscore) {
        this.wuliscore = wuliscore;
    }

    public Double getHuaxuescore() {
        return huaxuescore;
    }

    public void setHuaxuescore(Double huaxuescore) {
        this.huaxuescore = huaxuescore;
    }

    public Double getShengwuscore() {
        return shengwuscore;
    }

    public void setShengwuscore(Double shengwuscore) {
        this.shengwuscore = shengwuscore;
    }

    public Double getZhengzhiscore() {
        return zhengzhiscore;
    }

    public void setZhengzhiscore(Double zhengzhiscore) {
        this.zhengzhiscore = zhengzhiscore;
    }

    public Double getDiliscore() {
        return diliscore;
    }

    public void setDiliscore(Double diliscore) {
        this.diliscore = diliscore;
    }

    public Double getLishiscore() {
        return lishiscore;
    }

    public void setLishiscore(Double lishiscore) {
        this.lishiscore = lishiscore;
    }

    public Double getJishuscore() {
        return jishuscore;
    }

    public void setJishuscore(Double jishuscore) {
        this.jishuscore = jishuscore;
    }

    public Integer getRemark() {
        return remark;
    }

    public void setRemark(Integer remark) {
        this.remark = remark;
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