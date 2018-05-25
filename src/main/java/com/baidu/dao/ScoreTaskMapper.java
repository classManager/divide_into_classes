package com.baidu.dao;

import com.baidu.domain.ScoreTask;
import com.baidu.domain.ScoreTaskExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface ScoreTaskMapper {
    int countByExample(ScoreTaskExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ScoreTask record);

    int insertSelective(ScoreTask record);

    List<ScoreTask> selectByExample(ScoreTaskExample example);

    ScoreTask selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ScoreTask record, @Param("example") ScoreTaskExample example);

    int updateByExample(@Param("record") ScoreTask record, @Param("example") ScoreTaskExample example);

    int updateByPrimaryKeySelective(ScoreTask record);

    int updateByPrimaryKey(ScoreTask record);

    List<Map<String, Object>> selectExamResults(Map<String,Object> map);//int schoolId, int gradeYearId);

}