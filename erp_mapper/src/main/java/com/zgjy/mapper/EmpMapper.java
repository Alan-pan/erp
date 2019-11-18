package com.zgjy.mapper;

import com.zgjy.entity.Emp;
import com.zgjy.entity.EmpExample;
import java.util.List;

public interface EmpMapper {
    long countByExample(EmpExample example);

    int deleteByPrimaryKey(Integer eid);

    int insert(Emp record);

    int insertSelective(Emp record);

    List<Emp> selectByExample(EmpExample example);

    Emp selectByPrimaryKey(Integer eid);

    int updateByPrimaryKeySelective(Emp record);

    int updateByPrimaryKey(Emp record);
}