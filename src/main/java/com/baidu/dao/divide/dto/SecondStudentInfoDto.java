package com.baidu.dao.divide.dto;

import com.baidu.domain.SaasStudentExcel;

import java.util.List;

/**
 * Created by lt on 2018/05/21.
 */
public class SecondStudentInfoDto {

    private String subject;

    private List<SaasStudentExcel> composes;


    public SecondStudentInfoDto() {
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public List<SaasStudentExcel> getComposes() {
        return composes;
    }

    public void setComposes(List<SaasStudentExcel> composes) {
        this.composes = composes;
    }

    @Override
    public String toString() {
        return "SecondStudentInfoDto{" +
                "subject='" + subject + '\'' +
                ", composes=" + composes +
                '}';
    }
}
