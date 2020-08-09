package com.wzj.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * @Author: wzj
 * @Date: 2020/8/7 15:13
 * @Desc:
 */
public class CglibProxy<T> {
    public T createProxy(T t) {
        //增强器
        Enhancer enhancer = new Enhancer();
        //设置父类
        enhancer.setSuperclass(t.getClass());
        //设置回调的拦截器
        enhancer.setCallback(new LogMethodInterceptor());
        T proxy = (T) enhancer.create();
        return proxy;
    }
}
