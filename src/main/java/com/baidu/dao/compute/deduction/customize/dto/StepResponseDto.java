package com.baidu.dao.compute.deduction.customize.dto;

import com.baidu.dao.compute.deduction.dto.StepDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lt on 2018/05/2.
 */
public class StepResponseDto extends StepDto {

    private List<DeductionComposeDto> newCompose = new ArrayList<>();

    private List<ClassDeduction> xzClass = new ArrayList<>();

    /**
     * 存储选考班的班级组成
     * 例如
     *   Key--64表示物理班级  List<ClassDeduction>[{67=54,70=6} 这个班级由两个组合组成67组合54人+70组合6人,{70=60}] </ClassDeduction>   size=7 表示物理班级8个
     *
     */
    private Map<Integer,List<ClassDeduction>> xkClassComposeList = new HashMap<>();

    /**
     * 存储学考班的班级组成
     * 例如
     *   Key--64表示物理班级  List<ClassDeduction>[{67=54,70=6} 这个班级由两个组合组成67组合54人+70组合6人,{70=60}] </ClassDeduction>   size=7 表示物理班级8个
     *
     */
    private Map<Integer,List<ClassDeduction>> xuekClassComposeList = new HashMap<>();


    public List<DeductionComposeDto> getNewCompose() {
        return newCompose;
    }

    public void setNewCompose(List<DeductionComposeDto> newCompose) {
        this.newCompose = newCompose;
    }


    public Map<Integer, List<ClassDeduction>> getXkClassComposeList() {
        return xkClassComposeList;
    }

    public void setXkClassComposeList(Map<Integer, List<ClassDeduction>> xkClassComposeList) {
        this.xkClassComposeList = xkClassComposeList;
    }

    public Map<Integer, List<ClassDeduction>> getXuekClassComposeList() {
        return xuekClassComposeList;
    }

    public void setXuekClassComposeList(Map<Integer, List<ClassDeduction>> xuekClassComposeList) {
        this.xuekClassComposeList = xuekClassComposeList;
    }

    public List<ClassDeduction> getXzClass() {
        return xzClass;
    }

    public void setXzClass(List<ClassDeduction> xzClass) {
        this.xzClass = xzClass;
    }
}
