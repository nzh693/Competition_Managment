package com.hr.system.service;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public interface IFileService {


    /**
     * 上传文件到OSS
     * 服务器传输
     * @param file
     */
    public void uploadOnServer(File file);


    /**
     * 获取签名返回客户端js传输
     * 用户发送上传Policy请求到应用服务器。
     * 应用服务器返回上传Policy和签名给用户。
     * 用户直接上传数据到OSS。
     * @param file
     */
    public Map<String,String> uploadOnClient(File file);

    public void downloadFile();
}
