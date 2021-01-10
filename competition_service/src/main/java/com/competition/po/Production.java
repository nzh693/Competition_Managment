package com.competition.po;


public class Production {

  private long id;
  private long createUserId;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp modifyTime;
  private long deleted;
  private String createUserName;
  private String name;
  private String descr;
  private long grada;
  private long competitorId;
  private long competitionAreaId;
  private long propositionId;


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


  public String getDescr() {
    return descr;
  }

  public void setDescr(String descr) {
    this.descr = descr;
  }


  public long getGrada() {
    return grada;
  }

  public void setGrada(long grada) {
    this.grada = grada;
  }


  public long getCompetitorId() {
    return competitorId;
  }

  public void setCompetitorId(long competitorId) {
    this.competitorId = competitorId;
  }


  public long getCompetitionAreaId() {
    return competitionAreaId;
  }

  public void setCompetitionAreaId(long competitionAreaId) {
    this.competitionAreaId = competitionAreaId;
  }


  public long getPropositionId() {
    return propositionId;
  }

  public void setPropositionId(long propositionId) {
    this.propositionId = propositionId;
  }

}
