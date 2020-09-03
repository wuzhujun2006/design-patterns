package com.wzj.visitor.example2;

/**
 * @Author: wzj
 * @Date: 2020/9/2 21:21
 * @Desc:  公司团购8折
 */
public class GroupVisitor implements Visitor {
    double totalPrice = 0.0;

    @Override
    public void visitCpu(CPU cpu) {
        totalPrice += cpu.getPrice() * 0.8;
    }

    @Override
    public void visitMemory(Memory memory) {
        totalPrice += memory.getPrice() * 0.8;
    }

    @Override
    public void visitBoard(Board board) {
        totalPrice += board.getPrice() * 0.8;
    }
}
