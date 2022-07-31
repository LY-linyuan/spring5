package com.bjpowernode;

import com.bjpowernode.service.BuyGoodsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author 临渊
 * @Date 2022-07-31 15:44
 */
public class MyTest {
    @Test
    public void test01() {
        String config = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        BuyGoodsService buyService = (BuyGoodsService) applicationContext.getBean("buyService");

        System.out.println("service是代理" + buyService.getClass().getName());
        // 调用方法
        buyService.buy(1001, 10);
    }
}
