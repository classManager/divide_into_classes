package com.baidu.domain;

public class StudentBase {
    private Long id;

    private String studentcode;

    private Integer schoolid;

    private String grade;

    private Long studentid;

    private String studentname;

    private Integer sex;

    private String studentlevel;

    private String enrolyear;

    private String composeid;

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

    public String getStudentcode() {
        return studentcode;
    }

    public void setStudentcode(String studentcode) {
        this.studentcode = studentcode == null ? null : studentcode.trim();
    }

    public Integer getSchoolid() {
        return schoolid;
    }

    public void setSchoolid(Integer schoolid) {
        this.schoolid = schoolid;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    public Long getStudentid() {
        return studentid;
    }

    public void setStudentid(Long studentid) {
        this.studentid = studentid;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname == null ? null : studentname.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getStudentlevel() {
        return studentlevel;
    }

    public void setStudentlevel(String studentlevel) {
        this.studentlevel = studentlevel == null ? null : studentlevel.trim();
    }

    public String getEnrolyear() {
        return enrolyear;
    }

    public void setEnrolyear(String enrolyear) {
        this.enrolyear = enrolyear == null ? null : enrolyear.trim();
    }

    public String getComposeid() {
        return composeid;
    }

    public void setComposeid(String composeid) {
        this.composeid = composeid == null ? null : composeid.trim();
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