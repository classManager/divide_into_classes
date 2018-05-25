package com.baidu.domain;

public class ClassInfo {
    private Integer id;

    private Long classGradeId;

    private String classGrade;

    private String className;

    private String teacherCode;

    private String classType;

    private String classCode;

    private String classRemark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getClassGradeId() {
        return classGradeId;
    }

    public void setClassGradeId(Long classGradeId) {
        this.classGradeId = classGradeId;
    }

    public String getClassGrade() {
        return classGrade;
    }

    public void setClassGrade(String classGrade) {
        this.classGrade = classGrade == null ? null : classGrade.trim();
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }

    public String getTeacherCode() {
        return teacherCode;
    }

    public void setTeacherCode(String teacherCode) {
        this.teacherCode = teacherCode == null ? null : teacherCode.trim();
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType == null ? null : classType.trim();
    }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode == null ? null : classCode.trim();
    }

    public String getClassRemark() {
        return classRemark;
    }

    public void setClassRemark(String classRemark) {
        this.classRemark = classRemark == null ? null : classRemark.trim();
    }
}