package com.itheima.springmvc.pojo;

public class Shop {
    private Integer shopId;
    private String shopType;
    private String shopName;
    private String shopAddress;
    private Integer goodsTypeNumbers;
    private String shopImage;
    private Integer shopLevel;
    private String shopPhone;
    private Integer shopCondition;
    private Integer sellerId;
	private String shopIntroduction;
    private Integer leastCount;


    @Override
	public String toString() {
		return "Shop [shopId=" + shopId + ", shopType=" + shopType + ", shopName=" + shopName + ", shopAddress="
				+ shopAddress + ", goodsTypeNumbers=" + goodsTypeNumbers + ", shopImage=" + shopImage + ", shopLevel="
				+ shopLevel + ", shopPhone=" + shopPhone + ", shopCondition=" + shopCondition + ", sellerId=" + sellerId
				+ ", shopIntroduction=" + shopIntroduction + ", leastCount=" + leastCount + "]";
	}

    public boolean isDetailed(){
    	return shopId!=null&&shopName!=null&&shopAddress!=null&&shopIntroduction!=null&&shopType!=null&&shopCondition!=null&&sellerId!=null&&leastCount!=null;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getShopType() {
        return shopType;
    }

    public void setShopType(String shopType) {
        this.shopType = shopType == null ? null : shopType.trim();
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress == null ? null : shopAddress.trim();
    }

    public Integer getGoodsTypeNumbers() {
        return goodsTypeNumbers;
    }

    public void setGoodsTypeNumbers(Integer goodsTypeNumbers) {
        this.goodsTypeNumbers = goodsTypeNumbers;
    }

    public String getShopImage() {
        return shopImage;
    }

    public void setShopImage(String shopImage) {
        this.shopImage = shopImage == null ? null : shopImage.trim();
    }

    public Integer getShopLevel() {
        return shopLevel;
    }

    public void setShopLevel(Integer shopLevel) {
        this.shopLevel = shopLevel;
    }

    public String getShopPhone() {
        return shopPhone;
    }

    public void setShopPhone(String shopPhone) {
        this.shopPhone = shopPhone == null ? null : shopPhone.trim();
    }

    public Integer getShopCondition() {
        return shopCondition;
    }

    public void setShopCondition(Integer shopCondition) {
        this.shopCondition = shopCondition;
    }

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public String getShopIntroduction() {
        return shopIntroduction;
    }

    public void setShopIntroduction(String shopIntroduction) {
        this.shopIntroduction = shopIntroduction == null ? null : shopIntroduction.trim();
    }

    public Integer getLeastCount() {
        return leastCount;
    }

    public void setLeastCount(Integer leastCount) {
        this.leastCount = leastCount;
    }
}