package com.hr.system.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@TableName("menu_sub")
public class MenuSubPo {

  private long id;

  private long createUserId;

  private java.sql.Timestamp createTime;

  private java.sql.Timestamp modifyTime;

  private long deleted;

  private String createUserName;

  private String subName;

  private String subIndexPath;

  private String subIconPath;

  private long subVisitPower;

  private long menuId;


}
