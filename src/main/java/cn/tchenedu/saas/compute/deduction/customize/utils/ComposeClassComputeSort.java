package cn.tchenedu.saas.compute.deduction.customize.utils;

import cn.tchenedu.saas.compute.deduction.dto.DeductionComposeInfoDto;

import java.util.Comparator;

/**
 * Created by ckzhang on 2017/11/2.
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
        // ³É¼¨°´ÕÕ½µÐòÅÅÐò
        return (a.getChooseNumber() < b.getChooseNumber()) ? 1 : ((a.getChooseNumber() > b.getChooseNumber()) ? -1 : 0);
    }
}
