package com.baidu.dao.compute.deduction.customize;

import com.baidu.dao.compute.deduction.IDeductionCompute;
import com.baidu.dao.compute.deduction.customize.utils.ComposeClassComputeSort;
import com.baidu.dao.compute.deduction.customize.utils.CustomizeWeight;
import com.baidu.dao.compute.deduction.dto.*;
import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lt on 2018/05/21.
 */
public class CustomizeDeductionCompute implements IDeductionCompute {



    public static void main(String[] aaa){
        CustomizeDeductionCompute a = new CustomizeDeductionCompute();

        DeductionRequestDto request = new DeductionRequestDto();
        request.setClassMaxNumber(50);

        List<DeductionLevelInfoDto> levelInfos = new ArrayList<>();

        DeductionLevelInfoDto levelInfoDto = new DeductionLevelInfoDto();
        levelInfoDto.setLevel("A");


        // 测试
        List<DeductionComposeInfoDto> deductionComposeInfoDtos = new ArrayList<>();

        for (String key : CustomizeWeight.COMPOSE_WEIGHT_MAP.keySet()){
            DeductionComposeInfoDto dto = new DeductionComposeInfoDto();
            dto.setComposeId(key);
            dto.setChooseNumber((int)(Math.random() * 188) % 100);

            deductionComposeInfoDtos.add(dto);
        }

        levelInfoDto.setComposes(deductionComposeInfoDtos);

        levelInfos.add(levelInfoDto);

        request.setLevelInfos(levelInfos);


        request = JSON.parseObject("{\n" +
                "    \"classMaxNumber\": 80,\n" +
                "    \"levelInfos\": [\n" +
                "        {\n" +
                "            \"composes\": [\n" +
                "                {\n" +
                "                    \"chooseNumber\": 12,\n" +
                "                    \"composeId\": \"2235714\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"chooseNumber\": 21,\n" +
                "                    \"composeId\": \"2304761\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"chooseNumber\": 10,\n" +
                "                    \"composeId\": \"2325862\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"chooseNumber\": 17,\n" +
                "                    \"composeId\": \"2363152\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"chooseNumber\": 16,\n" +
                "                    \"composeId\": \"2453317\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"chooseNumber\": 17,\n" +
                "                    \"composeId\": \"2472854\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"chooseNumber\": 11,\n" +
                "                    \"composeId\": \"2580755\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"chooseNumber\": 16,\n" +
                "                    \"composeId\": \"2618045\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"level\": \"A\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"composes\": [\n" +
                "                {\n" +
                "                    \"chooseNumber\": 7,\n" +
                "                    \"composeId\": \"2235714\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"chooseNumber\": 11,\n" +
                "                    \"composeId\": \"2304761\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"chooseNumber\": 10,\n" +
                "                    \"composeId\": \"2325862\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"chooseNumber\": 14,\n" +
                "                    \"composeId\": \"2363152\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"chooseNumber\": 7,\n" +
                "                    \"composeId\": \"2453317\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"chooseNumber\": 8,\n" +
                "                    \"composeId\": \"2472854\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"chooseNumber\": 9,\n" +
                "                    \"composeId\": \"2580755\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"chooseNumber\": 11,\n" +
                "                    \"composeId\": \"2618045\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"level\": \"B\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"composes\": [\n" +
                "                {\n" +
                "                    \"chooseNumber\": 1,\n" +
                "                    \"composeId\": \"2304761\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"chooseNumber\": 2,\n" +
                "                    \"composeId\": \"2325862\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"level\": \"C\"\n" +
                "        }\n" +
                "    ]\n" +
                "}",DeductionRequestDto.class);

        a.compute(request);

    }

    @Override
    public DeductionResponseDto compute(DeductionRequestDto request) {

        int maxNumber = request.getClassMaxNumber();

        DeductionResponseDto response = new DeductionResponseDto();
        List<DeductionLevelRsDto> levelRs = new ArrayList<>();
        response.setLevelRs(levelRs);

        List<DeductionLevelInfoDto> levelInfos = request.getLevelInfos();

        for (DeductionLevelInfoDto item : levelInfos) {

            DeductionLevelRsDto levelRsDto = new DeductionLevelRsDto();
            levelRsDto.setLevel(item.getLevel());

            // 剩余零散人员信息集合
            Map<String,Integer> computeCompose = new HashMap<>();

            // 剩余零散人员信息集合
            List<DeductionComposeInfoDto> computeComposeList = new ArrayList<>();

            int studentNumber = 0;

            for (DeductionComposeInfoDto itemDuctionInfo : item.getComposes()) {

                studentNumber = studentNumber + itemDuctionInfo.getChooseNumber();

                // 计算人数大于最大班级人数的分班推算
                if (itemDuctionInfo.getChooseNumber() / maxNumber >= 1){
                    int classNumber = itemDuctionInfo.getChooseNumber() / maxNumber;

                    // 计算行政班班级数量
//                    levelRsDto.setXzbanNumber(levelRsDto.getXzbanNumber() + classNumber);


                    int customizeWeightValue = CustomizeWeight.COMPOSE_WEIGHT_MAP.get(itemDuctionInfo.getComposeId());
                    int resoverCustomizeWeightValue = 127 - customizeWeightValue;


                    for (String subject : CustomizeWeight.SUBJECT_WEIGHT_MAP.keySet()){


                        if ((customizeWeightValue & CustomizeWeight.SUBJECT_WEIGHT_MAP.get(subject)) != 0){

                            // 选课版班级数量
                            levelRsDto.getChooseSubjectClasses().put(subject, levelRsDto.getChooseSubjectClasses().getOrDefault(subject,0) + classNumber);
                        } else {

                            // 计算非选课版班级数量
                            levelRsDto.getUnchooseSubjectClasses().put(subject, levelRsDto.getUnchooseSubjectClasses().getOrDefault(subject,0) + classNumber);
                        }
                    }

                }

                // 获取零散人员信息
                if (itemDuctionInfo.getChooseNumber() % maxNumber != 0){
                    computeCompose.put(itemDuctionInfo.getComposeId(), itemDuctionInfo.getChooseNumber() % maxNumber);

                    DeductionComposeInfoDto infoDto = new DeductionComposeInfoDto();
                    infoDto.setChooseNumber(itemDuctionInfo.getChooseNumber() % maxNumber);
                    infoDto.setComposeId(itemDuctionInfo.getComposeId());

                    computeComposeList.add(infoDto);
                }
            }

            // 行政班更换策略
            levelRsDto.setXzbanNumber((int)Math.ceil(studentNumber * 1.0/ maxNumber));

            compute(levelRsDto, computeComposeList,computeCompose ,maxNumber);

            List<DeductionComposeInfoDto> reComputeComposeList = new ArrayList<>();
            Map<String,Integer> reComputeCompose = new HashMap<>();




            levelRs.add(levelRsDto);


        }


        return response;
    }




    private void compute(DeductionLevelRsDto levelRsDto, List<DeductionComposeInfoDto> computeComposeList, Map<String,Integer> computeCompose ,int maxNumber){
        // 使用computeCompose 计算零散人员分班信息, Kmeans Or 逻辑
        if (true){

            List<DeductionComposeInfoDto> canCompose = computeFitClassCompose(computeComposeList, maxNumber);

            // 按照可能的组合人数组成 从大到小排列
            canCompose.sort(new ComposeClassComputeSort());
            // 遍历List + 排重  解决此类问题

            List<DeductionComposeInfoDto> rs = new ArrayList<>();
            Map<String,String> isExist = new HashMap<>();
            for (DeductionComposeInfoDto canItem : canCompose){

                String keys[] = canItem.getComposeId().split("-");

                boolean flag = true;
                for (String keyItem : keys){
                    if (isExist.get(keyItem) != null){
                        flag = false;
                        continue;
                    }
                }
                if (flag == false){
                    continue;
                } else {

                    rs.add(canItem);
                    for (String keyItem : keys){
                        isExist.put(keyItem, keyItem);
                    }

                }

            }

            // 记录组合对应的人数,主要用于进行这个组合不重复的选课分班使用
            List<DeductionComposeInfoDto> unUsedComposeInfo = new ArrayList<>();

            for (DeductionComposeInfoDto rItem : rs){

                String keys[] = rItem.getComposeId().split("-");

                // 行政班+1   2017-10-28  行政班更换策略
//                levelRsDto.setXzbanNumber(levelRsDto.getXzbanNumber() + 1);

                // 当keys为多中组合时进行增加到unUsedComposeInfo 里面,为下一步处理做准备
                if (keys.length > 1){
                    unUsedComposeInfo.add(rItem);
                }

                int chooseComposeValue = 0;

                int bothChooseComposeValue = 127;

                // 计算为参加分班的学生
                for (String rKey : keys){
                    chooseComposeValue = CustomizeWeight.COMPOSE_WEIGHT_MAP.get(rKey) | chooseComposeValue;
                    bothChooseComposeValue = CustomizeWeight.COMPOSE_WEIGHT_MAP.get(rKey) & bothChooseComposeValue;
                }


                for (String subject : CustomizeWeight.SUBJECT_WEIGHT_MAP.keySet()){

                    // 选课版班级数量(两门一样的课程)
                    if ((bothChooseComposeValue & CustomizeWeight.SUBJECT_WEIGHT_MAP.get(subject)) != 0){
                        levelRsDto.getChooseSubjectClasses().put(subject, levelRsDto.getChooseSubjectClasses().getOrDefault(subject,0) + 1);
                    }

                    // 计算非选课版班级数量
                    if ((chooseComposeValue & CustomizeWeight.SUBJECT_WEIGHT_MAP.get(subject)) == 0){

                        levelRsDto.getUnchooseSubjectClasses().put(subject, levelRsDto.getUnchooseSubjectClasses().getOrDefault(subject,0) + 1);
                    }
                }

            }
            // 处理剩余走读班组合 unUsedComposeInfo
            if (true){
                List<DeductionComposeInfoDto> unUsedComposeCompute = new ArrayList<>();
                for (DeductionComposeInfoDto reduceItem : unUsedComposeInfo){
                    String keys[] = reduceItem.getComposeId().split("-");

                    int bothChooseComposeValue = 127;

                    // 计算为参加分班的学生
                    for (String rKey : keys){
                        bothChooseComposeValue = CustomizeWeight.COMPOSE_WEIGHT_MAP.get(rKey) & bothChooseComposeValue;
                    }

                    String newKey = bothChooseComposeValue + "";

                    if (reduceItem.getChooseNumber() != maxNumber){

                        DeductionComposeInfoDto newReduceItem = new DeductionComposeInfoDto();
                        newReduceItem.setComposeId(newKey);
                        newReduceItem.setChooseNumber(reduceItem.getChooseNumber());

                        unUsedComposeCompute.add(newReduceItem);
                    }


                    List<DeductionComposeInfoDto> onlyNoComputeSubjectes = new ArrayList<>();
                    for (String rKey : keys){
                        int resoverBothChooseComposeValue = 127 - bothChooseComposeValue;

                        for (String subject : CustomizeWeight.SUBJECT_WEIGHT_MAP.keySet()){

                            int resovleItemValue = resoverBothChooseComposeValue & CustomizeWeight.COMPOSE_WEIGHT_MAP.get(rKey);

                            if (resovleItemValue == CustomizeWeight.SUBJECT_WEIGHT_MAP.get(subject)){

                                DeductionComposeInfoDto onlyNoComputeSubject = new DeductionComposeInfoDto();
                                onlyNoComputeSubject.setComposeId(newKey + "@" + subject);
                                onlyNoComputeSubject.setChooseNumber(computeCompose.get(rKey));

                                onlyNoComputeSubjectes.add(onlyNoComputeSubject);

                                continue;
                            }
                        }
                    }

                    unUsedComposeCompute.addAll(getFitCompose(onlyNoComputeSubjectes, maxNumber));

                }

                List<DeductionComposeInfoDto> unUsedComposeComputeRs = computeSecondFitClassCompose(unUsedComposeCompute, maxNumber);

                unUsedComposeComputeRs.sort(new ComposeClassComputeSort());

                List<DeductionComposeInfoDto> unUsedComposeRs = new ArrayList<>();
                Map<String,String> isUnUsedComposeExist = new HashMap<>();
                for (DeductionComposeInfoDto canItem : unUsedComposeComputeRs){

                    String keys[] = canItem.getComposeId().split("-");

                    boolean flag = true;
                    for (String keyItem : keys){
                        if (isUnUsedComposeExist.get(keyItem) != null){
                            flag = false;
                            continue;
                        }
                    }
                    if (flag == false){
                        continue;
                    } else {

                        unUsedComposeRs.add(canItem);
                        for (String keyItem : keys){
                            isUnUsedComposeExist.put(keyItem, keyItem);
                        }

                    }

                }


                // 未完成---对应的还需要在进行一次聚类分析
                int studentNumber = 0;
                for (DeductionComposeInfoDto rItem : unUsedComposeRs) {

                    if (rItem.getComposeId().contains("@")) {

                        String keys[] = rItem.getComposeId().split("-");

                        boolean isComposeClass = true;
                        for (String rKey : keys) {
                            if (!rKey.contains("@")) {
                                isComposeClass = false;
                            }
                        }

                        if (isComposeClass) {
                            studentNumber = studentNumber + rItem.getChooseNumber();
                        }

                        for (String rKey : keys) {
                            if (rKey.contains("@")) {
                                String oneKey = rKey.split("@")[1];
                                if (rKey.contains("@")) {
                                    levelRsDto.getChooseSubjectClasses().put(oneKey, levelRsDto.getChooseSubjectClasses().get(oneKey) + 1);
                                }
                            }
                        }


                    }
                }

//                levelRsDto.setXzbanNumber(levelRsDto.getXzbanNumber() + (int)Math.ceil(studentNumber / maxNumber));


            }

        }
    }

    /**
     * 判断n对应的二进制里面有多少个1
     *
     * 把一个整数减去1，再和原整数做运算，会把该整数最右边一个1变成0，那么一个整数的二进制表示有多少个1，就可以进行多少次这样的操作
     * @param n
     * @return
     */
    private int numberOf1(int n){
        int count = 0;
        while(n!=0){
            n = n&(n-1);
            count++;
        }
        return count;
    }

    /**
     *
     * 递归计算出 所有可能的组合
     *
     * @param compose
     * @param maxNumber
     */
    private List<DeductionComposeInfoDto> computeFitClassCompose(List<DeductionComposeInfoDto> compose, int maxNumber){

        List<DeductionComposeInfoDto> backRs = new ArrayList<>();

        if (compose.size() == 0){
            return backRs;
        }

        List<DeductionComposeInfoDto> tmp = new ArrayList<>();
        tmp.addAll(compose);

        DeductionComposeInfoDto dItem = tmp.get(0);
        tmp.remove(dItem);

        backRs.add(dItem);


        for (DeductionComposeInfoDto item : tmp){

            int dItemValue = 127;
            int itemValue = 127;

            String dItemStr = dItem.getComposeId();
            String[] dItemStrs = dItemStr.split("-");

            for (String itemS : dItemStrs){
                dItemValue = dItemValue & CustomizeWeight.COMPOSE_WEIGHT_MAP.get(itemS);
            }

            String itemStr = item.getComposeId();
            String[] itemStrs = itemStr.split("-");

            for (String itemS : itemStrs){
                itemValue = itemValue & CustomizeWeight.COMPOSE_WEIGHT_MAP.get(itemS);
            }

            if(numberOf1(dItemValue & itemValue) == 2){

                if (item.getChooseNumber() + dItem.getChooseNumber() <= maxNumber){

                    List<DeductionComposeInfoDto> tmpItem = new ArrayList<>();
                    tmpItem.addAll(tmp);
                    tmpItem.remove(item);

                    DeductionComposeInfoDto newItem = new DeductionComposeInfoDto();
                    newItem.setChooseNumber(item.getChooseNumber() + dItem.getChooseNumber());
                    newItem.setComposeId(String.format("%s-%s", dItem.getComposeId(), item.getComposeId()));
                    tmpItem.add(0, newItem);

                    backRs.addAll(computeFitClassCompose(tmpItem,maxNumber));
                }
            }
        }



        return backRs;

    }

    /**
     *
     * 递归计算出 所有剩余组合的可用组合
     *
     * @param compose
     * @param maxNumber
     */
    private List<DeductionComposeInfoDto> getFitCompose(List<DeductionComposeInfoDto> compose, int maxNumber){

        List<DeductionComposeInfoDto> backRs = new ArrayList<>();

        if (compose.size() == 0){
            return backRs;
        }

        List<DeductionComposeInfoDto> tmp = new ArrayList<>();
        tmp.addAll(compose);

        DeductionComposeInfoDto dItem = tmp.get(0);
        tmp.remove(dItem);

        backRs.add(dItem);


        for (DeductionComposeInfoDto item : tmp){

            if (item.getChooseNumber() + dItem.getChooseNumber() <= maxNumber){

                List<DeductionComposeInfoDto> tmpItem = new ArrayList<>();
                tmpItem.addAll(tmp);
                tmpItem.remove(item);

                DeductionComposeInfoDto newItem = new DeductionComposeInfoDto();
                newItem.setChooseNumber(item.getChooseNumber() + dItem.getChooseNumber());
                newItem.setComposeId(String.format("%s-%s", dItem.getComposeId(), item.getComposeId()));
                tmpItem.add(0, newItem);

                backRs.addAll(getFitCompose(tmpItem,maxNumber));
            }

        }

        return backRs;

    }


    /**
     *
     * 递归计算出 所有可能的组合
     *
     * @param compose
     * @param maxNumber
     */
    private List<DeductionComposeInfoDto> computeSecondFitClassCompose(List<DeductionComposeInfoDto> compose, int maxNumber){

        List<DeductionComposeInfoDto> backRs = new ArrayList<>();

        if (compose.size() == 0){
            return backRs;
        }

        List<DeductionComposeInfoDto> tmp = new ArrayList<>();
        tmp.addAll(compose);

        DeductionComposeInfoDto dItem = tmp.get(0);
        tmp.remove(dItem);

        backRs.add(dItem);


        for (DeductionComposeInfoDto item : tmp){


            if (item.getComposeId().startsWith(dItem.getComposeId())){
                backRs.add(item);
                continue;
            }

            String dItemStr = dItem.getComposeId();

            String[] dItems = dItemStr.split("-");

            int dItemValue = 0;

            for (String oneStr : dItems){

                int a = 0;
                try {
                    a = Integer.parseInt(oneStr);
                } catch(Exception e){

                }
                if (a == 0){
                    a = CustomizeWeight.SUBJECT_WEIGHT_MAP.get(oneStr.split("@")[1]);
                }

                dItemValue = dItemValue | a;
            }



            String itemStr = item.getComposeId();

            String[] items = itemStr.split("-");

            int itemValue = 0;

            for (String oneStr : items){

                int a = 0;
                try {
                    a = Integer.parseInt(oneStr);
                } catch(Exception e){

                }
                if (a == 0){
                    a = CustomizeWeight.SUBJECT_WEIGHT_MAP.get(oneStr.split("@")[1]);
                }

                itemValue = itemValue | a;
            }


            if(numberOf1(dItemValue & itemValue) > 1){

                if (item.getChooseNumber() + dItem.getChooseNumber() <= maxNumber){

                    List<DeductionComposeInfoDto> tmpItem = new ArrayList<>();
                    tmpItem.addAll(tmp);
                    tmpItem.removeAll(backRs);

                    DeductionComposeInfoDto newItem = new DeductionComposeInfoDto();
                    newItem.setChooseNumber(item.getChooseNumber() + dItem.getChooseNumber());
                    newItem.setComposeId(String.format("%s-%s", dItem.getComposeId(), item.getComposeId()));
                    tmpItem.add(0, newItem);

                    backRs.addAll(computeSecondFitClassCompose(tmpItem,maxNumber));
                }
            }
        }



        return backRs;

    }
}

