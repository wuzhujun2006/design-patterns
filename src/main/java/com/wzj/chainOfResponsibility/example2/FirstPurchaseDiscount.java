package com.wzj.chainOfResponsibility.example2;

/**
 * @Author: wzj
 * @Date: 2019/9/8 16:06
 * @Desc: 首次购买减20元
 */
public class FirstPurchaseDiscount extends DiscountFilter {
    public int calculateBySourcePrice(int price) {
        if (price > 100){
            System.out.println("首次购买减20元");
            price = price - 20;
        }

        if(this.nextDiscountFilter != null) {
            return super.nextDiscountFilter.calculateBySourcePrice(price);
        }
        return price;
    }
}
