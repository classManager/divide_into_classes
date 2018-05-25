package cn.tchenedu.saas.compute.deduction.customize;

import cn.tchenedu.saas.compute.deduction.DeductionComputeStep;
import cn.tchenedu.saas.compute.deduction.customize.dto.ClassDeduction;
import cn.tchenedu.saas.compute.deduction.customize.dto.DeductionComposeDto;
import cn.tchenedu.saas.compute.deduction.customize.dto.StepRequestDto;
import cn.tchenedu.saas.compute.deduction.customize.dto.StepResponseDto;
import cn.tchenedu.saas.compute.deduction.customize.utils.ComposeClassComputeSort;
import cn.tchenedu.saas.compute.deduction.customize.utils.HelpUtils;
import cn.tchenedu.saas.compute.deduction.dto.DeductionComposeInfoDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ckzhang on 2017/10/21.
 *
 * 第二步,计算行政班组合情况
 */
public class DeductionComputeStep2 implements DeductionComputeStep {


    @Override
    public StepResponseDto compute(StepRequestDto re, int maxNumber) {

        StepResponseDto response = new StepResponseDto();
        response.setNewCompose(re.getComposes());

        List<DeductionComposeDto> composes = re.getComposes();

        Map<Integer, Integer> composeMap = new HashMap<>();
        for (DeductionComposeDto item : composes){
            composeMap.put(item.getComposeId(),item.getChooseNumber());
        }


        List<DeductionComposeInfoDto> convertComposes = convert(composes);

        // 递归查询获取每种组合中两门科目相同的所有可组合信息,并按照组合后的人数从大到小排序,最终获取到,可使用一组列表
        List<DeductionComposeInfoDto> allComposes = getFitComposeForList(convertComposes, maxNumber, true);
        List<DeductionComposeInfoDto> composeRs = getCompose(allComposes, composes.size(), true);

        // 进行上述结果的再次合并,得到新的组合从而得到行政班级的划分
        List<DeductionComposeInfoDto> allComposes1 = getFitComposeForList(composeRs, maxNumber, false);
        List<DeductionComposeInfoDto> composeRs1 = getCompose(allComposes1, composeRs.size(), false);;

        for(DeductionComposeInfoDto composeItem : composeRs1 ){

            ClassDeduction classDeductionItem = new ClassDeduction();
            classDeductionItem.setStudentNumber(composeItem.getChooseNumber());

            String composeStr = composeItem.getComposeId();

            String[] iStr = composeStr.split("#");
            for (String iS : iStr){
                String[] iSStr = iS.split("-");
                for (String iSS : iSStr){

                    int composeId = Integer.parseInt(iSS);
                    classDeductionItem.getClassCompose().put(composeId, composeMap.get(composeId));
                }
            }

            response.getXzClass().add(classDeductionItem);
        }

        return response;
    }

    /**
     * 列表内对象的转化
     *
     * @param composes  带转换对象List
     * @return  转化后的对象List
     */
    private List<DeductionComposeInfoDto> convert(List<DeductionComposeDto> composes){

        List<DeductionComposeInfoDto> rs = new ArrayList<>();

        for (DeductionComposeDto item : composes){

            DeductionComposeInfoDto newItem = new DeductionComposeInfoDto();

            newItem.setChooseNumber(item.getChooseNumber());
            newItem.setComposeId(item.getComposeId() + "");

            rs.add(newItem);
        }

        return rs;
    }


    /**
     * 按照人数的从大到小,进行targets遍历,并进行去除,确保这种方法能够得到一种组合
     *
     * @param targets   循环的List
     * @param sourceCount   List组合中包含的原子总数
     * @param isTwoSubjectSame   分隔符标示
     * @return  是否为两个科目相同的计算
     */
    private List<DeductionComposeInfoDto> getCompose(List<DeductionComposeInfoDto> targets, int sourceCount, boolean isTwoSubjectSame){

        List<DeductionComposeInfoDto> composeRs = new ArrayList<>();

        String splitStr = "-";
        if (!isTwoSubjectSame){
            splitStr = "#";
        }

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

    /**
     * 获取可用的组合总方法
     *
     * @param compose   用于计算的组合列表
     * @param maxNumber    限定条件,最大数字
     * @param isTwoSubjectSame    是否为两个科目相同的计算
     * @return
     */
    private List<DeductionComposeInfoDto> getFitComposeForList(List<DeductionComposeInfoDto> compose, int maxNumber,boolean isTwoSubjectSame){
        List<DeductionComposeInfoDto> backRs = new ArrayList<>();

        for (int i = 0 ; i < compose.size() ; i ++){
            backRs.addAll(getFitCompose(compose.subList(i, compose.size()) , maxNumber, isTwoSubjectSame));
        }

        // 添加初始化元素
        backRs.addAll(compose);

        return backRs;
    }

    /**
     *
     * 递归计算出 所有剩余组合的可用组合,每个组合中含有多种元素
     *
     * @param compose
     * @param maxNumber
     */
    private List<DeductionComposeInfoDto> getFitCompose(List<DeductionComposeInfoDto> compose, int maxNumber, boolean isTwoSubjectSame){

        List<DeductionComposeInfoDto> backRs = new ArrayList<>();

        if (compose.size() == 1){
            backRs.addAll(compose);
            return backRs;
        }


        String splitStr = "-";
        if (!isTwoSubjectSame){
            splitStr = "#";
        }


        DeductionComposeInfoDto dItem = compose.get(0);

        List<DeductionComposeInfoDto> subTemp = compose.subList(1, compose.size());



        List<DeductionComposeInfoDto> tmpItem = new ArrayList<>();
        tmpItem.addAll(subTemp);


        for (DeductionComposeInfoDto item : subTemp) {

            tmpItem.remove(item);


            boolean isComing = true;

            if (isTwoSubjectSame){

                int dValue = (1 << 7) - 1;  // 确保计算默认值为7个1的二进制
                String[] dSubjects = dItem.getComposeId().split("-");
                for (String dSubject : dSubjects) {
                    int dSubjectValue = Integer.parseInt(dSubject);
                    dValue = dValue & dSubjectValue;
                }

                int itemValue = (1 << 7) - 1;  // 确保计算默认值为7个1的二进制
                String[] iSubjects = item.getComposeId().split("-");
                for (String iSubject : iSubjects) {
                    int iSubjectValue = Integer.parseInt(iSubject);
                    itemValue = itemValue & iSubjectValue;
                }

                if (HelpUtils.numberOf1(dValue & itemValue) == 2 ){
                    isComing = true;
                } else {
                    isComing = false;
                }
            }



            // 判断组合是否有两门课程相同
            if (isComing) {

                if (item.getChooseNumber() + dItem.getChooseNumber() <= maxNumber) {
                    DeductionComposeInfoDto newItem = new DeductionComposeInfoDto();
                    newItem.setChooseNumber(item.getChooseNumber() + dItem.getChooseNumber());
                    newItem.setComposeId(String.format("%s" + splitStr + "%s", dItem.getComposeId(), item.getComposeId()));

                    backRs.add(newItem);
                    List<DeductionComposeInfoDto> copyTemp = new ArrayList<>();
                    copyTemp.add(newItem);
                    copyTemp.addAll(tmpItem);

                    backRs.addAll(getFitCompose(copyTemp, maxNumber, isTwoSubjectSame));
                }
            } else {
                 continue;
            }

        }



        return backRs;

    }
}

