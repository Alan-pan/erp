package com.zgjy.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zgjy.entity.Emp;
import com.zgjy.entity.EmpExample;
import com.zgjy.entity.Pager;
import com.zgjy.mapper.EmpMapper;
import com.zgjy.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
@Transactional
public class EmpServiceImpl implements EmpService {
    @Autowired
    EmpMapper empMapper;

    @Override
    public Pager<Emp> queryByExample(int pageNum, int pageSize, Emp emp) {
        System.out.println(emp);
        EmpExample empExample = new EmpExample();
        //是否开启条件查询
        EmpExample.Criteria criteria = empExample.createCriteria();
        /*eid,ename*/
        if (emp != null) {
            //注意引入的包import org.springframework.util.StringUtils;
            if (StringUtils.isEmpty(emp.getEid() + "") && StringUtils.isEmpty(emp.getName() + "")) {
                empExample = null;
            } else {
                if (!StringUtils.isEmpty(emp.getEid())) {
                    criteria.andEidEqualTo(emp.getEid());
                }
                if (!StringUtils.isEmpty(emp.getName())) {
                    criteria.andNameLike("%" + emp.getName() + "%");
                }
            }
        }else{
            empExample = null;
        }
        //开启分页查询 下一行必须是对应的查询语句否则失效
        Page<Object> pages = PageHelper.startPage(pageNum, pageSize);
        //条件查询
        List<Emp> lists = empMapper.selectByExample(empExample);
        Pager<Emp> emps=new Pager<>();
        //设置emp
        emps.setRows(lists);
        //设置总条数
        emps.setTotal((int)pages.getTotal());
        return emps;
    }

    @Override
    public Emp queryEmpById(int eid) {
        return empMapper.selectByPrimaryKey(eid);
    }

    @Override
    public int updateById(Emp emp) {
        int res = empMapper.updateByPrimaryKey(emp);
        return res;
    }

    @Override
    public int insertEmp(Emp emp) {
        int res = empMapper.insert(emp);
        return res;
    }

    @Override
    public int delete(int eid) {
        return empMapper.deleteByPrimaryKey(eid);
    }
}
