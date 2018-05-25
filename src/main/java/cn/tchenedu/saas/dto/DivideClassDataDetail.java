package cn.tchenedu.saas.dto;

import java.util.List;

/**
 * Created by ckzhang on 2017/9/23.
 */
public class DivideClassDataDetail {

    private int level;

    private List<DivideClassInfoDto> classes;

    public List<DivideClassInfoDto> getClasses() {
        return classes;
    }

    public void setClasses(List<DivideClassInfoDto> classes) {
        this.classes = classes;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

}
