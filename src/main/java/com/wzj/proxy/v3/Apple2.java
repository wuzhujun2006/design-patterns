package com.wzj.proxy.v3;

/**
 * @Author: wzj
 * @Date: 2020/8/3 15:25
 * @Desc: 继承实现
 */
public class Apple2 extends Apple {

    @Override
    public void secKill() {
        long start = System.currentTimeMillis();
        super.secKill();
        long end = System.currentTimeMillis();
        System.out.println("记录秒杀时间为:" + (end - start));
    }

}
