package com.wzj.strategy;

/**
 * @Author: wzj
 * @Date: 2020/5/5 20:56
 * @Desc: 折扣优惠接口
 */
public interface Discount {
    public int calculateBySourcePrice(int price);
}
