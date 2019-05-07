package com.baidu.service.impl;

import com.baidu.dao.ClassInfoMapper;
import com.baidu.domain.ClassInfo;
import com.baidu.domain.parm.QueryGradeParam;
import com.baidu.service.ClassInfoService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lt on 18/5/12.
 */

@Service
public class ClassInfoServiceImpl implements ClassInfoService, ApplicationContextAware {
    @Autowired
    private ClassInfoMapper classInfoMapper;

    /**
     * 根据年级Id获取班级列表
     *
     * @param gradeId 年级Id
     * @return
     */
    @Override
    public List<ClassInfo> getClassList(QueryGradeParam param) {
        return classInfoMapper.getClassList(param);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }
}
