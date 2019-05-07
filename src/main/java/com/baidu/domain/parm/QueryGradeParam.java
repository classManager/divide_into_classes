package com.baidu.domain.parm;

/**
 * 查询实体
 */
public class QueryGradeParam {

    /**
     * 年级ID
     */
    private Integer gradeId;

    /**
     * 学校id
     */
    private Integer schoolId;

    /**
     * 班级部
     */
    private String classGroup;

    /**
     * 动态表明
     */
    private String tableName;

    public Integer getGradeId() {
        return gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    public String getClassGroup() {
        return classGroup;
    }

    public void setClassGroup(String classGroup) {
        this.classGroup = classGroup;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
}