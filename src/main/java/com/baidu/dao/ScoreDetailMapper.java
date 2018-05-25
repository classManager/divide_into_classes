package com.baidu.dao;

import com.baidu.domain.ScoreDetail;
import com.baidu.domain.ScoreDetailExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ScoreDetailMapper {
    int countByExample(ScoreDetailExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ScoreDetail record);

    int insertSelective(ScoreDetail record);

    List<ScoreDetail> selectByExample(ScoreDetailExample example);

    ScoreDetail selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ScoreDetail record, @Param("example") ScoreDetailExample example);

    int updateByExample(@Param("record") ScoreDetail record, @Param("example") ScoreDetailExample example);

    int updateByPrimaryKeySelective(ScoreDetail record);

    int updateByPrimaryKey(ScoreDetail record);
}