package com.bjpowernode;

import com.bjpowernode.ba02.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author 临渊
 * @Date 2022-07-27 13:39
 */
public class MyTest02 {
    @Test
    public void test01() {
        String config = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        SomeService proxy = (SomeService) applicationContext.getBean("someService");
        // String str = proxy.doSome("张三", 500);
        // System.out.println(str);
    }
}
