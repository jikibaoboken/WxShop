package com.itheima.springmvc.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.itheima.springmvc.pojo.Customer;
import com.itheima.springmvc.pojo.Order;
import com.itheima.springmvc.pojo.Shop;

public interface OrderService {
public List<Order> showShopOrderList(Shop shop);
	
	public List<Order> showCustomerOrderList(Customer customer);
	
	public Order addOrder(Order order);
	
	public void closeOrder(Order order);
	
	public void payOrder(Order order);
	
	public void shopRefuseOrder(Order order);
	
	public void customerRefuseOrder(Order order);
	
	public void recieveOrder(Order order);
	
	public void agreeRefuseOrder(Order order);
	
	public void disagreeRefuseOrder(Order order);
	
	public void completeOrder(Order order);
	
	public void deleteOrder(Order order);
	
	public Order getOrderDetail(Order order);
	
	//统计商店当月成交订单
	public Integer countItemForMonth(Shop shop);
}
