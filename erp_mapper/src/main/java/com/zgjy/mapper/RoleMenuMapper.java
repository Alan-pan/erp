package com.zgjy.mapper;

import com.zgjy.entity.RoleMenu;
import com.zgjy.entity.RoleMenuExample;
import java.util.List;

public interface RoleMenuMapper {
    long countByExample(RoleMenuExample example);

    int deleteByPrimaryKey(Integer rmid);

    int insert(RoleMenu record);

    int insertSelective(RoleMenu record);

    List<RoleMenu> selectByExample(RoleMenuExample example);

    RoleMenu selectByPrimaryKey(Integer rmid);

    int updateByPrimaryKeySelective(RoleMenu record);

    int updateByPrimaryKey(RoleMenu record);
}