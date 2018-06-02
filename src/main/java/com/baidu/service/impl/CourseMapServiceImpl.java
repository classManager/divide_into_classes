package com.baidu.service.impl;

import com.baidu.dao.CourseMapMapper;
import com.baidu.service.CourseMapService;
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
public class CourseMapServiceImpl implements CourseMapService, ApplicationContextAware {
    @Autowired
    private CourseMapMapper courseMapMapper;

    @Override
    public List<Map<String, Object>> selectNumberOfSubject(String tableName) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("tableName", tableName);
        return courseMapMapper.selectNumberOfSubject(map);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }

}
