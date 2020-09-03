package com.wzj.visitor.example1;

import org.aspectj.weaver.ast.Or;

/**
 * @Author: wzj
 * @Date: 2020/9/2 20:57
 * @Desc:
 */
public class Client {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Orange orange = new Orange();
        Banana banana = new Banana();
        //个人套餐价格
        PersonelVisitor p = new PersonelVisitor();
        new ConcretePackage(apple, orange, banana).accept(p);
        System.out.println("个人套餐价格：" + p.totalPrice);
        //公司套餐价格
        GroupVisitor g = new GroupVisitor();
        new ConcretePackage(apple, orange, banana).accept(g);
        System.out.println("公司套餐价格：" + g.totalPrice);
    }
}
