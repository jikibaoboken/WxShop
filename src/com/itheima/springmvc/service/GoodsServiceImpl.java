package com.itheima.springmvc.service;

import java.awt.font.NumericShaper.Range;
import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itheima.springmvc.dao.GoodsMapper;
import com.itheima.springmvc.message.queryGoodsMessageForCustomer;
import com.itheima.springmvc.pojo.Goods;
import com.itheima.springmvc.pojo.GoodsExample;
import com.itheima.springmvc.pojo.Shop;
@Service
public class GoodsServiceImpl implements GoodsService {
	@Autowired
	private GoodsMapper goodsMapper;
	
	public Integer insertGoods(Goods goods) {
		// TODO Auto-generated method stub
		goodsMapper.insert(goods);
		GoodsExample example=new GoodsExample();
		example.createCriteria().andBelongEqualTo(goods.getBelong()).andGoodsAvatarEqualTo(goods.getGoodsAvatar()).andGoodsShelftimeEqualTo(goods.getGoodsShelftime()).andGoodsInventoryEqualTo(goods.getGoodsInventory()).andGoodsPriceEqualTo(goods.getGoodsPrice()).andGoodsNameEqualTo(goods.getGoodsName());
		
		List<Goods> list=goodsMapper.selectByExample(example);
		if(list.size()==1)
			return list.get(0).getGoodsId();
		else {
			return -1;
		}
	}
	public void deleteGoods(Goods goods){
		goodsMapper.deleteByPrimaryKey(goods.getGoodsId());
	}
	public List<Goods> selectGoodsByShopId(Goods goods){
		GoodsExample goodsExample=new GoodsExample();
		if(goods.getGoodsType().equals("全部"))
			goodsExample.createCriteria().andBelongEqualTo(goods.getBelong());
		else {
			goodsExample.createCriteria().andBelongEqualTo(goods.getBelong()).andGoodsTypeEqualTo(goods.getGoodsType());
		}
		return goodsMapper.selectByExample(goodsExample);
	}
	/**
	 * 增加商品的图片
	 */
	public void addPictures(Goods goods){
		//判断此商品确实存在
		if(goodsMapper.selectByPrimaryKey(goods.getGoodsId())!=null){
			Goods gsGoods=goodsMapper.selectByPrimaryKey(goods.getGoodsId());
			String string=gsGoods.getGoodsAvatar();
			gsGoods.setGoodsAvatar(string+"|"+goods.getGoodsAvatar());
			goodsMapper.updateByPrimaryKeySelective(gsGoods);
		}
	}
	public List<String> selectGoodsPicURLById(Goods goods){
		if(goodsMapper.selectByPrimaryKey(goods.getGoodsId())!=null){
			Goods gsGoods=goodsMapper.selectByPrimaryKey(goods.getGoodsId());
			String string=gsGoods.getGoodsAvatar();
			String[] list=string.split("\\|");
			List<String> list2=new ArrayList<String>();
			for(String s:list){
				s="112.74.182.209:8080/pic/"+s;
				list2.add(s);
			}
			return list2;
		}
		else{
			List<String> lsList= new ArrayList<String>();
			lsList.add("No Goods with this id");
			return lsList;
		}
	}
	public List<queryGoodsMessageForCustomer> showGoodsListByShopId(Shop shop){
		GoodsExample goodsExample=new GoodsExample();
		goodsExample.createCriteria().andBelongEqualTo(String.valueOf(shop.getShopId()));
		List<Goods> list=goodsMapper.selectByExample(goodsExample);
		List<queryGoodsMessageForCustomer> query=new ArrayList<queryGoodsMessageForCustomer>();
		if(list!=null){
			for(Goods gs:list){
				queryGoodsMessageForCustomer q=new queryGoodsMessageForCustomer();
				q.setId(String.valueOf(gs.getGoodsId()));
				String[] strings=gs.getGoodsAvatar().split("\\|");
				if(strings!=null)
					q.setImgUrl("http://112.74.182.209:8080/pic/"+strings[0]);
				q.setName(gs.getGoodsName());
				q.setPrice(gs.getGoodsPrice());
				query.add(q);
			}
			return query;
		}
		return query;
	}
	public String addGoodsRandomly(int numberOfGoods){
		Random rand = new Random();
		String[] types={"美妆个护","居家餐厨","数码家电","食品饮料","图书文具",
					"母婴玩具","服装鞋帽","箱包眼镜"};
		String[] goodsName={"饼干类","零嘴","各式洋芋片","宠物食品","糖业类","厕所用品","榖类食品 Cereals",
				"家禽类 Poultry","各式腌菜 Pickles","肉品类 (鸡, 猪, 牛)","海产类","大鸡腿 Fresh Grade Legs",
				"鸡胸肉 Fresh Grade Breast","小鸡腿 Chicken Drumsticks","鸡翅膀 Chicken Wings","猪肝 Pigs Liver",
				"猪腰 Pigs Kidney","猪心 Pigs Hearts","猪肚 Pig bag","没骨头的猪排 Pork Steak",
				"猪脚 Pigs feet","连骨头的猪排 Pork Chops","卷好的腰部瘦肉 Rolled Pork loin",
				"鲔鱼 Tuna","比目鱼 Plaice","鱆鱼 Octopus","马铃薯 Potato","红萝卜 Carrot","洋葱 Onion",
				"茄子 Aubergine","芹菜 Celery","包心菜 White Cabbage","紫色包心菜 Red cabbage",
				"大黄瓜 Cucumber","蕃茄 Tomato","小红萝卜 Radish","白萝卜 Mooli",
				"西洋菜 Watercress","玉米尖 Baby corn","白花菜 Cauliflower","绿花菜 Broccoli florets","绿皮南瓜","香菜",
				"四季豆"};
		String[] descs={"花儿朵朵彩色金属门后挂&nbsp;8钩免钉门背挂钩2066","产品概述：如此美味水果即使闻其清香也能倍添睡意，如果拥抱入怀更能增加梦境，材质柔软舒适，形状贴切实用，左右立体环绕声，音乐从后脑勺里流淌出来。。。即使旅游行程中也能让你安享音乐所带来的非一般的感觉！",
				     "茄（学名：Solanum melongena L.）茄科，茄属植物。茄直立分枝草本至亚灌木，高可达1米，小枝，叶柄及花梗均被6-8-（10）分枝，平贴或具短柄的星状绒毛，小枝多为紫色（野生的往往有皮刺），渐老则毛被逐渐脱落。叶大，卵形至长圆状卵形，叶柄长约2-4.5厘米（野生的",
				     "番茄，即西红柿（学名：Lycopersicon esculentum Mill.），是茄科番茄属一年生或多年生草本植物，体高0.6-2米，全体生粘质腺毛，有强烈气味，茎易倒伏，叶羽状复叶或羽状深裂，花序总梗长2-5厘米，常3-7朵花，花萼辐状，花冠辐状，浆果扁球...",
				     "薯片（英国英语：crisps；美国英语：potato chips）是指由马铃薯（土豆）制成的零食。薯片制作方法是把马铃薯去皮后切为薄片，然后炸或烤至脆口并加以调味即可，薯片已成为很多国家零食市场重要一部份。"};
		File directory=new File("/usr/pic/");
		File[] picFiles=directory.listFiles();
		String stringBuffer="";
		for(int i=0;i<numberOfGoods;i++){
			Goods goods=new Goods();
			//设置该商品所属的商家，商家id范围：1-100000
			//goods.setBelong(String.valueOf(rand.nextInt(100000)+1));
			goods.setBelong("5");
			//设置该商品的库存量，库存量范围：1-500
			goods.setGoodsInventory(rand.nextInt(500)+1);
			//设置该商品的价格，价格范围：1-50000
			goods.setGoodsPrice(String.valueOf(rand.nextInt(50000)+1));
			//设置该商品的上架时间
			Date date=new Date();
			String string=date.toString();
			goods.setGoodsShelftime(string);
			//设置该商品的类型
			goods.setGoodsType(types[rand.nextInt(8)]);
			//设置该商品的照片
			File pictureFile=picFiles[rand.nextInt(picFiles.length)];
			String ext=FilenameUtils.getExtension(pictureFile.getName());
			stringBuffer+=pictureFile.getName()+"     ";
			//stringBuffer.append(pictureFile.getName()+"     ");
			goods.setGoodsAvatar(pictureFile.getName());
			//设置该商品的描述
			String descccc=descs[rand.nextInt(descs.length)];
			goods.setGoodsDescription(descccc);
			//设置该商品的名称
			String name=goodsName[rand.nextInt(goodsName.length)];
			goods.setGoodsName(name);
			goods.setGoodsSale(rand.nextInt(500));
			goodsMapper.insert(goods);
		}
		return stringBuffer;
	}
	public List<Goods> selectGoodsByShopId(Shop shop){
		GoodsExample goodsExample=new GoodsExample();
		if(shop.getShopId()!=null)
			goodsExample.createCriteria().andBelongEqualTo(String.valueOf(shop.getShopId()));
		else {
			return new ArrayList<Goods>();
		}
		return goodsMapper.selectByExample(goodsExample);
	}
	public Goods selectGoodsByGoodsId(Goods goods){
		Goods g=new Goods();
		if(goods.getGoodsId()!=null)
			g=goodsMapper.selectByPrimaryKey(goods.getGoodsId());
		return g;
	}
}
