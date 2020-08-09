package com.wzj.proxy.v6;

/**
 * @Author: wzj
 * @Date: 2020/8/3 21:39
 * @Desc: 记录日志的代理类
 */
public class AppleLogProxy implements Sellalbe {

    Sellalbe sellalbe;

    public AppleLogProxy(Sellalbe sellalbe) {
        this.sellalbe = sellalbe;
    }

    @Override
    public void secKill() {
        System.out.println("秒杀开始...");
        sellalbe.secKill();
        System.out.println("秒杀结束...");
    }
}
