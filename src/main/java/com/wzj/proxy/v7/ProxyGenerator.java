package com.wzj.proxy.v7;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Author: wzj
 * @Date: 2020/8/4 8:55
 * @Desc: JDK实现动态代理
 */
public class ProxyGenerator {
    public Object createProxy(Apple apple, InvocationHandler handler) {
        Object o = Proxy.newProxyInstance(apple.getClass().getClassLoader(),
                apple.getClass().getInterfaces(), handler);
        return o;
    }
}
