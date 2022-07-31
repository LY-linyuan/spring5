package com.bjpowernode;

import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.domain.Student;
import com.bjpowernode.service.StudentService;
import com.bjpowernode.service.impl.StudentServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Author 临渊
 * @Date 2022-07-31 9:52
 */
public class MyTest {
    @Test
    public void test01() {
        String config = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String string: beanDefinitionNames) {
            // System.out.println("容器中对象名称" + string + "======" + applicationContext.getBean(string).getClass().getName());
            System.out.println("容器中对象名称" + string + "======》》》》" + applicationContext.getBean(string));
        }
    }

    @Test
    public void test02() {
        String config = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        // 获取spring容器中的dao对象
        StudentDao studentDao = (StudentDao) applicationContext.getBean("studentDao");
        Student student = new Student();
        student.setName("张张张");
        student.setId(9);
        student.setEmail("xxxx.commmmmm");
        student.setAge(500);
        int num = studentDao.insertStudent(student);
        System.out.println(num);
    }

    @Test
    public void test03() {
        String config = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        // 获取spring容器中的dao对象
        StudentService studentService = (StudentService) applicationContext.getBean("studentService");
        Student student = new Student();
        student.setName("1010101010");
        student.setId(11);
        student.setEmail("xxxx.coxxxxxx");
        student.setAge(100);
        int num = studentService.addStudent(student);
        // spring和mybatis整合时  事务是自动提交的  无需执行SqlSession.commit();
        System.out.println(num);
    }

    @Test
    public void test04() {
        String config = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        // 获取spring容器中的dao对象
        StudentService studentService = (StudentService) applicationContext.getBean("studentService");
        List<Student> studentList = studentService.queryStudents();
        for (Student student: studentList) {
            System.out.println(student);
        }
    }
}
