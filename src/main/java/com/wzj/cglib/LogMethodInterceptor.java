package com.wzj.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author: wzj
 * @Date: 2020/8/7 11:09
 * @Desc:
 */
public class LogMethodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        //代理类的父类信息
        System.out.println("代理类的父类信息:" + o.getClass().getSuperclass().getName());
        //前置增强
        before(method);
        Object result = null;
        //调用被代理对象的方法
        result = methodProxy.invokeSuper(o, objects);
        //后置增强
        after(method);
        return result;


    }

    private void after(Method method) {
        System.out.println("方法执行日志结束，方法名为：" + method.getName());
    }

    private void before(Method method) {
        System.out.println("方法执行日志开始，方法名为：" + method.getName());
    }


}
