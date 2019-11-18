package com.zgjy.mapper;

import com.zgjy.entity.GoodsCategory;
import com.zgjy.entity.GoodsCategoryExample;
import java.util.List;

public interface GoodsCategoryMapper {
    long countByExample(GoodsCategoryExample example);

    int deleteByPrimaryKey(Integer gcid);

    int insert(GoodsCategory record);

    int insertSelective(GoodsCategory record);

    List<GoodsCategory> selectByExample(GoodsCategoryExample example);

    GoodsCategory selectByPrimaryKey(Integer gcid);

    int updateByPrimaryKeySelective(GoodsCategory record);

    int updateByPrimaryKey(GoodsCategory record);
}