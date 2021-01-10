package com.hr.system.model;

import lombok.Data;

/**
 * @author: liu yan
 * @create: 2021-01-10 20:12
 * @description: 上传图片传输实体
 */
@Data
public class UploadImageDto {


    /**
     * 存储桶名称
     */
    private String bucketName;

    /**
     * 存储文件夹
     */
    private String dir;


}
