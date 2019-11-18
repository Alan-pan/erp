package com.zgjy.mapper;

import com.zgjy.entity.StoreDetail;
import com.zgjy.entity.StoreDetailExample;
import java.util.List;

public interface StoreDetailMapper {
    long countByExample(StoreDetailExample example);

    int deleteByPrimaryKey(Integer sdid);

    int insert(StoreDetail record);

    int insertSelective(StoreDetail record);

    List<StoreDetail> selectByExample(StoreDetailExample example);

    StoreDetail selectByPrimaryKey(Integer sdid);

    int updateByPrimaryKeySelective(StoreDetail record);

    int updateByPrimaryKey(StoreDetail record);
}