package com.wzj.proxy.v5;

/**
 * @Author: wzj
 * @Date: 2020/8/3 21:39
 * @Desc: 记录日志的代理类
 */
public class AppleLogProxy implements Sellalbe {

    Apple apple;

    public AppleLogProxy(Apple apple) {
        this.apple = apple;
    }

    @Override
    public void secKill() {
        System.out.println("秒杀开始...");
        apple.secKill();
        System.out.println("秒杀结束...");
    }
}
