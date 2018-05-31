package com.baidu.dao;

import com.baidu.domain.SaasStudentExcel;
import com.baidu.domain.SaasStudentExcelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SaasStudentExcelMapper {
    int countByExample(SaasStudentExcelExample example);

    int insert(SaasStudentExcel record);

    int insertSelective(SaasStudentExcel record);

    List<SaasStudentExcel> selectByExample(SaasStudentExcelExample example);

    int updateByExampleSelective(@Param("record") SaasStudentExcel record, @Param("example") SaasStudentExcelExample example);

    int updateByExample(@Param("record") SaasStudentExcel record, @Param("example") SaasStudentExcelExample example);
}