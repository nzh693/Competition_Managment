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
@TableName("competition_node")
public class CompetitionNodePo extends  BasePo {



  /**
   * 主赛程节点名称
   */
  private String name;

  /**
   * 排序
   */
  private long sort;

  /**
   *  节点描述
   */
  private String descr;

  /**
   * 状态：未开始 进行中 已结束
   */
  private long status;




}
