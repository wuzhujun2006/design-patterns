package com.wzj.visitor.example1;

/**
 * @Author: wzj
 * @Date: 2020/9/2 20:16
 * @Desc: 香蕉
 */
public class Banana implements FruitPackage {

    @Override
    public void accept(Visitor visitor) {
        visitor.visitBanana(this);
    }

    @Override
    public double getPrice() {
        return 40;
    }
}
