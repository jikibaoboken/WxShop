package com.itheima.springmvc.pojo;

import java.util.List;

public class CartItem {
	 	private Integer cartItemId;

	    private Integer orderState;

	    private Double orderPrice;

	    private String createTime;

	    private Double transferFee;

	    private String remarks;

	    private Integer customerId;
	    
	    private String customerAddress;

	    private Integer sellerId;

	    private List<CartGoodsInfo> goods_list;

	    private Integer belong;

		public Integer getOrderState() {
			return orderState;
		}

		public void setOrderState(Integer orderState) {
			this.orderState = orderState;
		}

		public Double getOrderPrice() {
			return orderPrice;
		}

		public void setOrderPrice(Double orderPrice) {
			this.orderPrice = orderPrice;
		}

		public String getCreateTime() {
			return createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public Double getTransferFee() {
			return transferFee;
		}

		public void setTransferFee(Double transferFee) {
			this.transferFee = transferFee;
		}

		public String getRemarks() {
			return remarks;
		}

		public void setRemarks(String remarks) {
			this.remarks = remarks;
		}

		public Integer getCustomerId() {
			return customerId;
		}

		public void setCustomerId(Integer customerId) {
			this.customerId = customerId;
		}

		public String getCustomerAddress() {
			return customerAddress;
		}

		public void setCustomerAddress(String customerAddress) {
			this.customerAddress = customerAddress;
		}

		public Integer getSellerId() {
			return sellerId;
		}

		public void setSellerId(Integer sellerId) {
			this.sellerId = sellerId;
		}
		
		public Integer getBelong() {
			return belong;
		}

		public void setBelong(Integer belong) {
			this.belong = belong;
		}
		public Integer getCartItemId() {
			return cartItemId;
		}

		public void setCartItemId(Integer cartItemId) {
			this.cartItemId = cartItemId;
		}

		public List<CartGoodsInfo> getGoods_list() {
			return goods_list;
		}

		public void setGoods_list(List<CartGoodsInfo> goods_list) {
			this.goods_list = goods_list;
		}
	    
	    


}
