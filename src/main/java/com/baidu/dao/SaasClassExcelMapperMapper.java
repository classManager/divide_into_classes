package com.baidu.dao;

import com.baidu.domain.SaasClassExcelMapper;
import com.baidu.domain.SaasClassExcelMapperExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SaasClassExcelMapperMapper {
    int countByExample(SaasClassExcelMapperExample example);

    int insert(SaasClassExcelMapper record);

    int insertSelective(SaasClassExcelMapper record);

    List<SaasClassExcelMapper> selectByExample(SaasClassExcelMapperExample example);

    int updateByExampleSelective(@Param("record") SaasClassExcelMapper record, @Param("example") SaasClassExcelMapperExample example);

    int updateByExample(@Param("record") SaasClassExcelMapper record, @Param("example") SaasClassExcelMapperExample example);
}