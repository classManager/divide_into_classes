package com.baidu.dao.compute.deduction;

import com.baidu.dao.compute.deduction.customize.dto.StepRequestDto;
import com.baidu.dao.compute.deduction.customize.dto.StepResponseDto;

/**
 * Created by lt on 2018/05/21.
 *
 * 分班步骤接口
 *
 */
public interface DeductionComputeStep{

    StepResponseDto compute(StepRequestDto object, int maxNumber);

}

