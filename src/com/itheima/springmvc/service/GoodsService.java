package com.itheima.springmvc.service;

import java.util.List;

import com.itheima.springmvc.message.queryGoodsMessageForCustomer;
import com.itheima.springmvc.pojo.Goods;
import com.itheima.springmvc.pojo.Shop;

public interface GoodsService {
	public Integer insertGoods(Goods goods);
	public void deleteGoods(Goods goods);
	public void addPictures(Goods goods);
	public List<Goods> selectGoodsByShopId(Goods goods);
	public List<String> selectGoodsPicURLById(Goods goods);
	//根据店铺ID返回该店所有的商品
	public List<Goods> selectGoodsByShopId(Shop shop);
	//根据店铺的ID，显示该店铺所拥有的所有商品的关键信息
	public List<queryGoodsMessageForCustomer> showGoodsListByShopId(Shop shop);
	//根据商品ID返回商品信息
	public Goods selectGoodsByGoodsId(Goods goods);
	/**
	 * 增加商品测试数据
	 */
	public String  addGoodsRandomly(int numberOfGoods);
}
