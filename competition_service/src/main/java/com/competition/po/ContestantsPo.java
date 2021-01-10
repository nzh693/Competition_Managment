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
@TableName("contestants_info")
public class ContestantsPo extends BasePo {

    /**
     * 账户名
     */
    private String account;

    /**
     * 账户密码
     */
    private String password;

    /**
     * 邮箱地址
     */
    private String email;

    /**
     * 赛区
     */
    private String competition_are;

    /**
     * 学号
     */
    private String student_number;


    /**
     * 参赛者姓名
     */
    private String name;

    /**
     * 性别
     */
    private long sex;

    /**
     * 年龄
     */
    private long age;

    /**
     * 届次
     */
    private String grade;

    /**
     * 头像
     */
    private String headPicture;

    /**
     * 当前赛程节点
     */
    private Integer currentPhase;

    /**
     * 赛区id
     */
    private Integer competitionAreaId;

    /**
     * 命题id
     */
    private Integer propositionId;

    /**
     * 作品id
     */
    private Integer productionId;

    /**
     * 分组id
     */
    private Integer groupId;

    /**
     * 导师id
     */
    private Integer tutorId;


}
