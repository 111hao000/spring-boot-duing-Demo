package com.duing.controller;

import com.duing.bean.Food;
import com.duing.bean.Vegetables;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用来返回json数据的，不是用来返回视图的
 */
@RestController
public class JsonController {
    @RequestMapping("/json")
    public String json(){
        return "hello json";
    }

    @Value("${food.meat}")
    private String meat;
    @Value("${food.rice}")
    private String rice;
    @RequestMapping("/food")
    public Food food(){
        Food food = new Food();
        food.setRice(meat);
        food.setMeat(rice);
        return food;
    }

    @Value("${vegetables.eggplant}")
    private String eggplant;
    @Value("${vegetables.greenpeper}")
    private String greenpeper;
    @Value("${vegetables.potato}")
    private String potato;
    @RequestMapping("/vegetables")
    public Vegetables vegetables(){
        Vegetables vegetables = new Vegetables();
        vegetables.setEggplant(eggplant);
        vegetables.setGreenpeper(greenpeper);
        vegetables.setPotato(potato);
        return vegetables;
    }
}
