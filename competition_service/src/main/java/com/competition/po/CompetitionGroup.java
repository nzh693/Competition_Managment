package com.competition.po;


public class CompetitionGroup {

  private long id;
  private long createUserId;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp modifyTime;
  private long deleted;
  private String createUserName;
  private String name;
  private long productionId;
  private long competitionAreaId;
  private long grada;
  private long propositionId;
  private long cuurentPhase;
  private long tutorId;


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


  public long getProductionId() {
    return productionId;
  }

  public void setProductionId(long productionId) {
    this.productionId = productionId;
  }


  public long getCompetitionAreaId() {
    return competitionAreaId;
  }

  public void setCompetitionAreaId(long competitionAreaId) {
    this.competitionAreaId = competitionAreaId;
  }


  public long getGrada() {
    return grada;
  }

  public void setGrada(long grada) {
    this.grada = grada;
  }


  public long getPropositionId() {
    return propositionId;
  }

  public void setPropositionId(long propositionId) {
    this.propositionId = propositionId;
  }


  public long getCuurentPhase() {
    return cuurentPhase;
  }

  public void setCuurentPhase(long cuurentPhase) {
    this.cuurentPhase = cuurentPhase;
  }


  public long getTutorId() {
    return tutorId;
  }

  public void setTutorId(long tutorId) {
    this.tutorId = tutorId;
  }

}
