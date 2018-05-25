package cn.tchenedu.saas.compute.deduction.customize;

import cn.tchenedu.saas.compute.deduction.DeductionComputeStep;
import cn.tchenedu.saas.compute.deduction.customize.dto.ClassDeduction;
import cn.tchenedu.saas.compute.deduction.customize.dto.DeductionComposeDto;
import cn.tchenedu.saas.compute.deduction.customize.dto.StepRequestDto;
import cn.tchenedu.saas.compute.deduction.customize.dto.StepResponseDto;
import cn.tchenedu.saas.compute.deduction.customize.utils.SubjectMap;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ckzhang on 2017/10/21.
 *
 * 演练第一步计算分班对应的选择完全相同的选考版和学考班
 *
 * 计算行政班数量
 */
public class DeductionComputeStep1 implements DeductionComputeStep {


    @Override
    public StepResponseDto compute(StepRequestDto re, int maxNumber) {


        int max = maxNumber;
        StepResponseDto response = new StepResponseDto();

        List<DeductionComposeDto> composes = re.getComposes();

        for (DeductionComposeDto item : composes){

            maxNumber = max;
            if (item.getChooseNumber() * 1.0 / maxNumber >= 1){

                int classNumber = item.getChooseNumber() / maxNumber;

                int remainNum = 0;//剩余人数
                int distributeNum = 0;//可分配人数
                if (item.getChooseNumber() % maxNumber < classNumber*SubjectMap.FLUCTUATE) {
                    distributeNum = (item.getChooseNumber() % maxNumber) / classNumber;
                    remainNum = (item.getChooseNumber() % maxNumber) % classNumber;
                }else {
                    if (item.getChooseNumber() % maxNumber != 0){
                        DeductionComposeDto newItem = new DeductionComposeDto();
                        newItem.setChooseNumber(item.getChooseNumber() % maxNumber);
                        newItem.setComposeId(item.getComposeId());
                        response.getNewCompose().add(newItem);
                    }
                }
                    maxNumber = maxNumber + distributeNum;
                    // 选考班/学考班班级添加
                    for (int key : SubjectMap.SUBJECT_MAP.keySet()) {
                        if ((item.getComposeId() & key) == key) {   // 计算全量选考班
                            int count = remainNum;
                            for (int i = 0; i < classNumber; i++) {
                                ClassDeduction keyItem = new ClassDeduction();
                                if (count > 0) {
                                    keyItem.getClassCompose().put(item.getComposeId(), maxNumber + 1);
                                    keyItem.setStudentNumber(maxNumber + 1);
                                    keyItem.setClassComposeStatus(1);
                                } else {
                                    keyItem.getClassCompose().put(item.getComposeId(), maxNumber);
                                    keyItem.setStudentNumber(maxNumber);
                                    keyItem.setClassComposeStatus(1);
                                }
                                if (response.getXkClassComposeList().get(key) != null) {
                                    response.getXkClassComposeList().get(key).add(keyItem);
                                } else {
                                    List<ClassDeduction> keyItems = new ArrayList<>();
                                    keyItems.add(keyItem);
                                    response.getXkClassComposeList().put(key, keyItems);
                                }
                                count--;
                            }
                        } else {    // 计算全量学考班
                            int count = remainNum;
                            for (int i = 0; i < classNumber; i++) {
                                ClassDeduction keyItem = new ClassDeduction();
                                if (count > 0) {
                                    keyItem.getClassCompose().put(item.getComposeId(), maxNumber + 1);
                                    keyItem.setStudentNumber(maxNumber + 1);
                                    keyItem.setClassComposeStatus(1);
                                } else {
                                    keyItem.getClassCompose().put(item.getComposeId(), maxNumber);
                                    keyItem.setStudentNumber(maxNumber);
                                    keyItem.setClassComposeStatus(1);
                                }

                                if (response.getXuekClassComposeList().get(key) != null) {
                                    response.getXuekClassComposeList().get(key).add(keyItem);
                                } else {
                                    List<ClassDeduction> keyItems = new ArrayList<>();
                                    keyItems.add(keyItem);
                                    response.getXuekClassComposeList().put(key, keyItems);
                                }
                                count--;
                            }
                        }
                    }
                    //行政班处理
                    for (int i = 0; i < classNumber; i++) {
                        ClassDeduction keyItem = new ClassDeduction();
                        if (remainNum > 0) {
                            keyItem.getClassCompose().put(item.getComposeId(), maxNumber + 1);
                            keyItem.setStudentNumber(maxNumber + 1);
                            keyItem.setClassComposeStatus(1);
                        } else {
                            keyItem.getClassCompose().put(item.getComposeId(), maxNumber);
                            keyItem.setStudentNumber(maxNumber);
                            keyItem.setClassComposeStatus(1);
                        }
                        response.getXzClass().add(keyItem);
                        remainNum--;
                    }
            }else {
                if (item.getChooseNumber() > 0) {
                    response.getNewCompose().add(item);
                }
            }

        }

        return response;
    }
}

