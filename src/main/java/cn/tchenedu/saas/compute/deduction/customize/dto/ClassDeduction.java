package cn.tchenedu.saas.compute.deduction.customize.dto;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ckzhang on 2017/11/2.
 */
public class ClassDeduction {

    // 一个班级包含多个组合的分布情况
    // key=====组合Id   value====组合人数
    private Map<Integer, Integer> classCompose = new HashMap<>();

    /**
     * 班级总人数
     */
    private int studentNumber;
    //标记是否为一个班一个组合 1 是 0 否
    private int classComposeStatus;

    public Map<Integer, Integer> getClassCompose() {
        return classCompose;
    }

    public void setClassCompose(Map<Integer, Integer> classCompose) {
        this.classCompose = classCompose;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public int getClassComposeStatus() {
        return classComposeStatus;
    }

    public void setClassComposeStatus(int classComposeStatus) {
        this.classComposeStatus = classComposeStatus;
    }
}
