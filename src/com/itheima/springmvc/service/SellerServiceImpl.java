package com.itheima.springmvc.service;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.itheima.springmvc.dao.SellerMapper;
import com.itheima.springmvc.dao.ShopMapper;
import com.itheima.springmvc.pojo.Seller;
import com.itheima.springmvc.pojo.SellerExample;
import com.itheima.springmvc.pojo.Shop;
import com.itheima.springmvc.pojo.ShopExample;
@Service
public class SellerServiceImpl implements SellerService {
	@Autowired
	private SellerMapper sellerMapper;
	@Autowired
	private ShopMapper shopMapper;
	
	public void insertSeller(Seller seller) {
		// TODO Auto-generated method stub
		sellerMapper.insert(seller);
	}
	public void deleteSeller(Seller seller){
		sellerMapper.deleteByPrimaryKey(seller.getSellerId());
	}
	public void updateSeller(Seller seller){
		sellerMapper.updateByPrimaryKeySelective(seller);
	}
	public Seller selectSellerById(Integer id){
		return sellerMapper.selectByPrimaryKey(id);
	}
	//此处设计有极大风险，后期应当通过一对一关联修改sql语句完成
	public Integer selectSellerIdByusername(Seller seller)
	{
		SellerExample sellerExample=new SellerExample();
		sellerExample.createCriteria().andUsernameEqualTo(seller.getUsername());
		List<Seller> res=sellerMapper.selectByExample(sellerExample);
		return res.get(0).getSellerId();
	}
	public List<Shop> selectshopBysellerID(Seller seller)
	{
		ShopExample ex=new ShopExample();
		ex.createCriteria().andSellerIdEqualTo(seller.getSellerId());
		return shopMapper.selectByExample(ex);
	}
}
