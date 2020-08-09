package com.wzj.spring.v1;

import com.wzj.proxy.v6.Sellalbe;

import java.lang.reflect.Method;

/**
 * @Author: wzj
 * @Date: 2020/8/3 15:46
 * @Desc: 记录时间的代理
 */
public class AppleTimeProxy {

    private void after() {
        System.out.println("方法执行结束时间：" + System.currentTimeMillis());
    }

    private void before() {
        System.out.println("方法执行开始时间：" + System.currentTimeMillis());
    }
}
