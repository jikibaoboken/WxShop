package com.itheima.springmvc.dao;

import com.itheima.springmvc.pojo.Item;
import com.itheima.springmvc.pojo.ShopItem;

public interface ItemMapper {


    int deleteByPrimaryKey(Integer itemId);

    int insert(Item record);

    int insertSelective(Item record);


    Item selectByPrimaryKey(Integer itemId);


    int updateByPrimaryKeySelective(Item record);

    int updateByPrimaryKey(Item record);

	void addShopItem(ShopItem shopItem);

	void deleteShopItem(ShopItem shopItem);

	void deleteItem(Item item);
}