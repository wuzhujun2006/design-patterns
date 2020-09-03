package com.wzj.visitor.example1;

/**
 * @Author: wzj
 * @Date: 2020/9/2 20:16
 * @Desc: 苹果
 */
public class Apple implements FruitPackage {

    @Override
    public void accept(Visitor visitor) {
        visitor.visitApple(this);
    }

    @Override
    public double getPrice() {
        return 30;
    }
}
