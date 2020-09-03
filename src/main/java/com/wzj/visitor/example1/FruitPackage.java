package com.wzj.visitor.example1;

/**
 * @Author: wzj
 * @Date: 2020/9/2 20:16
 * @Desc: 水果套餐
 */
interface FruitPackage {
    void accept(Visitor v);
    double getPrice();
}
