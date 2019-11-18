package com.zgjy.mapper;

import com.zgjy.entity.EmpRole;
import com.zgjy.entity.EmpRoleExample;
import java.util.List;

public interface EmpRoleMapper {
    long countByExample(EmpRoleExample example);

    int deleteByPrimaryKey(Integer erid);

    int insert(EmpRole record);

    int insertSelective(EmpRole record);

    List<EmpRole> selectByExample(EmpRoleExample example);

    EmpRole selectByPrimaryKey(Integer erid);

    int updateByPrimaryKeySelective(EmpRole record);

    int updateByPrimaryKey(EmpRole record);
}