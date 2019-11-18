package com.zgjy.mapper;

import com.zgjy.entity.Role;
import com.zgjy.entity.RoleExample;
import java.util.List;

public interface RoleMapper {
    long countByExample(RoleExample example);

    int deleteByPrimaryKey(Integer rid);

    int insert(Role record);

    int insertSelective(Role record);

    List<Role> selectByExample(RoleExample example);

    Role selectByPrimaryKey(Integer rid);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}