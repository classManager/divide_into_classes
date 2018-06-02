package com.baidu.service;

import com.baidu.domain.UserInfo;

import java.util.List;

/**
 * Created by lt on 17/8/2.
 */
public interface UserInfoService {
    int insertSelective(UserInfo record);

    List<UserInfo> selectByUsername(String username);
}
