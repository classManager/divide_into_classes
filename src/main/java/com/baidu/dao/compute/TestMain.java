package com.baidu.dao.compute;

import com.baidu.domain.dto.DivideData;
import com.baidu.domain.dto.DivideStudentDataDetail;
import com.baidu.domain.dto.DivideStudentInfo;
import com.baidu.domain.dto.DivideTaskInfo;
import com.baidu.domain.dto.NewDivideDetailRsDto;
import com.baidu.service.StudentBaseService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lt on 2018/05/26.
 */
public class TestMain {
    @Autowired
    private StudentBaseService studentBaseService;

    public static void main(String a[]) throws Exception {

        DivideTaskInfo task = new DivideTaskInfo();
        DivideData data = new DivideData();
        task.setTaskId("asdoi2oi13o12312");
        task.setBalanceSex(true);
        task.setMaxNumber(50);
        //task.setAvarageScore(true);

        List<DivideStudentDataDetail> list = new ArrayList<>();

        List<DivideStudentInfo> studentInfos = new ArrayList<>();


        DivideStudentDataDetail i = new DivideStudentDataDetail();
        i.setLevel(1);
        i.setStudents(studentInfos);

        list.add(i);

        List<NewDivideDetailRsDto> list1 = NewDivideClass.start(task, list);

//        System.out.println(list1);
//
//        for (String key : SubjectMap.COMPOSE_WEIGHT_MAP.keySet()){
//            int randomValue = (int)((Math.random() * 192123) % 100);
//
//            for (int m = 0 ; m < randomValue ; m ++){
//
//                DivideStudentInfo s = new DivideStudentInfo();
//                s.setScore(Math.random() * 1000);
//                s.setWlScore(Math.random() * 100);
////                s.setComposeId(key);
//                if (m %3 == 1) {
//                    s.setSex(0);
//                }else {
//                    s.setSex(1);
//                }
//                s.setStudentCode(key + "-" + m);
//
//
//
//                studentInfos.add(s);
//            }
//
////            break;
//        }
//
//        task.setMaxNumber(50);
//
//
//        List<NewDivideDetailRsDto> sss = NewDivideClass.start(task, list);
//
//        int ssss=0;
    }
}
