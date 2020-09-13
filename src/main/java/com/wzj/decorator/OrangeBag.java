package com.wzj.decorator;

/**
 * @Author: wzj
 * @Date: 2020/9/8 10:15
 * @Desc: 橘子包装类
 */
public class OrangeBag implements Bag {
    @Override
    public void pack() {
        System.out.println("橘子使用网兜包装");
    }
}
