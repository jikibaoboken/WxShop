package com.itheima.springmvc.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.socket.TextMessage;

import com.itheima.springmvc.dao.OrderMapper;
import com.itheima.springmvc.pojo.Customer;
import com.itheima.springmvc.pojo.GoodsInfo;
import com.itheima.springmvc.pojo.Order;
import com.itheima.springmvc.pojo.Shop;
import com.itheima.springmvc.websocket.ShopSpringWebSocketHandler;
import com.itheima.springmvc.websocket.SpringWebSocketHandler;

@Service
public class OrderServiceImpl implements OrderService{
	@Autowired
	private OrderMapper orderMapper;
	
	//@Autowired
	//private WebSocketPushHandler handler;

	public List<Order> showShopOrderList(Shop shop) {//商家看自己所有的订单列表
		// TODO Auto-generated method stub
		List<Order> list = orderMapper.showShopOrderList(shop);
		for(Order order : list)
		{
			order.setGoods_list(orderMapper.findOrderGoodsList(order));
		}
		return list;
	}

	@Override
	public List<Order> showCustomerOrderList(Customer customer) {//客户看自己的订单列表
		// TODO Auto-generated method stub
		List<Order> list = orderMapper.showCustomerOrderList(customer);
		for(Order order : list)
		{
			order.setGoods_list(orderMapper.findOrderGoodsList(order));
		}
		return list;
	}

	@Override
	public Order addOrder(Order order) {
		// TODO Auto-generated method stub
		List<GoodsInfo> list = order.getGoods_list();
		double order_price = 0;
		for(GoodsInfo info : list)
		{
			order_price += info.getGoodsPrice()*info.getGoodsCount();
		}
		order_price+=order.getTransferFee();
		order.setOrderPrice(order_price);
		orderMapper.insertSelective(order);
		int order_id = order.getOrderId();
		System.out.print(order_id);
		for(GoodsInfo info : list)
		{
			info.setOrderId(order_id);
			orderMapper.insertGoodsInfo(info);
		}
		return order;
	}

	@Override
	public void closeOrder(Order order) {
		// TODO Auto-generated method stub
		orderMapper.closeOrder(order);
	}

	@Override
	public void payOrder(Order order) {
		// TODO Auto-generated method stub
		orderMapper.payMoney(order);
		orderMapper.setPayOrderState(order);
		
		new ShopSpringWebSocketHandler().sendMessageToShop(order.getBelong()+"", new TextMessage("newOrder:"+order.getOrderId()));
	}

	@Override
	public void shopRefuseOrder(Order order) {
		// TODO Auto-generated method stub
		if(orderMapper.selectStateOfOrder(order)==3)
		{
			return ;
		}
		if(orderMapper.selectStateOfOrder(order)==2)
		{
			orderMapper.returnMoney(order);
			orderMapper.refuseOrder(order);
			
			//通知客户已取消订单
		}
	}

	@Override
	public void customerRefuseOrder(Order order) {
		// TODO Auto-generated method stub
		if(orderMapper.selectStateOfOrder(order)==4)
		{
			//******************询问商家是否可以取消订单，剩下的让其他action解决就好
		}
		if(orderMapper.selectStateOfOrder(order)==3)
		{
			return ;
		}
		if(orderMapper.selectStateOfOrder(order)==2)
		{
			orderMapper.returnMoney(order);
			orderMapper.refuseOrder(order);//refuseOrder的意思都是把order_state设成3
			
			//客户显示已取消订单,通知商家已取消订单
		}
	}

	@Override
	public void recieveOrder(Order order) {
		// TODO Auto-generated method stub
		orderMapper.setTransferringState(order);
		
		//命令用户显示配送中状态
		new SpringWebSocketHandler().sendMessageToUser(order.getCustomerId()+"", new TextMessage("shopRecieveOrder"));
	}

	@Override
	public void agreeRefuseOrder(Order order) {
		// TODO Auto-generated method stub
		orderMapper.returnMoney(order);
		orderMapper.setAgreeRefuseState(order);
		
		//告诉用户商家已同意取消订单
	}

	@Override
	public void disagreeRefuseOrder(Order order) {
		// TODO Auto-generated method stub
		
		//告诉用户商家不同意取消订单
	}

	@Override
	public void completeOrder(Order order) {
		// TODO Auto-generated method stub
		orderMapper.completeOrder(order);
		
		//告诉用户已完成订单
		new SpringWebSocketHandler().sendMessageToUser(order.getCustomerId()+"", new TextMessage("the order has been completed"));
	}

	@Override
	public void deleteOrder(Order order) {
		// TODO Auto-generated method stub
		orderMapper.deleteGoodsListOfOrder(order);
		orderMapper.deleteOrder(order);
		
		//刷新用户界面，不再由该订单
	}

	public Order getOrderDetail(Order order) {
		// TODO Auto-generated method stub
		return orderMapper.getOrderDetail(order);
	}
	
}
