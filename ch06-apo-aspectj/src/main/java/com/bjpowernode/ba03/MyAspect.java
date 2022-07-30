package com.bjpowernode.ba03;

import com.bjpowernode.ba02.Student;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Date;

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

    /**
     *   环绕通知方法的定义格式
     *      1 public
     *      2 必须有一个返回值   推荐 Object
     *      3 方法名称自定义
     *      4 方法有参数  固定参数  ProceedingJoinPoint
     *
     */

    /**
     * @Around 环绕通知
     *  属性 value  切入点表达式
     *  位置  方法的定义上面
     *
     *      特点 :
     *          1. 功能最强的功能
     *          2. 可以在目标方法的前和后都能增加功能
     *          3. 控制目标方法是否被调用执行
     *          4. 修改原来目标方法的执行结果  影响最后的调用结果
     *
     *       环绕通知  就等于jdk的动态代理
     *
     *              参数 ProceedingJoinPoint  等同于method  执行目标方法
     *              返回值  目标方法的执行结果  可以被修改
     *
     */
    @Around(value = "execution(* *..SomeServiceImpl.doFirst(..))")
    public Object myAround(ProceedingJoinPoint pjp) throws Throwable {
        // 获取第一个参数值
        String name = "";
        Object[] args = pjp.getArgs();
        if (args != null && args.length > 1) {
            Object arg = args[0];
            name = (String) arg;
        }

        // 环绕通知的功能
        Object result = null;
        System.out.println("环绕通知目标方法前 " + new Date());
        // 目标方法的调用
        if ("张三".equals(name)) {
            // 调用目标方法
            result = pjp.proceed(); // method.invoke();   Object result = doFirst();
        }
        // 在目标方法前后加功能
        System.out.println("环绕通知目标方法后  提交事务");

        // 修改目标方法的执行结果
        if (result != null) {
            result = "0000123456";
        }

        // 返回目标方法执行结果
        return result;


    }

}
