import com.zgjy.entity.Emp;
import com.zgjy.entity.EmpExample;
import com.zgjy.entity.Pager;
import com.zgjy.mapper.EmpMapper;
import com.zgjy.service.EmpService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    @Test
    public void t1(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring.xml");
        EmpMapper empMapper = ioc.getBean(EmpMapper.class);
        EmpExample empExample=new EmpExample();
        EmpExample.Criteria criteria = empExample.createCriteria();
        criteria.andNameLike("%小明%");
        List<Emp> emps1 = empMapper.selectByExample(empExample);
        System.out.println(emps1);
    }
}