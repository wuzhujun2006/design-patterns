package com.wzj.spring.v2;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @Author: wzj
 * @Date: 2020/8/3 15:46
 * @Desc: 记录时间的代理
 */
@Aspect
public class AppleTimeProxy {

    @Before("execution (void com.wzj.spring.v2.Apple.secKill())")
    private void after() {
        System.out.println("方法执行结束时间：" + System.currentTimeMillis());
    }

    @After("execution (void com.wzj.spring.v2.Apple.secKill())")
    private void before() {
        System.out.println("方法执行开始时间：" + System.currentTimeMillis());
    }
}
