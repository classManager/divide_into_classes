package com.baidu.util;

/**
 * Created by lt on 18/5/12.
 */
public class Result<T> {
    private Integer returncode;
    private String msg;
    private T data;
    public Integer getReturncode() {
        return returncode;
    }

    public void setReturncode(Integer returncode) {
        this.returncode = returncode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
