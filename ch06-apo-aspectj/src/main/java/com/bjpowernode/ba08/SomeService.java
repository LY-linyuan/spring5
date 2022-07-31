package com.bjpowernode.ba08;

import com.bjpowernode.ba02.Student;

/**
 * @Author 临渊
 * @Date 2022-07-27 13:15
 */
public interface SomeService {
    void doSome(String name, Integer age);
    String doOther(String name, Integer age);

    Student doOther2(String name, Integer age);

    String doFirst(String name, Integer age);

    void doSecond();

    void doThird();
}
