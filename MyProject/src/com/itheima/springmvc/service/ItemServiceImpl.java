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
	
	
	@Override
	public void addItem(Item item) {
		// TODO Auto-generated method stub
		itemMapper.insertSelective(item);
	}

	@Override
	public void deleteItem(Item item) {
		// TODO Auto-generated method stub
		itemMapper.deleteItem(item);
	}

	@Override
	public void addShopItem(ShopItem shopItem) {
		// TODO Auto-generated method stub
		itemMapper.addShopItem(shopItem);
	}

	@Override
	public void deleteShopItem(ShopItem shopItem) {
		// TODO Auto-generated method stub
		itemMapper.deleteShopItem(shopItem);
	}

}
