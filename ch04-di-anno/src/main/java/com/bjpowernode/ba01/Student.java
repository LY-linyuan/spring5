package com.bjpowernode.ba01;

import org.springframework.stereotype.Component;

/**
 * @Author 临渊
 * @Date 2022-07-27 6:19
 */

/**
 * @Cpmponent 创建对象的注解  等同于 bean标签的功能
 *      竖向value  对象的名称  就是bean的  id值
 *          value的值是唯一的  创建的对象在整个  spring就一个
 *          位置  在类的上面
 *   @Component (value = "myStudent")  等同于   <bean id="myStudent" class="com.bjpowernode.ba01.Student></bean>
 *
 *    spring 中与Component功能一致的注解还有
 *      1. @Repository(持久层的注解  放在持久层类的上面) :
 *          放在   dao的实现类上面 表示创建dao对象  dao对象是能访问数据库的
 *      2. @Service(放在业务层类上面) 放在service
 *              的实现类的上面 service类对象是做业务处理 可以有事务处理的功能
 *      3. @Controller (放在控制器上面的)  创建控制器的对象
 *          能够接收用户提交的参数  显示请求处理的结果
 *      以上三个注解的使用语法和Component一样  但是这三个注解的功能还有额外的功能
 *
 * @Repository @Service @ Controller 给项目分层的  持久层 业务层 控制层
 *
 */

// 使用value指定名称
    // 只有这一个属性的时候value可以省略
// @Component(value = "myStudent")
// @Component("myStudent")   常用
    // 不指定对象名称  由spring提供默认的对象名称 默认名称为类的名字的小写开头
@Component
public class Student {
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

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
