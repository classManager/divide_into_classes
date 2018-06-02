package com.baidu.domain.dto;

/**
 * Created by lt on 2018/05/23.
 */
    public class DivideStudentInfo {

    // 总成绩
    private double score;

    private String studentCode;

    // 性别   0女  1男
    private int sex;

    // 分层
    private int level;

    // 物理/化学/生物/政治/历史/地理/技术成绩
    private double wlScore;
    private double hxScore;
    private double swScore;
    private double zzScore;
    private double lsScore;
    private double dlScore;
    private double jsScore;

    // 选课组合
    private String composeId = "No";


    // 参数传递不必关注
    private double compareScore;

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getWlScore() {
        return wlScore;
    }

    public void setWlScore(double wlScore) {
        this.wlScore = wlScore;
    }

    public double getHxScore() {
        return hxScore;
    }

    public void setHxScore(double hxScore) {
        this.hxScore = hxScore;
    }

    public double getSwScore() {
        return swScore;
    }

    public void setSwScore(double swScore) {
        this.swScore = swScore;
    }

    public double getZzScore() {
        return zzScore;
    }

    public void setZzScore(double zzScore) {
        this.zzScore = zzScore;
    }

    public double getLsScore() {
        return lsScore;
    }

    public void setLsScore(double lsScore) {
        this.lsScore = lsScore;
    }

    public double getDlScore() {
        return dlScore;
    }

    public void setDlScore(double dlScore) {
        this.dlScore = dlScore;
    }

    public double getJsScore() {
        return jsScore;
    }

    public void setJsScore(double jsScore) {
        this.jsScore = jsScore;
    }

    public double getCompareScore() {
        return compareScore;
    }

    public void setCompareScore(double compareScore) {
        this.compareScore = compareScore;
    }

    public String getComposeId() {
        return composeId;
    }

    public void setComposeId(String composeId) {
        this.composeId = composeId;
    }
}
