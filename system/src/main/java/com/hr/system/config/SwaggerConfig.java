package com.hr.system.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
     public Docket createRestApi(){
         return new Docket(DocumentationType.SWAGGER_2)
                 .apiInfo(getApiInfo())
                 .select()
                 .apis(RequestHandlerSelectors.basePackage("com.hr.system.controller"))
                 .paths(PathSelectors.any())
                 .build();
     }

     private ApiInfo getApiInfo(){
         return  new ApiInfoBuilder().title("系统服务api")
                 .version("1.0.0")
                 .description("为用户提供社区服务相关接口API")
                 .termsOfServiceUrl("localhost:8093/api")
                 .contact("nzh_693@163.com")
                 .build();
     }

}
