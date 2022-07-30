package com.bjpowernode.ba05;

import com.bjpowernode.ba02.Student;

/**
 * @Author 临渊
 * @Date 2022-07-27 13:15
 */
public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome(String name, Integer age) {
        // 给doSome方法增加功能 在这个方法之前增加一个时间
        System.out.println("目标方法doSome   " + name + age);
    }

    @Override
    public String doOther(String name, Integer age) {
        System.out.println("执行了目标类的doOther方法");
        return "abcd";
    }

    @Override
    public Student doOther2(String name, Integer age) {
        Student student = new Student();
        student.setName("李四");
        student.setAge(2000);
        return student;
    }

    @Override
    public String doFirst(String name, Integer age) {
        System.out.println("业务目标类的方法  doFirst()");
        return "ddoFirsto";
    }

    @Override
    public void doSecond() {
        System.out.println("执行业务目标方法doSecond");
        // System.out.println("执行业务目标方法doSecond" + 10 / 0);
    }

    @Override
    public void doThird() {
        System.out.println("执行doThird  目标方法");
        // System.out.println("执行doThird  目标方法" + 10 / 0);
    }
}
