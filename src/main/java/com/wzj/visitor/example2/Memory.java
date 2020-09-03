package com.wzj.visitor.example2;

/**
 * @Author: wzj
 * @Date: 2020/9/2 21:13
 * @Desc: 内存条
 */
public class Memory implements ComputerPart{
    @Override
    public void accept(Visitor v) {
        v.visitMemory(this);
    }

    @Override
    public double getPrice() {
        return 500;
    }
}
