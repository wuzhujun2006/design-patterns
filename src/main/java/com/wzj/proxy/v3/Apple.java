package com.wzj.proxy.v3;

import java.util.Random;

/**
 * @Author: wzj
 * @Date: 2020/8/3 10:29
 * @Desc: 待销苹果
 * 问题1：记录苹果秒杀的具体时间
 * 最简单的做法就是修改代码
 * 问题2：如果没法改变方法源码呢？
 * 继承
 */
public class Apple implements Sellalbe {

    @Override
    public void secKill() {
        System.out.println("苹果正在秒杀中...");
        try {
            Thread.sleep(new Random().nextInt(3000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
