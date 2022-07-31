package com.bjpowernode.dao;

import com.bjpowernode.domain.Goods;

public interface GoodsDao {
    // 更新库存
    // good表示本次用户的商品信息 id 购买数量
    int updateGoods(Goods goods);

    // 查询商品的信息
    Goods selectGoods(Integer id);
}
