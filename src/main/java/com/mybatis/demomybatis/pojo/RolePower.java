package com.mybatis.demomybatis.pojo;


public class RolePower {

  private long rolePowerId;
  private long roleId;
  private long powerId;

  public RolePower() {
  }

  public RolePower(long rolePowerId, long roleId, long powerId) {
    this.rolePowerId = rolePowerId;
    this.roleId = roleId;
    this.powerId = powerId;
  }

  @Override
  public String toString() {
    return "RolePower{" +
            "rolePowerId=" + rolePowerId +
            ", roleId=" + roleId +
            ", powerId=" + powerId +
            '}';
  }

  public long getRolePowerId() {
    return rolePowerId;
  }

  public void setRolePowerId(long rolePowerId) {
    this.rolePowerId = rolePowerId;
  }


  public long getRoleId() {
    return roleId;
  }

  public void setRoleId(long roleId) {
    this.roleId = roleId;
  }


  public long getPowerId() {
    return powerId;
  }

  public void setPowerId(long powerId) {
    this.powerId = powerId;
  }

}
