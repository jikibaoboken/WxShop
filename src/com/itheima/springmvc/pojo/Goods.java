package com.itheima.springmvc.pojo;

public class Goods {
    private Integer goodsId;

    private String goodsShelftime;

    private String goodsName;

    private Integer goodsInventory;

    private String goodsAvatar;

    private String goodsPrice;

    private String belong;

    private String goodsType;

    private String goodsDescription;

    private Integer goodsSale;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsShelftime() {
        return goodsShelftime;
    }

    public void setGoodsShelftime(String goodsShelftime) {
        this.goodsShelftime = goodsShelftime == null ? null : goodsShelftime.trim();
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public Integer getGoodsInventory() {
        return goodsInventory;
    }

    public void setGoodsInventory(Integer goodsInventory) {
        this.goodsInventory = goodsInventory;
    }

    public String getGoodsAvatar() {
        return goodsAvatar;
    }

    public void setGoodsAvatar(String goodsAvatar) {
        this.goodsAvatar = goodsAvatar == null ? null : goodsAvatar.trim();
    }

    public String getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(String goodsPrice) {
        this.goodsPrice = goodsPrice == null ? null : goodsPrice.trim();
    }

    public String getBelong() {
        return belong;
    }

    public void setBelong(String belong) {
        this.belong = belong == null ? null : belong.trim();
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType == null ? null : goodsType.trim();
    }

    public String getGoodsDescription() {
        return goodsDescription;
    }

    public void setGoodsDescription(String goodsDescription) {
        this.goodsDescription = goodsDescription == null ? null : goodsDescription.trim();
    }

    public Integer getGoodsSale() {
        return goodsSale;
    }

    public void setGoodsSale(Integer goodsSale) {
        this.goodsSale = goodsSale;
    }
}