package com.baidu.dao;

import com.baidu.domain.GradeInfo;
import com.baidu.domain.GradeInfoExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface GradeInfoMapper {
    int countByExample(GradeInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GradeInfo record);

    int insertSelective(GradeInfo record);

    List<GradeInfo> selectByExample(GradeInfoExample example);

    GradeInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GradeInfo record, @Param("example") GradeInfoExample example);

    int updateByExample(@Param("record") GradeInfo record, @Param("example") GradeInfoExample example);

    int updateByPrimaryKeySelective(GradeInfo record);

    int updateByPrimaryKey(GradeInfo record);
}