package com.zgjy.service;

import com.zgjy.entity.Emp;
import com.zgjy.entity.Pager;

import java.util.List;

public interface EmpService {
    //分页查询
    Pager<Emp> queryByExample(int pageNum, int pageSize, Emp emp);

    Emp queryEmpById(int eid);

    int updateById(Emp emp);

    int insertEmp(Emp emp);

    int delete(int eid);
}
