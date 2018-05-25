package cn.tchenedu.saas.dto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ckzhang on 2017/11/9.
 */
public class DivideDetailRsDto {

    private String level;

    private List<DivideClassInfoDto> xzClass = new ArrayList<>();


    private Map<String, List<DivideClassInfoDto>> xkClass = new HashMap<>();


    private Map<String, List<DivideClassInfoDto>> xuekClass = new HashMap<>();


    public List<DivideClassInfoDto> getXzClass() {
        return xzClass;
    }

    public void setXzClass(List<DivideClassInfoDto> xzClass) {
        this.xzClass = xzClass;
    }

    public Map<String, List<DivideClassInfoDto>> getXkClass() {
        return xkClass;
    }

    public void setXkClass(Map<String, List<DivideClassInfoDto>> xkClass) {
        this.xkClass = xkClass;
    }

    public Map<String, List<DivideClassInfoDto>> getXuekClass() {
        return xuekClass;
    }

    public void setXuekClass(Map<String, List<DivideClassInfoDto>> xuekClass) {
        this.xuekClass = xuekClass;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
