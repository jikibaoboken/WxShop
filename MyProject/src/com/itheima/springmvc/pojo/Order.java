package com.itheima.springmvc.pojo;

import java.util.List;

public class Order {
    private Integer orderId;

    private Integer orderState;

    private Double orderPrice;

    private String createTime;

    private Double transferFee;

    private String remarks;

    private Integer customerId;

    @Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderState=" + orderState + ", orderPrice=" + orderPrice
				+ ", createTime=" + createTime + ", transferFee=" + transferFee + ", remarks=" + remarks
				+ ", customerId=" + customerId + ", customerAddress=" + customerAddress + ", sellerId=" + sellerId
				+ ", goods_list=" + goods_list + ", belong=" + belong + "]";
	}

	private String customerAddress;

    private Integer sellerId;

    private List<GoodsInfo> goods_list;

    private Integer belong;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

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
        this.createTime = createTime == null ? null : createTime.trim();
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
        this.remarks = remarks == null ? null : remarks.trim();
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
        this.customerAddress = customerAddress == null ? null : customerAddress.trim();
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

	public List<GoodsInfo> getGoods_list() {
		return goods_list;
	}

	public void setGoods_list(List<GoodsInfo> goods_list) {
		this.goods_list = goods_list;
	}
}