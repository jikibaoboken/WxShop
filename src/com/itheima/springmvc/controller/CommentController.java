package com.itheima.springmvc.controller;

import java.io.File;
import java.util.List;
import java.util.UUID;

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

import com.itheima.springmvc.message.queryGoodsMessageForCustomer;
import com.itheima.springmvc.pojo.Comment;
import com.itheima.springmvc.pojo.Shop;
import com.itheima.springmvc.pojo.Goods;
import com.itheima.springmvc.pojo.Goodscomment;
import com.itheima.springmvc.service.CommentService;
import com.itheima.springmvc.service.SellerService;
@Controller
public class CommentController {
	@Autowired
	SellerService sellerService;
	
	@Autowired 
	private CommentService commentService;
	
    //url:json:{}
	@RequestMapping(value="/comment/addComment.action")
	public @ResponseBody
	Comment addComment(@RequestBody Comment comment){
		commentService.insertComment(comment);
		return comment;
	}
	
	@RequestMapping(value="/comment/deleteComment.action")
	public @ResponseBody
	Comment deleteComment(@RequestBody Comment comment){
		commentService.deleteComment(comment);
		return comment;
	}
	@RequestMapping(value="/comment/selectCommentByShopID.action")
	public @ResponseBody
	List<Comment> selectCommentByShopID(@RequestBody Shop shop){
		return commentService.selectCommentByShopID(shop);
	}
	@RequestMapping(value="/comment/selectCommentByGoodsID.action")
	public @ResponseBody
	List<Goodscomment> selectCommentByGoodsID(@RequestBody Goods goods){
		return commentService.selectCommentByGoodsID(goods);
	}
}
