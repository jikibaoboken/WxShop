package com.itheima.springmvc.pojo;

import java.util.List;

public class GoodsQueryVo {
	private Goods goods;
	private List<String> imgURL;
	public Goods getGoods() {
		return goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}

	public GoodsQueryVo() {
	}
}
