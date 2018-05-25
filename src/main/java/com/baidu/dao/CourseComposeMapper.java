package com.baidu.dao;

import com.baidu.domain.CourseCompose;
import com.baidu.domain.CourseComposeExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper

public interface CourseComposeMapper {
    int countByExample(CourseComposeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CourseCompose record);

    int insertSelective(CourseCompose record);

    List<CourseCompose> selectByExample(CourseComposeExample example);

    CourseCompose selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CourseCompose record, @Param("example") CourseComposeExample example);

    int updateByExample(@Param("record") CourseCompose record, @Param("example") CourseComposeExample example);

    int updateByPrimaryKeySelective(CourseCompose record);

    int updateByPrimaryKey(CourseCompose record);
}