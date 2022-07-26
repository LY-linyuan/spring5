package com.bjpowernode;


import com.bjpowernode.ba01.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * @Author 临渊
 * @Date 2022-07-26 10:30
 */
public class MyTest {


    @Test
    public void test01() {
        String config = "ba01/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Student myStudent = (Student) ac.getBean("myStudent");
        System.out.println(myStudent);


        Date myDate = (Date) ac.getBean("myDate");
        System.out.println(myDate);
    }


}
