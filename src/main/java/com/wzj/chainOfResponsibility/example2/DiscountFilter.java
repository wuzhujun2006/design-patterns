package com.wzj.chainOfResponsibility.example2;

/**
 * @Author: wzj
 * @Date: 2019/9/8 9:06
 * @Desc: 折扣优惠接口
 */
public abstract class DiscountFilter {

    // 下一个责任链成员
    protected DiscountFilter nextDiscountFilter;

    // 根据原价计算优惠后的价格
    public abstract int calculateBySourcePrice(int price);

}
