package com.itheima.springmvc.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itheima.springmvc.message.ShopDetailedMessageForCustomerQueryVo;
import com.itheima.springmvc.message.queryShopMessageForCustomer;
import com.itheima.springmvc.pojo.Address;
import com.itheima.springmvc.pojo.AddressExample;
import com.itheima.springmvc.pojo.Comment;
import com.itheima.springmvc.pojo.Shop;
import com.itheima.springmvc.service.AddressService;
import com.itheima.springmvc.service.CommentService;
import com.itheima.springmvc.service.OrderService;
import com.itheima.springmvc.service.ShopService;
import com.springmvc.utils.Distance;

@Controller
public class QueryShopMessageController {
	@Autowired
	private ShopService shopService;
	@Autowired
	private AddressService addressService;
	@Autowired
	private OrderService orderService;
	@Autowired
	private CommentService commentService;
	
	/**
	 * 返回商店的信息
	 * @param shop
	 * @return ShopDetailedMessageForCustomerQueryVo
	 */
	@RequestMapping(value="/query/queryDetailedShopMessage.action")
	public @ResponseBody 
	ShopDetailedMessageForCustomerQueryVo getShopDetailedMessageForCustomerQueryVo(@RequestBody Shop shop){
		ShopDetailedMessageForCustomerQueryVo q=new ShopDetailedMessageForCustomerQueryVo();
		if(shop.getShopId()!=null){
			Shop res=shopService.selectShopById(shop.getShopId());
			q.setShop(res);
			
			//获取该商店的地址
			Address address=addressService.getShopAddress(shop);
			if(address!=null)
				q.setShopAddress(address);
			
			//获取店铺总评分
			q.setShopAverageGrade(commentService.getAverageCommentGrade(shop));
			
			//获取总评comment
			Comment cs=commentService.getAllAverageCommentGrade(shop);
			q.setConsistency(cs.getConsistency());
			q.setLogistics(cs.getLogistics());
			q.setService(cs.getService());
			
			//获取该商店的100条订单
			List<Comment> comments=commentService.selectCommentByShopID(shop);
			if(comments!=null&&comments.size()<=100){
				q.setShopComment(comments);
			}
			else{
				if(comments.size()>100){
					List<Comment> list=new ArrayList<Comment>();
					for(int i=0;i<100;i++)
						list.add(comments.get(i));
					q.setShopComment(list);
				}
			}
			//获取月销量
			q.setShopVolume(orderService.countItemForMonth(shop));
			
		}
		return q;
	}
	/**
	 * 根据传入的地址返回5公里内的所有商店List
	 * @param address
	 * @return
	 */
	@RequestMapping(value="/query/GetShopClosedToCustomer.action")
	public @ResponseBody
	List<queryShopMessageForCustomer> GetShopClosedToCustomer(@RequestBody Address address){
		List<Address> resList=addressService.getShopListWithCloseToCustomer(address);		
		List<Integer> shopids=new ArrayList<Integer>();
		List<Shop> shops=new ArrayList<Shop>();
		for(Address add:resList){
			Integer shopId=add.getHostId();
			Shop s=shopService.selectShopById(shopId);
			shops.add(s);
		}
		List<queryShopMessageForCustomer> list=new ArrayList<queryShopMessageForCustomer>();
		for(Shop s:shops){
			queryShopMessageForCustomer query=new queryShopMessageForCustomer();
			query.setShopId(s.getShopId());
			//设置商店的回显图片
			String[] strings=s.getShopImage().split("\\|");
			if(strings!=null)
				query.setShopImageURL("http://112.74.182.209:8080/pic/"+strings[0]);
			//计算传入点的经纬度与商店的距离
			Address shopAdd=addressService.getShopAddress(s);
			double dis=0.0;
			if(shopAdd!=null){
				dis=Distance.GetDistance(address.getLongitude(),
						address.getLatitude(),
						shopAdd.getLongitude(),
						shopAdd.getLatitude());
				query.setDistance(dis);
				query.setDeliveryPrice(Distance.getDeliveryPrice(dis));
				query.setDeliveryTimeCost(Distance.getAverageTime(dis));
			}
			//
			query.setShopName(s.getShopName());
			query.setShopLeastCount(s.getLeastCount());
			query.setShopVolume(orderService.countItemForMonth(s));
			//计算商店平均评分
			query.setShopGrade(commentService.getAverageCommentGrade(s));
			list.add(query);
		}
		return list;
	}
	@RequestMapping(value="/query/GetShopListByShopType.action")
	public @ResponseBody
	List<ShopDetailedMessageForCustomerQueryVo> GetShopListByShopType(@RequestBody Shop shop){
		List<ShopDetailedMessageForCustomerQueryVo> list=new ArrayList<ShopDetailedMessageForCustomerQueryVo>();
		if(shop.getShopType()!=null){
			List<Shop> shopList=shopService.selectShopListByShopType(shop);
			for(Shop s:shopList){
				ShopDetailedMessageForCustomerQueryVo vo=new ShopDetailedMessageForCustomerQueryVo();
				Comment c=commentService.getAllAverageCommentGrade(s);
				vo.setConsistency(c.getConsistency());
				vo.setLogistics(c.getLogistics());
				vo.setService(c.getService());
				vo.setShop(s);
				vo.setShopAddress(addressService.getShopAddress(s));
				vo.setShopAverageGrade(commentService.getAverageCommentGrade(s));
				vo.setShopComment(commentService.selectCommentByShopID(s));
				vo.setShopVolume(orderService.countItemForMonth(s));
				list.add(vo);
			}
		}
		return list;
	}
}
