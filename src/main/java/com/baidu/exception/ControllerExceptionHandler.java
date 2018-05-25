package com.baidu.exception;

import com.baidu.util.Result;
import com.baidu.util.ResultUtil;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


@ControllerAdvice
public class ControllerExceptionHandler {
    public static Logger log = org.slf4j.LoggerFactory.getLogger(ControllerExceptionHandler.class);
    @ExceptionHandler
    @ResponseBody
    public Result handlerException(Exception excption){
        if(excption instanceof UserException){
            UserException userException = (UserException) excption;
            return ResultUtil.fail(userException.getCode(), userException.getMessage());
        }else {
            log.error("未知系统错误[{}]", excption);
            return ResultUtil.fail(-1, "未知错误");
        }
    }
}
