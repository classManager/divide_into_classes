package com.baidu.service.impl;

import com.baidu.dao.ScoreTaskMapper;
import com.baidu.service.ScoreTaskService;
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
public class ScoreTaskServiceImpl implements ScoreTaskService,ApplicationContextAware {
    @Autowired
    private ScoreTaskMapper scoreTaskMapper;


    @Override
    public List<Map<String, Object>> selectExamResults(int schoolId, int gradeYearId) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("schoolId", schoolId);
        map.put("gradeYearId", gradeYearId);
        return scoreTaskMapper.selectExamResults(map);
    }
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }

}
