package com.competition.po;

import com.baomidou.mybatisplus.annotation.TableName;

import java.sql.Timestamp;


@TableName("post_picture")
public class PostPicturePo {

    private long id;
    private long createUserId;
    private java.sql.Timestamp createTime;
    private java.sql.Timestamp modifyTime;
    private long deleted;
    private String createUserName;
    private long postId;
    private String ossSavePath;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(long createUserId) {
        this.createUserId = createUserId;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Timestamp modifyTime) {
        this.modifyTime = modifyTime;
    }

    public long getDeleted() {
        return deleted;
    }

    public void setDeleted(long deleted) {
        this.deleted = deleted;
    }

    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    public long getPostId() {
        return postId;
    }

    public void setPostId(long postId) {
        this.postId = postId;
    }

    public String getOssSavePath() {
        return ossSavePath;
    }

    public void setOssSavePath(String ossSavePath) {
        this.ossSavePath = ossSavePath;
    }
}
