package cn.tchenedu.saas.compute.deduction.customize;

import cn.tchenedu.saas.compute.deduction.IDeductionCompute;
import cn.tchenedu.saas.compute.deduction.customize.dto.ClassDeduction;
import cn.tchenedu.saas.compute.deduction.customize.dto.DeductionComposeDto;
import cn.tchenedu.saas.compute.deduction.customize.dto.StepRequestDto;
import cn.tchenedu.saas.compute.deduction.customize.dto.StepResponseDto;
import cn.tchenedu.saas.compute.deduction.customize.utils.CustomizeWeight;
import cn.tchenedu.saas.compute.deduction.customize.utils.SubjectMap;
import cn.tchenedu.saas.compute.deduction.dto.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ckzhang on 2017/10/21.
 */
public class DeductionCompute implements IDeductionCompute {



    public static void main(String[] aaa){
        DeductionCompute a = new DeductionCompute();

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
            dto.setChooseNumber((int)(Math.random() * 188) % 80);

            deductionComposeInfoDtos.add(dto);
        }

        levelInfoDto.setComposes(deductionComposeInfoDtos);

        levelInfos.add(levelInfoDto);

        request.setLevelInfos(levelInfos);

        a.compute(request);

    }

    @Override
    public DeductionResponseDto compute(DeductionRequestDto request) {

        int maxNumber = request.getClassMaxNumber();

        List<DeductionLevelInfoDto> levels = request.getLevelInfos();

        DeductionComputeStep1 step1 = new DeductionComputeStep1();

        DeductionComputeStep2 step2 = new DeductionComputeStep2();

        DeductionComputeStep3 step3 = new DeductionComputeStep3();

        DeductionComputeStep4 step4 = new DeductionComputeStep4();

        DeductionResponseDto responseDto = new DeductionResponseDto();

        List<DeductionLevelRsDto> levelRs = new ArrayList<>();

        responseDto.setLevelRs(levelRs);

        for (DeductionLevelInfoDto level : levels) {

            StepResponseDto response = new StepResponseDto();

            List<DeductionComposeDto> composes = convert(level.getComposes());

            StepRequestDto request1Dto = new StepRequestDto();
            request1Dto.setComposes(composes);

            StepResponseDto response1 = step1.compute(request1Dto, maxNumber);

            StepRequestDto request2Dto = new StepRequestDto();
            request2Dto.setComposes(response1.getNewCompose());

            StepResponseDto response2 = step2.compute(request2Dto, maxNumber);

            StepResponseDto response3 = step3.compute(response2, maxNumber);

            StepResponseDto response4 = step4.compute(response2, maxNumber);


            response.getXzClass().addAll(response1.getXzClass());
            response.setXkClassComposeList(response1.getXkClassComposeList());
            response.setXuekClassComposeList(response1.getXuekClassComposeList());


            response.getXzClass().addAll(response2.getXzClass());

            for (int key : response3.getXkClassComposeList().keySet()){
                List<ClassDeduction> itemList = response.getXkClassComposeList().get(key);

                if (itemList != null){
                    itemList.addAll(response3.getXkClassComposeList().get(key));
                }
            }

            for (int key : response4.getXuekClassComposeList().keySet()){
                List<ClassDeduction> itemList = response.getXuekClassComposeList().get(key);

                if (itemList != null){
                    itemList.addAll(response4.getXuekClassComposeList().get(key));
                }
            }


            DeductionLevelRsDto levelRsDto = new DeductionLevelRsDto();

            levelRsDto.setLevel(level.getLevel());
            levelRsDto.setXzbanNumber(response.getXzClass().size());

            for (int key : response.getXkClassComposeList().keySet()){
                levelRsDto.getChooseSubjectClasses().put(SubjectMap.SUBJECT_MAP.get(key), response.getXkClassComposeList().get(key).size());
            }

            for (int key : response.getXuekClassComposeList().keySet()){
                levelRsDto.getUnchooseSubjectClasses().put(SubjectMap.SUBJECT_MAP.get(key), response.getXuekClassComposeList().get(key).size());
            }

            responseDto.getLevelRs().add(levelRsDto);

        }



        return responseDto;

    }


    /**
     *  计算某一层级对应的分班详情信息
     *
     *
     * @param orginComposes
     * @param maxNumber
     * @return
     */
    public StepResponseDto computeDetail(List<DeductionComposeInfoDto> orginComposes, int maxNumber) {


        Map<String, StepResponseDto> back = new HashMap<>();

        DeductionComputeStep1 step1 = new DeductionComputeStep1();

        DeductionComputeStep2 step2 = new DeductionComputeStep2();

        DeductionComputeStep3 step3 = new DeductionComputeStep3();

        DeductionComputeStep4 step4 = new DeductionComputeStep4();

        StepResponseDto response = new StepResponseDto();

        List<DeductionComposeDto> composes = convert(orginComposes);

        StepRequestDto request1Dto = new StepRequestDto();
        request1Dto.setComposes(composes);

        StepResponseDto response1 = step1.compute(request1Dto, maxNumber);

        StepRequestDto request2Dto = new StepRequestDto();
        request2Dto.setComposes(response1.getNewCompose());

        StepResponseDto response2 = step2.compute(request2Dto, maxNumber);
//        StepResponseDto response2 = new StepResponseDto();
//        response2.setNewCompose(composes);
//        List<ClassDeduction> xzClass = this.getXzClass();
//        response2.setXzClass(xzClass);

        StepResponseDto response3 = step3.compute(response2, maxNumber);

        StepResponseDto response4 = step4.compute(response2, maxNumber);


        response.getXzClass().addAll(response1.getXzClass());
        response.setXkClassComposeList(response1.getXkClassComposeList());
        response.setXuekClassComposeList(response1.getXuekClassComposeList());


        response.getXzClass().addAll(response2.getXzClass());

        for (int key : response3.getXkClassComposeList().keySet()){
            List<ClassDeduction> itemList = response.getXkClassComposeList().get(key);

            if (itemList == null){
                itemList = new ArrayList<>();
                itemList.addAll(response3.getXkClassComposeList().get(key));
                response.getXkClassComposeList().put(key, itemList);
            } else {
                itemList.addAll(response3.getXkClassComposeList().get(key));
            }
        }

        for (int key : response4.getXuekClassComposeList().keySet()){
            List<ClassDeduction> itemList = response.getXuekClassComposeList().get(key);

            if (itemList == null){
                itemList = new ArrayList<>();
                itemList.addAll(response4.getXuekClassComposeList().get(key));
                response.getXuekClassComposeList().put(key, itemList);
            } else {
                itemList.addAll(response4.getXuekClassComposeList().get(key));
            }
        }

        return response;

    }

    private List<DeductionComposeDto> convert(List<DeductionComposeInfoDto> composes){

        List<DeductionComposeDto> rs = new ArrayList<>();

        for (DeductionComposeInfoDto item : composes){

            DeductionComposeDto newItem = new DeductionComposeDto();

            newItem.setChooseNumber(item.getChooseNumber());
            newItem.setComposeId(SubjectMap.COMPOSE_WEIGHT_MAP.get(item.getComposeId()));
            rs.add(newItem);
        }

        return rs;

    }

    public List<ClassDeduction> getXzClass() {
        List<ClassDeduction> xzClass = new ArrayList<>();
        ClassDeduction c = new ClassDeduction();
        c.setStudentNumber(50);
        c.setClassComposeStatus(1);
        c.getClassCompose().put(112,20);
        c.getClassCompose().put(52,20);
        c.getClassCompose().put(56,10);
        xzClass.add(c);
        ClassDeduction c1 = new ClassDeduction();
        c1.setStudentNumber(50);
        c1.setClassComposeStatus(1);
        c1.getClassCompose().put(112,17);
        c1.getClassCompose().put(52,33);
        xzClass.add(c1);
        ClassDeduction c2 = new ClassDeduction();
        c2.setStudentNumber(50);
        c2.setClassComposeStatus(1);
        c2.getClassCompose().put(112,19);
        c2.getClassCompose().put(52,31);
        xzClass.add(c2);
        ClassDeduction c3 = new ClassDeduction();
        c3.setStudentNumber(50);
        c3.setClassComposeStatus(1);
        c3.getClassCompose().put(112,23);
        c3.getClassCompose().put(100,27);
        xzClass.add(c3);
        ClassDeduction c4 = new ClassDeduction();
        c4.setStudentNumber(50);
        c4.setClassComposeStatus(1);
        c4.getClassCompose().put(112,22);
        c4.getClassCompose().put(98,28);
        xzClass.add(c4);
        ClassDeduction c5 = new ClassDeduction();
        c5.setStudentNumber(50);
        c5.setClassComposeStatus(1);
        c5.getClassCompose().put(112,14);
        c5.getClassCompose().put(28,17);
        c5.getClassCompose().put(26,19);
        xzClass.add(c5);
        ClassDeduction c6 = new ClassDeduction();
        c6.setStudentNumber(50);
        c6.setClassComposeStatus(1);
        c6.getClassCompose().put(112,26);
        c6.getClassCompose().put(22,24);
        xzClass.add(c6);
        ClassDeduction c7 = new ClassDeduction();
        c7.setStudentNumber(48);
        c7.setClassComposeStatus(1);
        c7.getClassCompose().put(112,12);
        c7.getClassCompose().put(100,36);
        xzClass.add(c7);
        ClassDeduction c8 = new ClassDeduction();
        c8.setStudentNumber(48);
        c8.setClassComposeStatus(1);
        c8.getClassCompose().put(112,21);
        c8.getClassCompose().put(84,27);
        xzClass.add(c8);
        ClassDeduction c10 = new ClassDeduction();
        c10.setStudentNumber(50);
        c10.setClassComposeStatus(1);
        c10.getClassCompose().put(84,26);
        c10.getClassCompose().put(22,24);
        xzClass.add(c10);
        ClassDeduction c11 = new ClassDeduction();
        c11.setStudentNumber(50);
        c11.setClassComposeStatus(1);
        c11.getClassCompose().put(84,25);
        c11.getClassCompose().put(22,25);
        xzClass.add(c11);
        ClassDeduction c12 = new ClassDeduction();
        c12.setStudentNumber(50);
        c12.setClassComposeStatus(1);
        c12.getClassCompose().put(84,20);
        c12.getClassCompose().put(28,30);
        xzClass.add(c12);
        ClassDeduction c13 = new ClassDeduction();
        c13.setStudentNumber(50);
        c13.setClassComposeStatus(1);
        c13.getClassCompose().put(84,18);
        c13.getClassCompose().put(28,32);
        xzClass.add(c13);
        ClassDeduction c14 = new ClassDeduction();
        c14.setStudentNumber(48);
        c14.setClassComposeStatus(1);
        c14.getClassCompose().put(84,26);
        c14.getClassCompose().put(76,22);
        xzClass.add(c14);
        ClassDeduction c15 = new ClassDeduction();
        c15.setStudentNumber(49);
        c15.setClassComposeStatus(1);
        c15.getClassCompose().put(84,26);
        c15.getClassCompose().put(22,23);
        xzClass.add(c15);
        ClassDeduction c16 = new ClassDeduction();
        c16.setStudentNumber(53);
        c16.setClassComposeStatus(1);
        c16.getClassCompose().put(100,18);
        c16.getClassCompose().put(70,35);
        xzClass.add(c16);
        ClassDeduction c17 = new ClassDeduction();
        c17.setStudentNumber(50);
        c17.setClassComposeStatus(1);
        c17.getClassCompose().put(100,16);
        c17.getClassCompose().put(38,34);
        xzClass.add(c17);
        ClassDeduction c18 = new ClassDeduction();
        c18.setStudentNumber(54);
        c18.setClassComposeStatus(1);
        c18.getClassCompose().put(70,36);
        c18.getClassCompose().put(14,18);
        xzClass.add(c18);
        ClassDeduction c19 = new ClassDeduction();
        c19.setStudentNumber(50);
        c19.setClassComposeStatus(1);
        c19.getClassCompose().put(26,35);
        c19.getClassCompose().put(22,15);
        xzClass.add(c19);
        ClassDeduction c20 = new ClassDeduction();
        c20.setStudentNumber(50);
        c20.setClassComposeStatus(1);
        c20.getClassCompose().put(56,20);
        c20.getClassCompose().put(26,30);
        xzClass.add(c20);
        ClassDeduction c21 = new ClassDeduction();
        c21.setStudentNumber(47);
        c21.setClassComposeStatus(1);
        c21.getClassCompose().put(104,27);
        c21.getClassCompose().put(42,20);
        xzClass.add(c21);
        ClassDeduction c22 = new ClassDeduction();
        c22.setStudentNumber(52);
        c22.setClassComposeStatus(1);
        c22.getClassCompose().put(82,21);
        c22.getClassCompose().put(88,31);
        xzClass.add(c22);
        ClassDeduction c23 = new ClassDeduction();
        c23.setStudentNumber(55);
        c23.setClassComposeStatus(1);
        c23.getClassCompose().put(50,30);
        c23.getClassCompose().put(38,25);
        xzClass.add(c23);
        ClassDeduction c24 = new ClassDeduction();
        c24.setStudentNumber(50);
        c24.setClassComposeStatus(1);
        c24.getClassCompose().put(14,26);
        c24.getClassCompose().put(74,24);
        xzClass.add(c24);
        ClassDeduction c25 = new ClassDeduction();
        c25.setStudentNumber(50);
        c25.setClassComposeStatus(1);
        c25.getClassCompose().put(14,25);
        c25.getClassCompose().put(44,25);
        xzClass.add(c25);
        ClassDeduction c26 = new ClassDeduction();
        c26.setStudentNumber(50);
        c26.setClassComposeStatus(1);
        c26.getClassCompose().put(14,29);
        c26.getClassCompose().put(98,21);
        xzClass.add(c26);
        ClassDeduction c27 = new ClassDeduction();
        c27.setStudentNumber(50);
        c27.setClassComposeStatus(1);
        c27.getClassCompose().put(14,19);
        c27.getClassCompose().put(22,31);
        xzClass.add(c27);
        ClassDeduction c28 = new ClassDeduction();
        c28.setStudentNumber(50);
        c28.setClassComposeStatus(1);
        c28.getClassCompose().put(14,40);
        c28.getClassCompose().put(42,10);
        xzClass.add(c28);
        ClassDeduction c29 = new ClassDeduction();
        c29.setStudentNumber(50);
        c29.setClassComposeStatus(1);
        c29.getClassCompose().put(14,30);
        c29.getClassCompose().put(52,20);
        xzClass.add(c29);
        ClassDeduction c30 = new ClassDeduction();
        c30.setStudentNumber(49);
        c30.setClassComposeStatus(1);
        c30.getClassCompose().put(14,21);
        c30.getClassCompose().put(22,28);
        xzClass.add(c30);
        ClassDeduction c31 = new ClassDeduction();
        c31.setStudentNumber(50);
        c31.setClassComposeStatus(1);
        c31.getClassCompose().put(50,22);
        c31.getClassCompose().put(82,28);
        xzClass.add(c31);
        ClassDeduction c32 = new ClassDeduction();
        c32.setStudentNumber(50);
        c32.setClassComposeStatus(1);
        c32.getClassCompose().put(84,13);
        c32.getClassCompose().put(52,18);
        c32.getClassCompose().put(22,19);
        xzClass.add(c32);

        return xzClass;
    }
}

