package com.itheima.springmvc.service;
import java.util.List;

import com.itheima.springmvc.message.ShopDetailedMessageForCustomerQueryVo;
import com.itheima.springmvc.message.queryShopMessageForCustomer;
import com.itheima.springmvc.message.queryShopMessageForSeller;
import com.itheima.springmvc.pojo.Address;
import com.itheima.springmvc.pojo.Shop;
public interface ShopService {
	
	public Shop insertShop(Shop shop);
	public void deleteShop(Shop shop);
	public Shop updateShop(Shop shop);
	public Shop selectShopById(Integer id);
	public queryShopMessageForSeller getShopMessageForSeller(Shop shop);
	public String addDetailedAddress(Address add);
	public Shop pauseShop(Shop shop);
	public List<Shop> selectShopListByShopType(Shop shop);
}

