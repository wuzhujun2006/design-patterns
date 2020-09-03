package com.wzj.visitor.example1;

/**
 * @Author: wzj
 * @Date: 2020/9/2 20:41
 * @Desc:  团购访问者--一律8折
 */
public class GroupVisitor implements Visitor{

    double totalPrice = 0.0;


    @Override
    public void visitApple(Apple apple) {
        totalPrice += apple.getPrice() * 0.8;
    }

    @Override
    public void visitOrange(Orange orange) {
        totalPrice += orange.getPrice() * 0.8;
    }

    @Override
    public void visitBanana(Banana banana) {
        totalPrice += banana.getPrice() * 0.8;
    }
}
