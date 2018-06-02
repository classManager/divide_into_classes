package cn.tchenedu.saas.compute;


import cn.tchenedu.saas.compute.deduction.customize.DeductionCompute;
import cn.tchenedu.saas.compute.deduction.customize.dto.ClassDeduction;
import cn.tchenedu.saas.compute.deduction.customize.dto.StepResponseDto;
import cn.tchenedu.saas.compute.deduction.customize.utils.SubjectMap;
import cn.tchenedu.saas.compute.deduction.dto.DeductionComposeInfoDto;
import cn.tchenedu.saas.dto.*;
import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ckzhang on 2017/9/23.
 */
public class NewCompute {



    public static NewDivideDetailRsDto divideAllClass(List<DivideStudentInfo> maleStudents,
                                                   List<DivideStudentInfo> fmaleStudents,
                                                   int maxNumber) throws Exception {

        DivideDetailRsDto rsDto = new DivideDetailRsDto();

        //所有男生选择的组合人数
        Map<String,List<DivideStudentInfo>> mailComposeNumber = new HashMap<>();
        //所有女生选择的组合人数
        Map<String,List<DivideStudentInfo>> fmailComposeNumber = new HashMap<>();

        //所有组合id
        Map<String,String> composeDump = new HashMap<>();


        //男生
        for (DivideStudentInfo item : maleStudents){

            List<DivideStudentInfo> divideStudentInfoList = mailComposeNumber.get(item.getComposeId());
            if (divideStudentInfoList == null){
                divideStudentInfoList = new ArrayList<>();
                divideStudentInfoList.add(item);
                mailComposeNumber.put(item.getComposeId(), divideStudentInfoList);
            } else {
                divideStudentInfoList.add(item);
            }

            composeDump.put(item.getComposeId(),item.getComposeId());
        }

        //女生
        for (DivideStudentInfo item : fmaleStudents){

            List<DivideStudentInfo> divideStudentInfoList = fmailComposeNumber.get(item.getComposeId());
            if (divideStudentInfoList == null){
                divideStudentInfoList = new ArrayList<>();
                divideStudentInfoList.add(item);
                fmailComposeNumber.put(item.getComposeId(), divideStudentInfoList);
            } else {
                divideStudentInfoList.add(item);
            }
            composeDump.put(item.getComposeId(),item.getComposeId());
        }

        //把选择同一个组合的男女生总数统计下
        List<DeductionComposeInfoDto> composeChooses = new ArrayList<>();
        for (String key : composeDump.keySet()){

            DeductionComposeInfoDto dto = new DeductionComposeInfoDto();
            dto.setComposeId(key);

            Integer mNumber = mailComposeNumber.get(key) != null ? mailComposeNumber.get(key).size() : 0;
            Integer fmNumber = fmailComposeNumber.get(key) != null ? fmailComposeNumber.get(key).size() : 0;
            //选择同一个组合的男生和女生人数
            dto.setChooseNumber(mNumber + fmNumber);

            composeChooses.add(dto);
        }



        DeductionCompute compute = new DeductionCompute();
        //分为多少班，每个班级的人数已经定好
        StepResponseDto response = compute.computeDetail(composeChooses, maxNumber);

        List<ClassDeduction> xzClasses = response.getXzClass();


        List<DivideResultInfo> rs = new ArrayList<>();

        for (String key : composeDump.keySet()) {

            List<DivideStudentInfo> fenMaleStudents = mailComposeNumber.get(key);
            List<DivideStudentInfo> fenFmaleStudents = fmailComposeNumber.get(key);

            fenMaleStudents = fenMaleStudents == null ? new ArrayList<>() : fenMaleStudents;

            fenFmaleStudents = fenFmaleStudents == null ? new ArrayList<>() : fenFmaleStudents;

            List<ClassDeduction> computeClass = new ArrayList<>();

            int keyValue = SubjectMap.COMPOSE_WEIGHT_MAP.get(key);

            for (ClassDeduction cItem : xzClasses) {

                if (cItem.getClassCompose().get(keyValue) != null) {
                    computeClass.add(cItem);
                }

            }


            // 计算的班级拿到了,计算的男女学生列表拿到了
            // 开始计算
            List<DivideClassInfoDto> admClasses = new ArrayList<>();

            int counter = 1;

            for (ClassDeduction cItem : computeClass){
                DivideClassInfoDto dtoItem = new DivideClassInfoDto();
                dtoItem.setClassCode(keyValue + "-" + cItem.getClassCompose().get(keyValue) + "#" + counter);
                dtoItem.setMaxStudent(cItem.getClassCompose().get(keyValue));
                dtoItem.setSeqNumber(counter);

                admClasses.add(dtoItem);

                counter ++ ;
            }

            admClasses.sort(new DescClassMumbersComparate());

            rs.addAll(divideClass(admClasses,fenMaleStudents,fenFmaleStudents));

        }


        List<DivideClassInfoDto> divideClassInfoDtos = new ArrayList<>();

        Map<String, List<DivideResultInfo>> dumpMap = new HashMap<>();
        for (DivideResultInfo item : rs){

            String key = item.getClassCode().split("#")[0];
            List<DivideResultInfo> itemList = dumpMap.get(key);
            if (itemList == null){
                itemList = new ArrayList<>();
                itemList.add(item);
                dumpMap.put(key,itemList);
            } else {
                itemList.add(item);
            }
        }



        // 操作 rs结果集与 xzClasses 结果集得到具体行政班人员划分---处理行政班级
        Map<String, List<DivideResultInfo>> xzMap = new HashMap<>();


        for (String key : dumpMap.keySet()){

            List<DivideResultInfo> temps = new ArrayList<>();
            temps.addAll(dumpMap.get(key));
            xzMap.put(key,temps);
        }

        for (int i = 0 ; i < xzClasses.size() ; i++){
            ClassDeduction item = xzClasses.get(i);

            DivideClassInfoDto iDto = new DivideClassInfoDto();
            iDto.setSeqNumber(i + 1);
            iDto.setMaxStudent(item.getStudentNumber());
            iDto.setClassCode(i + "1");

            String composeId="";
            for (Map.Entry<String, Integer> entry : SubjectMap.COMPOSE_WEIGHT_MAP.entrySet()) {
                for (Integer composeKey : item.getClassCompose().keySet()) {
                    if (composeKey == (entry.getValue())) {
                        if (StringUtils.isBlank(composeId)) {
                            composeId = entry.getKey();
                        }else {
                            composeId += "," + entry.getKey();
                        }
                    }
                }
            }
            iDto.setSubjectId(composeId);

            List<String> keys = new ArrayList();
            for (int keyValue : item.getClassCompose().keySet()){
                keys.add(keyValue + "-" + item.getClassCompose().get(keyValue));
            }

            for (String key : keys){
                List<DivideResultInfo> listItem = xzMap.get(key);
                DivideResultInfo iItem = listItem.get(0);
                listItem.remove(iItem);
                iDto.getSutdents().addAll(iItem.getStudents());
            }

            divideClassInfoDtos.add(iDto);

        }


        // 操作 rs结果集与 选考班结果集得到具体行政班人员划分---处理选考班级
        for (int key : response.getXkClassComposeList().keySet()){

            Map<String, List<DivideResultInfo>> xkMap = new HashMap<>();
            for (String keyTemp : dumpMap.keySet()){

                List<DivideResultInfo> temps = new ArrayList<>();
                temps.addAll(dumpMap.get(keyTemp));
                xkMap.put(keyTemp,temps);
            }

            List<DivideClassInfoDto> itemClasses = new ArrayList<>();

            List<ClassDeduction> classDeductions = response.getXkClassComposeList().get(key);


            String className = SubjectMap.SUBJECT_MAP.get(key);

            int i = 0;
            for (ClassDeduction cItem : classDeductions){
                if (cItem.getClassComposeStatus() == 1){
                    continue;
                }
                List<String> keys = new ArrayList();
                for (int keyValue : cItem.getClassCompose().keySet()){
                    keys.add(keyValue + "-" + cItem.getClassCompose().get(keyValue));
                }

                DivideClassInfoDto iDto = new DivideClassInfoDto();
                iDto.setSeqNumber(i + 1);
                iDto.setMaxStudent(cItem.getStudentNumber());
                iDto.setClassCode(i + "1");

                for (String keyItem : keys){
                    List<DivideResultInfo> listItem = xkMap.get(keyItem);

                    DivideResultInfo iItem = listItem.get(0);
                    listItem.remove(iItem);

                    iDto.getSutdents().addAll(iItem.getStudents());
                }

                itemClasses.add(iDto);

                i++;
            }

            if (rsDto.getXkClass().get(className) == null ){
                rsDto.getXkClass().put(className, itemClasses);
            } else {
                rsDto.getXkClass().get(className).addAll(itemClasses);
            }


        }

        // 操作 rs结果集与 选考班结果集得到具体行政班人员划分---处理学考班级
        for (int key : response.getXuekClassComposeList().keySet()){

            Map<String, List<DivideResultInfo>> xkMap = new HashMap<>();
            for (String keyTemp : dumpMap.keySet()){

                List<DivideResultInfo> temps = new ArrayList<>();
                temps.addAll(dumpMap.get(keyTemp));
                xkMap.put(keyTemp,temps);
            }

            List<DivideClassInfoDto> itemClasses = new ArrayList<>();

            List<ClassDeduction> classDeductions = response.getXuekClassComposeList().get(key);


            String className = SubjectMap.SUBJECT_MAP.get(key);

            int i = 0;
            for (ClassDeduction cItem : classDeductions){
                if (cItem.getClassComposeStatus() == 1){
                    continue;
                }
                List<String> keys = new ArrayList();
                for (int keyValue : cItem.getClassCompose().keySet()){
                    keys.add(keyValue + "-" + cItem.getClassCompose().get(keyValue));
                }

                DivideClassInfoDto iDto = new DivideClassInfoDto();
                iDto.setSeqNumber(i + 1);
                iDto.setMaxStudent(cItem.getStudentNumber());
                iDto.setClassCode(i + "1");

                for (String keyItem : keys){
                    List<DivideResultInfo> listItem = xkMap.get(keyItem);

                    DivideResultInfo iItem = listItem.get(0);
                    listItem.remove(iItem);

                    iDto.getSutdents().addAll(iItem.getStudents());
                }

                itemClasses.add(iDto);

                i++;
            }

            if (rsDto.getXuekClass().get(className) == null ){
                rsDto.getXuekClass().put(className, itemClasses);
            } else {
                rsDto.getXuekClass().get(className).addAll(itemClasses);
            }


        }


        rsDto.setXzClass(divideClassInfoDtos);


        return average(rsDto);
    }



    private static NewDivideDetailRsDto average(DivideDetailRsDto rsDto){

        NewDivideDetailRsDto dto = new NewDivideDetailRsDto();

        for (DivideClassInfoDto item : rsDto.getXzClass()){

            int mailNumber = 0;
            int fmailNumber = 0;
            double score = 0.0;

            for (DivideStudentInfo i : item.getSutdents()){

                if (i.getSex() == 0 ){
                    fmailNumber++;
                } else {
                    mailNumber++;
                }
                score = score + i.getScore();
            }

            DivideResultInfo copyI = new DivideResultInfo();
            copyI.setAverageScore(score / item.getSutdents().size());
            copyI.setStudents(item.getSutdents());
            copyI.setFemale(fmailNumber);
            copyI.setMale(mailNumber);
            copyI.setSeqNumber(item.getSeqNumber());
            copyI.setMaxStudent(item.getMaxStudent());
            copyI.setSubjectId(item.getSubjectId());

            dto.getXzClass().add(copyI);

        }

        if (rsDto.getXzClass().get(0).getSutdents().get(0).getComposeId() != "No") {
            for (String key : rsDto.getXkClass().keySet()) {

                List<DivideResultInfo> cs = new ArrayList<>();

                for (DivideClassInfoDto item : rsDto.getXkClass().get(key)) {

                    int mailNumber = 0;
                    int fmailNumber = 0;
                    double score = 0.0;

                    for (DivideStudentInfo i : item.getSutdents()) {

                        if (i.getSex() == 0) {
                            fmailNumber++;
                        } else {
                            mailNumber++;
                        }
                        score = score + getScore(i, key);
                    }

                    DivideResultInfo copyI = new DivideResultInfo();
                    copyI.setAverageScore(score / item.getSutdents().size());
                    copyI.setStudents(item.getSutdents());
                    copyI.setFemale(fmailNumber);
                    copyI.setMale(mailNumber);
                    copyI.setSeqNumber(item.getSeqNumber());
                    copyI.setMaxStudent(item.getMaxStudent());
                    copyI.setSubjectId(item.getSubjectId());

                    cs.add(copyI);
                }

                dto.getXkClass().put(key, cs);
            }

            for (String key : rsDto.getXuekClass().keySet()) {

                List<DivideResultInfo> cs = new ArrayList<>();

                for (DivideClassInfoDto item : rsDto.getXuekClass().get(key)) {

                    int mailNumber = 0;
                    int fmailNumber = 0;
                    double score = 0.0;

                    for (DivideStudentInfo i : item.getSutdents()) {

                        if (i.getSex() == 0) {
                            fmailNumber++;
                        } else {
                            mailNumber++;
                        }
                        score = score + getScore(i, key);
                    }

                    DivideResultInfo copyI = new DivideResultInfo();
                    copyI.setAverageScore(score / item.getSutdents().size());
                    copyI.setStudents(item.getSutdents());
                    copyI.setFemale(fmailNumber);
                    copyI.setMale(mailNumber);
                    copyI.setSeqNumber(item.getSeqNumber());
                    copyI.setMaxStudent(item.getMaxStudent());
                    copyI.setSubjectId(item.getSubjectId());

                    cs.add(copyI);
                }

                dto.getXuekClass().put(key, cs);
            }

        }

        return dto;

    }


    private static double getScore(DivideStudentInfo s, String key){

        switch(SubjectMap.SUBJECT_WEIGHT_MAP.get(key)){
            case 1 << 6:
                return s.getWlScore();
            case 1 << 5:
                return s.getHxScore();
            case 1 << 4:
                return s.getSwScore();
            case 1 << 3:
                return s.getZzScore();
            case 1 << 2:
                return s.getDlScore();
            case 1 << 1:
                return s.getLsScore();
            case 1 << 0:
                return s.getJsScore();
            default: return 0;
        }
    }

    public static DivideDetailRsDto divideAllClass(List<DivideStudentInfo> allStudents,int maxNumber){

        return null;
    }

    /**
     * 行政班分班算法
     *
     * 此方法支持  成绩均分/男女比例均等
     *
     * @param admClasses
     * @param mStudents
     * @param fStudents
     * @return
     * @throws Exception
     */
    public static List<DivideResultInfo> divideClass(List<DivideClassInfoDto> admClasses,
                                                   List<DivideStudentInfo> mStudents,
                                                   List<DivideStudentInfo> fStudents)
            throws Exception {


        Map<String, DivideResultInfo> admDivideResults = new HashMap<>();

        List<DivideStudentInfo> maleStudents = new ArrayList<>();
        List<DivideStudentInfo> fmaleStudents = new ArrayList<>();

        maleStudents.addAll(mStudents);
        fmaleStudents.addAll(fStudents);

        List<DivideClassInfoDto> divideClassInfos = new ArrayList<>();
        divideClassInfos.addAll(admClasses);

        // 初始化本次男女学生的成绩排名
        List<DivideStudentInfo> fenMaleStudents = new ArrayList<>();
        fenMaleStudents.addAll(maleStudents);

        List<DivideStudentInfo> fenFmaleStudents = new ArrayList<>();
        fenFmaleStudents.addAll(fmaleStudents);

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

            if (computeClassInfo.get(0).getMaxStudent() == 0){
                continue;
            }

            int reduceNum = computeClassInfo.get(0).getMaxStudent();
            reduceNum = reduceNum % 2 == 0 ? reduceNum : reduceNum -1;

            int fmaleStCount = fenFmaleStudents.size();
            int maleStCount = fenMaleStudents.size();
            int allStCount = fmaleStCount + maleStCount;

            if (allStCount == 0){
                continue;
            }
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
            }

            List<List<DivideStudentInfo>> fenFmaleStudentsRs = new ArrayList<>();
            if (fmaleStudentNumber > 0) {
                // 女同学分配
                fenFmaleStudentsRs = DivideStudent2Class.fen(classNum, fmaleStudentNumber, fenFmaleStudents);

                // 此处需要将已经分过版的学生删除掉
                for (List<DivideStudentInfo> reItem : fenFmaleStudentsRs){
                    fenFmaleStudents.removeAll(reItem);
                }
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




        for (String keyItem : admDivideResults.keySet()){
            DivideResultInfo classInfo = admDivideResults.get(keyItem);

            double sumScore = 0;
            for (DivideStudentInfo item: classInfo.getStudents()){
                sumScore = sumScore + item.getCompareScore();
            }
            classInfo.setAverageScore(sumScore/classInfo.getStudents().size());

        }

        List<DivideResultInfo> rs = new ArrayList<>();
        rs.addAll(admDivideResults.values());

        return rs;

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
