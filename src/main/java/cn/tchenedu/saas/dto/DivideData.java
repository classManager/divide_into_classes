package cn.tchenedu.saas.dto;

import java.util.List;

/**
 * Created by ckzhang on 2017/9/23.
 */
public class DivideData {


    // 学生分层数据
    private List<DivideStudentDataDetail> studentData;

    // 行政班班级数据
    private List<DivideClassDataDetail> admClasses;

    // 选课班班级数据
    private List<DivideClassDataDetail> chooseSubjectClasses;

    // 教学班班级数据
    private List<DivideClassDataDetail> unchooseSubjectClasses;

    public List<DivideStudentDataDetail> getStudentData() {
        return studentData;
    }

    public void setStudentData(List<DivideStudentDataDetail> studentData) {
        this.studentData = studentData;
    }

    public List<DivideClassDataDetail> getAdmClasses() {
        return admClasses;
    }

    public void setAdmClasses(List<DivideClassDataDetail> admClasses) {
        this.admClasses = admClasses;
    }

    public List<DivideClassDataDetail> getChooseSubjectClasses() {
        return chooseSubjectClasses;
    }

    public void setChooseSubjectClasses(List<DivideClassDataDetail> chooseSubjectClasses) {
        this.chooseSubjectClasses = chooseSubjectClasses;
    }

    public List<DivideClassDataDetail> getUnchooseSubjectClasses() {
        return unchooseSubjectClasses;
    }

    public void setUnchooseSubjectClasses(List<DivideClassDataDetail> unchooseSubjectClasses) {
        this.unchooseSubjectClasses = unchooseSubjectClasses;
    }
}
