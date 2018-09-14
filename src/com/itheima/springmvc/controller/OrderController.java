package com.itheima.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itheima.springmvc.pojo.Customer;
import com.itheima.springmvc.pojo.Item;
import com.itheima.springmvc.pojo.Order;
import com.itheima.springmvc.pojo.Shop;
import com.itheima.springmvc.service.OrderServiceImpl;

@Controller
@RequestMapping("/order")
public class OrderController {
	@Autowired
	private OrderServiceImpl orderService;
	
	@RequestMapping("getOrderDetail.action")
	public @ResponseBody
	Order getOrderDetail(@RequestBody Order order)
	{
		return orderService.getOrderDetail(order);
	}
	@RequestMapping("/showShopOrderList.action")
	public @ResponseBody
	List<Order> showShopOrderList(@RequestBody Shop shop)
	{
		return orderService.showShopOrderList(shop);
	}
	
	@RequestMapping("/showCustomerOrderList.action")
	public @ResponseBody
	List<Order> showCustomerOrderList(@RequestBody Customer customer)
	{
		return orderService.showCustomerOrderList(customer);
	}
	
	@RequestMapping("/addOrder.action")
	public @ResponseBody
	Order addOrder(@RequestBody Order order)
	{	
		return orderService.addOrder(order);
	}
	
	@RequestMapping("/closeOrder.action")
	public @ResponseBody
	void closeOrder(@RequestBody Order order)
	{
		orderService.closeOrder(order);
	}
	
	@RequestMapping("/payOrder.action")
	public @ResponseBody
	void payOrder(@RequestBody Order order)
	{
		System.out.print(order+"conttttttttttttttttttttttttttttttttttttttttttttttttttttttttttt\n\ntttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttt");
		orderService.payOrder(order);//service的payOrder里面要有通知的函数
	}
	
	@RequestMapping("/shopRefuseOrder.action")
	public @ResponseBody
	void shopRefuseOrder(@RequestBody Order order)
	{
		orderService.shopRefuseOrder(order);//这个直接取消就行
	}
	
	@RequestMapping("/customerRefuseOrder.action")
	public @ResponseBody
	void customerRefuseOrder(@RequestBody Order order)
	{
		orderService.customerRefuseOrder(order);//要分商家接受订单前后,并且在接受订单后时，是要向商家询问
	}
	
	@RequestMapping("/recieveOrder")
	public @ResponseBody
	void recieveOrder(@RequestBody Order order)
	{
		orderService.recieveOrder(order);//指的是商家接受了订单
	}
	
	@RequestMapping("/agreeRefuseOrder.action")//同意不同意都是针对于商家接受订单之后的
	public @ResponseBody
	void agreeRefuseOrder(@RequestBody Order order)
	{
		orderService.payOrder(order);//内部是写改变状态并且退钱
	}
	
	@RequestMapping("/disagreeRefuseOrder.action")
	public @ResponseBody
	void disagreeRefuseOrder(@RequestBody Order order)
	{
		orderService.payOrder(order);//通知客户不允许拒绝
	}
	
	@RequestMapping("/completeOrder.action")
	public @ResponseBody
	void completeOrder(@RequestBody Order order)
	{
		orderService.completeOrder(order);//指的是客户确认收货了
	}
	
	@RequestMapping("/deleteOrder.action")
	public @ResponseBody
	void deleteOrder(@RequestBody Order order)
	{
		orderService.deleteOrder(order);
	}
}
