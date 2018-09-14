package com.itheima.springmvc.controller;

import java.io.File;
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

import com.itheima.springmvc.pojo.Goods;
import com.itheima.springmvc.pojo.Seller;
import com.itheima.springmvc.pojo.Shop;
import com.itheima.springmvc.service.SellerService;

/**
 * 
 * 用于对商品进行增删改查操作
 * @author Maugham
 *
 */
@Controller
public class SellerController {
	@Autowired
	SellerService sellerService;
	
    //url:json:{}
	@RequestMapping(value="/seller/addseller.action")
	public @ResponseBody
	Seller addSeller(@RequestBody Seller seller){
		sellerService.insertSeller(seller);
		return seller;
	}
	
	@RequestMapping(value="/seller/deleteSeller.action")
	public @ResponseBody
	Seller deleteSeller(@RequestBody Seller seller){
		sellerService.deleteSeller(seller);
		return seller;
	}
	
	@RequestMapping(value="/seller/selectshopBysellerID.action")
	public @ResponseBody
	List<Shop> selectshopBysellerID(@RequestBody Seller seller){
		List<Shop> shopList=sellerService.selectshopBysellerID(seller);
		for(Shop shop:shopList){
			String[] strings=shop.getShopImage().split("\\|");
			if(strings!=null)
				shop.setShopImage("http://112.74.182.209:8080/pic/"+strings[0]);
		}
		return shopList;
	}
	
	@RequestMapping(value="/seller/selectSellerIdByusername.action")
	public @ResponseBody
	Integer selectSellerIdByusername(@RequestBody Seller seller){
		return sellerService.selectSellerIdByusername(seller);
	}
	
	
	//去修改页面 入参 id
	@RequestMapping(value = "/sellerEdit.action")
//	public ModelAndView toEdit(@RequestParam(value = "id",required = false,defaultValue = "1") Integer idaaq,
	public ModelAndView toEdit(Integer id, Model model){
		
		//Servlet时代开发
//		String id = request.getParameter("id");
		
		//查询一个商品
//		Shop shop = shopService.selectShopById(Integer.parseInt(id));
		Seller seller = sellerService.selectSellerById(id);
		ModelAndView mav = new ModelAndView();
		//数据
		mav.addObject("seller", seller);
		mav.setViewName("editSeller");
		return mav;
		
	}
	//提交修改页面 入参  为 Seller对象  
	@RequestMapping(value = "/updateseller.action")
	public ModelAndView updateseller(Seller seller){
		//修改
		//itemService.updateItemsById(vo.getItems());
		sellerService.updateSeller(seller);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("success");
		return mav;
		
	}	
	//提交修改页面 入参  为Seller对象  
	@RequestMapping(value = "/seller.action")
	public ModelAndView updateseller(){		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("editSeller");
		return mav;	
	}
	@RequestMapping("seller/json.action")
	public @ResponseBody
	Seller json(@RequestBody Seller seller){
		System.out.println(seller);
		return seller;
	}
	
	@RequestMapping(value="/seller/addSellerPic.action")
	public @ResponseBody
	Seller addSellerPic(Seller seller,@RequestParam(value="pictureFile",required=false)
	MultipartFile pictureFile) throws Exception{
		String name=UUID.randomUUID().toString().replaceAll("-", "");
		String ext=FilenameUtils.getExtension(pictureFile.getOriginalFilename());
		pictureFile.transferTo(new File("D:\\upload\\"+name+"."+ext));
		seller.setCyberspaceAvatar(name+"."+ext);
		sellerService.insertSeller(seller);
		return seller;
	}
}
