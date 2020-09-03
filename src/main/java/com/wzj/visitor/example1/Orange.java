package com.wzj.visitor.example1;

import com.wzj.proxy.v8.Discount;

/**
 * @Author: wzj
 * @Date: 2020/8/4 20:45
 * @Desc: 橘子
 */
public class Orange implements FruitPackage {

    @Override
    public void accept(Visitor visitor) {
        visitor.visitOrange(this);
    }

    @Override
    public double getPrice() {
        return 50;
    }
}
