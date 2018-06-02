package com.baidu.domain.dto;

import java.util.List;

/**
 * Created by lt on 2018/05/23.
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
