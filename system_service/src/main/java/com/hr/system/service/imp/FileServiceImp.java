package com.hr.system.service.imp;

import com.aliyun.oss.OSS;

import com.aliyun.oss.common.utils.BinaryUtil;
import com.aliyun.oss.model.MatchMode;
import com.aliyun.oss.model.PolicyConditions;
import com.hr.system.service.IFileService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class FileServiceImp implements IFileService {


    Logger logger = LoggerFactory.getLogger(this.getClass());

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
    public Map<String, String> uploadOnClient(File file) {
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
            oss.shutdown();
            logger.debug(new Date().getTime() + "上传文件：" + file.getName());
        }

        return respMap;
    }

    @Override
    public void uploadOnServer(File file) {

        String fileKeyName = file.getName();
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            logger.error("上传文件失败+" + e.getStackTrace());
        }
        oss.putObject(bucketName, fileKeyName, inputStream);
        logger.debug(new Date().getTime() + "上传文件：" + fileKeyName);
        // 关闭OSSClient。
        oss.shutdown();
    }


    @Override
    public void downloadFile() {
    }


}
