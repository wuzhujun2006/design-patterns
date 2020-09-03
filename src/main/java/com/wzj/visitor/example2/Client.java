package com.wzj.visitor.example2;

/**
 * @Author: wzj
 * @Date: 2020/9/2 21:24
 * @Desc:
 */
public class Client {
    public static void main(String[] args) {
        CPU cpu = new CPU();
        Memory memory = new Memory();
        Board board = new Board();
        PersonelVisitor p = new PersonelVisitor();
        new Computer(cpu, memory, board).acccept(p);
        System.out.println("个人套餐价格：" + p.totalPrice);
        GroupVisitor g = new GroupVisitor();
        new Computer(cpu, memory, board).acccept(g);
        System.out.println("公司套餐价格：" + g.totalPrice);
    }
}
