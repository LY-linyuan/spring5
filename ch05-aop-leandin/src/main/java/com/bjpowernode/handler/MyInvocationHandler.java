package com.bjpowernode.handler;

import com.bjpowernode.util.ServiceTools;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * @Author 临渊
 * @Date 2022-07-27 10:42
 */
public class MyInvocationHandler implements InvocationHandler {

    private Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 通过代理对象在执行方法是会调用执行invoke()
        System.out.println("执行MyInvocationHandler的invoke方法");
        System.out.println("method的方法名称" + method.getName());
        String methodName = method.getName();
        Object res = null;
        if (methodName == "doSome"){
        res = null;
        ServiceTools.doLog();
        res = method.invoke(target, args);
        ServiceTools.doTrans();
        } else {
            res = method.invoke(target, args);
        }
        return res;
    }
}
