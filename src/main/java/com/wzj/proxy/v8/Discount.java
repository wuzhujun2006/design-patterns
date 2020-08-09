package com.wzj.proxy.v8;

/**
 * @Author: wzj
 * @Date: 2020/8/5 20:56
 * @Desc: 折扣优惠接口
 */
public interface Discount {
    public int calculateBySourcePrice(int price);
}
