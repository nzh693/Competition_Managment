package com.hr.system.po;


public class Tourists {

  private long id;
  private long createUserId;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp modifyTime;
  private long deleted;
  private String createUserName;
  private String ip;
  private long visitPower;
  private java.sql.Date loadTime;
  private java.sql.Date exitTime;


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


  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }


  public long getVisitPower() {
    return visitPower;
  }

  public void setVisitPower(long visitPower) {
    this.visitPower = visitPower;
  }


  public java.sql.Date getLoadTime() {
    return loadTime;
  }

  public void setLoadTime(java.sql.Date loadTime) {
    this.loadTime = loadTime;
  }


  public java.sql.Date getExitTime() {
    return exitTime;
  }

  public void setExitTime(java.sql.Date exitTime) {
    this.exitTime = exitTime;
  }

}
