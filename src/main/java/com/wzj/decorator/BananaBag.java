package com.wzj.decorator;

/**
 * @Author: wzj
 * @Date: 2020/9/8 10:15
 * @Desc: 香蕉包装类
 */
public class BananaBag implements Bag {
    @Override
    public void pack() {
        System.out.println("香蕉使用竹箩包装");
    }
}
