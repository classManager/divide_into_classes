package com.baidu.dao;

import com.baidu.domain.ScoreComposeStatistics;
import com.baidu.domain.ScoreComposeStatisticsExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ScoreComposeStatisticsMapper {
    int countByExample(ScoreComposeStatisticsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ScoreComposeStatistics record);

    int insertSelective(ScoreComposeStatistics record);

    List<ScoreComposeStatistics> selectByExample(ScoreComposeStatisticsExample example);

    ScoreComposeStatistics selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ScoreComposeStatistics record, @Param("example") ScoreComposeStatisticsExample example);

    int updateByExample(@Param("record") ScoreComposeStatistics record, @Param("example") ScoreComposeStatisticsExample example);

    int updateByPrimaryKeySelective(ScoreComposeStatistics record);

    int updateByPrimaryKey(ScoreComposeStatistics record);
}