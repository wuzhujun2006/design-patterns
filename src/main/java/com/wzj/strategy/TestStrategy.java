package com.wzj.strategy;

/**
 * @Author: wzj
 * @Date: 2020/5/5 21:35
 * @Desc: 测试类
 */
public class TestStrategy {
    public static void main(String[] args) {
        Discount discount = new FirstPurchaseDiscount();
        Context context = new Context(110, discount);
        int price = context.getPrice();
        System.out.println(price);
    }
}
