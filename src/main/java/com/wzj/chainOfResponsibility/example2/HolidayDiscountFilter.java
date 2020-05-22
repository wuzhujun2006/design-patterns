package com.wzj.chainOfResponsibility.example2;

/**
 * @Author: wzj
 * @Date: 2019/9/8 16:02
 * @Desc: 节日一律减5元
 */
public class HolidayDiscountFilter extends DiscountFilter{
    public int calculateBySourcePrice(int price) {
        if (price > 20){
            System.out.println("节日一律减5元");
            price = price - 5;
        }

        if(this.nextDiscountFilter != null) {
            return super.nextDiscountFilter.calculateBySourcePrice(price);
        }
        return price;
    }
}
