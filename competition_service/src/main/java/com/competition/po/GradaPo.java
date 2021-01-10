package com.competition.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@TableName("grada")
public class GradaPo extends BasePo {

    /**
     * 名称
     */
    private String name;

    /**
     * 主题
     */
    private String topic;

    /**
     * 届次顺序
     */
    private Integer sort;

    /**
     * 届次logo
     */
    private String logoPath;

    /**
     * 届次海报图片地址
     */
    private String picturePath;

}
