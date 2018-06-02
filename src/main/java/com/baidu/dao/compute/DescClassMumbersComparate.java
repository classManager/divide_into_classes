package com.baidu.dao.compute;

import com.baidu.domain.dto.DivideClassInfoDto;

import java.util.Comparator;

/**
 * Created by lt on 2018/05/26.
 */
class DescClassMumbersComparate implements Comparator<DivideClassInfoDto> {


    public int compare(DivideClassInfoDto[] left, DivideClassInfoDto[] right) {
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
    public int compare(DivideClassInfoDto a, DivideClassInfoDto b) {
        // 成绩按照降序排序
        return (a.getMaxStudent() > b.getMaxStudent()) ? 1 : ((a.getMaxStudent() < b.getMaxStudent()) ? -1 : 0);
    }
}