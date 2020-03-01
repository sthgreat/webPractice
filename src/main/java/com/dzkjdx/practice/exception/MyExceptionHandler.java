package com.dzkjdx.practice.exception;

import com.dzkjdx.practice.vo.ResponseVo;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class MyExceptionHandler {
    @ExceptionHandler(NeedLoginException.class)
    @ResponseBody
    public ResponseVo needLogin(NeedLoginException e){
        return new ResponseVo(-1, e.getMessage());
    }
}
