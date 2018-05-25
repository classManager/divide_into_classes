package cn.tchenedu.saas.dto;

import java.util.List;

/**
 * Created by ckzhang on 2017/9/23.
 */
public class DivideStudentDataDetail {

    private int level;

    private List<DivideStudentInfo> students;


    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public List<DivideStudentInfo> getStudents() {
        return students;
    }

    public void setStudents(List<DivideStudentInfo> students) {
        this.students = students;
    }
}
