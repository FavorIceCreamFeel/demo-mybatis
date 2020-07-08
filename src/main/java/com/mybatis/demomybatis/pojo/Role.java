package com.mybatis.demomybatis.pojo;


public class Role {

  private long roleId;
  private String roleName;
  private String roleDescribe;
  private long roleStatus;

  public Role() {
  }

  public Role(long roleId, String roleName, String roleDescribe, long roleStatus) {
    this.roleId = roleId;
    this.roleName = roleName;
    this.roleDescribe = roleDescribe;
    this.roleStatus = roleStatus;
  }

  @Override
  public String toString() {
    return "Role{" +
            "roleId=" + roleId +
            ", roleName='" + roleName + '\'' +
            ", roleDescribe='" + roleDescribe + '\'' +
            ", roleStatus=" + roleStatus +
            '}';
  }

  public long getRoleId() {
    return roleId;
  }

  public void setRoleId(long roleId) {
    this.roleId = roleId;
  }


  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }


  public String getRoleDescribe() {
    return roleDescribe;
  }

  public void setRoleDescribe(String roleDescribe) {
    this.roleDescribe = roleDescribe;
  }


  public long getRoleStatus() {
    return roleStatus;
  }

  public void setRoleStatus(long roleStatus) {
    this.roleStatus = roleStatus;
  }

}
