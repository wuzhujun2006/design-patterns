package com.wzj.strategy;

/**
 * @Author: wzj
 * @Date: 2020/5/5 21:05
 * @Desc: 第二件打9折
 */
public class SecondPurchaseDiscount implements Discount {
    @Override
    public int calculateBySourcePrice(int price) {
        System.out.println("第二件打9折");
        Double balance =  price * 0.9;

        return balance.intValue();
    }
}
