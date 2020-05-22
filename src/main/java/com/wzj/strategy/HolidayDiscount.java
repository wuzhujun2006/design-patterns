package com.wzj.strategy;

/**
 * @Author: wzj
 * @Date: 2020/5/5 21:09
 * @Desc: 节日一律减5元
 */
public class HolidayDiscount implements Discount {
    @Override
    public int calculateBySourcePrice(int price) {
        if (price > 20){
            System.out.println("节日一律减5元");
            price = price - 5;
        }

        return price;
    }
}
