package com.zgjy.mapper;

import com.zgjy.entity.Dept;
import com.zgjy.entity.DeptExample;
import java.util.List;

public interface DeptMapper {
    long countByExample(DeptExample example);

    int deleteByPrimaryKey(Integer did);

    int insert(Dept record);

    int insertSelective(Dept record);

    List<Dept> selectByExample(DeptExample example);

    Dept selectByPrimaryKey(Integer did);

    int updateByPrimaryKeySelective(Dept record);

    int updateByPrimaryKey(Dept record);
}