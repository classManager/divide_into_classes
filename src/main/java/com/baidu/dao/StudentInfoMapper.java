package com.baidu.dao;

import com.baidu.domain.StudentInfo;
import com.baidu.domain.StudentInfoExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StudentInfoMapper {
    int countByExample(StudentInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StudentInfo record);

    int insertSelective(StudentInfo record);

    List<StudentInfo> selectByExample(StudentInfoExample example);

    StudentInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StudentInfo record, @Param("example") StudentInfoExample example);

    int updateByExample(@Param("record") StudentInfo record, @Param("example") StudentInfoExample example);

    int updateByPrimaryKeySelective(StudentInfo record);

    int updateByPrimaryKey(StudentInfo record);
}