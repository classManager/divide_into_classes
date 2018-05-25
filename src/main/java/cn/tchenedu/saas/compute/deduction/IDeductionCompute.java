package cn.tchenedu.saas.compute.deduction;

import cn.tchenedu.saas.compute.deduction.dto.DeductionRequestDto;
import cn.tchenedu.saas.compute.deduction.dto.DeductionResponseDto;

/**
 * Created by ckzhang on 2017/10/21.
 */
public interface IDeductionCompute {


    DeductionResponseDto compute(DeductionRequestDto request);
}
