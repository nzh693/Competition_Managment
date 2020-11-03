package com.hr.system.controller;

import com.hr.system.service.IFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;

@RestController
@RequestMapping("system/file")
public class FileController {


    @Autowired
    private IFileService fileService;

    @RequestMapping("/upload")
    public void upload(){
        File file = new File("C:\\Users\\tnie\\Desktop\\文件上传\\SaveFile\\Document\\笔记\\SpringCloud\\springcloud基础.md");
        fileService.upload(file);
    }
}
