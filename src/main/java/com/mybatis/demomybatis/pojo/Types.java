package com.mybatis.demomybatis.pojo;


public class Types {

  private long typeId;
  private String typeName;
  private String typeCreateTime;

  public Types() {
  }

  public Types(long typeId, String typeName, String typeCreateTime) {
    this.typeId = typeId;
    this.typeName = typeName;
    this.typeCreateTime = typeCreateTime;
  }

  @Override
  public String toString() {
    return "Types{" +
            "typeId=" + typeId +
            ", typeName='" + typeName + '\'' +
            ", typeCreateTime='" + typeCreateTime + '\'' +
            '}';
  }

  public long getTypeId() {
    return typeId;
  }

  public void setTypeId(long typeId) {
    this.typeId = typeId;
  }


  public String getTypeName() {
    return typeName;
  }

  public void setTypeName(String typeName) {
    this.typeName = typeName;
  }


  public String getTypeCreateTime() {
    return typeCreateTime;
  }

  public void setTypeCreateTime(String typeCreateTime) {
    this.typeCreateTime = typeCreateTime;
  }

}
