package com.baidu.dao.compute.deduction.dto;

import java.util.List;

/**
 * Created by lt on 2018/05/21.
 */
public class DeductionResponseDto {

    private List<DeductionLevelRsDto> levelRs;


    public List<DeductionLevelRsDto> getLevelRs() {
        return levelRs;
    }

    public void setLevelRs(List<DeductionLevelRsDto> levelRs) {
        this.levelRs = levelRs;
    }
}
