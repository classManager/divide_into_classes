package com.baidu.domain;

public class GradeInfo {
    private Integer id;

    private Integer tnid;

    private Integer gradecode;

    private String grade;

    private Integer gOrder;

    private Integer year;

    private Byte classtype;

    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTnid() {
        return tnid;
    }

    public void setTnid(Integer tnid) {
        this.tnid = tnid;
    }

    public Integer getGradecode() {
        return gradecode;
    }

    public void setGradecode(Integer gradecode) {
        this.gradecode = gradecode;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    public Integer getgOrder() {
        return gOrder;
    }

    public void setgOrder(Integer gOrder) {
        this.gOrder = gOrder;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Byte getClasstype() {
        return classtype;
    }

    public void setClasstype(Byte classtype) {
        this.classtype = classtype;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}