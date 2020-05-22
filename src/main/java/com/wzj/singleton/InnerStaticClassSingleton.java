package com.wzj.singleton;

/**
 * @Author: wzj
 * @Date: 2020/2/13 15:45
 * @Desc:  静态内部类方式
 *  JVM保证单例
 *  加载外部类时不会加载内部类，这样可以实现懒加载
 */
public class InnerStaticClassSingleton {

    private InnerStaticClassSingleton() {

    }

    //内部静态类
    private static class InnerStaticClassSingletonHolder {
        private static final InnerStaticClassSingleton INSTANCE = new InnerStaticClassSingleton();
    }

    public static InnerStaticClassSingleton getInstance() {
        return InnerStaticClassSingletonHolder.INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() ->
                    System.out.println(InnerStaticClassSingleton.getInstance().hashCode())
            ).start();
        }
    }
}
