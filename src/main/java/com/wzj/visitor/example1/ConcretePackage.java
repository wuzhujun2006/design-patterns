package com.wzj.visitor.example1;

/**
 * @Author: wzj
 * @Date: 2020/9/2 20:51
 * @Desc: 具体套餐，苹果、香蕉、橘子
 */
public class ConcretePackage implements FruitPackage{
    Apple apple;
    Orange orange;
    Banana banana;

    public ConcretePackage(Apple apple, Orange orange, Banana banana) {
        this.apple = apple;
        this.orange = orange;
        this.banana = banana;
    }

    public void accept(Visitor visitor) {
        this.apple.accept(visitor);
        this.orange.accept(visitor);
        this.banana.accept(visitor);
    }

    @Override
    public double getPrice() {
        return apple.getPrice() + orange.getPrice() + banana.getPrice();
    }
}
