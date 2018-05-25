package cn.tchenedu.saas.compute;


import cn.tchenedu.saas.dto.DivideClassDataDetail;
import cn.tchenedu.saas.dto.DivideClassInfoDto;
import cn.tchenedu.saas.dto.DivideResultInfo;
import cn.tchenedu.saas.dto.DivideStudentInfo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ckzhang on 2017/9/23.
 */
public class Compute {

    /**
     * 行政班分班算法
     *
     * 此方法支持  成绩均分/男女比例均等
     *
     * @param admClasses
     * @param maleStudents
     * @param fmaleStudents
     * @return
     * @throws Exception
     */
    public static List<DivideResultInfo> admDivide(List<DivideClassDataDetail> admClasses,
                                                   Map<Integer,List<DivideStudentInfo>> maleStudents,
                                                   Map<Integer, List<DivideStudentInfo>> fmaleStudents)
            throws Exception {


        Map<String, DivideResultInfo> admDivideResults = new HashMap<>();

        Map<Integer, List<DivideClassInfoDto>> admLevelClassesMap = new HashMap<>();


        for (DivideClassDataDetail levelClasses : admClasses) {
            int maxStudent = 0;
            int level = levelClasses.getLevel();
            int studentNums = maleStudents.get(level).size() + fmaleStudents.get(level).size();

            List<DivideClassInfoDto> divideClassInfos = levelClasses.getClasses();

            List<DivideClassInfoDto> classLevelItem = admLevelClassesMap.getOrDefault(level, new ArrayList<>());

            for (DivideClassInfoDto item : divideClassInfos) {
                maxStudent = maxStudent + item.getMaxStudent();
                classLevelItem.add(item);
            }

            if (maxStudent < studentNums) {
                throw new Exception("Level :" + level + " \t class max student num < current student num, class max student:" + maleStudents + "current student num:" + studentNums);
            }

            // 按可分配人数排序
            classLevelItem.sort(new DivideClassInfoComparate());
            admLevelClassesMap.put(level, classLevelItem);
        }

        // 分层分班
        for (int key : admLevelClassesMap.keySet()) {
            List<DivideClassInfoDto> divideClassInfos = new ArrayList<>();
            divideClassInfos.addAll(admLevelClassesMap.get(key));

            // 初始化本次男女学生的成绩排名
            List<DivideStudentInfo> fenMaleStudents = new ArrayList<>();
            fenMaleStudents.addAll(maleStudents.get(key));

            List<DivideStudentInfo> fenFmaleStudents = new ArrayList<>();
            fenFmaleStudents.addAll(fmaleStudents.get(key));

            for (DivideStudentInfo item : fenFmaleStudents){
                item.setCompareScore(item.getScore());
            }
            for (DivideStudentInfo item : fenMaleStudents){
                item.setCompareScore(item.getScore());
            }


            fenFmaleStudents.sort(new DescStudentInfoComparate());
            fenMaleStudents.sort(new DescStudentInfoComparate());

            int maxComputeCount = divideClassInfos.size();

            for (int computeCount = 0 ; computeCount < maxComputeCount; computeCount++){

                List<DivideClassInfoDto> computeClassInfo = divideClassInfos.subList(computeCount,maxComputeCount);
                int classNum = computeClassInfo.size();

                if (computeClassInfo.get(0).getMaxStudent() < 2){
                    continue;
                }

                int reduceNum = computeClassInfo.get(0).getMaxStudent();
                reduceNum = reduceNum % 2 == 0 ? reduceNum : reduceNum -1;

                int fmaleStCount = fenFmaleStudents.size();
                int maleStCount = fenMaleStudents.size();
                int allStCount = fmaleStCount + maleStCount;
                // 女同学分配数量计算  向下取整
                int maleStudentNumber = (int)(maleStCount * reduceNum / allStCount);
                int fmaleStudentNumber = reduceNum - maleStudentNumber > 0 ? reduceNum - maleStudentNumber : 0;

                // 计算男女分配比例
                while (true) {
                    if ( fmaleStCount < fmaleStudentNumber * classNum) {
                        reduceNum--;
                        fmaleStudentNumber = reduceNum - maleStudentNumber > 0 ? reduceNum - maleStudentNumber : 0;
                    } else {
                        break;
                    }
                }

                List<List<DivideStudentInfo>> fenMaleStudentsRs = new ArrayList<>();
                int currentLength = 0;
                if (maleStudentNumber > 0) {
                    // 男同学分配
                    fenMaleStudentsRs = DivideStudent2Class.fen(classNum, maleStudentNumber, fenMaleStudents);

                    // 此处需要将已经分过版的学生删除掉
                    for (List<DivideStudentInfo> reItem : fenMaleStudentsRs){
                        fenMaleStudents.removeAll(reItem);
                    }
//                    currentLength = fenMaleStudents.size();
//                    if (maleStudentNumber / 2 >= 1) {
//                        int midIndex = classNum * maleStudentNumber;
//                        fenMaleStudents = fenMaleStudents.subList(midIndex / 2, currentLength - midIndex / 2);
//                    }
//                    if (maleStudentNumber % 2 == 1) {
//                        int halfDescSort = fenMaleStudents.size() / 2;
//                        int startIndex = halfDescSort - classNum / 2;
//                        startIndex = startIndex > 0 ? startIndex : 0;
//                        int endIndex = startIndex + classNum;
//
//                        List<DivideStudentInfo> preTemp = fenMaleStudents.subList(0, startIndex);
//                        List<DivideStudentInfo> tailTemp = fenMaleStudents.subList(endIndex, fenMaleStudents.size());
//                        fenMaleStudents = new ArrayList<>();
//                        fenMaleStudents.addAll(preTemp);
//                        fenMaleStudents.addAll(tailTemp);
//
//                    }
                }

                List<List<DivideStudentInfo>> fenFmaleStudentsRs = new ArrayList<>();
                if (fmaleStudentNumber > 0) {
                    // 女同学分配
                    fenFmaleStudentsRs = DivideStudent2Class.fen(classNum, fmaleStudentNumber, fenFmaleStudents);

                    // 此处需要将已经分过版的学生删除掉
                    for (List<DivideStudentInfo> reItem : fenFmaleStudentsRs){
                        fenFmaleStudents.removeAll(reItem);
                    }

//                    currentLength = fenFmaleStudents.size();
//                    if (fmaleStudentNumber / 2 >= 1) {
//                        int midIndex = classNum * fmaleStudentNumber;
//                        fenFmaleStudents = fenFmaleStudents.subList(midIndex / 2, currentLength - midIndex / 2);
//                    }
//                    if (fmaleStudentNumber % 2 == 1) {
//                        int halfDescSort = fenFmaleStudents.size() / 2;
//                        int startIndex = halfDescSort - classNum / 2;
//                        startIndex = startIndex > 0 ? startIndex : 0;
//                        int endIndex = startIndex + classNum;
//
//                        List<DivideStudentInfo> preTemp = fenFmaleStudents.subList(0, startIndex);
//                        List<DivideStudentInfo> tailTemp = fenFmaleStudents.subList(endIndex, fenFmaleStudents.size());
//                        fenFmaleStudents = new ArrayList<>();
//                        fenFmaleStudents.addAll(preTemp);
//                        fenFmaleStudents.addAll(tailTemp);
//
//                    }
                }


                int i = 0;
                for(DivideClassInfoDto itemClass : computeClassInfo){
                        DivideResultInfo resultItem = admDivideResults.getOrDefault(itemClass.getClassCode(), new DivideResultInfo());

                        // 按照班级减去已分配学生数
                        itemClass.setMaxStudent(itemClass.getMaxStudent() - reduceNum);


                        resultItem.setClassCode(itemClass.getClassCode());
                        resultItem.setMaxStudent(itemClass.getMaxStudent());

                        List<DivideStudentInfo> rsStudents = resultItem.getStudents() == null ? new ArrayList<>() : resultItem.getStudents();

                        if(fenMaleStudentsRs.size() > 0) {
                            rsStudents.addAll(fenMaleStudentsRs.get(i));
                        }
                        if (fenFmaleStudentsRs.size() > 0) {
                            rsStudents.addAll(fenFmaleStudentsRs.get(i));
                        }

                        resultItem.setStudents(rsStudents);

                        i++;

                        resultItem.setFemale(resultItem.getFemale() + fmaleStudentNumber);
                        resultItem.setMale(resultItem.getMale() + maleStudentNumber);

                        admDivideResults.put(itemClass.getClassCode(), resultItem);

                }

            }

            for (String keyItem : admDivideResults.keySet()){
                DivideResultInfo classInfo = admDivideResults.get(keyItem);
                if (classInfo.getMaxStudent() != 0){

                    int maxStudent = classInfo.getMaxStudent();
                    for (int i = 0 ; i < maxStudent; i++) {

                        if (i%2 == 0) {
                            if (fenMaleStudents.size() > 0) {
                                classInfo.getStudents().add(fenMaleStudents.get(0));
                                classInfo.setMale(classInfo.getMale() + 1);
                                classInfo.setMaxStudent(classInfo.getMaxStudent() - 1);

                                fenMaleStudents.remove(0);
                            } else if (fenFmaleStudents.size() > 0){
                                classInfo.getStudents().add(fenFmaleStudents.get(0));
                                classInfo.setFemale(classInfo.getFemale() + 1);
                                classInfo.setMaxStudent(classInfo.getMaxStudent() - 1);

                                fenFmaleStudents.remove(0);
                            }
                        } else {
                            if (fenFmaleStudents.size() > 0){
                                classInfo.getStudents().add(fenFmaleStudents.get(0));
                                classInfo.setFemale(classInfo.getFemale() + 1);
                                classInfo.setMaxStudent(classInfo.getMaxStudent() - 1);

                                fenFmaleStudents.remove(0);
                            } else if (fenMaleStudents.size() > 0) {
                                classInfo.getStudents().add(fenMaleStudents.get(0));
                                classInfo.setMale(classInfo.getMale() + 1);
                                classInfo.setMaxStudent(classInfo.getMaxStudent() - 1);

                                fenMaleStudents.remove(0);
                            }
                        }

                    }

                }

            }

        }


        for (String keyItem : admDivideResults.keySet()){
            DivideResultInfo classInfo = admDivideResults.get(keyItem);

            double sumScore = 0;
            for (DivideStudentInfo item: classInfo.getStudents()){
                sumScore = sumScore + item.getCompareScore();
            }
            classInfo.setAverageScore(sumScore/classInfo.getStudents().size());

        }

        List<DivideResultInfo> results = new ArrayList<>();
        results.addAll(admDivideResults.values());

        return results;

    }


    /**
     * 行政班分班算法,此方法只支持成绩均分
     * 支持分层处理
     *
     * @param admClasses
     * @param allStudents
     * @return
     * @throws Exception
     */
    public static List<DivideResultInfo> admDivide(List<DivideClassDataDetail> admClasses,Map<Integer,
            List<DivideStudentInfo>> allStudents) throws Exception {


        Map<String, DivideResultInfo> admDivideResults = new HashMap<>();

        Map<Integer, List<DivideClassInfoDto>> admLevelClassesMap = new HashMap<>();


        for (DivideClassDataDetail levelClasses : admClasses) {
            int maxStudent = 0;
            int level = levelClasses.getLevel();
            int studentNums = allStudents.get(level).size();

            List<DivideClassInfoDto> divideClassInfos = levelClasses.getClasses();

            List<DivideClassInfoDto> classLevelItem = admLevelClassesMap.getOrDefault(level, new ArrayList<>());

            for (DivideClassInfoDto item : divideClassInfos) {
                maxStudent = maxStudent + item.getMaxStudent();
                classLevelItem.add(item);
            }

            if (maxStudent < studentNums) {
                throw new Exception("Level :" + level + " \t class max student num < current student num, class max student:" + maxStudent + "current student num:" + studentNums);
            }

            // 按可分配人数排序
            classLevelItem.sort(new DivideClassInfoComparate());
            admLevelClassesMap.put(level, classLevelItem);
        }

        // 分层分班
        for (int key : admLevelClassesMap.keySet()) {
            List<DivideClassInfoDto> divideClassInfos = new ArrayList<>();
            divideClassInfos.addAll(admLevelClassesMap.get(key));

            // 初始化本次学生的成绩排名
            List<DivideStudentInfo> fenAllStudents = new ArrayList<>();
            fenAllStudents.addAll(allStudents.get(key));

            for (DivideStudentInfo item : fenAllStudents){
                item.setCompareScore(item.getScore());
            }


            fenAllStudents.sort(new DescStudentInfoComparate());

            int maxComputeCount = divideClassInfos.size();

            for (int computeCount = 0 ; computeCount < maxComputeCount; computeCount++){

                List<DivideClassInfoDto> computeClassInfo = divideClassInfos.subList(computeCount,maxComputeCount);
                int classNum = computeClassInfo.size();

                if (computeClassInfo.get(0).getMaxStudent() < 2){
                    continue;
                }

                int reduceNum = computeClassInfo.get(0).getMaxStudent();
                reduceNum = reduceNum % 2 == 0 ? reduceNum : reduceNum -1;


                // 学生分配
                List<List<DivideStudentInfo>> fenAllStudentsRs = DivideStudent2Class.fen(classNum,reduceNum,fenAllStudents);

                // 此处需要将已经分过版的学生删除掉
                int currentLength = fenAllStudents.size();
                fenAllStudents = fenAllStudents.subList(classNum * reduceNum / 2, currentLength - classNum * reduceNum / 2);



                int i = 0;
                for(DivideClassInfoDto itemClass : computeClassInfo){

                    DivideResultInfo resultItem = admDivideResults.getOrDefault(itemClass.getClassCode(), new DivideResultInfo());

                    // 按照班级减去已分配学生数
                    itemClass.setMaxStudent(itemClass.getMaxStudent() - reduceNum);


                    resultItem.setClassCode(itemClass.getClassCode());
                    resultItem.setMaxStudent(itemClass.getMaxStudent());

                    List<DivideStudentInfo> rsStudents = resultItem.getStudents() == null ? new ArrayList<>() : resultItem.getStudents();

                    rsStudents.addAll(fenAllStudentsRs.get(i));

                    resultItem.setStudents(rsStudents);

                    i++;

                    admDivideResults.put(itemClass.getClassCode(), resultItem);

                }

            }

            for (String keyItem : admDivideResults.keySet()){
                DivideResultInfo classInfo = admDivideResults.get(keyItem);
                if (classInfo.getMaxStudent() != 0){

                    int maxStudent = classInfo.getMaxStudent();
                    for (int i = 0 ; i < maxStudent; i++) {
                        if (fenAllStudents.size() > 0) {
                            classInfo.getStudents().add(fenAllStudents.get(0));
                            classInfo.setMale(classInfo.getMale() + 1);
                            classInfo.setMaxStudent(classInfo.getMaxStudent() - 1);

                            fenAllStudents.remove(0);
                        }

                    }

                }

            }

        }


        for (String keyItem : admDivideResults.keySet()){
            DivideResultInfo classInfo = admDivideResults.get(keyItem);

            double sumScore = 0;
            for (DivideStudentInfo item: classInfo.getStudents()){
                sumScore = sumScore + item.getCompareScore();

                if (item.getSex() == 0){
                    classInfo.setFemale(classInfo.getFemale() + 1);
                } else {
                    classInfo.setMale(classInfo.getMale() + 1);
                }
            }
            classInfo.setAverageScore(sumScore/classInfo.getStudents().size());

        }

        List<DivideResultInfo> results = new ArrayList<>();
        results.addAll(admDivideResults.values());

        return results;

    }
}
