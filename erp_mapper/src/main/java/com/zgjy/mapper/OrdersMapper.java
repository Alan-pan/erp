package com.zgjy.mapper;

import com.zgjy.entity.Orders;
import com.zgjy.entity.OrdersExample;
import java.util.List;

public interface OrdersMapper {
    long countByExample(OrdersExample example);

    int deleteByPrimaryKey(Integer oid);

    int insert(Orders record);

    int insertSelective(Orders record);

    List<Orders> selectByExample(OrdersExample example);

    Orders selectByPrimaryKey(Integer oid);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);
}