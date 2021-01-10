package com.hr.system.model;

import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class MenuDto {

    private long id;

    private long createUserId;

    private java.sql.Timestamp createTime;

    private java.sql.Timestamp modifyTime;

    private long deleted;

    private String createUserName;

    private String name;

    private String indexPath;

    private String iconPath;

    private long visitPower;

    /**
     * 子菜单
     */
    private List<MenuSubDto> subMenuList;
}
