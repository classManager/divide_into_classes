package com.baidu.dao.compute.deduction.customize.dto;

/**
 * Created by lt on 2018/05/21.
 */
public class DeductionComposeDto {

    private int composeId;

    private int chooseNumber;

    public int getComposeId() {
        return composeId;
    }

    public void setComposeId(int composeId) {
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
