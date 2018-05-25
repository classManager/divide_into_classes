package com.baidu.dao;

import com.baidu.domain.CourseMap;
import com.baidu.domain.CourseMapExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface CourseMapMapper {
    int countByExample(CourseMapExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CourseMap record);

    int insertSelective(CourseMap record);

    List<CourseMap> selectByExample(CourseMapExample example);

    CourseMap selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CourseMap record, @Param("example") CourseMapExample example);

    int updateByExample(@Param("record") CourseMap record, @Param("example") CourseMapExample example);

    int updateByPrimaryKeySelective(CourseMap record);

    int updateByPrimaryKey(CourseMap record);

    List<Map<String, Object>> selectNumberOfSubject(Map<String,Object> map);//String tableName);
}