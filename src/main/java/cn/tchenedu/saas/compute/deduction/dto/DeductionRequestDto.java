package cn.tchenedu.saas.compute.deduction.dto;

import java.util.List;

/**
 * Created by ckzhang on 2017/10/21.
 */
public class DeductionRequestDto {

    private List<DeductionLevelInfoDto> levelInfos;

    private int classMaxNumber;


    public int getClassMaxNumber() {
        return classMaxNumber;
    }

    public void setClassMaxNumber(int classMaxNumber) {
        this.classMaxNumber = classMaxNumber;
    }

    public List<DeductionLevelInfoDto> getLevelInfos() {
        return levelInfos;
    }

    public void setLevelInfos(List<DeductionLevelInfoDto> levelInfos) {
        this.levelInfos = levelInfos;
    }

    @Override
    public String toString() {
        return "DeductionRequestDto{" +
                "levelInfos=" + levelInfos +
                ", classMaxNumber=" + classMaxNumber +
                '}';
    }
}
