package com.baidu.dao.divide;

import com.alibaba.fastjson.JSON;
import com.baidu.dao.compute.NewCompute;
import com.baidu.domain.dto.DivideStudentDataDetail;
import com.baidu.domain.dto.DivideStudentInfo;
import com.baidu.domain.dto.DivideTaskInfo;
import com.baidu.domain.dto.NewDivideDetailRsDto;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lt on 2018/05/23.
 */
public class DivideClass {

    public static List<NewDivideDetailRsDto> start(DivideTaskInfo task, List<DivideStudentDataDetail> studentData) throws Exception {

        List<NewDivideDetailRsDto> rs = new ArrayList<>();

        //所有学生
        List<DivideStudentDataDetail> students = studentData;

        // 男女独立,分层处理
        for (DivideStudentDataDetail stItems : students) {
            List<DivideStudentInfo> studentInfos = stItems.getStudents();


            List<DivideStudentInfo> males = new ArrayList<>();
            //女生
            List<DivideStudentInfo> fmales = new ArrayList<>();
            //男生
            List<DivideStudentInfo> all = new ArrayList<>();


            for (DivideStudentInfo divideStudentItem : studentInfos) {
                //将男女学生分别放入对应的集合，男：males;女：fmales;
                List<DivideStudentInfo> tempStudents = divideStudentItem.getSex() == 0 ? fmales : males;
                tempStudents.add(divideStudentItem);
                //将所有的学生放入临时的list中
                all.add(divideStudentItem);

            }


            NewDivideDetailRsDto detailRsDto = null;
            //如果是男女比例均衡的条件
            if (task.isBalanceSex()) {
                detailRsDto = NewCompute.divideAllClass(males, fmales, task.getMaxNumber());
            } else {
                detailRsDto = NewCompute.divideAllClass(males, fmales, task.getMaxNumber());
            }

            detailRsDto.setLevel(stItems.getLevel() + "");

            rs.add(detailRsDto);
        }


        System.out.println(JSON.toJSON(rs));


        return rs;


    }

}

