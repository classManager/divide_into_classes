package cn.tchenedu.saas.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ckzhang on 2017/9/23.
 */
public class DivideClassInfoDto {

    private String classCode;

    private int maxStudent;

    private String subjectId;

    private int seqNumber;

    // 是否是选课班
    private boolean isChooseSubject;

    private List<DivideStudentInfo> sutdents = new ArrayList<>();

    public boolean isChooseSubject() {
        return isChooseSubject;
    }

    public void setChooseSubject(boolean chooseSubject) {
        isChooseSubject = chooseSubject;
    }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public int getMaxStudent() {
        return maxStudent;
    }

    public void setMaxStudent(int maxStudent) {
        this.maxStudent = maxStudent;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public int getSeqNumber() {
        return seqNumber;
    }

    public void setSeqNumber(int seqNumber) {
        this.seqNumber = seqNumber;
    }

    public List<DivideStudentInfo> getSutdents() {
        return sutdents;
    }

    public void setSutdents(List<DivideStudentInfo> sutdents) {
        this.sutdents = sutdents;
    }
}
