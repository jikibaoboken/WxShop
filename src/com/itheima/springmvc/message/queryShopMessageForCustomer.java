package com.itheima.springmvc.message;

public class queryShopMessageForCustomer {
	private Integer shopId;
	private String shopImageURL;
	private String shopName;
	private float shopGrade;
	private Integer shopVolume;
	private Integer shopLeastCount;
	private double deliveryPrice;
	private String deliveryTimeCost;
	private double distance;
	public Integer getShopId() {
		return shopId;
	}
	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}
	public String getShopImageURL() {
		return shopImageURL;
	}
	public void setShopImageURL(String shopImageURL) {
		this.shopImageURL = shopImageURL;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public float getShopGrade() {
		return shopGrade;
	}
	public void setShopGrade(float shopGrade) {
		this.shopGrade = shopGrade;
	}
	public Integer getShopVolume() {
		return shopVolume;
	}
	public void setShopVolume(Integer shopVolume) {
		this.shopVolume = shopVolume;
	}
	public Integer getShopLeastCount() {
		return shopLeastCount;
	}
	public void setShopLeastCount(Integer shopLeastCount) {
		this.shopLeastCount = shopLeastCount;
	}
	
	public double getDeliveryPrice() {
		return deliveryPrice;
	}
	public void setDeliveryPrice(double deliveryPrice) {
		this.deliveryPrice = deliveryPrice;
	}
	public String getDeliveryTimeCost() {
		return deliveryTimeCost;
	}
	public void setDeliveryTimeCost(String deliveryTimeCost) {
		this.deliveryTimeCost = deliveryTimeCost;
	}
	
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	public queryShopMessageForCustomer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "queryShopMessageForCustomer [shopId=" + shopId + ", shopImageURL=" + shopImageURL + ", shopName="
				+ shopName + ", shopGrade=" + shopGrade + ", shopVolume=" + shopVolume + ", shopLeastCount="
				+ shopLeastCount + ", deliveryPrice=" + deliveryPrice + ", deliveryTimeCost=" + deliveryTimeCost
				+ ", distance=" + distance + "]";
	}
	
}
