package com.itheima.springmvc.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.eclipse.jdt.internal.compiler.ast.ClassLiteralAccess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.itheima.springmvc.dao.CommentMapper;
import com.itheima.springmvc.dao.GoodsMapper;
import com.itheima.springmvc.dao.GoodscommentMapper;
import com.itheima.springmvc.pojo.Comment;
import com.itheima.springmvc.pojo.CommentExample;
import com.itheima.springmvc.pojo.Comment_Info;
import com.itheima.springmvc.pojo.Customer;
import com.itheima.springmvc.pojo.Goods;
import com.itheima.springmvc.pojo.Goodscomment;
import com.itheima.springmvc.pojo.GoodscommentExample;
import com.itheima.springmvc.pojo.Seller;
import com.itheima.springmvc.pojo.Shop;
import com.itheima.springmvc.pojo.ShopExample;
@Service
public class CommentServiceImpl implements CommentService {
	@Autowired
	private CommentMapper commentMapper;
	@Autowired
	private GoodscommentMapper goodscommentMapper;
	
	public void insertComment(Comment comment) {
		// TODO Auto-generated method stub
		int comment_id = commentMapper.insert(comment);
		if(comment.getList()!=null){
			List<Goodscomment> list = comment.getList();
			for(Goodscomment goodscomment : list)
			{
				goodscomment.setCommentId(comment_id);
				goodscommentMapper.insertSelective(goodscomment);
			}
		}
		
	}
	public void deleteComment(Comment comment){
		if(null!=comment.getCustomerId()){
			commentMapper.deleteByPrimaryKey(comment.getCustomerId());
		}		
	}
	public void updateComment(Comment comment){
		commentMapper.updateByPrimaryKeySelective(comment);
	}
	public List<Comment> selectCommentByShopID(Shop shop)
	{
		CommentExample ex=new CommentExample();
		ex.createCriteria().andShopIdEqualTo(shop.getShopId());
		return commentMapper.selectByExample(ex);
	}
	public List<Goodscomment> selectCommentByGoodsID(Goods goods)
	{
		GoodscommentExample ex=new GoodscommentExample();
		List<Goodscomment> cs=new ArrayList<Goodscomment>();
		if(goods.getGoodsId()!=null){
			ex.createCriteria().andGoodsIdEqualTo(goods.getGoodsId());
			cs=goodscommentMapper.selectByExample(ex);
		}
		return cs;
	}
	public float getAverageCommentGrade(Shop shop){
		CommentExample example=new CommentExample();
		example.createCriteria().andShopIdEqualTo(shop.getShopId());
		List<Comment> list=commentMapper.selectByExample(example);
		float res=0.0f;
		for(Comment c:list){
			res+=c.getAverageGrade();
		}
		res/=list.size();
		return res;
	}
	public Comment getAllAverageCommentGrade(Shop shop){
		Comment res=new Comment();
		if(shop.getShopId()!=null){
			CommentExample example=new CommentExample();
			example.createCriteria().andShopIdEqualTo(shop.getShopId());		
			List<Comment> list=commentMapper.selectByExample(example);
			float logiAverage=0.0f;
			float servAverage=0.0f;
			float consAverage=0.0f;
			for(Comment c:list){
				logiAverage+=c.getLogistics();
				servAverage+=c.getService();
				consAverage+=c.getConsistency();
			}
			res.setConsistency((int) (consAverage/3.0f));
			res.setLogistics((int) (logiAverage/3.0f));
			res.setService((int) (servAverage/3.0f));
			res.setShopId(shop.getShopId());
		}
		return res;
	}
	public Integer getGreatCommentNumber(Goods goods){
		List<Goodscomment> list=selectCommentByGoodsID(goods);
		Integer num=0;
		if(list!=null&&list.size()!=0){
			for(Goodscomment c:list){
				if(0==c.getReputation())
					num+=c.getReputation();
			}
		}
		return num;
	}
}

