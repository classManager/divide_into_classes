package com.baidu.exception;

/**
 * Created by lt on 17/7/6.
 */
public class UserException extends RuntimeException{
    private Integer code;
    private String msg;
    public UserException(Integer code, String msg){
        this.code = code;
        this.msg = msg;
    }

    public static UserException createException(Integer code, String msg){
        return new UserException(code, msg);
    }

    public Integer getCode() {
        return code;
    }
}
