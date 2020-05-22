package com.wzj.singleton;

/**
 * @Author: wzj
 * @Date: 2020/2/13 16:05
 * @Desc: 枚举实现，既可以保证线程同步，还可以防止反序列化。
 */
public enum EnumSingleton {
    INSTANCE;
    public static void main(String[] args) {
        for(int i=0; i<100; i++) {
            new Thread(()->{
                System.out.println(EnumSingleton.INSTANCE.hashCode());
            }).start();
        }
    }
}
