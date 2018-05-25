package com.baidu.service;

import com.baidu.util.Result;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

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

    Result ConfirmStudents(int schoolId,int gradeId, String classGroup);

    /**
     * 根据年级Id获取班级列表
     *
     * @param gradeId 年级Id
     * @return
     */
    Result getClassList(int gradeId, int schoolId);
}
