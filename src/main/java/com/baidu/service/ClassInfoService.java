package com.baidu.service;

import com.baidu.domain.ClassInfo;
import com.baidu.domain.parm.QueryGradeParam;

import java.util.List;

/**
 * Created by lt on 18/5/12.
 */
public interface ClassInfoService {

    /**
     * 根据年级Id获取班级列表
     *
     * @param gradeId 年级Id
     * @return
     */
    List<ClassInfo> getClassList(QueryGradeParam param);
}
