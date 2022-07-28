package com.bjpowernode.ba01;

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
}
