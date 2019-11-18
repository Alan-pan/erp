package com.zgjy.mapper;

import com.zgjy.entity.Goods;
import com.zgjy.entity.GoodsExample;
import java.util.List;

public interface GoodsMapper {
    long countByExample(GoodsExample example);

    int deleteByPrimaryKey(Integer gid);

    int insert(Goods record);

    int insertSelective(Goods record);

    List<Goods> selectByExample(GoodsExample example);

    Goods selectByPrimaryKey(Integer gid);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);
}