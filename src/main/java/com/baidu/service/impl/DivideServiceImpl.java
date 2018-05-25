package com.baidu.service.impl;

import com.baidu.domain.ClassInfo;
import com.baidu.service.*;
import com.baidu.util.Result;
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
public class DivideServiceImpl implements DivideService, ApplicationContextAware {
    @Autowired
    private ScoreTaskService scoreTaskService;
    @Autowired
    private StudentBaseService studentBaseService;
    @Autowired
    private CourseMapService courseMapService;
    @Autowired
    private ClassInfoService classInfoService;


    @Override
    public Result ConfirmStudents(int schoolId, int gradeId, String classGroup) {
        Result result = new Result();
        result.setReturncode(-1);
        Map<String, Object> mapres = new HashMap<String, Object>();
        if (schoolId == 0) {
            result.setMsg("学校Id不能为空");
            return result;
        }
        if (gradeId == 0) {
            result.setMsg("年级Id不能为空");
            return result;
        }
        String classTable = "saas_" + schoolId + "_class_excel";//班级表
        String studentTable = "saas_" + schoolId + "_student_excel"; //学生表
        //单科成绩及人数
        List<Map<String, Object>> subject = courseMapService.selectNumberOfSubject(studentTable);
        //组合课程及人数
        List<Map<String, Object>> groupClass = studentBaseService.selectGroupClass(schoolId, gradeId, classGroup, classTable);
        //成绩列表
        List<Map<String, Object>> achievementList = scoreTaskService.selectExamResults(schoolId, gradeId);
        //未选课人数
        int unSelect = studentBaseService.selectUnSelect(schoolId, gradeId, classTable);
        //学生总人数以及男女比例
        List<Map<String, Object>> studentNum = studentBaseService.selectStudentInfo(schoolId, gradeId, classTable);

        int totle = 0;
        if (studentNum != null && studentNum.size() > 0) {
            for (Map<String, Object> map : studentNum) {
                if (map.get("sex").equals(0)) {
                    mapres.put("grilsNum", map.get("sNum"));
                }
                if (map.get("sex").equals(1)) {
                    mapres.put("boysNum", map.get("sNum"));
                }
                totle += Integer.valueOf(map.get("sNum").toString());
            }
        }
        //获取班级分组
        List<String> grade = studentBaseService.selectClassGroup(classTable);
        mapres.put("totle", totle);
        mapres.put("unSelectNum", unSelect);
        mapres.put("grade", grade);
        mapres.put("groupClass", groupClass);
        mapres.put("subject", subject);
        mapres.put("achievementList", achievementList);

        if (mapres != null) {
            result.setReturncode(200);
            result.setMsg("班级列表获取成功!");
            result.setData(mapres);
        }
        return result;
    }

    @Override
    public Result getClassList(int gradeId, int schoolId) {

        String classTable = "saas_" + schoolId + "_class_excel";//班级表
        Result result = new Result();
        result.setReturncode(-1);
        List<ClassInfo> subject = classInfoService.getClassList(gradeId, classTable);
        if (subject != null) {
            result.setReturncode(200);
            result.setMsg("确认学生信息成功!");
            result.setData(subject);
        }
        return result;

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }

}
