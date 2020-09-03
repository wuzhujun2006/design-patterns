package com.wzj.visitor.example2;

/**
 * @Author: wzj
 * @Date: 2020/9/2 21:13
 * @Desc: CPU
 */
public class CPU implements ComputerPart{
    @Override
    public void accept(Visitor v) {
        v.visitCpu(this);
    }

    @Override
    public double getPrice() {
        return 1000;
    }
}
