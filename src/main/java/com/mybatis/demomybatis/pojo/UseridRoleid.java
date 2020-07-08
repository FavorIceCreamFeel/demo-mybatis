package com.mybatis.demomybatis.pojo;


public class UseridRoleid {

  private long userRoleId;
  private long userId;
  private long roleId;

  public UseridRoleid(long userRoleId, long userId, long roleId) {
    this.userRoleId = userRoleId;
    this.userId = userId;
    this.roleId = roleId;
  }

  public UseridRoleid() {
  }

  @Override
  public String toString() {
    return "UseridRoleid{" +
            "userRoleId=" + userRoleId +
            ", userId=" + userId +
            ", roleId=" + roleId +
            '}';
  }

  public long getUserRoleId() {
    return userRoleId;
  }

  public void setUserRoleId(long userRoleId) {
    this.userRoleId = userRoleId;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public long getRoleId() {
    return roleId;
  }

  public void setRoleId(long roleId) {
    this.roleId = roleId;
  }

}
