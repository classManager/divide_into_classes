package com.baidu.dao;

import com.baidu.domain.SaasStudentExcel;
import com.baidu.domain.SaasStudentExcelExample;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface SaasStudentExcelMapper {
    int countByExample(SaasStudentExcelExample example);

    int insert(SaasStudentExcel record);

    int insertSelective(SaasStudentExcel record);

    List<SaasStudentExcel> selectByExample(SaasStudentExcelExample example);

    int updateByExampleSelective(@Param("record") SaasStudentExcel record, @Param("example") SaasStudentExcelExample example);

    int updateByExample(@Param("record") SaasStudentExcel record, @Param("example") SaasStudentExcelExample example);

    /**
     * 定二
     * @param map
     * @return
     */
    List<SaasStudentExcel> selectBySecondCheckMajor(Map<String, Object> map);

    /**
     * 定三
     * @param map
     * @return
     */
    List<SaasStudentExcel> selectByThreeCheckMajor(Map<String, Object> map);

    /**
     * 获取所有学生
     * @return
     */
    List<SaasStudentExcel> selectAlltudent();
}