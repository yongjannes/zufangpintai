package com.zufang.lease.common.exception;

import com.zufang.lease.common.result.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Title: GlobalExceptionHandler
 * @Author 殇枫
 * @Package com.zufang.lease.common.exception
 * @Date 2025/7/27
 * @description:
 */

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result error(Exception e){
        e.printStackTrace();
        return Result.fail();
    }
}