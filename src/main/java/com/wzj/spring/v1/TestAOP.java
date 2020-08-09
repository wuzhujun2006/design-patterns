package com.wzj.spring.v1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: wzj
 * @Date: 2020/8/5 15:09
 * @Desc:
 */
public class TestAOP {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
        Apple apple = (Apple)context.getBean("apple");
        apple.secKill();
    }
}
