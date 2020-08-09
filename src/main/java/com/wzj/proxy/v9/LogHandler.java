package com.wzj.proxy.v9;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author: wzj
 * @Date: 2020/8/4 8:45
 * @Desc: 使用泛型，代理任何对象的任何行为
 */
public class LogHandler<T> implements InvocationHandler {

    T t;

    public LogHandler(T t) {
        this.t = t;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before(method);
        Object o = method.invoke(t, args);
        after(method);
        return o;
    }

    private void after(Method method) {
        System.out.println("方法执行日志结束，方法名为：" + method.getName());
    }

    private void before(Method method) {
        System.out.println("方法执行日志开始，方法名为：" + method.getName());
    }
}
