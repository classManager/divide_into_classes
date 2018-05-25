package com.baidu.dao;

import com.baidu.domain.ScoreCourseDetail;
import com.baidu.domain.ScoreCourseDetailExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ScoreCourseDetailMapper {
    int countByExample(ScoreCourseDetailExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ScoreCourseDetail record);

    int insertSelective(ScoreCourseDetail record);

    List<ScoreCourseDetail> selectByExample(ScoreCourseDetailExample example);

    ScoreCourseDetail selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ScoreCourseDetail record, @Param("example") ScoreCourseDetailExample example);

    int updateByExample(@Param("record") ScoreCourseDetail record, @Param("example") ScoreCourseDetailExample example);

    int updateByPrimaryKeySelective(ScoreCourseDetail record);

    int updateByPrimaryKey(ScoreCourseDetail record);
}