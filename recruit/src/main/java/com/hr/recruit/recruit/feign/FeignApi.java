package com.hr.recruit.recruit.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("hrsalary")
public interface FeignApi {

    @RequestMapping("/salary/get")
    public String TestFeign();

}
