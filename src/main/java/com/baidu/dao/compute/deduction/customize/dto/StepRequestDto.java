package com.baidu.dao.compute.deduction.customize.dto;

import com.baidu.dao.compute.deduction.dto.StepDto;

import java.util.List;

/**
 * Created by lt on 2018/05/2.
 */
public class StepRequestDto extends StepDto {

    private List<DeductionComposeDto> composes;

    public List<DeductionComposeDto> getComposes() {
        return composes;
    }

    public void setComposes(List<DeductionComposeDto> composes) {
        this.composes = composes;
    }
}
