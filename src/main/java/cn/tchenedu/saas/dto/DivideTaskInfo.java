package cn.tchenedu.saas.dto;

/**
 * Created by ckzhang on 2017/9/23.
 */
public class DivideTaskInfo {

    private String taskId;

    private boolean isAvarageScore;

    private boolean isBalanceSex;

    private int maxNumber;

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public boolean isAvarageScore() {
        return isAvarageScore;
    }

    public void setAvarageScore(boolean avarageScore) {
        isAvarageScore = avarageScore;
    }

    public boolean isBalanceSex() {
        return isBalanceSex;
    }

    public void setBalanceSex(boolean balanceSex) {
        isBalanceSex = balanceSex;
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public void setMaxNumber(int maxNumber) {
        this.maxNumber = maxNumber;
    }
}
