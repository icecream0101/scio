/*
 * This file is generated by jOOQ.
 */
package com.scio.cloud.jooq.domain.public_.tables.pojos;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;

/** This class is generated by jOOQ. */
@Generated(
    value = {"http://www.jooq.org", "jOOQ version:3.11.9"},
    comments = "This class is generated by jOOQ")
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class UserInfo implements Serializable {

  private static final long serialVersionUID = -893275052;

  private Long id;
  private String password;
  private String realname;
  private String registerIp;
  private Timestamp registerTime;
  private Integer status;
  private String username;

  public UserInfo() {}

  public UserInfo(UserInfo value) {
    this.id = value.id;
    this.password = value.password;
    this.realname = value.realname;
    this.registerIp = value.registerIp;
    this.registerTime = value.registerTime;
    this.status = value.status;
    this.username = value.username;
  }

  public UserInfo(
      Long id,
      String password,
      String realname,
      String registerIp,
      Timestamp registerTime,
      Integer status,
      String username) {
    this.id = id;
    this.password = password;
    this.realname = realname;
    this.registerIp = registerIp;
    this.registerTime = registerTime;
    this.status = status;
    this.username = username;
  }

  public Long getId() {
    return this.id;
  }

  public String getPassword() {
    return this.password;
  }

  public String getRealname() {
    return this.realname;
  }

  public String getRegisterIp() {
    return this.registerIp;
  }

  public Timestamp getRegisterTime() {
    return this.registerTime;
  }

  public Integer getStatus() {
    return this.status;
  }

  public String getUsername() {
    return this.username;
  }

  /** @param id the id to set */
  public void setId(Long id) {
    this.id = id;
  }

  /** @param password the password to set */
  public void setPassword(String password) {
    this.password = password;
  }

  /** @param realname the realname to set */
  public void setRealname(String realname) {
    this.realname = realname;
  }

  /** @param registerIp the registerIp to set */
  public void setRegisterIp(String registerIp) {
    this.registerIp = registerIp;
  }

  /** @param registerTime the registerTime to set */
  public void setRegisterTime(Timestamp registerTime) {
    this.registerTime = registerTime;
  }

  /** @param status the status to set */
  public void setStatus(Integer status) {
    this.status = status;
  }

  /** @param username the username to set */
  public void setUsername(String username) {
    this.username = username;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("UserInfo (");

    sb.append(id);
    sb.append(", ").append(password);
    sb.append(", ").append(realname);
    sb.append(", ").append(registerIp);
    sb.append(", ").append(registerTime);
    sb.append(", ").append(status);
    sb.append(", ").append(username);

    sb.append(")");
    return sb.toString();
  }
}
