package com.baidu.service;

import java.util.List;
import java.util.Map;

/**
 * Created by lt on 18/5/15.
 */
public interface CourseMapService {
    /**
     * 查询单个课程和对应的报名人数
     *
     * @param tableName saas_75_student_excel
     * @return
     */
    List<Map<String, Object>> selectNumberOfSubject(String tableName);
}
