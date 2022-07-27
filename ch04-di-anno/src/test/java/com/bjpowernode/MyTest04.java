package com.bjpowernode;

import com.bjpowernode.ba04.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author 临渊
 * @Date 2022-07-27 6:30
 */
public class MyTest04 {
    @Test
    public void test01() {
        String config = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        Student myStudent = (Student) applicationContext.getBean("myStudent");
        System.out.println(myStudent);
    }
}
