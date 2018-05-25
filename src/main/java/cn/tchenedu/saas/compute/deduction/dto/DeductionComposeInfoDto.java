package cn.tchenedu.saas.compute.deduction.dto;

/**
 * Created by ckzhang on 2017/10/21.
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
