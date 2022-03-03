package com.duing.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * 全局异常配置
 */
@ControllerAdvice
public class MyExceptionHandler {
    //全局异常配置
    @ExceptionHandler(Exception.class)
    public ModelAndView handler(Exception e){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/error");
        mv.addObject("message",e.getMessage());
        return mv;
    }
}
