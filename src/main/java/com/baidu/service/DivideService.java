package com.baidu.service;

import com.baidu.domain.parm.QueryGradeParam;
import com.baidu.util.Result;

/**
 * Created by lt on 18/5/12.
 */
public interface DivideService {
    /**
     * @param schoolId    学校Id
     * @param gradeYearId 年级年份Id
     * @param gradeId     年级Id
     * @param classGroup  班级组
     * @param tableName   表名字  saas_75_class_excel   saas_75_student_excel
     * @return
     */

    Result ConfirmStudents(QueryGradeParam param);

    /**
     * 根据年级Id获取班级列表
     *
     * @param param 年级Id
     * @return
     */
    Result getClassList(QueryGradeParam param);

    /**
     * 分班
     * @param schoolId
     * @param gradeName
     * @return
     */
    Result divideClass(int schoolId,String gradeName);

    Result divideSecondClass(int schoolId,String gradeName,String[] Subject);

}
