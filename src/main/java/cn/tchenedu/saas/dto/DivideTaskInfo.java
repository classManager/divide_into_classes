package cn.tchenedu.saas.dto;

/**
 * Created by ckzhang on 2017/9/23.
 */
public class DivideTaskInfo {

    //任务ID
    private String taskId;
    //平均分
    private boolean isAvarageScore;
    //男女比例均衡
    private boolean isBalanceSex;
    // 班级最大人数
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
