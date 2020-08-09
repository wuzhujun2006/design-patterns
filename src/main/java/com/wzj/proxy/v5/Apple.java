package com.wzj.proxy.v5;

import java.util.Random;

/**
 * @Author: wzj
 * @Date: 2020/8/3 10:29
 * @Desc: 待销苹果
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
