package com.baidu.util;

/**
 * Created by lt on 18/5/12.
 */
public class ResultUtil {
    public static Result success(Object object){
        Result result = new Result();
        result.setReturncode(0);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }
    public static Result success(){
        return success(null);
    }
    public static Result fail(int code, String msg){
        Result result = new Result();
        result.setReturncode(code);
        result.setMsg(msg);
        return result;
    }
}
