package cn.tchenedu.saas.compute.deduction.customize.dto;

import cn.tchenedu.saas.compute.deduction.dto.StepDto;

import java.util.List;

/**
 * Created by ckzhang on 2017/11/2.
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
