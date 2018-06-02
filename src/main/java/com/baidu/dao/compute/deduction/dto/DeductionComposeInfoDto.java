package com.baidu.dao.compute.deduction.dto;

/**
 * 组合Id和对应的选择人数实体
 * LT
 */
public class DeductionComposeInfoDto {

    private String composeId;

    private int chooseNumber;

    public String getComposeId() {
        return composeId;
    }

    public void setComposeId(String composeId) {
        this.composeId = composeId;
    }

    public int getChooseNumber() {
        return chooseNumber;
    }

    public void setChooseNumber(int chooseNumber) {
        this.chooseNumber = chooseNumber;
    }

    @Override
    public String toString() {
        return "DeductionComposeInfoDto{" +
                "composeId='" + composeId + '\'' +
                ", chooseNumber=" + chooseNumber +
                '}';
    }
}
