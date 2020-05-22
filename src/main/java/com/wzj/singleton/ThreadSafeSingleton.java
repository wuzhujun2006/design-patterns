package com.wzj.singleton;

/**
 * @Author: wzj
 * @Date: 2020/2/13 13:50
 * @Desc: 懒汉式-线程安全
 * 通过synchronized解决，但获取锁带来性能开销，效率下降
 */
public class ThreadSafeSingleton {

    private static ThreadSafeSingleton LAZY_SINGLETON;

    private ThreadSafeSingleton() {
    }

    public static synchronized ThreadSafeSingleton getInstance() {
        if (null == LAZY_SINGLETON) {
            //睡眠1毫秒，在new对象前，增加被其他线程打断的机会，保证能被多个线程执行
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            LAZY_SINGLETON = new ThreadSafeSingleton();
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
