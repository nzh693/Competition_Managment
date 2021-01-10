package com.competition.po;


 import com.baomidou.mybatisplus.annotation.TableName;

 import java.sql.Timestamp;

@TableName("question")
public class QuestionPo {

    private long id;
    private long createUserId;
    private java.sql.Timestamp createTime;
    private java.sql.Timestamp modifyTime;
    private long deleted;
    private String createUserName;
    private String title;
    private String descr;
    private long status;
    private long authorId;
    private long bestAnswerId;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public long getStatus() {
        return status;
    }

    public void setStatus(long status) {
        this.status = status;
    }

    public long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(long authorId) {
        this.authorId = authorId;
    }

    public long getBestAnswerId() {
        return bestAnswerId;
    }

    public void setBestAnswerId(long bestAnswerId) {
        this.bestAnswerId = bestAnswerId;
    }
}
