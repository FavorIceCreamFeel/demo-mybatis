package com.mybatis.demomybatis.pojo;


public class Goods {

  private long goodsId;
  private String goodsName;
  private long goodsNum;
  private double goodsMoney;
  private long goodsTypeId;
  private String goodsUrl;
  private String goodsDescription;
  private long goodsStatus;

  public Goods() {
  }

  public Goods(long goodsId, String goodsName, long goodsNum, double goodsMoney, long goodsTypeId, String goodsUrl, String goodsDescription, long goodsStatus) {
    this.goodsId = goodsId;
    this.goodsName = goodsName;
    this.goodsNum = goodsNum;
    this.goodsMoney = goodsMoney;
    this.goodsTypeId = goodsTypeId;
    this.goodsUrl = goodsUrl;
    this.goodsDescription = goodsDescription;
    this.goodsStatus = goodsStatus;
  }

  public long getGoodsId() {
    return goodsId;
  }

  public void setGoodsId(long goodsId) {
    this.goodsId = goodsId;
  }


  public String getGoodsName() {
    return goodsName;
  }

  public void setGoodsName(String goodsName) {
    this.goodsName = goodsName;
  }


  public long getGoodsNum() {
    return goodsNum;
  }

  public void setGoodsNum(long goodsNum) {
    this.goodsNum = goodsNum;
  }


  public double getGoodsMoney() {
    return goodsMoney;
  }

  public void setGoodsMoney(double goodsMoney) {
    this.goodsMoney = goodsMoney;
  }


  public long getGoodsTypeId() {
    return goodsTypeId;
  }

  public void setGoodsTypeId(long goodsTypeId) {
    this.goodsTypeId = goodsTypeId;
  }


  public String getGoodsUrl() {
    return goodsUrl;
  }

  public void setGoodsUrl(String goodsUrl) {
    this.goodsUrl = goodsUrl;
  }


  public String getGoodsDescription() {
    return goodsDescription;
  }

  public void setGoodsDescription(String goodsDescription) {
    this.goodsDescription = goodsDescription;
  }


  public long getGoodsStatus() {
    return goodsStatus;
  }

  public void setGoodsStatus(long goodsStatus) {
    this.goodsStatus = goodsStatus;
  }

  @Override
  public String toString() {
    return "Goods{" +
            "goodsId=" + goodsId +
            ", goodsName='" + goodsName + '\'' +
            ", goodsNum=" + goodsNum +
            ", goodsMoney=" + goodsMoney +
            ", goodsTypeId=" + goodsTypeId +
            ", goodsUrl='" + goodsUrl + '\'' +
            ", goodsDescription='" + goodsDescription + '\'' +
            ", goodsStatus=" + goodsStatus +
            '}';
  }
}
