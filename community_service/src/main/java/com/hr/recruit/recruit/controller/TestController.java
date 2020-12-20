package com.hr.recruit.recruit.controller;

import com.hr.recruit.recruit.feign.FeignApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@RequestMapping("/recruit")
public class TestController {

    @Autowired
    private FeignApi feignApi;

    @Value("${recruit.name}")
    private String name;

    /**
     * 测试远程调用
     *
     * @return
     */
    @RequestMapping("testFeign")
    public String testFeign() {
        System.out.println("测试远程服务");
        String re = feignApi.TestFeign();
        return "测试远程调用：" + re;
    }

    /**
     * 测试配置中心
     *
     * @return
     */
    @RequestMapping("testConfig")
    public String testConfig() {
        System.out.println("测试配置中心");
        return "测试配置中心：" + name;
    }

    public static void main(String[] args) {
        int a = -9;
        do {
            System.out.println(a += 4);
        } while (a++ == 0);
    }

}
