package com.itheima.springmvc.service;
import java.util.List;
import com.itheima.springmvc.pojo.Comment;
import com.itheima.springmvc.pojo.Goods;
import com.itheima.springmvc.pojo.Goodscomment;
import com.itheima.springmvc.pojo.Seller;
import com.itheima.springmvc.pojo.Shop;
public interface CommentService {
	public void insertComment(Comment comment);
	public void deleteComment(Comment comment);
	public void updateComment(Comment comment);
	public List<Comment> selectCommentByShopID(Shop shop);
	public List<Goodscomment> selectCommentByGoodsID(Goods goods);
	
	//返回店铺总的平均评分
	public float getAverageCommentGrade(Shop shop);
	//返回店铺3个角度的平均评分
	public Comment getAllAverageCommentGrade(Shop shop);
	//返回商品的好评次数
	public Integer getGreatCommentNumber(Goods goods);
}
