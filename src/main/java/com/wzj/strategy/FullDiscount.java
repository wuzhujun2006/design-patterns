package com.wzj.strategy;

/**
 * @Author: wzj
 * @Date: 2020/5/5 20:57
 * @Desc: 优惠满减20元
 */
public class FullDiscount implements Discount {
    @Override
    public int calculateBySourcePrice(int price) {
        if (price > 200){
            System.out.println("优惠满减20元");
            price = price - 20;
        }
        return price;
    }
}
