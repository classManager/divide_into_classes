package com.baidu.service.impl;

import com.baidu.dao.SaasStudentExcelMapper;
import com.baidu.dao.StudentBaseMapper;
import com.baidu.domain.SaasStudentExcel;
import com.baidu.service.StudentBaseService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ApplicationEventPublisherAware是由Spring提供的用于为Service注入ApplicationEventPublisher事件发布器的接口，
 * 使用这个接口，我们自己的Service就拥有了发布事件的能力。
 * Created by lt on 18/5/15.
 */
@Service
public class StudentBaseServiceImpl implements StudentBaseService, ApplicationContextAware {
    @Autowired
    private StudentBaseMapper studentBaseMapper;

    @Autowired
    private SaasStudentExcelMapper saasStudentExcelMapper;

    /**
     * 获取组合课程及对应的报名人数
     *
     * @param schoolId   学校Id
     * @param gradeId    年级Id
     * @param classGroup 班级组
     * @param tableName  表名
     * @return
     */
    @Override
    public List<Map<String, Object>> selectGroupClass(int schoolId, int gradeId, String classGroup, String tableName) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("schoolId", schoolId);
        map.put("gradeId", gradeId);
        map.put("classGroup", classGroup);
        map.put("tableName", tableName);
        return studentBaseMapper.selectGroupClass(map);
    }

    /**
     * 查询为选课人数
     *
     * @param schoolId  学校Id
     * @param gradeId   年级Id
     * @param tableName 表名 saas_75_class_excel
     * @return
     */
    @Override
    public int selectUnSelect(int schoolId, int gradeId, String tableName) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("schoolId", schoolId);
        map.put("gradeId", gradeId);
        map.put("tableName", tableName);
        return studentBaseMapper.selectUnSelect(map);
    }

    /**
     * 查询学生人数及男女比比例
     *
     * @param schoolId  学校Id
     * @param gradeId   年级Id
     * @param tableName saas_75_class_excel
     * @return
     */
    @Override
    public List<Map<String, Object>> selectStudentInfo(int schoolId, int gradeId, String tableName) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("schoolId", schoolId);
        map.put("gradeId", gradeId);
        map.put("tableName", tableName);
        return studentBaseMapper.selectStudentInfo(map);
    }

    /**
     * 获取班级分组
     *
     * @param tableName
     * @return
     */
    @Override
    public List<String> selectClassGroup(String tableName) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("tableName", tableName);
        return studentBaseMapper.selectClassGroup(map);
    }

    /**
     * 根据学校Id和年级名称获取所有学生的信息和成绩
     *
     * @param schoolId
     * @param gradeName
     * @return
     */
    @Override
    public List<Map<String, Object>> selectAllStudentAndScore(int schoolId, String gradeName) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("schoolId", schoolId);
        map.put("gradeName", gradeName);
        return studentBaseMapper.selectAllStudentAndScore(map);
    }

    @Override
    public List<Map<String, Object>> selectAllComposeAndNum(int schoolId, String gradeName) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("schoolId", schoolId);
        map.put("gradeName", gradeName);
        return studentBaseMapper.selectAllComposeAndNum(map);
    }

    /**
     * 定二
     *
     * @param map
     * @return
     */
    @Override
    public List<SaasStudentExcel> selectBySecondCheckMajor(String checkMajor1, String checkMajor2) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("checkMajor1", checkMajor1);
        map.put("checkMajor2", checkMajor2);
        return saasStudentExcelMapper.selectBySecondCheckMajor(map);
    }

    /**
     * 定三
     *
     * @param map
     * @return
     */
    @Override
    public List<SaasStudentExcel> selectByThreeCheckMajor(String checkMajor1, String checkMajor2, String checkMajor3) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("checkMajor1", checkMajor1);
        map.put("checkMajor2", checkMajor2);
        map.put("checkMajor3", checkMajor3);
        return saasStudentExcelMapper.selectByThreeCheckMajor(map);
    }

    /**
     * 获取所有学生信息
     *
     * @return
     */
    @Override
    public List<SaasStudentExcel> selectAlltudent() {
        return saasStudentExcelMapper.selectAlltudent();
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }
}
