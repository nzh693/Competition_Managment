package com.competition.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/recruit")
public class TestController {

//    @Autowired
//    private FeignApi feignApi;
//
//    @Value("${recruit.name}")
//    private String name;
//
//    /**
//     * 测试远程调用
//     *
//     * @return
//     */
//    @RequestMapping("testFeign")
//    public String testFeign() {
//        System.out.println("测试远程服务");
//        String re = feignApi.TestFeign();
//        return "测试远程调用：" + re;
//    }
//
//    /**
//     * 测试配置中心
//     *
//     * @return
//     */
//    @RequestMapping("testConfig")
//    public String testConfig() {
//        System.out.println("测试配置中心");
//        return "测试配置中心：" + name;
//    }



}
