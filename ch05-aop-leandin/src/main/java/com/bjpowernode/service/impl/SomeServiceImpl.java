package com.bjpowernode.service.impl;

import com.bjpowernode.service.SomeService;
import com.bjpowernode.util.ServiceTools;

import java.util.Date;

/**
 * @Author 临渊
 * @Date 2022-07-27 10:25
 */
public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome() {
        System.out.println("执行业务方法  doSome");
    }

    @Override
    public void doOther() {
        System.out.println("执行业务方法  doOther");
    }
}
