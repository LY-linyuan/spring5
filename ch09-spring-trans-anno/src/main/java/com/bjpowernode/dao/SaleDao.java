package com.bjpowernode.dao;

import com.bjpowernode.domain.Sale;

/**
 * @Author 临渊
 * @Date 2022-07-31 15:13
 */
public interface SaleDao {
    // 增加销售记录
    int insertSale(Sale sale);
}
