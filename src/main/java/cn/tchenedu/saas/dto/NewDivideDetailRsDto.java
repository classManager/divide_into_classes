package cn.tchenedu.saas.dto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ckzhang on 2017/11/9.
 */
public class NewDivideDetailRsDto {

    private String level;

    private List<DivideResultInfo> xzClass = new ArrayList<>();


    private Map<String, List<DivideResultInfo>> xkClass = new HashMap<>();


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
