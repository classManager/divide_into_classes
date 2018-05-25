package com.baidu.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lt on 17/7/5.
 */
@Component
@ConfigurationProperties(prefix = "thirdparty")
public class ThirdpartConfig {
    public static final String tokenURL = "tokenURL";
    private Map<String, String> org = new HashMap<>();//接受yml中org里面的属性值

    public Map<String, String> getOrg() {
        return org;
    }

    public void setOrg(Map<String, String> org) {
        this.org = org;
    }
}
