package com.baidu.service.impl;

import com.baidu.dao.UserInfoMapper;
import com.baidu.domain.UserInfo;
import com.baidu.event.UserRegisterEvent;
import com.baidu.service.UserInfoService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ApplicationEventPublisherAware是由Spring提供的用于为Service注入ApplicationEventPublisher事件发布器的接口，
 * 使用这个接口，我们自己的Service就拥有了发布事件的能力。
 * <p>
 * Created by lt on 18/5/12.
 */
@Service
public class UserServiceImpl implements UserInfoService, ApplicationContextAware {
    @Autowired
    private UserInfoMapper userInfoMapper;
    private ApplicationContext applicationContext;

    @Override
    public int insertSelective(UserInfo record) {
        applicationContext.publishEvent(new UserRegisterEvent(record.getUsername()));
        return userInfoMapper.insertSelective(record);
    }

    @Override
    public List<UserInfo> selectByUsername(String username) {
        return userInfoMapper.selectByUsername(username);
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }
}
