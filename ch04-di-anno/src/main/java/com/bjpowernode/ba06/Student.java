package com.bjpowernode.ba06;

/**
 * @Author 临渊
 * @Date 2022-07-27 6:19
 */

import com.bjpowernode.ba06.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resources;


@Component("myStudent")
public class Student {
    @Value(value = "张三")
    private String name;
    private Integer age;
    /**
     *  引用类型
     * @Resource 来自jdk中的注解 spring框架提供了对这个注解的支持  可以使用它给引用类型赋值
     *          使用自动注入的原理 支持byName byType 默认byName
     *    属性上面 无需set
     *          set上面
     *
     *  默认先试用byName  如果byName失败  那就用byType
     *      只使用byName 的话
     *      @Resources(name = "mySchool")
     */
//     @Resources(name = "mySchool")
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
