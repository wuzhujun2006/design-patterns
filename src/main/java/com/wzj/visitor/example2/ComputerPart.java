package com.wzj.visitor.example2;

/**
 * @Author: wzj
 * @Date: 2020/9/2 21:15
 * @Desc: 电脑部件
 */
public interface ComputerPart {

    void accept(Visitor v);
    double getPrice();
}
