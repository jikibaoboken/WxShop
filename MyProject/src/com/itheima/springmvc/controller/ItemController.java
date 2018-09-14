package com.itheima.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itheima.springmvc.pojo.Item;
import com.itheima.springmvc.pojo.Shop;
import com.itheima.springmvc.pojo.ShopItem;
import com.itheima.springmvc.service.ItemService;

@Controller
@RequestMapping("/item")
public class ItemController {
	@Autowired
	private ItemService itemService;
	
	@RequestMapping("/addItem.action")
	public @ResponseBody
	String addItem(@RequestBody Item item)
	{
		itemService.addItem(item);
		return "success";
	}
	
	@RequestMapping("/deleteItem.action")
	public @ResponseBody
	String deleteItem(@RequestBody Item item)
	{
		itemService.deleteItem(item);
		return "success";
	}
	
	@RequestMapping("/addShopItem.action")
	public @ResponseBody
	String addShopItem(@RequestBody ShopItem shopItem)
	{
		itemService.addShopItem(shopItem);
		return "success";
	}
	
	@RequestMapping("/deleteShopItem.action")
	public @ResponseBody
	String deleteShopItem(@RequestBody ShopItem shopItem)
	{
		itemService.deleteShopItem(shopItem);
		return "success";
	}
}
