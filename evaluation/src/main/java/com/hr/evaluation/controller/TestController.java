package com.hr.evaluation.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/evaluation")
public class TestController {


    @Value("${test.name}")
    private String name;

    @RequestMapping("/get")
    public String  TestFeign(){
        return "数据：23 evaluation"+name;
    }
}
