package com.wzj.visitor.example2;

/**
 * @Author: wzj
 * @Date: 2020/9/2 21:13
 * @Desc: CPU
 */
public class Board implements ComputerPart{
    @Override
    public void accept(Visitor v) {
        v.visitBoard(this);
    }

    @Override
    public double getPrice() {
        return 800;
    }
}
