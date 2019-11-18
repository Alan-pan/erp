package com.zgjy.mapper;

import com.zgjy.entity.Menu;
import com.zgjy.entity.MenuExample;
import java.util.List;

public interface MenuMapper {
    long countByExample(MenuExample example);

    int deleteByPrimaryKey(Integer mid);

    int insert(Menu record);

    int insertSelective(Menu record);

    List<Menu> selectByExample(MenuExample example);

    Menu selectByPrimaryKey(Integer mid);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);
}