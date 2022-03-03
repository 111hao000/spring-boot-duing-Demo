package com.duing.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServletController {

    @RequestMapping("/hello")
    public String hello(){
        System.out.println("controller执行了");
        return "hello world";
    }
}
