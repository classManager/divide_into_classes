package cn.tchenedu.saas.dto;

import java.util.List;

/**
 * Created by ckzhang on 2017/9/23.
 */
public class DivideResultInfo extends DivideClassInfoDto {


    private double averageScore;

    // 男同学数量
    private int male = 0;

    // 女同学数量
    private int female = 0;

    private List<DivideStudentInfo> students;

    public List<DivideStudentInfo> getStudents() {
        return students;
    }

    public void setStudents(List<DivideStudentInfo> students) {
        this.students = students;
    }

    public int getMale() {
        return male;
    }

    public void setMale(int male) {
        this.male = male;
    }

    public int getFemale() {
        return female;
    }

    public void setFemale(int female) {
        this.female = female;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }
}
