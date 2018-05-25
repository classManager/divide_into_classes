package cn.tchenedu.saas.compute.deduction;

import cn.tchenedu.saas.compute.deduction.customize.dto.StepRequestDto;
import cn.tchenedu.saas.compute.deduction.customize.dto.StepResponseDto;

/**
 * Created by ckzhang on 2017/10/21.
 *
 * 分班步骤接口
 *
 */
public interface DeductionComputeStep{

    StepResponseDto compute(StepRequestDto object, int maxNumber);

}

