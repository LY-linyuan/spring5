package com.bjpowernode.service.impl;

import com.bjpowernode.service.SomeService;

/**
 * @Author 临渊
 * @Date 2022-07-26 10:29
 */
public class SomeServiceImpl implements SomeService {

    public SomeServiceImpl() {
        System.out.println("SomeServiceImpl  无参数的构造方法");
    }

    @Override
    public void doSome() {
        System.out.println("执行了SomeServiceImpl的doSome方法");
    }
}
