package com.hr.system.service.imp;

import com.aliyun.oss.OSSClient;
import com.aliyun.oss.model.PutObjectResult;
import com.hr.system.service.IFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class FileServiceImp implements IFileService {


    @Autowired
    private OSSClient ossClient;

    @Override
    public void upload(File file) {
        PutObjectResult putObjectResult = ossClient.putObject("contract-nzh", file.getName(), file);
        System.out.println("---------- :"+putObjectResult.getETag());
    }

    @Override
    public void downloadFile() {

    }
}
