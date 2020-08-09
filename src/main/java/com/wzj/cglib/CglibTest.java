package com.wzj.cglib;

import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Enhancer;

/**
 * @Author: wzj
 * @Date: 2020/8/7 14:16
 * @Desc:
 */
public class CglibTest {
    public static void main(String[] args) {
        //打印代理类
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, (String)System.getProperties().get("user.dir"));
        Apple apple = new Apple();
        Apple proxy = (Apple) new CglibProxy().createProxy(apple);
        proxy.secKill();
    }
}
