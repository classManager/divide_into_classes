package cn.tchenedu.saas.compute;

import cn.tchenedu.saas.dto.DivideStudentInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ckzhang on 2017/9/26.
 */
public class DivideStudent2Class {

    /**
     *
     * 学生分班算法核心,直接从学生中进行分配
     * 采用 蛇形分配  一个低分学生一个高分学生
     *
     * @param classNum
     * @param studentNum
     * @param descSort
     * @return
     */
    public static List<List<DivideStudentInfo>> fen(int classNum, int studentNum, List<DivideStudentInfo> descSort){

        if(studentNum == 0){
            return new ArrayList<>();
        }

        List<List<DivideStudentInfo>> back = new ArrayList<>();

        int halfStudentNum = studentNum / 2;

        List<DivideStudentInfo> descScoreList = descSort.subList(0, classNum * halfStudentNum);
        List<DivideStudentInfo> ascScoreList = descSort.subList(descSort.size() - classNum * halfStudentNum, descSort.size());
        ascScoreList.sort(new AscDivideStudentInfoComparate());

        for (int i = 0; i < classNum ; i ++){

            List<DivideStudentInfo> classItem = new ArrayList<>();
            back.add(classItem);

            int index1 = 2 * classNum - 1 - i * 2;
            int index2 = 2 * classNum - index1;


            int an = i;

            for (int k = 0 ; k < halfStudentNum; k ++){
                if (k != 0) {
                    int addValue = k % 2 == 0 ? index2 : index1;
                    an = an + addValue;
                } else {
                    an = i + 1;
                }
                System.out.println(an);
                classItem.add(descScoreList.get(an-1));
                classItem.add(ascScoreList.get(an-1));

            }


        }

        if (studentNum %2 == 1){

            int start2Index = descSort.size() / 2  - classNum / 2;

            int indexK = start2Index > 0 ? start2Index : 0;
            for (List<DivideStudentInfo> classItem : back){
                classItem.add(descSort.get(indexK));
                indexK ++;
            }

        }

        return back;

    }
}
