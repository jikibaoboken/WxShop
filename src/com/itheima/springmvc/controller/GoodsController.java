package com.itheima.springmvc.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.itheima.springmvc.message.queryGoodsMessage;
import com.itheima.springmvc.message.queryGoodsMessageForCustomer;
import com.itheima.springmvc.pojo.Goods;
import com.itheima.springmvc.pojo.GoodsQueryVo;
import com.itheima.springmvc.pojo.Shop;

import com.itheima.springmvc.service.GoodsService;

/**
 * 
 * 用于对商品进行增删改查操作
 * @author Maugham
 *
 */
@Controller
public class GoodsController {
	@Autowired
	GoodsService goodsService;
    //url:  json:{}
	//首次添加
	@RequestMapping(value="/goods/addGoods.action")
	public @ResponseBody
	Goods addGoods(Goods goods,@RequestParam(value="pictureFile",required=false)MultipartFile pictureFile) throws Exception{
		String name=UUID.randomUUID().toString().replaceAll("-", "");
		String ext=FilenameUtils.getExtension(pictureFile.getOriginalFilename());
		//pictureFile.transferTo(new File("D:\\upload\\"+name+"."+ext));
		pictureFile.transferTo(new File("/usr/pic/"+name+"."+ext));
		goods.setGoodsAvatar(name+"."+ext);
		Integer res=goodsService.insertGoods(goods);
		goods.setGoodsId(res);
		return goods;
	}
	@RequestMapping(value="/goods/addGoodsPic.action")
	public @ResponseBody
	Goods addGoodsPic(Goods goods,@RequestParam(value="pictureFile",required=false)MultipartFile pictureFile) throws Exception{
		String name=UUID.randomUUID().toString().replaceAll("-", "");
		String ext=FilenameUtils.getExtension(pictureFile.getOriginalFilename());
		//pictureFile.transferTo(new File("D:\\upload\\"+name+"."+ext));
		pictureFile.transferTo(new File("/usr/pic/"+name+"."+ext));
		goods.setGoodsAvatar(name+"."+ext);
		goodsService.addPictures(goods);
		return goods;
	}
	@RequestMapping(value="/goods/addGoodsTest.action")
	public void addGoodsTest(Goods goods){
		goodsService.insertGoods(goods);
	}
	
	@RequestMapping(value="/testButton.action")
	public String addGoodsByGoods(){
		Goods goods=new Goods();
		goods.setGoodsId(1);
		goods.setGoodsName("西瓜");
		goods.setGoodsPrice("15");
		goods.setGoodsShelftime("2018-8-27");
		goodsService.insertGoods(goods);
		return "success";
	}
	
	@RequestMapping(value="/goods/deleteGoods.action")
	public @ResponseBody
	Goods deleteGoods(@RequestBody Goods goods){
		goodsService.deleteGoods(goods);
		return goods;
	}
	//返回被切割的Goods对象，就是queryGoodsMessage对象的List
	@RequestMapping(value="/goods/selectGoodsByShopId.action")
	public @ResponseBody
	List<queryGoodsMessage> selectGoodsByShopId(@RequestBody Goods goods){
		List<queryGoodsMessage> msg=new ArrayList<queryGoodsMessage>();
		List<Goods> result= goodsService.selectGoodsByShopId(goods);
		for(Goods gs:result){
			queryGoodsMessage query=new queryGoodsMessage();
			query.setGoodsInventory(gs.getGoodsInventory());
			query.setGoodsName(gs.getGoodsName());
			query.setGoodsPrice(gs.getGoodsPrice());
			query.setGoodsShelftime(gs.getGoodsShelftime());
			query.setGoodsId(gs.getGoodsId());
			String[] strings=gs.getGoodsAvatar().split("\\|");
			if(strings!=null)
				query.setGoodsImgUrl("http://112.74.182.209:8080/pic/"+strings[0]);
			query.setGoodsType(gs.getGoodsType());
			msg.add(query);
		}
		return msg;
	}
	/**
	 * 根据shopId返回该店的商品
	 * @param shop
	 * @return
	 */
	@RequestMapping(value="/goods/getGoodsListMsgByShopId.action")
	public @ResponseBody
	List<queryGoodsMessageForCustomer> getGoodsListMsgByShopId(@RequestBody Shop shop){
		System.out.println(shop.getShopId());
		return goodsService.showGoodsListByShopId(shop);
	}
	/**
	 * 返回商品的第一张图片
	 * @param goods
	 * @return
	 */
	@RequestMapping(value="/goods/getGoodsPicURL.action")
	public @ResponseBody
	List<String> getGoodsPicURL(@RequestBody Goods goods){
		List<String> str=goodsService.selectGoodsPicURLById(goods);
		return str;
	}
	/**
	 * 网页端使用的action，用于增加商品
	 * @return
	 */
	@RequestMapping(value="goods.action")
	public ModelAndView goods(){
		ModelAndView modelAndView =new ModelAndView();
		modelAndView.setViewName("addGoods");
		return modelAndView;
	}
	/**
	 * 向goods表单增加测试数据，50万条测试数据，随机化多数的表段
	 */
	@RequestMapping(value="/goods/addGoodsRandomly.action")
	public @ResponseBody 
	String addGoodsRandomly(){
		return goodsService.addGoodsRandomly(5000);
	}
}
