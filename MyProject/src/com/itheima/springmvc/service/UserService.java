package com.itheima.springmvc.service;

import java.util.List;

import com.itheima.springmvc.pojo.CartItem;
import com.itheima.springmvc.pojo.CartMessage;
import com.itheima.springmvc.pojo.Customer;
import com.itheima.springmvc.pojo.Item;
import com.itheima.springmvc.pojo.Shop;

public interface UserService {

	public Customer register(Customer customer);
	public boolean login(String username,String password);
	public void update(Customer customer);
	public List<Item> showLikes(Customer customer);
	public Integer selectIdByUserName(String username);
	public void recharge(Customer customer);
	public List<CartItem> showCart(Customer customer);
	public void updateCart(CartMessage cartMessage);
	public Customer wxLogin(Customer customer);
	public List<Shop> showShopLikes(Customer customer);
}
