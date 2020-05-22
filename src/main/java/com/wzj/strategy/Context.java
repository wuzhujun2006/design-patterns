package com.wzj.strategy;

/**
 * @Author: wzj
 * @Date: 2020/5/5 21:25
 * @Desc: 优惠类：环境类
 */
public class Context {
    private int price;
    private Discount discount;

    public Context(int price, Discount discount) {
        this.price = price;
        this.discount = discount;
    }

    public int getPrice() {
        return this.discount.calculateBySourcePrice(this.price);
    }
}
