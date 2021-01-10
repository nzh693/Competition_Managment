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
@TableName("competition_node_sub")
public class CompetitionNodeSubPo extends BasePo {

  /**
   * 子节点名称
   */
  private String name;

  /**
   * 排序
   */
  private long sort;

  /**
   * 描述
   */
  private String descr;

  /**
   * 状态
   */
  private long status;

  /**
   * 父节点id
   */
  private long competitionParentId;


}
