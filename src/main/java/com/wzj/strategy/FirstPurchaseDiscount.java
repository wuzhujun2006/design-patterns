package com.wzj.strategy;

/**
 * @Author: wzj
 * @Date: 2020/5/5 21:11
 * @Desc: 首次购买减20元
 */
public class FirstPurchaseDiscount implements Discount {
    @Override
    public int calculateBySourcePrice(int price) {
        if (price > 100){
            System.out.println("首次购买减20元");
            price = price - 20;
        }

        return price;
    }
}
