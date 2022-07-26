package com.bjpowernode.ba01;

/**
 * @Author 临渊
 * @Date 2022-07-26 11:52
 */
public class Student {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setName(String name) {
        System.out.println("name   111111");
        this.name = name;
    }

    public void setAge(int age) {
        System.out.println("age   222222");
        this.age = age;
    }

    public void setEmail(String email) {
        System.out.println(email);
    }


}
