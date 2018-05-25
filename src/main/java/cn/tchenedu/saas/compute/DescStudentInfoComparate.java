package cn.tchenedu.saas.compute;

import cn.tchenedu.saas.dto.DivideStudentInfo;

import java.util.Comparator;

/**
 * Created by ckzhang on 2017/9/26.
 */
class DescStudentInfoComparate implements Comparator<DivideStudentInfo> {


    public int compare(DivideStudentInfo[] left, DivideStudentInfo[] right) {
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
    public int compare(DivideStudentInfo a, DivideStudentInfo b) {
        // 成绩按照降序排序
        return (a.getCompareScore() < b.getCompareScore()) ? 1 : ((a.getCompareScore() > b.getCompareScore()) ? -1 : 0);
    }
}