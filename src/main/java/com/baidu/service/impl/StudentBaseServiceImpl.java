package com.baidu.service.impl;

import com.baidu.dao.StudentBaseMapper;
import com.baidu.dao.UserInfoMapper;
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

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }
}
