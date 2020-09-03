package com.wzj.visitor.example1;

/**
 * @Author: wzj
 * @Date: 2020/9/2 20:14
 * @Desc: 访问者接口
 */
public interface Visitor {

    void visitApple(Apple apple);

    void visitOrange(Orange orange);

    void visitBanana(Banana banana);

}
