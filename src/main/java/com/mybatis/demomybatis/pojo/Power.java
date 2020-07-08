package com.mybatis.demomybatis.pojo;


public class Power {

  private long powerId;
  private String powerName;
  private String powerDescribe;
  private String powerSign;

  public Power() {
  }

  public Power(long powerId, String powerName, String powerDescribe, String powerSign) {
    this.powerId = powerId;
    this.powerName = powerName;
    this.powerDescribe = powerDescribe;
    this.powerSign = powerSign;
  }

  @Override
  public String toString() {
    return "Power{" +
            "powerId=" + powerId +
            ", powerName='" + powerName + '\'' +
            ", powerDescribe='" + powerDescribe + '\'' +
            ", powerSign='" + powerSign + '\'' +
            '}';
  }

  public long getPowerId() {
    return powerId;
  }

  public void setPowerId(long powerId) {
    this.powerId = powerId;
  }


  public String getPowerName() {
    return powerName;
  }

  public void setPowerName(String powerName) {
    this.powerName = powerName;
  }


  public String getPowerDescribe() {
    return powerDescribe;
  }

  public void setPowerDescribe(String powerDescribe) {
    this.powerDescribe = powerDescribe;
  }


  public String getPowerSign() {
    return powerSign;
  }

  public void setPowerSign(String powerSign) {
    this.powerSign = powerSign;
  }

}
