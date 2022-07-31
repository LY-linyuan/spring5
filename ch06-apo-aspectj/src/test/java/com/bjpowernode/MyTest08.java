package com.bjpowernode;

import com.bjpowernode.ba08.SomeService;
import com.bjpowernode.ba08.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author 临渊
 * @Date 2022-07-27 13:39
 */
public class MyTest08 {
    @Test
    public void test01() {
        String config = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        SomeService proxy = (SomeService) applicationContext.getBean("someService");
        proxy.doThird();
        System.out.println("proxy + " + proxy.getClass().getName());
    }

}
