package com.wzj.singleton;

/**
 * @Author: wzj
 * @Date: 2020/2/13 13:50
 * @Desc: 双重检测下线程安全
 *
 */
public class DoubleCheckedThreadSafeSingleton {

    private volatile static DoubleCheckedThreadSafeSingleton LAZY_SINGLETON;

    private DoubleCheckedThreadSafeSingleton() {
    }

    public static DoubleCheckedThreadSafeSingleton getInstance() {
        if (null == LAZY_SINGLETON) {
            //试图通过减小同步代码块的方式提高效率，带来了线程不安全
            synchronized (DoubleCheckedThreadSafeSingleton.class) {
                if (null == LAZY_SINGLETON) {
                    //睡眠1毫秒，在new对象前，增加被其他线程打断的机会，保证能被多个线程执行
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    LAZY_SINGLETON = new DoubleCheckedThreadSafeSingleton();
                }
            }

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
