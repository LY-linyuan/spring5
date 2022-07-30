package com.bjpowernode.ba04;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
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
     *   异常通知方法的定义格式
     *      1 public
     *      2 没有返回值
     *      3 方法名称自定义
     *      4 方法有一个Exception  如果还有  joinPoint  Exception
     */

    /**
     * @AfterThrowing : 异常通知
     *      属性
     *          value 切入点表达式
     *          throwing  自定义变量  表示目标方法抛出的异常对象
     *            变量名 必须和方法的参数名一样
     *  特点
     *      1 在目标方法抛出异常时执行
     *      2 可以做异常的监控程序        监控目标方法执行时是不是有异常
     *          如果有异常 可以发送邮件 短信进行通知
     *
     *     执行就是
     *          try{
     *                 SomeService.doSecond(..);
     *          } catch(Exception e) {
     *              myAfterThroeing(e);
     *          }
     */
    @AfterThrowing(value = "execution(* *..SomeServiceImpl.doSecond(..))",
            throwing = "ex")
    public void myAfterThrowing(Exception ex) {
        System.out.println("方法发生异常时  执行" + ex.getMessage());
        // 发送邮件短信
    }


}
