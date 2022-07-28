package com.bjpowernode.ba02;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

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
     *  后置通知  定义方法 : 实现切面功能的
     *      方法的定义要求 :
     *          1. 公共方法
     *          2. 无返回值
     *          3. 方法名称自定义
     *          4. 方法可以有参数 也可以没有
     *                  如果有参数 参数不是自定义的, 有几个参数类型可以使用
     */


    /**
     * @AfterReturning 后置通知
     *  属性
     *      1. value 切入点表达式
     *      2. returning 自定义变量 表示目标方法的返回值的
     *          这个自定义变量名必须要和通知方法的形参名一样
     *   位置 :
     *      方法定义的上面
     *              1. 在目标方法之后执行的
     *              2. 可以获取目标方法的返回值可以根据返回值做不同处理的功能
     *              3. 可以修改这个返回值
     *        Object res = doOther();
     * @param res
     */
    @AfterReturning(value = "execution(* *..SomeServiceImpl.doOther(..))",
            returning = "res")
    public void myAfterReturning(Object res) {
        // res 是目标方法执行的返回值
        System.out.println("后置通知");
    }

}
