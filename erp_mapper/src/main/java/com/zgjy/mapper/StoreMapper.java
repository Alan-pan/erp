package com.zgjy.mapper;

import com.zgjy.entity.Store;
import com.zgjy.entity.StoreExample;
import java.util.List;

public interface StoreMapper {
    long countByExample(StoreExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(Store record);

    int insertSelective(Store record);

    List<Store> selectByExample(StoreExample example);

    Store selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(Store record);

    int updateByPrimaryKey(Store record);
}