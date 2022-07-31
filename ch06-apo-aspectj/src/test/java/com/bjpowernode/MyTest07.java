package com.bjpowernode;

import com.bjpowernode.ba07.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author 临渊
 * @Date 2022-07-27 13:39
 */
public class MyTest07 {
    @Test
    public void test01() {
        String config = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        SomeServiceImpl proxy = (SomeServiceImpl) applicationContext.getBean("someService");
        proxy.doThird();
        System.out.println("proxy + " + proxy.getClass().getName());
    }

}
