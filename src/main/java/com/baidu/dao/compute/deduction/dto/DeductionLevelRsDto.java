package com.baidu.dao.compute.deduction.dto;

import com.baidu.dao.compute.deduction.customize.utils.CustomizeWeight;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ckzhang
 * @date 2018/05/21
 */
public class DeductionLevelRsDto {

    private String level;

    // 行政班级数
    private int xzbanNumber = 0;

    // 教学班班级数量
    private Map<String,Integer> chooseSubjectClasses= new HashMap();

    // 教学班班级数量
    private Map<String,Integer> unchooseSubjectClasses= new HashMap();

    public DeductionLevelRsDto(){
        for (String subject : CustomizeWeight.SUBJECT_WEIGHT_MAP.keySet()){

            chooseSubjectClasses.put(subject, 0);
            unchooseSubjectClasses.put(subject, 0);
        }
    }


    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getXzbanNumber() {
        return xzbanNumber;
    }

    public void setXzbanNumber(int xzbanNumber) {
        this.xzbanNumber = xzbanNumber;
    }


    public Map<String, Integer> getChooseSubjectClasses() {
        return chooseSubjectClasses;
    }

    public void setChooseSubjectClasses(Map<String, Integer> chooseSubjectClasses) {
        this.chooseSubjectClasses = chooseSubjectClasses;
    }

    public Map<String, Integer> getUnchooseSubjectClasses() {
        return unchooseSubjectClasses;
    }

    public void setUnchooseSubjectClasses(Map<String, Integer> unchooseSubjectClasses) {
        this.unchooseSubjectClasses = unchooseSubjectClasses;
    }
}
