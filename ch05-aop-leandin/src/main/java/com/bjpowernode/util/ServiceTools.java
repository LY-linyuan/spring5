package com.bjpowernode.util;

import java.util.Date;

/**
 * @Author 临渊
 * @Date 2022-07-27 10:34
 */
public class ServiceTools {
    public static void doLog() {
        System.out.println("方法执行事件" + new Date());
    }
    public static void doTrans() {
        System.out.println("提交事务");
    }
}
