package com.baidu.dao.compute.deduction.customize.utils;

import com.baidu.dao.compute.deduction.dto.DeductionComposeInfoDto;

import java.util.Comparator;

/**
 * Created by lt on 2018/05/2.
 */
public

class ComposeClassComputeSort implements Comparator<DeductionComposeInfoDto> {


    public int compare(DeductionComposeInfoDto[] left, DeductionComposeInfoDto[] right) {
        int minLength = Math.min(left.length, right.length);
        for (int i = 0; i < minLength; i++) {
            int result = compare(left[i], right[i]);
            if (result != 0) {
                return result;
            }
        }
        return left.length - right.length;
    }


    @Override
    public int compare(DeductionComposeInfoDto a, DeductionComposeInfoDto b) {
        // �ɼ����ս�������
        return (a.getChooseNumber() < b.getChooseNumber()) ? 1 : ((a.getChooseNumber() > b.getChooseNumber()) ? -1 : 0);
    }
}
