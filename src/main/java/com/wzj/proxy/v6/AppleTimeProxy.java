package com.wzj.proxy.v6;

/**
 * @Author: wzj
 * @Date: 2020/8/3 15:46
 * @Desc: 记录时间的代理
 * 组合优于继承
 */
public class AppleTimeProxy implements Sellalbe {

    Sellalbe sellalbe;

    public AppleTimeProxy(Sellalbe sellalbe) {
        this.sellalbe = sellalbe;
    }

    @Override
    public void secKill() {
        long start = System.currentTimeMillis();
        sellalbe.secKill();
        long end = System.currentTimeMillis();
        System.out.println("记录秒杀时间为:" + (end - start));
    }
}
