package com.wzj.proxy.v6;

/**
 * @Author: wzj
 * @Date: 2020/8/3 21:44
 * @Desc: 如何实现代理的各种组合？继承？Decorator?
 *  代理的对象改成Sellable类型-越来越像decorator了,为了实现嵌套
 */
public class Test6 {
    public static void main(String[] args) {
        //先记录时间，后打印日志
        new AppleLogProxy(new AppleTimeProxy(new Apple())).secKill();
        System.out.println("===========================");
        //先打印日志，后记录时间
        new AppleTimeProxy(new AppleLogProxy(new Apple())).secKill();
    }
}
