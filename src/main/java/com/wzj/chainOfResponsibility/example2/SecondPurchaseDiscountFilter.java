package com.wzj.chainOfResponsibility.example2;

/**
 * @Author: wzj
 * @Date: 2019/9/8 16:09
 * @Desc: 第二件打9折
 */
public class SecondPurchaseDiscountFilter  extends DiscountFilter{
    public int calculateBySourcePrice(int price) {

        System.out.println("第二件打9折");
        Double balance =  price * 0.9;

        if(this.nextDiscountFilter != null) {
            return super.nextDiscountFilter.calculateBySourcePrice(balance.intValue());
        }
        return price;
    }
}
