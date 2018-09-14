package com.itheima.springmvc.service;

import com.itheima.springmvc.pojo.Item;
import com.itheima.springmvc.pojo.ShopItem;

public interface ItemService {
	public void addItem(Item item);
	public void deleteItem(Item item);
	public void addShopItem(ShopItem shopItem);
	public void deleteShopItem(ShopItem shopItem);
}