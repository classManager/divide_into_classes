package com.baidu.service;

import java.util.List;
import java.util.Map;

/**
 * Created by lt on 18/5/15.
 */
public interface ScoreTaskService {
    /**
     * @param schoolId    学校Id
     * @param gradeYearId 年级id
     * @return
     */
    List<Map<String, Object>> selectExamResults(int schoolId, int gradeYearId);
}
