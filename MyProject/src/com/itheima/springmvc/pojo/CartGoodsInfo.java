package com.itheima.springmvc.pojo;

public class CartGoodsInfo {
	private Integer cartGoodsInfoId;
	
	private Integer goodsId;
	
	private String goodsName;
	
	private double goodsPrice;
	
	private Integer goodsCount;
	
	private String goodsPic;
	
	private Integer customerId;
	
	private Integer shopId;
	public Integer getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public double getGoodsPrice() {
		return goodsPrice;
	}

	public void setGoodsPrice(double goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

	public Integer getGoodsCount() {
		return goodsCount;
	}

	public void setGoodsCount(Integer goodsCount) {
		this.goodsCount = goodsCount;
	}

	public String getGoodsPic() {
		return goodsPic;
	}

	public void setGoodsPic(String goodsPic) {
		this.goodsPic = goodsPic;
	}

	public Integer getCartGoodsInfoId() {
		return cartGoodsInfoId;
	}

	public void setCartGoodsInfoId(Integer cartGoodsInfoId) {
		this.cartGoodsInfoId = cartGoodsInfoId;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Integer getShopId() {
		return shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}
	
}
