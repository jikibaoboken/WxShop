package com.itheima.springmvc.service;
import java.util.List;

import com.itheima.springmvc.pojo.Seller;
import com.itheima.springmvc.pojo.Shop;
public interface SellerService {
	
	public void insertSeller(Seller seller);
	public void deleteSeller(Seller seller);
	public void updateSeller(Seller seller);
	public Seller selectSellerById(Integer id);
	public Integer selectSellerIdByusername(Seller seller);
	public List<Shop> selectshopBysellerID(Seller seller);
}

