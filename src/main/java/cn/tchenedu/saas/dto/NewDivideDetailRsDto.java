package cn.tchenedu.saas.dto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ckzhang on 2017/11/9.
 */
public class NewDivideDetailRsDto {

    //级别
    private String level;

    //行政班
    private List<DivideResultInfo> xzClass = new ArrayList<>();

    //选考班级
    private Map<String, List<DivideResultInfo>> xkClass = new HashMap<>();

    //学考班级
    private Map<String, List<DivideResultInfo>> xuekClass = new HashMap<>();


    public List<DivideResultInfo> getXzClass() {
        return xzClass;
    }

    public void setXzClass(List<DivideResultInfo> xzClass) {
        this.xzClass = xzClass;
    }

    public Map<String, List<DivideResultInfo>> getXkClass() {
        return xkClass;
    }

    public void setXkClass(Map<String, List<DivideResultInfo>> xkClass) {
        this.xkClass = xkClass;
    }

    public Map<String, List<DivideResultInfo>> getXuekClass() {
        return xuekClass;
    }

    public void setXuekClass(Map<String, List<DivideResultInfo>> xuekClass) {
        this.xuekClass = xuekClass;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
