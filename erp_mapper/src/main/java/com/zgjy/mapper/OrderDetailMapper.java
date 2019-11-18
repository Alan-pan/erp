package com.zgjy.mapper;

import com.zgjy.entity.OrderDetail;
import com.zgjy.entity.OrderDetailExample;
import java.util.List;

public interface OrderDetailMapper {
    long countByExample(OrderDetailExample example);

    int deleteByPrimaryKey(Integer odid);

    int insert(OrderDetail record);

    int insertSelective(OrderDetail record);

    List<OrderDetail> selectByExample(OrderDetailExample example);

    OrderDetail selectByPrimaryKey(Integer odid);

    int updateByPrimaryKeySelective(OrderDetail record);

    int updateByPrimaryKey(OrderDetail record);
}