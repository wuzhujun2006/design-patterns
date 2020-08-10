package com.wzj.proxy.v7;


import java.lang.reflect.InvocationHandler;

/**
 * @Author: wzj
 * @Date: 2020/8/3 21:44
 * @Desc: 如果想让LogProxy可以重用，不仅可以代理Apple，还可以代理任何其他可以代理的类型 Object
 *  （毕竟日志记录，时间计算是很多方法都需要的东西），这时该怎么做呢？
 *  分离代理行为与被代理对象
 *  使用jdk的动态代理
 */
public class Test7 {
    public static void main(String[] args) {
        Apple apple = new Apple();
        InvocationHandler handler = new LogHandler(apple);
        Sellalbe sellalbe = (Sellalbe) new ProxyGenerator().createProxy(apple, handler);
        sellalbe.secKill();
    }
}
