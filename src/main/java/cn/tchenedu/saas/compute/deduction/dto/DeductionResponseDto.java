package cn.tchenedu.saas.compute.deduction.dto;

import java.util.List;

/**
 * Created by ckzhang on 2017/10/21.
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
