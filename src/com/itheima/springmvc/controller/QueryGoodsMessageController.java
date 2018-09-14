package com.itheima.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itheima.springmvc.message.GoodsDetailedMessageForCustomer;
import com.itheima.springmvc.message.queryGoodsMessageForCustomer;
import com.itheima.springmvc.pojo.Goods;
import com.itheima.springmvc.pojo.Shop;
import com.itheima.springmvc.service.CommentService;
import com.itheima.springmvc.service.GoodsService;

@Controller
public class QueryGoodsMessageController {
	@Autowired
	private GoodsService goodsService;
	@Autowired
	private CommentService commentService;
	
	@RequestMapping(value="/query/queryDetailedGoodsMessage.action")
	public @ResponseBody
	GoodsDetailedMessageForCustomer queryDetailedGoodsMessage(@RequestBody Goods goods)
	{
		GoodsDetailedMessageForCustomer g=new GoodsDetailedMessageForCustomer();
		if(goods.getGoodsId()!=null){
			g.setCommments(commentService.selectCommentByGoodsID(goods));
			g.setGoods(goodsService.selectGoodsByGoodsId(goods));
			g.setGreatCommentNumber(commentService.getGreatCommentNumber(goods));
			if(g.getGoods()!=null){
				List<String> strings=new ArrayList();
				String imgs=g.getGoods().getGoodsAvatar();
				String[] imgss=imgs.split("\\|");
				for(int i=0;i<imgss.length;i++){
					strings.add("http://112.74.182.209:8080/pic/"+imgss[i]);
				}
				g.setImageList(strings);
			}
		}
		return g;
	}
	@RequestMapping(value="/query/queryDetailedGoodsMessageForSeller.action")
	public @ResponseBody
	List<GoodsDetailedMessageForCustomer> queryDetailedGoodsMessageForSeller(@RequestBody Goods gx)
	{
		List<GoodsDetailedMessageForCustomer> gg=new ArrayList<GoodsDetailedMessageForCustomer>();
		List<Goods> list=goodsService.selectGoodsByShopId(gx);
		for(Goods goods:list){
			GoodsDetailedMessageForCustomer g=new GoodsDetailedMessageForCustomer();
			if(goods.getGoodsId()!=null){
				g.setCommments(commentService.selectCommentByGoodsID(goods));
				g.setGoods(goodsService.selectGoodsByGoodsId(goods));
				g.setGreatCommentNumber(commentService.getGreatCommentNumber(goods));
				if(g.getGoods()!=null){
					List<String> strings=new ArrayList();
					String imgs=g.getGoods().getGoodsAvatar();
					String[] imgss=imgs.split("\\|");
					for(int i=0;i<imgss.length;i++){
						strings.add("http://112.74.182.209:8080/pic/"+imgss[i]);
					}
					g.setImageList(strings);
				}
			}
			gg.add(g);
		}
		
		return gg;
	}
}
