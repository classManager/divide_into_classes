package com.baidu.dao.compute.deduction;

import com.baidu.dao.compute.deduction.dto.DeductionRequestDto;
import com.baidu.dao.compute.deduction.dto.DeductionResponseDto;

/**
 * Created by lt on 2018/05/21.
 */
public interface IDeductionCompute {


    DeductionResponseDto compute(DeductionRequestDto request);
}
