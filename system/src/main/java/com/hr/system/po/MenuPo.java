package com.hr.system.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@TableName("menu")
public class MenuPo {

  private long id;

  private Integer createUserId;

  private java.sql.Timestamp createTime;

  private java.sql.Timestamp modifyTime;

  private Integer deleted;

  private String createUserName;

  private String name;

  private String indexPath;

  private String iconPath;

  private Integer visitPower;

  private Integer sort;

  /**
   * 子菜单
   */
  private List<MenuSubPo> subMenuList;



}
