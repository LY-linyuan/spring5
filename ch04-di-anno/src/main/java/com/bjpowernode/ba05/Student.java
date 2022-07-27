package com.bjpowernode.ba05;

/**
 * @Author 临渊
 * @Date 2022-07-27 6:19
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("myStudent")
public class Student {
    @Value(value = "张三")
    private String name;
    private Integer age;
    /**
     * 引用类型赋值
     * @Autowried spring 框架提供的注解  实现引用类型的赋值
     *   使用自动注原理
     *      默认使用的byType
     *      属性上模无需set方法
     *              set方法上面
     *
     *      属性 : required  是一个boolean 类型  默认为true
     *              引用类型如果赋值失败那就报错 终止执行
     *              如果是false 的话 如果赋值失败程序正常运行  引用类型赋值null
     *
     *         大多情况用true可能更合适
     *
     *
     *     使用byName
     *     属性上面   1 先有一个@Autowired
     *              2 属性上面  加入@Qualifier(value = "bean  的 id")
     *          这两个注解没有先后顺序
     */
    @Autowired(required = false)
    @Qualifier(value = "mySchool-1")
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
