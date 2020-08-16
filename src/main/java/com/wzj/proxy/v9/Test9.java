package com.wzj.proxy.v9;

/**
 * @Author: wzj
 * @Date: 2020/8/4 21:23
 * @Desc: 打印生成的代理
 *
 */
public class Test9 {
    public static void main(String[] args) {
        Apple apple = new Apple();
        //在项目目录下生成代理类
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
        LogHandler handler = new LogHandler(apple);
        Sellalbe sellalbe = (Sellalbe) new ProxyGenerator().createProxy(apple, handler);
        sellalbe.secKill();
}
}
