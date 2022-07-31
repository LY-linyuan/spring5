package com.bjpowernode.service.impl;

import com.bjpowernode.dao.GoodsDao;
import com.bjpowernode.dao.SaleDao;
import com.bjpowernode.domain.Goods;
import com.bjpowernode.domain.Sale;
import com.bjpowernode.service.BuyGoodsService;

/**
 * @Author 临渊
 * @Date 2022-07-31 15:30
 */
public class BuyGoodsServiceImpl implements BuyGoodsService {

    private SaleDao saleDao;
    private GoodsDao goodsDao;

    @Override
    public void buy(Integer goodsId, Integer nums) {
        System.out.println("buy  方法的开始");
        // 记录销售的信息
        Sale sale = new Sale();
        sale.setGid(goodsId);
        sale.setNums(nums);
        saleDao.insertSale(sale);
        // 更新库存
        Goods goods = goodsDao.selectGoods(goodsId);
        if (goods == null) {
            // 不存在
            throw new NullPointerException("编号" + goodsId + "商品不存在");
        } else if (goods.getAmount() < nums){
            // 商品库存不足
            throw new NullPointerException("编号" + goodsId + "商品库存不足");
        } else {
            // 修改库存
            Goods buyGoods = new Goods();
            buyGoods.setId(goodsId);
            buyGoods.setAmount(nums);
            goodsDao.updateGoods(buyGoods);
        }
        System.out.println("buy  方法的完成");



    }

    public void setSaleDao(SaleDao saleDao) {
        this.saleDao = saleDao;
    }

    public void setGoodsDao(GoodsDao goodsDao) {
        this.goodsDao = goodsDao;
    }


}
