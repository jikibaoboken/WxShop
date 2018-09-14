package com.itheima.springmvc.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itheima.springmvc.dao.AddressMapper;
import com.itheima.springmvc.pojo.Address;
import com.itheima.springmvc.pojo.AddressExample;
import com.itheima.springmvc.pojo.Shop;

@Service
public class AddressServiceImpl implements AddressService {
	@Autowired
	private AddressMapper addressMapper;
	
	
	/**
	 * @author Maugham
	 * @return 返回商店的地址
	 */
	public Address getShopAddress(Shop shop){
		//获取数据库中该商店的Address
		AddressExample addressExample=new AddressExample();
		addressExample.createCriteria().andHostTypeEqualTo("shop").andHostIdEqualTo(shop.getShopId()).andHostAddressIsNotNull().andHostNameIsNotNull().andLatitudeIsNotNull().andLongitudeIsNotNull();
		List<Address> resList=addressMapper.selectByExample(addressExample);
		if(resList!=null&&resList.size()==1)
			return resList.get(0);
		else{
			return new Address();
		}
	}
	/**
	 * @author Maugham
	 * 返回一定范围内的商店地址列表
	 */
	public List<Address> getShopListWithCloseToCustomer(Address address){
		Float longitudeFloat=address.getLongitude();
		Float latitudeFloat=address.getLatitude();
		BigDecimal b1 = new BigDecimal(latitudeFloat.floatValue());
		BigDecimal b2 = new BigDecimal(longitudeFloat.floatValue());
		BigDecimal cs=new BigDecimal(0.1);
		
		AddressExample addressExample=new AddressExample();
		addressExample.createCriteria().andLatitudeBetween(b1.subtract(cs).floatValue(),b1.add(cs).floatValue()).andLongitudeBetween(b2.subtract(cs).floatValue(),b2.add(cs).floatValue()).andHostTypeEqualTo("shop");
		//addressExample.createCriteria().andHostTypeEqualTo("shop").andLatitudeGreaterThanOrEqualTo(b2.subtract(cs).floatValue()).andLatitudeLessThanOrEqualTo(b2.add(cs).floatValue());
		return addressMapper.selectByExample(addressExample);
	}
}
