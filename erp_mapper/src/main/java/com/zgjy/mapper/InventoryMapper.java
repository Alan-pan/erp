package com.zgjy.mapper;

import com.zgjy.entity.Inventory;
import com.zgjy.entity.InventoryExample;
import java.util.List;

public interface InventoryMapper {
    long countByExample(InventoryExample example);

    int deleteByPrimaryKey(Integer inid);

    int insert(Inventory record);

    int insertSelective(Inventory record);

    List<Inventory> selectByExample(InventoryExample example);

    Inventory selectByPrimaryKey(Integer inid);

    int updateByPrimaryKeySelective(Inventory record);

    int updateByPrimaryKey(Inventory record);
}