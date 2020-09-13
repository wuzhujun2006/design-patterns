package com.wzj.decorator;

/**
 * @Author: wzj
 * @Date: 2020/9/8 10:15
 * @Desc: 苹果包装类
 */
public class AppleBag implements Bag {
    @Override
    public void pack() {
        System.out.println("苹果使用纸箱包装");
    }
}
