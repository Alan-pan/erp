package com.zgjy.mapper;

import com.zgjy.entity.Supplier;
import com.zgjy.entity.SupplierExample;
import java.util.List;

public interface SupplierMapper {
    long countByExample(SupplierExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(Supplier record);

    int insertSelective(Supplier record);

    List<Supplier> selectByExample(SupplierExample example);

    Supplier selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(Supplier record);

    int updateByPrimaryKey(Supplier record);
}