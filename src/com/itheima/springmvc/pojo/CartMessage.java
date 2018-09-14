package com.itheima.springmvc.pojo;

import java.util.List;

public class CartMessage {
	private List<CartItem> list;
	
	private Integer customerId;

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public List<CartItem> getList() {
		return list;
	}

	public void setList(List<CartItem> list) {
		this.list = list;
	}
	
}
