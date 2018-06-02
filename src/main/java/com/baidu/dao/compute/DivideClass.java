package com.baidu.dao.compute;

import com.baidu.domain.dto.*;
import com.alibaba.fastjson.JSON;

import java.util.*;

/**
 * Created by lt on 2018/05/23.
 */
public class DivideClass {

    public static List<DivideResultInfo> start(DivideTaskInfo task, DivideData data) throws Exception {


        List<DivideResultInfo> rs = new ArrayList<>();


        //所有学生
        List<DivideStudentDataDetail> students = data.getStudentData();

        // 所有学生集合
        Map<Integer, List<DivideStudentInfo>> allStudents = new HashMap<>();

        // 男学生集合
        Map<Integer, List<DivideStudentInfo>> maleStudents = new HashMap<>();

        // 女学生集合
        Map<Integer, List<DivideStudentInfo>> fmaleStudents = new HashMap<>();

        // 男女独立,分层处理
        for(DivideStudentDataDetail stItems : students){
            List<DivideStudentInfo> studentInfos = stItems.getStudents();


            List<DivideStudentInfo> males = maleStudents.getOrDefault(stItems.getLevel(),new ArrayList<>());
            List<DivideStudentInfo> fmales = fmaleStudents.getOrDefault(stItems.getLevel(),new ArrayList<>());
            List<DivideStudentInfo> all = allStudents.getOrDefault(stItems.getLevel(),new ArrayList<>());


            for (DivideStudentInfo divideStudentItem : studentInfos){
                List<DivideStudentInfo> tempStudents = divideStudentItem.getSex() == 0 ? fmales : males;
                tempStudents.add(divideStudentItem);

                all.add(divideStudentItem);

            }

            maleStudents.put(stItems.getLevel(),males);
            fmaleStudents.put(stItems.getLevel(),fmales);
            allStudents.put(stItems.getLevel(),all);
        }





        if(task.isBalanceSex()) {
            rs.addAll(Compute.admDivide(data.getAdmClasses(), maleStudents, fmaleStudents));
        } else {
            rs.addAll(Compute.admDivide(data.getAdmClasses(), allStudents));
        }

        System.out.println(JSON.toJSON(rs));



        return rs;
    }

}

