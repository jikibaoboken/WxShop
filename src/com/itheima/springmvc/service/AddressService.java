package com.itheima.springmvc.service;

import java.util.List;

import com.itheima.springmvc.pojo.Address;
import com.itheima.springmvc.pojo.Shop;

public interface AddressService {
	public Address getShopAddress(Shop shop);
	public List<Address> getShopListWithCloseToCustomer(Address address);
}
