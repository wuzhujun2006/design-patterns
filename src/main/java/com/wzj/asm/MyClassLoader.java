package com.wzj.asm;

/**
 * @Author: wzj
 * @Date: 2020/8/5 21:26
 * @Desc:
 */
public class MyClassLoader extends ClassLoader{
    public Class defineClass(String name, byte[] b) {
        return defineClass(name, b, 0, b.length);
    }
}
