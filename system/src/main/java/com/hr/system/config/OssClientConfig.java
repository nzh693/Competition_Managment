package com.hr.system.config;

import com.aliyun.oss.OSSClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OssClientConfig {

    @Autowired
    private  OssClientConfig clientConfig;

    @Bean
    public OSSClient init(){
        return null;
    }


}
