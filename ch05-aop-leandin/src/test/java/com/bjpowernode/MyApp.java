package com.bjpowernode;

import com.bjpowernode.handler.MyInvocationHandler;
import com.bjpowernode.service.SomeService;
import com.bjpowernode.service.impl.SomeServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Author 临渊
 * @Date 2022-07-27 10:26
 */
public class MyApp {
    public static void main(String[] args) {
        /*// 调用doSome doOther
        SomeService service = new SomeServiceImpl();
        service.doSome();
        service.doOther();*/

        // 使用jdk的Proxy创建代理对象
        // 创建目标对象
        SomeService target = new SomeServiceImpl();
        // 创建InvocationHandler对象
        InvocationHandler handler = new MyInvocationHandler(target);
        // 创建proxy代理对象
        SomeService service = (SomeService) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), handler);

        service.doSome();
        System.out.println("=================================");
        service.doOther();
    }
}
