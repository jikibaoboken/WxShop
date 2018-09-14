
package com.itheima.springmvc.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itheima.springmvc.dao.AddressMapper;
import com.itheima.springmvc.dao.ShopMapper;

import com.itheima.springmvc.message.queryShopMessageForSeller;
import com.itheima.springmvc.pojo.Address;

import com.itheima.springmvc.pojo.Shop;
import com.itheima.springmvc.pojo.ShopExample;

@Service
public class ShopServiceImpl implements ShopService {
	@Autowired
	private ShopMapper shopMapper;
	@Autowired
	private AddressMapper addressMapper;
	
	public Shop insertShop(Shop shop) {
		// TODO Auto-generated method stub
		shopMapper.insert(shop);
		Integer shopId=shop.getShopId();
		System.out.println(shop);
		Shop s=new Shop();
		if(shopId!=null)
			s=shopMapper.selectByPrimaryKey(shopId);
		else
		{
			s.setShopId(-999);
		}
		return s;
	}
	public void deleteShop(Shop shop){
		shopMapper.deleteByPrimaryKey(shop.getShopId());
	}
	/**
	 * 更新商店的信息
	 * @author Maugham
	 */
	public Shop updateShop(Shop shop){
		Shop s=new Shop();
		if(shop.getShopId()!=null){
			s=shopMapper.selectByPrimaryKey(shop.getShopId());
			if(shop.getShopImage()!=null&&shop.getShopIntroduction()!=null&&shop.getShopName()!=null){
				s.setShopIntroduction(shop.getShopIntroduction());
				s.setShopName(shop.getShopName());
				s.setShopImage(shop.getShopImage());
			}
			shopMapper.updateByPrimaryKeySelective(s);
		}
		return s;		 
	}
	public Shop selectShopById(Integer id){
		return shopMapper.selectByPrimaryKey(id);
	}
	public queryShopMessageForSeller getShopMessageForSeller(Shop shop){
		queryShopMessageForSeller query=new queryShopMessageForSeller();
		Shop res=shopMapper.selectByPrimaryKey(shop.getShopId());
		String[] strings=res.getShopImage().split("\\|");
		if(strings!=null)
			query.setShopimageurl("http://112.74.182.209:8080/pic/"+strings[0]);
		query.setShopname(res.getShopName());
		query.setShoptext(res.getShopIntroduction());
		return query;
	}
	
	public String addDetailedAddress(Address add){
		if(add.messageFull()){
			addressMapper.insert(add);
			return "Insert detailed address successfully!";
		}
		else
			return "Address message is not completed!";
	}
	public Shop pauseShop(Shop shop){
		Shop res=new Shop();
		if(shop.getShopCondition()!=null&&shop.getShopCondition()>=1&&shop.getShopCondition()<=3)
		{
			Integer con=shopMapper.selectByPrimaryKey(shop.getShopId()).getShopCondition();
			if(con!=null&&con!=shop.getShopCondition()){
				Shop s=new Shop();
				s.setShopCondition(shop.getShopCondition());
				s.setShopId(shop.getShopId());
				shopMapper.updateByPrimaryKeySelective(s);
				res=shopMapper.selectByPrimaryKey(shop.getShopId());
			}
			else{
				System.out.println("ResultMessage: shop condition is null or is same with database record.");
			}
		}
		else{
			System.out.println("ResultMessage: shop condition maybe null or maybe out of bound.");
		}
		return res;
	}
	public List<Shop> selectShopListByShopType(Shop shop){
		ShopExample example=new ShopExample();
		if(shop.getShopType()!=null&&shop.getShopType()!="")
			example.createCriteria().andShopTypeEqualTo(shop.getShopType());
		return shopMapper.selectByExample(example);
	}
}