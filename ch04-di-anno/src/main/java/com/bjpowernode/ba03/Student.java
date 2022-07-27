package com.bjpowernode.ba03;

/**
 * @Author 临渊
 * @Date 2022-07-27 6:19
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("myStudent")
public class Student {
    @Value(value = "张张三")
    private String name;
    private Integer age;
    /**
     * 引用类型赋值
     * @Autowried spring 框架提供的注解  实现引用类型的赋值
     *   使用自动注原理
     *      默认使用的byType
     *      属性上模无需set方法
     *              set方法上面
     */
    @Autowired
    private School school;



    public Student() {
        System.out.println("myStudent无参数构造方法");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    @Value(value = "200")
    public void setAge(Integer age) {
        this.age = age;
    }

    public void setSchool(School school) {
        this.school = school;
    }
}
