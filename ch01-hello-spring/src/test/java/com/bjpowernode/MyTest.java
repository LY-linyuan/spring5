package com.bjpowernode;

import com.bjpowernode.service.SomeService;
import com.bjpowernode.service.impl.SomeServiceImpl;
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
    public void Test01() {
        SomeService service = new SomeServiceImpl();
        service.doSome();
    }

    /**
     * spring创建对象默认的是调用无参构造方法
     */
    @Test
    public void test02() {
        // 使用spring 容器创建的对象
        // 1 指定spring配置文件的名称
        String config = "beans.xml";
        // 2. 创建表示spring容器的对象, ApplicationContext
        // ApplicationContext 表示spring容器 通过这个容器就能狗获取对象了
        // ClassPathXmlApplicationContext via哦是从类路径中加载spring配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        // 从容器中获取某个对象  你要调用对象的方法
        // ac.getBean("配置文件中bean的id值");
        SomeService someService = (SomeService) ac.getBean("someService");
        // 使用spring创建好的对象
        someService.doSome();
    }

    /**
     * 获取spring容器中java对象的信息
     */

    @Test
    public void test03() {
        String config = "beans.xml";
        ApplicationContext ac = new  ClassPathXmlApplicationContext(config);
        // 使用spring 提供的方法来获取容器中定义对象的数量
        int nums = ac.getBeanDefinitionCount();
        System.out.println(nums);
        // 容器中每个定义对象的名称  返回值  是由id值构成的一个String[] 数组
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        for (String string : beanDefinitionNames) {
            System.out.println(string);
        }
    }


    // 获取一个非自定义类的对象
    @Test
    public void test04() {
        String config = "beans.xml";
        ApplicationContext ac = new  ClassPathXmlApplicationContext(config);
        Date mydate = (Date) ac.getBean("mydate");
        System.out.println(mydate);
    }


}
