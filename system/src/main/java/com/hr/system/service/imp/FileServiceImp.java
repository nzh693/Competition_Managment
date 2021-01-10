package com.hr.system.service.imp;

import com.aliyun.oss.OSS;

import com.aliyun.oss.common.utils.BinaryUtil;
import com.aliyun.oss.model.MatchMode;
import com.aliyun.oss.model.PolicyConditions;
import com.aliyun.oss.model.PutObjectResult;
import com.hr.system.service.IFileService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class FileServiceImp implements IFileService {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    private final static String fileUrl="https://";

    @Value("${oss.accessKeyId}")
    private String accessKeyId;

    @Value("${oss.secretKey}")
    private String accessKeySecret;

    @Value("${oss.endPoint}")
    private String endpoint;

    @Value("${oss.bucketName}")
    private String bucketName;


    @Autowired
    private OSS oss;

    @Override
    public Map<String, String> uploadOnClient(MultipartFile file) {
        String host = "https://" + bucketName + "." + endpoint; // host的格式为 bucketname.endpoint
        String formatDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        String dir = formatDate + "/"; // 用户上传文件时指定的前缀。
        Map<String, String> respMap = new LinkedHashMap<String, String>();
        try {
            long expireTime = 30;
            long expireEndTime = System.currentTimeMillis() + expireTime * 1000;
            Date expiration = new Date(expireEndTime);
            PolicyConditions policyConds = new PolicyConditions();
            policyConds.addConditionItem(PolicyConditions.COND_CONTENT_LENGTH_RANGE, 0, 1048576000);
            policyConds.addConditionItem(MatchMode.StartWith, PolicyConditions.COND_KEY, dir);

            String postPolicy = oss.generatePostPolicy(expiration, policyConds);
            byte[] binaryData = postPolicy.getBytes("utf-8");
            String encodedPolicy = BinaryUtil.toBase64String(binaryData);
            String postSignature = oss.calculatePostSignature(postPolicy);

            respMap.put("accessid", accessKeyId);
            respMap.put("policy", encodedPolicy);
            respMap.put("signature", postSignature);
            respMap.put("dir", dir);
            respMap.put("host", host);
            respMap.put("expire", String.valueOf(expireEndTime / 1000));

        } catch (Exception e) {
            // Assert.fail(e.getMessage());
            System.out.println(e.getMessage());
        } finally {

            logger.debug(new Date().getTime() + "上传文件：" + file.getOriginalFilename());
        }

        return respMap;
    }

    @Override
    public String uploadOnServer(MultipartFile file, String dir, String catalog) {
        PutObjectResult re = null;
        String fileName = file.getOriginalFilename();
        InputStream inputStream = null;
        String uri = "";
        try {
            inputStream = file.getInputStream();
            oss.putObject(bucketName, dir +"/"+ fileName, inputStream);
            uri =fileUrl+bucketName+"."+endpoint.substring(7,endpoint.length())+"/"+dir+"/"+fileName;
        } catch (IOException e) {
            logger.error("上传文件失败" + e.getStackTrace());
        } finally {

        }
        return uri;
    }

    @Override
    public void downloadFile() {
    }

}
