package com.baidu.domain;

import org.hibernate.validator.constraints.NotBlank;

public class UserInfo {
    private Integer id;


    private String password;

    @NotBlank(message = "用户名不允许为空")
    private String username;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }
}