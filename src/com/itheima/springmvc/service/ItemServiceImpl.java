package com.itheima.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itheima.springmvc.dao.ItemMapper;
import com.itheima.springmvc.pojo.Item;
import com.itheima.springmvc.pojo.ShopItem;

@Service
public class ItemServiceImpl implements ItemService{
	@Autowired
	private ItemMapper itemMapper;
	
	
	
	public void addItem(Item item) {
		// TODO Auto-generated method stub
		itemMapper.insertSelective(item);
	}

	
	public void deleteItem(Item item) {
		// TODO Auto-generated method stub
		itemMapper.deleteItem(item);
	}

	
	public void addShopItem(ShopItem shopItem) {
		// TODO Auto-generated method stub
		itemMapper.addShopItem(shopItem);
	}

	
	public void deleteShopItem(ShopItem shopItem) {
		// TODO Auto-generated method stub
		itemMapper.deleteShopItem(shopItem);
	}

}
