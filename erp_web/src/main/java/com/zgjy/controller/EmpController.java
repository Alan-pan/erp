package com.zgjy.controller;

import com.zgjy.entity.Emp;
import com.zgjy.entity.Pager;
import com.zgjy.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.transform.Result;
import java.util.HashMap;
import java.util.Map;

@Controller
public class EmpController {
    //自动注入的是接口
    @Autowired
    EmpService empService;

    @RequestMapping("/emp/list")
    @ResponseBody
    public Pager<Emp> list(@RequestParam(defaultValue = "0") int pageNum, @RequestParam(defaultValue = "10") int pageSize, Emp emp) {
        Pager<Emp> emps = empService.queryByExample(pageNum, pageSize, emp);
        return emps;
    }

    @RequestMapping("/emp/queryEmpById")
    @ResponseBody
    public Emp queryEmpById(int eid) {
        Emp emp = empService.queryEmpById(eid);
        return emp;
    }

    //添加和更新集成
    @RequestMapping("/emp/commit")
    @ResponseBody
    public Map commit(Emp emp) {
        System.out.println(emp);
        Map<String, Object> result = new HashMap<>();
        //根据eid判断不为null更新操作
        int res = -1;//默认失败
        if (!StringUtils.isEmpty(emp.getEid())) {
            res = empService.updateById(emp);
        } else {//否则是添加操作
            res = empService.insertEmp(emp);
        }
        result.put("status", res);
        return result;
    }

    @RequestMapping("/emp/delete")
    @ResponseBody
    public Map delete(int eid) {
        int res = empService.delete(eid);
        Map map = new HashMap();
        map.put("status", res);
        return map;
    }
}
