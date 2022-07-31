package com.bjpowernode.ba07;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @Author 临渊
 * @Date 2022-07-27 13:17
 */

/**
 * @Aspect : 是aspectj框架中的注解
 *      作用 : 用来表示当前类是切面类
 *      切面类 : 是用来给业务方法增加功能的类 在这个歌类中有切面的功能的代码
 *    使用微值 : 在类定义的上面
 */
@Aspect
public class MyAspect {

    @After(value = "mypt()")
    public void myAfter() {
        System.out.println("执行最终通知   总是会执行");
        // 一般做资源清除工作
    }

    @Before(value = "mypt()")
    public void mBefore() {
        System.out.println("执行前置通知   目标方法之前执行");
        // 一般做资源清除工作
    }

    /**
     * @Pointcut  管理切入点表达式
     *      属性  : value  切入点表达式
     *      位置 :  自动以方法上面
     *    当时用Pointcut定义一个方法的上面时  name这个方法的名称就是这个切入点表达式的别名
     *      其他的通知中 value属性可以使用这个方法的名称  待日切入点表达式
     */

    @Pointcut("execution(* *..SomeServiceImpl.doThird(..))")
    private void mypt() {
        // 内部无需写代码
    }


}
