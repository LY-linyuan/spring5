package com.bjpowernode;

import com.bjpowernode.ba02.School;
import com.bjpowernode.ba02.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author 临渊
 * @Date 2022-07-26 18:05
 */
public class MyTest02 {
    @Test
    public void test01() {
        Student student = new Student();
        student.setName("张三");
        student.setAge(20);
        School school = new School();
        school.setName("山东大学");
        school.setAddress("济南");
        student.setSchool(school);
        System.out.println(student);
    }

    @Test
    public void test02() {
        String config = "ba02/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        Student student = (Student) applicationContext.getBean("myStudent");
        System.out.println(student);
    }
}
