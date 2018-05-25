package cn.tchenedu.saas.compute;

import cn.tchenedu.saas.compute.deduction.customize.utils.SubjectMap;
import cn.tchenedu.saas.dto.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ckzhang on 2017/9/26.
 */
public class TestMain {

    public static void main(String a[] ) throws Exception {
        DivideTaskInfo task = new DivideTaskInfo();
        DivideData data = new DivideData();
        task.setTaskId("asdoi2oi13o12312");
        task.setBalanceSex(true);


        List<DivideStudentDataDetail> list = new ArrayList<>();

        List<DivideStudentInfo> studentInfos = new ArrayList<>();


        DivideStudentDataDetail i = new DivideStudentDataDetail();
        i.setLevel(1);
        i.setStudents(studentInfos);

        list.add(i);



        for (String key : SubjectMap.COMPOSE_WEIGHT_MAP.keySet()){
            int randomValue = (int)((Math.random() * 192123) % 100);

            for (int m = 0 ; m < randomValue ; m ++){

                DivideStudentInfo s = new DivideStudentInfo();
                s.setScore(Math.random() * 1000);
                s.setWlScore(Math.random() * 100);
//                s.setComposeId(key);
                if (m %3 == 1) {
                    s.setSex(0);
                }else {
                    s.setSex(1);
                }
                s.setStudentCode(key + "-" + m);



                studentInfos.add(s);
            }

//            break;
        }

        task.setMaxNumber(50);


        List<NewDivideDetailRsDto> sss = NewDivideClass.start(task, list);

        int ssss=0;
    }
}
