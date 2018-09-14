package com.itheima.springmvc.dao;

import com.itheima.springmvc.pojo.Goodscomment;
import com.itheima.springmvc.pojo.GoodscommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodscommentMapper {
    int countByExample(GoodscommentExample example);

    int deleteByExample(GoodscommentExample example);

    int deleteByPrimaryKey(Integer goodscommentId);

    int insert(Goodscomment record);

    int insertSelective(Goodscomment record);

    List<Goodscomment> selectByExample(GoodscommentExample example);

    Goodscomment selectByPrimaryKey(Integer goodscommentId);

    int updateByExampleSelective(@Param("record") Goodscomment record, @Param("example") GoodscommentExample example);

    int updateByExample(@Param("record") Goodscomment record, @Param("example") GoodscommentExample example);

    int updateByPrimaryKeySelective(Goodscomment record);

    int updateByPrimaryKey(Goodscomment record);
}