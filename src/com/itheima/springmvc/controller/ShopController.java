package com.itheima.springmvc.controller;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.itheima.springmvc.message.queryShopMessageForCustomer;
import com.itheima.springmvc.message.queryShopMessageForSeller;
import com.itheima.springmvc.pojo.Address;
import com.itheima.springmvc.pojo.Customer;
import com.itheima.springmvc.pojo.Seller;
import com.itheima.springmvc.pojo.Shop;
import com.itheima.springmvc.service.ShopService;

/**
 * 
 * 用于对商品进行增删改查操作
 * @author Maugham
 *
 */
@Controller
public class ShopController {
	@Autowired
	ShopService shopService;
	
    //url:json:{}
//	
//	@RequestMapping(value="/shop/addShopTest.action")
//	public void addShopTest(Shop shop){
//		shopService.insertShop(shop);
//	}
	 
//	@RequestMapping(value="/testButton.action")
//	public String addShopByShop(){
//		Shop shop=new Shop();
//		shop.setShopId(1);
//		shop.setShopType("水果店");
//		shop.setShopName("龙湖水果");
//		shop.setShopAddress("江苏省南京市东南大学九龙湖校区");
//		shop.setGoodsTypeNumbers(2);
//		shopService.insertShop(shop);
//		return "success";
//	}
	
	
	//去修改页面 入参 id
	@RequestMapping(value = "/shopEdit.action")
//	public ModelAndView toEdit(@RequestParam(value = "id",required = false,defaultValue = "1") Integer idaaq,
	public ModelAndView toEdit(Integer id,
			HttpServletRequest request,HttpServletResponse response
			,HttpSession session,Model model){
		
		//Servlet时代开发
//		String id = request.getParameter("id");
		
		//查询一个商品
//		Shop shop = shopService.selectShopById(Integer.parseInt(id));
		Shop shop = shopService.selectShopById(id);
		ModelAndView mav = new ModelAndView();
		//数据
		mav.addObject("shop", shop);
		mav.setViewName("editShop");
		return mav;
		
	}
		
	//提交修改页面 入参  为 Shop对象  
	@RequestMapping(value = "/shop.action")
	public ModelAndView updateshop(){		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("editShop");
		return mav;	
	}
	@RequestMapping("shop/json.action")
	public @ResponseBody
	Shop json(@RequestBody Shop shop){
		System.out.println(shop);
		return shop;
	}
	
	/**
	 * 向商家返回请求的商店信息
	 * @param shop
	 * @return
	 */
	@RequestMapping(value="/shop/queryShopMessageForSellerByShopID.action")
	public @ResponseBody
	queryShopMessageForSeller queryShopMessageForSellerByShopID(@RequestBody Shop shop){
		return shopService.getShopMessageForSeller(shop);
	}
	/**
	 * 用于增加商店记录，所传入的信息包括商店的所有信息以及商店的图片文件
	 * @param shop
	 * @param pictureFile
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/shop/addShopPic.action")
	public @ResponseBody
	Shop addShopPic(Shop shop,@RequestParam(value="pictureFile",required=false)MultipartFile pictureFile) throws Exception{
		String name=UUID.randomUUID().toString().replaceAll("-", "");
		String ext=FilenameUtils.getExtension(pictureFile.getOriginalFilename());
		pictureFile.transferTo(new File("/usr/pic/"+name+"."+ext));
		shop.setShopImage(name+"."+ext);
		return shopService.insertShop(shop);
	}
	/**
	 * 用于增加商店的详细地址类，包括经纬度以及文字地址，以及宿主类型，宿主ID
	 * @param address
	 * @return
	 */
	@RequestMapping(value="/shop/addDetailedAddress.action")
	public @ResponseBody
	String addDetailedAddress(@RequestBody Address address){
		return shopService.addDetailedAddress(address);
	}
	/**
	 * 用于删除商店记录
	 */
	@RequestMapping(value="/shop/deleteShop.action")
	public @ResponseBody
	Shop deleteShop(@RequestBody Shop shop){
		shopService.deleteShop(shop);
		return shop;
	}
	/**
	 * 网页中更新商店记录
	 * @param shop
	 * @return
	 */
	@RequestMapping(value = "/shop/updateShop.action")
	public ModelAndView updateshop(Shop shop){
		//itemService.updateItemsById(vo.getItems());
		shopService.updateShop(shop);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("success");
		return mav;
			
	}
	/**
	 * Application中更新商店记录使用json,传入商店图片，商店的描述，商店的名称，商店的id
	 * @param shop
	 * @return
	 * @throws IOException 
	 * @throws IllegalStateException 
	 * @RequestMapping(value = "/shop/updateShopWithPic2.action")
		public @ResponseBody 
		Shop updateShopWithPic2(@RequestBody Shop shop) throws Exception{	
			return 	shopService.updateShop(shop);
		}
	 */
	@RequestMapping(value = "/shop/updateShopWithPic.action")
	public @ResponseBody 
	Shop updateShopWithPic(Shop shop,@RequestParam(value="pictureFile",required=false)MultipartFile pictureFile) throws Exception{	
		String name=UUID.randomUUID().toString().replaceAll("-", "");
		String ext=FilenameUtils.getExtension(pictureFile.getOriginalFilename());
		pictureFile.transferTo(new File("/usr/pic/"+name+"."+ext));
		shop.setShopImage(name+"."+ext);
		return 	shopService.updateShop(shop);
	}
	
	/**
	 * 暂停店铺
	 */
	@RequestMapping(value="/shop/pauseShop.action")
	public @ResponseBody
	Shop pauseShop(@RequestBody Shop shop){
		return shopService.pauseShop(shop);
	}
}
