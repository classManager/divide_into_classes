package com.baidu.service;

import com.baidu.domain.SaasStudentExcel;

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
     * 查询学生人数及男女比比例
     *
     * @param schoolId  学校Id
     * @param gradeId   年级Id
     * @param tableName saas_75_class_excel
     * @return
     */
    List<Map<String, Object>> selectStudentInfo(int schoolId, int gradeId, String tableName);

    /**
     * 获取班级组
     *
     * @param tableName
     * @return
     */
    List<String> selectClassGroup(String tableName);

    /**
     * 根据学校Id和年级名称获取所有学生的信息和成绩
     * @param map
     * @return
     */
    List<Map<String, Object>> selectAllStudentAndScore(int schoolId,String gradeName);

    /**
     * 根据学校Id和年级名称获取所有的组合Id和学生选择数量
     * @param schoolId
     * @param gradeName
     * @return
     */
    List<Map<String, Object>> selectAllComposeAndNum(int schoolId,String gradeName);

    /**
     * 定二
     * @param checkMajor1
     * @param checkMajor2
     * @return
     */
    List<SaasStudentExcel> selectBySecondCheckMajor(String checkMajor1,String checkMajor2);

    /**
     * 定三
     * @param checkMajor1
     * @param checkMajor2
     * @param checkMajor3
     * @return
     */
    List<SaasStudentExcel> selectByThreeCheckMajor(String checkMajor1,String checkMajor2,String checkMajor3);

    /**
     * 获取所有学生信息
     * @return
     */
    List<SaasStudentExcel> selectAlltudent();
}
