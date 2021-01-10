package com.competition.po;

import lombok.Data;

/**
 * @author: liu yan
 * @create: 2021-01-03 11:40
 * @description: 基础po
 */
@Data
public  class BasePo {

    /**
     * 唯一id
     */
    private long id;

    /**
     * 创建人id
     */
    private long createUserId;

    /**
     * 创建人名称
     */
    private String createUserName;

    /**
     * 创建时间
     */
    private java.sql.Timestamp createTime;

    /**
     * 修改时间
     */
    private java.sql.Timestamp modifyTime;

    /**
     * 逻辑删除标识符
     */
    private long deleted;


}
