package com.competition.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class GradaDto {

    /**
     * 大赛名称
     */
    private String name;

    /**
     * 大赛主题
     */
    private String topic;

    /**
     * 届次logo
     */
    private String logoPath;

    /**
     * 届次海报图片地址
     */
    private String picturePath;

    /**
     * 创建人
     */
    private String createUserName;
}
