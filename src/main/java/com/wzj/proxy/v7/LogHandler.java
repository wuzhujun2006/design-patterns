package com.wzj.proxy.v7;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author: wzj
 * @Date: 2020/8/4 8:45
 * @Desc: 通过实现InvocationHandlet接口创建自己的调用处理器
 */
public class LogHandler implements InvocationHandler {

    Apple apple;

    public LogHandler(Apple apple) {
        this.apple = apple;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("方法执行日志开始，方法名为：" + method.getName());
        Object o = method.invoke(apple, args);
        System.out.println("方法执行日志结束，方法名为：" + method.getName());

        return o;
    }
}
