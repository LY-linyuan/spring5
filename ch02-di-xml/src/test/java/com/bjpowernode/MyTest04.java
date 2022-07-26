package com.bjpowernode;

import com.bjpowernode.ba04.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

/**
 * @Author 临渊
 * @Date 2022-07-26 18:19
 */
public class MyTest04 {
    @Test
    public void test01() {
        String config = "ba04/applicationContext.xml";
        ApplicationContext applicationContext = new  ClassPathXmlApplicationContext(config);
        Student student = (Student) applicationContext.getBean("myStudent");
        System.out.println(student);
    }

}
