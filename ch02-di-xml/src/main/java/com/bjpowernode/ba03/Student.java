package com.bjpowernode.ba03;

/**
 * @Author 临渊
 * @Date 2022-07-26 11:52
 */
public class Student {
    private String name;
    private int age;
    private School school;

    public Student() {
    }

    public Student(String name, int age, School school) {
        System.out.println("有参数构造方法 student");
        this.name = name;
        this.age = age;
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
