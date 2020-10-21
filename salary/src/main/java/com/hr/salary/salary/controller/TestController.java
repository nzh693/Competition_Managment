package com.hr.salary.salary.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/salary")
public class TestController {

    @RequestMapping("/get")
    public String  TestFeign(){
        return "数据：23";
    }
}
