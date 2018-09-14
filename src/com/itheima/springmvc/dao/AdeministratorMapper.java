package com.itheima.springmvc.dao;

import com.itheima.springmvc.pojo.Adeministrator;
import com.itheima.springmvc.pojo.AdeministratorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdeministratorMapper {
    int countByExample(AdeministratorExample example);

    int deleteByExample(AdeministratorExample example);

    int deleteByPrimaryKey(Integer adminId);

    int insert(Adeministrator record);

    int insertSelective(Adeministrator record);

    List<Adeministrator> selectByExample(AdeministratorExample example);

    Adeministrator selectByPrimaryKey(Integer adminId);

    int updateByExampleSelective(@Param("record") Adeministrator record, @Param("example") AdeministratorExample example);

    int updateByExample(@Param("record") Adeministrator record, @Param("example") AdeministratorExample example);

    int updateByPrimaryKeySelective(Adeministrator record);

    int updateByPrimaryKey(Adeministrator record);
}