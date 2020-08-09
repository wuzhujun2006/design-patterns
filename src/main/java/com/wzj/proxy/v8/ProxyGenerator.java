package com.wzj.proxy.v8;

import com.wzj.proxy.v8.LogHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Author: wzj
 * @Date: 2020/8/4 8:55
 * @Desc: 使用泛型，代理任何类的任何接口
 */
public class ProxyGenerator<T> {
    public Object createProxy(T t, InvocationHandler handler) {
        Object o = Proxy.newProxyInstance(t.getClass().getClassLoader(),
                t.getClass().getInterfaces(), handler);
        return o;
    }
}
