package com.wzj.proxy.v5;

/**
 * @Author: wzj
 * @Date: 2020/8/3 15:46
 * @Desc: 记录时间的代理
 * 组合优于继承
 */
public class AppleTimeProxy implements Sellalbe {

    Apple apple;

    public AppleTimeProxy(Apple apple) {
        this.apple = apple;
    }

    @Override
    public void secKill() {
        long start = System.currentTimeMillis();
        apple.secKill();
        long end = System.currentTimeMillis();
        System.out.println("记录秒杀时间为:" + (end - start));
    }
}
