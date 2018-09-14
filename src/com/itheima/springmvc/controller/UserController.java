package com.itheima.springmvc.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.itheima.springmvc.pojo.CartItem;
import com.itheima.springmvc.pojo.CartMessage;
import com.itheima.springmvc.pojo.Customer;
import com.itheima.springmvc.pojo.Item;
import com.itheima.springmvc.pojo.Shop;
import com.itheima.springmvc.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/wxLogin.action")
	public @ResponseBody
	Customer wxLogin(@RequestBody Customer customer)
	{
		return userService.wxLogin(customer);
	}
	
	@RequestMapping("/showCart.action")
	public @ResponseBody
	List<CartItem> showCart(@RequestBody Customer customer)
	{
		return userService.showCart(customer);
	}
	
	@RequestMapping("/updateCart.action")
	public @ResponseBody
	void updateCart(@RequestBody CartMessage cartMessage)
	{
		userService.updateCart(cartMessage);
	}
	
	@RequestMapping("/insert.action")
	public @ResponseBody
	Customer insert(@RequestBody Customer customer)
	{
		return userService.register(customer);
	}
	/*@RequestMapping("/insert.action")
	public ModelAndView insert(Customer customer)
	{
		userService.register(customer);
		ModelAndView mav=new ModelAndView();
		mav.setViewName("success");
		return mav;
	}*/
	
	@RequestMapping("/update.action")
	public @ResponseBody
	String update(@RequestBody Customer customer)
	{
		userService.update(customer);
		return "success";
	}
	
	/*@RequestMapping("/login")
	public @ResponseBody
	String login(@RequestBody Customer customer)
	{
		if(userService.login(customer.getUsername(), customer.getPassword()))
		{
			return "loginSuccess";
		}
		else
		{
			return "loginFail";
		}
	}*/
	
	@RequestMapping("/uploadPicture.action")
	public @ResponseBody
	String uploadPicture(Customer customer,@RequestParam(value="user_avatar",required=false)MultipartFile user_avatar) throws IllegalStateException, IOException
	{
		String name = UUID.randomUUID().toString().replaceAll("-", "");
		String ext=FilenameUtils.getExtension(user_avatar.getOriginalFilename());
		//user_avatar.transferTo(new File("D:\\upload\\"+name+"."+ext));
		user_avatar.transferTo(new File("/usr/pic/"+name+"."+ext));
		customer.setCyberspace_avatar(name+"."+ext);
		userService.update(customer);
		return "http://112.74.182.209:8080/pic/"+name+"."+ext;
	}
	
	@RequestMapping("/showLikes.action")
	public @ResponseBody
	List<Item> showLikes(@RequestBody Customer customer)
	{
		return userService.showLikes(customer);
	}
	
	@RequestMapping("/showShopLikes.action")
	public @ResponseBody
	List<Shop> showShopLikes(@RequestBody Customer customer)
	{
		return userService.showShopLikes(customer);
	}
	
	@RequestMapping("/recharge.action")
	public @ResponseBody
	String recharge(@RequestBody Customer customer)
	{
		userService.recharge(customer);
		return "success";
	}
	
}
