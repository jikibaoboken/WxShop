package com.itheima.springmvc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.itheima.springmvc.dao.CustomerMapper;
import com.itheima.springmvc.pojo.CartGoodsInfo;
import com.itheima.springmvc.pojo.CartItem;
import com.itheima.springmvc.pojo.CartMessage;
import com.itheima.springmvc.pojo.Customer;
import com.itheima.springmvc.pojo.Item;
import com.itheima.springmvc.pojo.Order;
import com.itheima.springmvc.pojo.Shop;
import com.itheima.springmvc.pojo.ShopItem;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private CustomerMapper customerMapper;
	@Override
	public Customer register(Customer customer) {
		customerMapper.insert(customer);
		// TODO Auto-generated method stub
		return customer;
	}
	@Override
	public boolean login(String username,String password) {
		// TODO Auto-generated method stub
		String truePassword = customerMapper.selectPasswordByUsername(username);
		if(truePassword.equals(password))
		{
			return true;
		}
		else
			return false;
	}
	@Override
	public void update(Customer customer) {
		// TODO Auto-generated method stub
		customerMapper.update(customer);
		
	}
	@Override
	public List<Item> showLikes(Customer customer) {
		// TODO Auto-generated method stub
		 return customerMapper.selectItemsByCustomerId(customer);
	}
	@Override
	public Integer selectIdByUserName(String username) {
		// TODO Auto-generated method stub
		return customerMapper.selectIdByUserName(username);
	}
	@Override
	public void recharge(Customer customer) {
		// TODO Auto-generated method stub
		customerMapper.recharge(customer);
		
	}
	@Override
	public List<CartItem> showCart(Customer customer) {
		// TODO Auto-generated method stub
		List<CartItem> list = customerMapper.showCustomerCart(customer);
		for(CartItem cartItem : list)
		{
			cartItem.setGoods_list(customerMapper.findCartGoodsLsit(cartItem));
		}
		return list;
	}
	@Override
	public void updateCart(CartMessage cartMessage) {
		// TODO Auto-generated method stub
		
		customerMapper.deleteOfUpdateCart(cartMessage.getCustomerId());
		customerMapper.deleteGoodsOfUpdateCart(cartMessage.getCustomerId());
		
		System.out.print(cartMessage.getList()+",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
		if(cartMessage.getList()==null)
			return ;
		else
		{
			List<CartItem> list = cartMessage.getList();
			for(CartItem cartItem : list)
			{
				customerMapper.insertOfUpdateCart(cartItem);
				for(CartGoodsInfo info : cartItem.getGoods_list())
				{
					info.setCustomerId(cartMessage.getCustomerId());
					info.setShopId(cartItem.getBelong());
					customerMapper.insertGoodsOfUpdateCart(info);
				}
			}
		}
	}
	@Override
	public Customer wxLogin(Customer customer) {
		// TODO Auto-generated method stub
		Customer temp = customerMapper.selectCustomerByUserName(customer.getUsername());
		if(temp!=null)
			return temp;
		else
		{
			temp=new Customer();
			temp.setNickname("NotFound");
			return temp;
		}	
	}
	@Override
	public List<Shop> showShopLikes(Customer customer) {
		// TODO Auto-generated method stub
		List<ShopItem> listOfItem = customerMapper.showShopLikes(customer);
		List<Shop> listOfShop = new ArrayList<Shop>();
		for(ShopItem item : listOfItem)
		{
			Shop temp = customerMapper.selectShopByShopId(item);
			listOfShop.add(temp);
		}
		return listOfShop;
	}
}