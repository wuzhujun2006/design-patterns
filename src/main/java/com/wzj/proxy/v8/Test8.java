package com.wzj.proxy.v8;


import java.lang.reflect.InvocationHandler;

/**
 * @Author: wzj
 * @Date: 2020/8/3 21:44
 * @Desc: 如果想让LogProxy可以重用，不仅可以代理Tank，还可以代理任何其他可以代理的类型 Object
 *  （毕竟日志记录，时间计算是很多方法都需要的东西），这时该怎么做呢？
 *  分离代理行为与被代理对象
 *  使用jdk的动态代理
 *
 *  增加泛型,既可以代理苹果秒杀的接口，也可以代理橘子打折接口，实现任何对象任何接口的代理
 */
public class Test8 {
    public static void main(String[] args) {
        Apple apple = new Apple();
        InvocationHandler appHandler = new LogHandler(apple);
        Sellalbe sellalbe = (Sellalbe) new ProxyGenerator().createProxy(apple, appHandler);
        sellalbe.secKill();

        System.out.println("=================================");

        Orange orange = new Orange();
        InvocationHandler orgHandler = new LogHandler(orange);
        Discount discount = (Discount) new ProxyGenerator().createProxy(orange, orgHandler);
        discount.calculateBySourcePrice(10);
    }
}
