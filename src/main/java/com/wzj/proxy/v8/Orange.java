package com.wzj.proxy.v8;

/**
 * @Author: wzj
 * @Date: 2020/8/4 17:45
 * @Desc: 待销橘子
 */
public class Orange implements Discount {

    /**
     * 打折优惠
     */
    @Override
    public int calculateBySourcePrice(int price) {
        int i= 9;
        System.out.println("橘子打折优惠, 一律9元");
        return i;
    }
}
