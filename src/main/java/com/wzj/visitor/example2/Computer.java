package com.wzj.visitor.example2;

/**
 * @Author: wzj
 * @Date: 2020/9/2 21:24
 * @Desc:  电脑
 */
public class Computer {

    CPU cpu;
    Memory memory;
    Board board;

    public Computer(CPU cpu, Memory memory, Board board) {
        this.cpu = cpu;
        this.memory = memory;
        this.board = board;
    }

    public void acccept(Visitor v) {
        this.cpu.accept(v);
        this.memory.accept(v);
        this.board.accept(v);
    }
}
