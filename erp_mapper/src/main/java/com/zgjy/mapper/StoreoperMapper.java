package com.zgjy.mapper;

import com.zgjy.entity.Storeoper;
import com.zgjy.entity.StoreoperExample;
import java.util.List;

public interface StoreoperMapper {
    long countByExample(StoreoperExample example);

    int deleteByPrimaryKey(Integer soid);

    int insert(Storeoper record);

    int insertSelective(Storeoper record);

    List<Storeoper> selectByExample(StoreoperExample example);

    Storeoper selectByPrimaryKey(Integer soid);

    int updateByPrimaryKeySelective(Storeoper record);

    int updateByPrimaryKey(Storeoper record);
}