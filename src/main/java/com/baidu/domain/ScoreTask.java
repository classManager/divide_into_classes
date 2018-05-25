package com.baidu.domain;

public class ScoreTask {
    private Long id;

    private String scoreid;

    private Integer schoolid;

    private Long gradeyearid;

    private String grade;

    private String examname;

    private String fileurl;

    private Integer studentnum;

    private Integer scorestudentnum;

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

    public Integer getSchoolid() {
        return schoolid;
    }

    public void setSchoolid(Integer schoolid) {
        this.schoolid = schoolid;
    }

    public Long getGradeyearid() {
        return gradeyearid;
    }

    public void setGradeyearid(Long gradeyearid) {
        this.gradeyearid = gradeyearid;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    public String getExamname() {
        return examname;
    }

    public void setExamname(String examname) {
        this.examname = examname == null ? null : examname.trim();
    }

    public String getFileurl() {
        return fileurl;
    }

    public void setFileurl(String fileurl) {
        this.fileurl = fileurl == null ? null : fileurl.trim();
    }

    public Integer getStudentnum() {
        return studentnum;
    }

    public void setStudentnum(Integer studentnum) {
        this.studentnum = studentnum;
    }

    public Integer getScorestudentnum() {
        return scorestudentnum;
    }

    public void setScorestudentnum(Integer scorestudentnum) {
        this.scorestudentnum = scorestudentnum;
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