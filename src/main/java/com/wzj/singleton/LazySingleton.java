package com.wzj.singleton;

/**
 * @Author: wzj
 * @Date: 2020/2/13 12:50
 * @Desc: 懒汉式-线程不安全
 */
public class LazySingleton {

    private static LazySingleton LAZY_SINGLETON;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (null == LAZY_SINGLETON) {
            //睡眠1毫秒，在new对象前，增加被其他线程打断的机会，保证能被多个线程执行
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            LAZY_SINGLETON = new LazySingleton();
        }

        return LAZY_SINGLETON;
    }

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            new Thread(() ->
                    System.out.println(LAZY_SINGLETON.getInstance().hashCode())
            ).start();
        }
    }
}
