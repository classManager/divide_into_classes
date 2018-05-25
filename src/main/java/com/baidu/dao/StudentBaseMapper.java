package com.baidu.dao;

import com.baidu.domain.StudentBase;
import com.baidu.domain.StudentBaseExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface StudentBaseMapper {
    int countByExample(StudentBaseExample example);

    int deleteByPrimaryKey(Long id);

    int insert(StudentBase record);

    int insertSelective(StudentBase record);

    List<StudentBase> selectByExample(StudentBaseExample example);

    StudentBase selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") StudentBase record, @Param("example") StudentBaseExample example);

    int updateByExample(@Param("record") StudentBase record, @Param("example") StudentBaseExample example);

    int updateByPrimaryKeySelective(StudentBase record);

    int updateByPrimaryKey(StudentBase record);
    /**
     * 获取组合课程及对应的报名人数
     *
     * @param schoolId   学校Id
     * @param gradeId    年级Id
     * @param classGroup 班级组
     * @param tableName  表名
     * @return
     */
    List<Map<String, Object>> selectGroupClass(Map<String,Object> map);//int schoolId, int gradeId, String classGroup, String tableName);

    /**
     * 查询为选课人数
     *
     * @param schoolId  学校Id
     * @param gradeId   年级Id
     * @param tableName 表名
     * @return
     */
    int selectUnSelect(Map<String,Object> map);//int schoolId, int gradeId, String tableName);

    /**
     * 查询学生人数及男女比比例
     *
     * @param schoolId  学校Id
     * @param gradeId   年级Id
     * @param tableName saas_75_class_excel
     * @return
     */
    List<Map<String, Object>> selectStudentInfo(Map<String,Object> map);//int schoolId, int gradeId, String tableName);

    /**
     * 获取班级分组
     *
     * @param tableName
     * @return
     */
    List<String> selectClassGroup(Map<String,Object> map);//String tableName);
}