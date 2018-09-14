package com.itheima.springmvc.message;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.itheima.springmvc.pojo.Address;
import com.itheima.springmvc.pojo.Comment;
import com.itheima.springmvc.pojo.Shop;
import com.itheima.springmvc.pojo.Order;
import com.itheima.springmvc.pojo.OrderExample;

public class ShopDetailedMessageForCustomerQueryVo {
	private Shop shop;
	private Address shopAddress;
	private List<Comment> shopComment;
	private float shopAverageGrade;
	private float logistics;
	private float service;
	private float consistency;
	private Integer shopVolume;
	
	public float getLogistics() {
		return logistics;
	}
	public void setLogistics(float logistics) {
		this.logistics = logistics;
	}
	public float getService() {
		return service;
	}
	public void setService(float service) {
		this.service = service;
	}
	public float getConsistency() {
		return consistency;
	}
	public void setConsistency(float consistency) {
		this.consistency = consistency;
	}
	
	public float getShopAverageGrade() {
		return shopAverageGrade;
	}
	public void setShopAverageGrade(float shopAverageGrade) {
		this.shopAverageGrade = shopAverageGrade;
	}
	public Integer getShopVolume() {
		return shopVolume;
	}
	public void setShopVolume(Integer shopVolume) {
		this.shopVolume = shopVolume;
	}

	private boolean isDetailed(){
		return shop!=null&&shopAddress!=null&&shopComment!=null;
	}
	
	public Shop getShop() {
		return shop;
	}
	public void setShop(Shop shop) {
		this.shop = shop;
	}
	public Address getShopAddress() {
		return shopAddress;
	}
	public void setShopAddress(Address shopAddress) {
		this.shopAddress = shopAddress;
	}
	
	public List<Comment> getShopComment() {
		return shopComment;
	}
	public void setShopComment(List<Comment> shopComment) {
		this.shopComment = shopComment;
	}
	
	@Override
	public String toString() {
		return "ShopDetailedMessageForCustomerQueryVo [shop=" + shop + ", shopAddress=" + shopAddress + ", shopComment="
				+ shopComment + "]";
	}
	public ShopDetailedMessageForCustomerQueryVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
