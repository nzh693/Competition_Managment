package com.hr.system.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public interface IFileService {

    /**
     * 在服务器端将文件上传至oss
     * @param file
     * @param dir 文件夹
     * @param catalog 目录
     */
    public String uploadOnServer(MultipartFile file,String dir,String catalog);


    /**
     * 获取签名返回客户端js传输
     * 用户发送上传Policy请求到应用服务器。
     * 应用服务器返回上传Policy和签名给用户。
     * 用户直接上传数据到OSS。
     * @param file
     */
    public Map<String,String> uploadOnClient(MultipartFile file);

    public void downloadFile();
}
