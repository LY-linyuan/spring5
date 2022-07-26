package com.bjpowernode;

import com.bjpowernode.ba03.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

/**
 * @Author 临渊
 * @Date 2022-07-26 18:19
 */
public class MyTest03 {
    @Test
    public void test01() {
        String config = "ba03/applicationContext.xml";
        ApplicationContext applicationContext = new  ClassPathXmlApplicationContext(config);
        Student student = (Student) applicationContext.getBean("myStudent");
        System.out.println(student);
    }

    @Test
    public void test02() {
        String config = "ba03/applicationContext.xml";
        ApplicationContext applicationContext = new  ClassPathXmlApplicationContext(config);
        Student student = (Student) applicationContext.getBean("student");
        System.out.println(student);
    }

    @Test
    public void test03() {
        String config = "ba03/applicationContext.xml";
        ApplicationContext applicationContext = new  ClassPathXmlApplicationContext(config);
        File file = (File) applicationContext.getBean("myFile");
        System.out.println(file.getName());
    }
}
