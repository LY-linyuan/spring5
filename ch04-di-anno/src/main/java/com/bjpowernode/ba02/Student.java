package com.bjpowernode.ba02;

/**
 * @Author 临渊
 * @Date 2022-07-27 6:19
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 简单类型的属性赋值
 * @Value value 是String 类型的 表示简单类型的属性赋值
 *       1 在属性定义的上面  无需set方法
 *       2 在set方法上
 *
 */

@Component("myStudent")
public class Student {
    // @Value(value = "张张三")
    @Value("${myName}")
    private String name;
    private Integer age;



    public Student() {
        System.out.println("myStudent无参数构造方法");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /*public void setName(String name) {
        this.name = name;
    }*/

    // @Value(value = "200")
    @Value("${myAge}")
    public void setAge(Integer age) {
        this.age = age;
    }
}
