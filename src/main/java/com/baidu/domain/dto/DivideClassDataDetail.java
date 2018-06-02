package com.baidu.domain.dto;

import java.util.List;

/**
 * Created by lt on 2018/05/23.
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
