package com.baidu.service;

import java.util.List;
import java.util.Map;

/**
 * Created by lt on 18/5/12.
 */
public interface StudentBaseService {

    /**
     * 获取组合课程及对应的报名人数
     *
     * @param schoolId   学校Id
     * @param gradeId    年级Id
     * @param classGroup 班级组
     * @param tableName  表名  saas_75_class_excel
     * @return
     */
    List<Map<String, Object>> selectGroupClass(int schoolId, int gradeId, String classGroup, String tableName);

    /**
     * 查询未选课人数
     *
     * @param schoolId  学校Id
     * @param gradeId   年级Id
     * @param tableName 表名  saas_75_class_excel
     * @return
     */
    int selectUnSelect(int schoolId, int gradeId, String tableName);

    /**
     *查询学生人数及男女比比例
     * @param schoolId 学校Id
     * @param gradeId 年级Id
     * @param tableName  saas_75_class_excel
     * @return
     */
    List<Map<String, Object>> selectStudentInfo(int schoolId, int gradeId, String tableName);

    /**
     * 获取班级组
     * @param tableName
     * @return
     */
    List<String> selectClassGroup( String tableName);
}
