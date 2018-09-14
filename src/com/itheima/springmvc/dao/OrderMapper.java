package com.itheima.springmvc.dao;

import com.itheima.springmvc.pojo.Customer;
import com.itheima.springmvc.pojo.GoodsInfo;
import com.itheima.springmvc.pojo.Order;
import com.itheima.springmvc.pojo.OrderExample;
import com.itheima.springmvc.pojo.Shop;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderMapper {
	int countByExample(OrderExample example);

    int deleteByExample(OrderExample example);

    int deleteByPrimaryKey(Integer orderId);

    int insert(Order record);

    int insertSelective(Order record);//addorder

    List<Order> selectByExample(OrderExample example);

    Order selectByPrimaryKey(Integer orderId);

    int updateByExampleSelective(@Param("record") Order record, @Param("example") OrderExample example);

    int updateByExample(@Param("record") Order record, @Param("example") OrderExample example);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    List<Order> showShopOrderList(Shop shop);
    
    List<Order> showCustomerOrderList(Customer customer);

	void closeOrder(Order order);

	void payMoney(Order order);

	void setPayOrderState(Order order);

	int selectStateOfOrder(Order order);

	void returnMoney(Order order);

	void refuseOrder(Order order);

	void setTransferringState(Order order);

	void setAgreeRefuseState(Order order);

	void deleteOrder(Order order);

	void completeOrder(Order order);

	void insertGoodsInfo(GoodsInfo info);

	void deleteGoodsListOfOrder(Order order);

	List<GoodsInfo> findOrderGoodsList(Order order);

	Order getOrderDetail(Order order);
}