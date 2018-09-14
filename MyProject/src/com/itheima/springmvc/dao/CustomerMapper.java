package com.itheima.springmvc.dao;

import java.util.List;

import com.itheima.springmvc.pojo.CartGoodsInfo;
import com.itheima.springmvc.pojo.CartItem;
import com.itheima.springmvc.pojo.Customer;
import com.itheima.springmvc.pojo.Item;
import com.itheima.springmvc.pojo.Shop;
import com.itheima.springmvc.pojo.ShopItem;

public interface CustomerMapper {
	
	public List<Item> selectItemsByCustomerId(Customer customer);
	
    public int deleteByPrimaryKey(Integer customerId);

    public void insert(Customer record);

    public int insertSelective(Customer record);

   
    public Customer selectByPrimaryKey(Integer customerId);

    
    public int updateByPrimaryKeySelective(Customer record);

    public int updateByPrimaryKey(Customer record);

	

	public String selectPasswordByUsername(String username);

	public void update(Customer customer);

	public Integer selectIdByUserName(String username);

	public void recharge(Customer customer);

	public List<CartItem> showCustomerCart(Customer customer);

	public List<CartGoodsInfo> findCartGoodsLsit(CartItem cartItem);

	public void deleteOfUpdateCart(Integer customerId);

	public void deleteGoodsOfUpdateCart(Integer customerId);

	public void insertOfUpdateCart(CartItem cartItem);

	public void insertGoodsOfUpdateCart(CartGoodsInfo info);

	public Customer selectCustomerByUserName(String username);

	public List<ShopItem> showShopLikes(Customer customer);

	public Shop selectShopByShopId(ShopItem item);
}