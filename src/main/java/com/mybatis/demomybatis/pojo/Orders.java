package com.mybatis.demomybatis.pojo;


public class Orders {

  private long orderId;
  private long goodsId;
  private double goodsMoney;
  private String orderUser;
  private long goodsNum;
  private String orderTime;
  private long orderStatus;

  public Orders() {
  }

  public Orders(long orderId, long goodsId, double goodsMoney, String orderUser, long goodsNum, String orderTime, long orderStatus) {
    this.orderId = orderId;
    this.goodsId = goodsId;
    this.goodsMoney = goodsMoney;
    this.orderUser = orderUser;
    this.goodsNum = goodsNum;
    this.orderTime = orderTime;
    this.orderStatus = orderStatus;
  }

  @Override
  public String toString() {
    return "Orders{" +
            "orderId=" + orderId +
            ", goodsId=" + goodsId +
            ", goodsMoney=" + goodsMoney +
            ", orderUser='" + orderUser + '\'' +
            ", goodsNum=" + goodsNum +
            ", orderTime='" + orderTime + '\'' +
            ", orderStatus=" + orderStatus +
            '}';
  }

  public long getOrderId() {
    return orderId;
  }

  public void setOrderId(long orderId) {
    this.orderId = orderId;
  }


  public long getGoodsId() {
    return goodsId;
  }

  public void setGoodsId(long goodsId) {
    this.goodsId = goodsId;
  }


  public double getGoodsMoney() {
    return goodsMoney;
  }

  public void setGoodsMoney(double goodsMoney) {
    this.goodsMoney = goodsMoney;
  }


  public String getOrderUser() {
    return orderUser;
  }

  public void setOrderUser(String orderUser) {
    this.orderUser = orderUser;
  }


  public long getGoodsNum() {
    return goodsNum;
  }

  public void setGoodsNum(long goodsNum) {
    this.goodsNum = goodsNum;
  }


  public String getOrderTime() {
    return orderTime;
  }

  public void setOrderTime(String orderTime) {
    this.orderTime = orderTime;
  }


  public long getOrderStatus() {
    return orderStatus;
  }

  public void setOrderStatus(long orderStatus) {
    this.orderStatus = orderStatus;
  }

}
