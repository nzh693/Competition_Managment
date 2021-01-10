package com.competition.po;


public class Proposition {

  private long id;
  private long createUserId;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp modifyTime;
  private long deleted;
  private String createUserName;
  private String name;
  private String background;
  private String descr;
  private long gradatitionId;
  private long competitionAreaId;


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


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public java.sql.Timestamp getModifyTime() {
    return modifyTime;
  }

  public void setModifyTime(java.sql.Timestamp modifyTime) {
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


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getBackground() {
    return background;
  }

  public void setBackground(String background) {
    this.background = background;
  }


  public String getDescr() {
    return descr;
  }

  public void setDescr(String descr) {
    this.descr = descr;
  }


  public long getGradatitionId() {
    return gradatitionId;
  }

  public void setGradatitionId(long gradatitionId) {
    this.gradatitionId = gradatitionId;
  }


  public long getCompetitionAreaId() {
    return competitionAreaId;
  }

  public void setCompetitionAreaId(long competitionAreaId) {
    this.competitionAreaId = competitionAreaId;
  }

}
