package com.baidu.dao.compute.deduction.dto;

import java.util.List;

/**
 * Created by lt on 2018/05/21.
 */
public class DeductionLevelInfoDto {

    private String level;

    private List<DeductionComposeInfoDto> composes;


    public DeductionLevelInfoDto() {
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public List<DeductionComposeInfoDto> getComposes() {
        return composes;
    }

    public void setComposes(List<DeductionComposeInfoDto> composes) {
        this.composes = composes;
    }

    @Override
    public String toString() {
        return "DeductionLevelInfoDto{" +
                "level='" + level + '\'' +
                ", composes=" + composes +
                '}';
    }
}
