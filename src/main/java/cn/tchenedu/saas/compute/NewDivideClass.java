package cn.tchenedu.saas.compute;

import cn.tchenedu.saas.dto.*;
import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ckzhang on 2017/9/23.
 */
public class NewDivideClass {

    public static List<NewDivideDetailRsDto> start(DivideTaskInfo task, List<DivideStudentDataDetail> studentData) throws Exception {

        List<NewDivideDetailRsDto> rs = new ArrayList<>();

        //所有学生
        List<DivideStudentDataDetail> students = studentData;

        // 男女独立,分层处理
        for(DivideStudentDataDetail stItems : students){
            List<DivideStudentInfo> studentInfos = stItems.getStudents();


            List<DivideStudentInfo> males = new ArrayList<>();
            List<DivideStudentInfo> fmales = new ArrayList<>();
            List<DivideStudentInfo> all = new ArrayList<>();


            for (DivideStudentInfo divideStudentItem : studentInfos){
                List<DivideStudentInfo> tempStudents = divideStudentItem.getSex() == 0 ? fmales : males;
                tempStudents.add(divideStudentItem);

                all.add(divideStudentItem);

            }


            NewDivideDetailRsDto detailRsDto = null;
            if(task.isBalanceSex()) {
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

