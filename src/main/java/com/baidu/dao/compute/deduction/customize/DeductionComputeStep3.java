package com.baidu.dao.compute.deduction.customize;

import com.baidu.dao.compute.deduction.customize.dto.ClassDeduction;
import com.baidu.dao.compute.deduction.customize.dto.DeductionComposeDto;
import com.baidu.dao.compute.deduction.customize.dto.StepResponseDto;
import com.baidu.dao.compute.deduction.customize.utils.ComposeClassComputeSort;
import com.baidu.dao.compute.deduction.customize.utils.SubjectMap;
import com.baidu.dao.compute.deduction.dto.DeductionComposeInfoDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lt on 2018/05/21.
 *
 * 第三步,进行行政班确定的情况下,计算选考版分班情况
 */
public class DeductionComputeStep3 {

    public StepResponseDto compute(StepResponseDto request, int maxNumber) {


        StepResponseDto response = new StepResponseDto();

        List<ClassDeduction> classDeductions = request.getXzClass();

        List<DeductionComposeDto> composes = request.getNewCompose();

        List<DeductionComposeInfoDto> composeDtos = new ArrayList<>();

        Map<String,DeductionComposeInfoDto> composeDtoMap = new HashMap<>();


        //确定行政班的情况下,同行政班选考版放到一起
        for (int i = 0 ; i < classDeductions.size() ; i ++){
            ClassDeduction classItem = classDeductions.get(i);



            for (int subjectKey : SubjectMap.SUBJECT_MAP.keySet()) {

                for (int id : classItem.getClassCompose().keySet()) {


                    if ((subjectKey & id) != 0) {

                        String key = i + "-" + subjectKey;

                        DeductionComposeInfoDto dto = composeDtoMap.get(key);
                        if (dto == null){
                            dto = new DeductionComposeInfoDto();
                            dto.setChooseNumber(classItem.getClassCompose().get(id));
                            dto.setComposeId(key);

                            composeDtoMap.put(key,dto);

                        } else {

                            dto.setChooseNumber(dto.getChooseNumber() + classItem.getClassCompose().get(id));

                            composeDtoMap.put(key,dto);
                        }

                    }
                }
            }
        }


        Map<Integer, List<DeductionComposeInfoDto>> fixCluster = getFixCluster(composeDtoMap);


        Map<Integer, List<DeductionComposeInfoDto>> rsAll = new HashMap<>();
        for (int key : fixCluster.keySet()){
            List<DeductionComposeInfoDto> items = fixCluster.get(key);
            List<DeductionComposeInfoDto> rs = getCompose(getAllCompose(items, maxNumber), items.size());
            rsAll.put(key, rs);
        }

        for(Integer key : rsAll.keySet()){
            List<DeductionComposeInfoDto> deductionComposeInfoDtos = rsAll.get(key);

            for (DeductionComposeInfoDto dto : deductionComposeInfoDtos) {

                ClassDeduction item = new ClassDeduction();
                item.setStudentNumber(dto.getChooseNumber());

                String[] dtoStrs = dto.getComposeId().split("#");
                for (String dtoStr : dtoStrs){
                    String[] mixStr = dtoStr.split("-");
                    int index = Integer.parseInt(mixStr[0]);
                    int subjectValue = Integer.parseInt(mixStr[1]);


                    ClassDeduction indexDto = classDeductions.get(index);

                    for (int indexKey : indexDto.getClassCompose().keySet()){
                        if ((indexKey & subjectValue) != 0 ){
                            item.getClassCompose().put(indexKey, indexDto.getClassCompose().get(indexKey));
                        }
                    }

                }

                List<ClassDeduction> xkClasses = response.getXkClassComposeList().get(key);
                if (xkClasses == null) {
                    xkClasses = new ArrayList<>();
                    xkClasses.add(item);
                    response.getXkClassComposeList().put(key, xkClasses);
                } else {
                    xkClasses.add(item);
                }
            }
        }

        return response;
    }


    /**
     * 按照人数的从大到小,进行targets遍历,并进行去除,确保这种方法能够得到一种组合
     *
     * @param targets   循环的List
     * @param sourceCount   List组合中包含的原子总数
     * @return  是否为两个科目相同的计算
     */
    private List<DeductionComposeInfoDto> getCompose(List<DeductionComposeInfoDto> targets, int sourceCount){

        List<DeductionComposeInfoDto> composeRs = new ArrayList<>();

        String splitStr = "#";

        targets.sort(new ComposeClassComputeSort());
        Map<String, String> dump = new HashMap<>();
        for (DeductionComposeInfoDto item : targets) {
            if (dump.keySet().size() == sourceCount) {
                break;
            }

            String itemStrs[] = item.getComposeId().split(splitStr);

            boolean isDump = false;
            for (String iStr : itemStrs) {
                if (dump.get(iStr) != null) {
                    isDump = true;
                    break;
                }
            }

            if (isDump) {
                continue;
            } else {
                composeRs.add(item);
                for (String iStr : itemStrs) {
                    dump.put(iStr, iStr);
                }
            }
        }

        return composeRs;
    }



    private Map<Integer, List<DeductionComposeInfoDto>> getFixCluster(Map<String,DeductionComposeInfoDto> composeDtoMap){


        Map<Integer, List<DeductionComposeInfoDto>> back = new HashMap<>();

        for (String key: composeDtoMap.keySet()){
            DeductionComposeInfoDto item = composeDtoMap.get(key);

            String[] keys = key.split("-");

            int keyValue= Integer.parseInt(keys[1]);

            List<DeductionComposeInfoDto> array = back.get(keyValue);

            if (array == null){
                array = new ArrayList<>();
                array.add(item);
                back.put(keyValue, array);
            } else {
                array.add(item);
            }
        }

        return back;
    }


    /**
     * 获取可用的组合总方法
     *
     * @param targets   用于计算的组合列表
     * @param maxNumber    限定条件,最大数字
     * @return
     */
    private List<DeductionComposeInfoDto> getAllCompose(List<DeductionComposeInfoDto> targets,int maxNumber){

        List<DeductionComposeInfoDto> backRs = new ArrayList<>();

        for (int i = 0 ; i < targets.size() ; i ++){
            backRs.addAll(getFitCompose(targets.subList(i, targets.size()) , maxNumber));
        }

        // 添加初始化元素
        backRs.addAll(targets);

        return backRs;

    }


    /**
     *
     * 递归计算出 所有剩余组合的可用组合,每个组合中含有多种元素
     *
     * @param targets
     * @param maxNumber
     */
    private List<DeductionComposeInfoDto> getFitCompose(List<DeductionComposeInfoDto> targets,int maxNumber){

        List<DeductionComposeInfoDto>  rs = new ArrayList<>();

        String splitStr = "#";

        targets.sort(new ComposeClassComputeSort());

        DeductionComposeInfoDto dItem = targets.get(0);

        List<DeductionComposeInfoDto> subTemp = targets.subList(1, targets.size());



        List<DeductionComposeInfoDto> tmpItem = new ArrayList<>();
        tmpItem.addAll(subTemp);


        for (DeductionComposeInfoDto item : subTemp) {

            tmpItem.remove(item);

            if (item.getChooseNumber() + dItem.getChooseNumber() <= maxNumber) {
                DeductionComposeInfoDto newItem = new DeductionComposeInfoDto();
                newItem.setChooseNumber(item.getChooseNumber() + dItem.getChooseNumber());
                newItem.setComposeId(String.format("%s" + splitStr + "%s", dItem.getComposeId(), item.getComposeId()));

                rs.add(newItem);
                List<DeductionComposeInfoDto> copyTemp = new ArrayList<>();
                copyTemp.add(newItem);
                copyTemp.addAll(tmpItem);

                rs.addAll(getFitCompose(copyTemp, maxNumber));
            }else {
                continue;
            }

        }



        return rs;

    }

}

