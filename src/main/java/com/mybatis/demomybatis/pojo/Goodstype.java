package com.mybatis.demomybatis.pojo;


public class Goodstype {

  private long goodsTypeId;
  private String goodsTypeName;
  private long typeId;
  private String goodsTypeTime;

  public Goodstype() {
  }

  public Goodstype(long goodsTypeId, String goodsTypeName, long typeId, String goodsTypeTime) {
    this.goodsTypeId = goodsTypeId;
    this.goodsTypeName = goodsTypeName;
    this.typeId = typeId;
    this.goodsTypeTime = goodsTypeTime;
  }

  public long getGoodsTypeId() {
    return goodsTypeId;
  }

  public void setGoodsTypeId(long goodsTypeId) {
    this.goodsTypeId = goodsTypeId;
  }


  public String getGoodsTypeName() {
    return goodsTypeName;
  }

  public void setGoodsTypeName(String goodsTypeName) {
    this.goodsTypeName = goodsTypeName;
  }


  public long getTypeId() {
    return typeId;
  }

  public void setTypeId(long typeId) {
    this.typeId = typeId;
  }


  public String getGoodsTypeTime() {
    return goodsTypeTime;
  }

  public void setGoodsTypeTime(String goodsTypeTime) {
    this.goodsTypeTime = goodsTypeTime;
  }

  @Override
  public String toString() {
    return "Goodstype{" +
            "goodsTypeId=" + goodsTypeId +
            ", goodsTypeName='" + goodsTypeName + '\'' +
            ", typeId=" + typeId +
            ", goodsTypeTime='" + goodsTypeTime + '\'' +
            '}';
  }
}
