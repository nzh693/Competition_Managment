package com.hr.system;

import com.aliyun.oss.OSSClient;
import com.hr.system.service.imp.FileServiceImp;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;


@SpringBootTest
@RunWith(SpringRunner.class)
class SystemApplicationTests {


    @Autowired
    private FileServiceImp fileServiceImp;

    @Test
    void contextLoads() {
        File file = new File("C:\\Users\\tnie\\Desktop\\文件上传\\SaveFile\\Document\\笔记\\SpringCloud\\springcloud基础.md");
//        fileServiceImp.upload(file);
    }

}
