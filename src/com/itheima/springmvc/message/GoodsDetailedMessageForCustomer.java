package com.itheima.springmvc.message;

import java.util.List;

import com.itheima.springmvc.pojo.Goods;
import com.itheima.springmvc.pojo.Goodscomment;


public class GoodsDetailedMessageForCustomer {
	private Goods goods;
	private List<Goodscomment> commments;
	private List<String> imageList;
	private Integer greatCommentNumber;
	public Goods getGoods() {
		return goods;
	}
	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	public List<Goodscomment> getCommments() {
		return commments;
	}
	public void setCommments(List<Goodscomment> commments) {
		this.commments = commments;
	}
	public List<String> getImageList() {
		return imageList;
	}
	public void setImageList(List<String> imageList) {
		this.imageList = imageList;
	}
	public Integer getGreatCommentNumber() {
		return greatCommentNumber;
	}
	public void setGreatCommentNumber(Integer greatCommentNumber) {
		this.greatCommentNumber = greatCommentNumber;
	}
	@Override
	public String toString() {
		return "GoodsDetailedMessageForCustomer [goods=" + goods + ", commments=" + commments + ", imageList="
				+ imageList + ", greatCommentNumber=" + greatCommentNumber + "]";
	}
	public GoodsDetailedMessageForCustomer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
