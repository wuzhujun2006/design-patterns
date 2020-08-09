package com.wzj.proxy.v9;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Author: wzj
 * @Date: 2020/8/4 8:55
 * @Desc:
 */
public class ProxyGenerator<T> {
    public Object createProxy(T t, InvocationHandler handler) {
        Object o = Proxy.newProxyInstance(t.getClass().getClassLoader(), t.getClass().getInterfaces(), handler);
        return o;
    }
}
