package com.wzj.chainOfResponsibility.example2;

/**
 * @Author: wzj
 * @Date: 2019/9/8 9:07
 * @Desc: 满200减20元
 */
public class FullDiscountFilter extends DiscountFilter{

    public int calculateBySourcePrice(int price) {
        if (price > 200){
            System.out.println("优惠满减20元");
            price = price - 20;
        }

        if(this.nextDiscountFilter != null) {
            return super.nextDiscountFilter.calculateBySourcePrice(price);
        }
        return price;
    }
}
