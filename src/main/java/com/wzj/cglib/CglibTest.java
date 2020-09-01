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
        // 不使用缓存，使用缓存的话，复杂度会比较高，我们只看如何生成代理类
//        System.setProperty("cglib.useCache", "false");
        Apple apple = new Apple();
        Apple proxy = (Apple) new CglibProxy().createProxy(apple);
        proxy.secKill();
    }
}
